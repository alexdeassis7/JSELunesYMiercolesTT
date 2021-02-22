package com.educacionit.transacciones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class JNoRollBack {

	public static void main(String[] args) {

		Connection connection = Conexion.getConnection();
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;		
		
		try {
			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES (? , ? )");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES (? , ? , ?)");

			System.out.println("Primer insert en MiTabla");
			stmt1.setInt(1, 11111);
			stmt1.setString(2, "11111@gmail.com");
			stmt1.executeUpdate();

			System.out.println("segundo insert en MiTabla");
			stmt1.setInt(1, 2222);
			stmt1.setString(2, "2222@gmail.com");
			stmt1.executeUpdate();

			System.out.println("tercer insert en MiTabla");
			stmt1.setInt(1, 3333);
			stmt1.setString(2, "3333@gmail.com");
			stmt1.executeUpdate();

			System.out.println("Primer insert en MiOtraTabla");
			stmt2.setString(1, "Alex");
			stmt2.setString(2, "Martinez");
			// Fozamos un error enviando un dato inconrrecto
			stmt2.setString(3, "ERROOOOOOORRRRR");
			stmt2.executeUpdate();

		
		} catch (SQLException e) {
			System.out.println("Fallo alguna de las sentencias SQL");
		}

	}
}
