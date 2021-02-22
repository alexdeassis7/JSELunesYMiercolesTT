package com.educacionit.transacciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JRollBack {

	public static void main(String[] args) {

		Connection connection = Conexion.getConnection();
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		try {
			// desactivamos el autoCommit! , por defecto se encuentra en true!
			connection.setAutoCommit(false);

			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES (? , ? )");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES (? , ? , ?)");

			System.out.println("Primer insert en MiTabla");
			stmt1.setInt(1, 4444);
			stmt1.setString(2, "4444@gmail.com");
			stmt1.executeUpdate();

			System.out.println("segundo insert en MiTabla");
			stmt1.setInt(1, 5555);
			stmt1.setString(2, "5555@gmail.com");
			stmt1.executeUpdate();

			System.out.println("tercer insert en MiTabla");
			stmt1.setInt(1, 6666);
			stmt1.setString(2, "6666@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Primer insert en MiOtraTabla");
			stmt2.setString(1, "Carmelo");
			stmt2.setString(2, "Gonzalez");
			// Fozamos un error enviando un dato inconrrecto
			//stmt2.setString(3, "ERROOOOOOORRRRR");
			stmt2.setInt(3, 45);
			stmt2.executeUpdate();
			
			//invocamos al metodo commit para impactar los cambios en la base de datos y que se vean reflejados 
			//el metodo commit pertenece a la conexion!
			connection.commit();
			

		} catch (SQLException e) {
			System.out.println("Fallo alguna de las sentencias SQL");
			
			if(connection != null ) {
				System.out.println("Haciendo un RollBack de las querys ");
				
				try {
					//el metodo rollback vuelve atras todos los cambios realizados , este metodo tambien pertenece a la conexion 
					connection.rollback();
				}catch (Exception e2) {
					System.out.println("Error Grave No se logro volver atras los INSERT ejecutados , contactar Administrador de Base de datos ");
				}
			
			}
			
		}

	}
}

/*
 * Operaciones Bancaria:
 * 
 * 1- Comprobar que nuetra cuenta existe es valida y esta operativa 2-Comprobar
 * si hay saldo en nuestra cuenta 3-comprobar los datos de la cuenta del
 * vendedor (que existe ,que puede recibir dinero ....etc ) 4- retirar el dinero
 * de nuestra cuenta 5- ingresar el dinero en la cuenta del vendedor
 * 
 * 
 * Niveles de Aislamiento: para setear el nivel de isolation se ejecutra la
 * siguient4e sentencia
 * 
 * SET TRANSACTION ISOLATION LEVEL
 * 
 * SQL SERVER ,oracle y MySql SEerializable Repeatable read read commited read
 * uncommited
 * 
 * propia de SQLServer snapshot
 * 
 * 
 * 
 */
