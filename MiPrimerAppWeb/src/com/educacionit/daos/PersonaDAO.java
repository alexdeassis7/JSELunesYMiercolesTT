package com.educacionit.daos;

import java.sql.SQLException;
import java.sql.Statement;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();

			estatuto.executeUpdate("INSERT INTO personas (`nombre`,`edad`,`profesion`,`telefono`) VALUES ('"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");

			System.out.println("Se Ah Registrado Exitosamente en la DB " + miPersona.getNombrePersona());

			// Libero los recursos
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("No se registro a " + miPersona.getNombrePersona() + " en la tabla personas");
		}

	}

}
