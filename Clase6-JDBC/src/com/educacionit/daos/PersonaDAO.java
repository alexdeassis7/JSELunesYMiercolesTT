package com.educacionit.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

//Patron DAO Data Access Object 

public class PersonaDAO {
//CRUD - Created - Read - Update - Delete

	public void registrarPersona(PersonaVO miPersona) {
		// establecemos la conexion
		Conexion conex = new Conexion();

		try {
			// obtenog un objeto connection y a traves de ese objeto un Statement para poder
			// ejecutar la Query en la DB
			Statement estatuto = conex.getConnection().createStatement();
			// ejecuto la query en la DB
			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getIdPersona() + "','"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");
			// liberamos los recursos
			estatuto.close();
			conex.desconectar();
			// mostramos un mensaje que indica que se inserto el dato
			JOptionPane.showMessageDialog(null, "Se Ha registrado Exitosamente a " + miPersona.getNombrePersona());

		} catch (SQLException e) {
			// capturamos el error
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se Registro a " + miPersona.getNombrePersona());
		}

	}

	public void eliminarPersona(String codigo) {
		// establecemos la conexion
		Conexion conex = new Conexion();

		try {
			// obtengoun objeto connection y a traves de ese objeto un Statement para poder
			// ejecutar la Query en la DB
			Statement estatuto = conex.getConnection().createStatement();

			if (buscarPersona(Integer.parseInt(codigo)) != null) {

				estatuto.executeUpdate("DELETE FROM persona WHERE id = '" + codigo + "' ");
				// mostramos un mensaje que indica que se inserto el dato
				JOptionPane.showMessageDialog(null, "Se Ha BORRADO Exitosamente al registro con id : " + codigo);

			} else {
				JOptionPane.showMessageDialog(null, "No se elimino por que no Existe la persona con id : " + codigo);
			}
			// liberamos los recursos

			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			// capturamos el error
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se elimino la persona con id : " + codigo);
		}
	}

	public PersonaVO buscarPersona(int codigo) {
		Conexion conex = new Conexion();
		PersonaVO persona = new PersonaVO();
		boolean existe = false;

		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ?");
			// reemplazo el singo de interrogacion por un valor int ('codigo')
			consulta.setInt(1, codigo);

			// ejecuto la consulta en la DB
			ResultSet res = consulta.executeQuery();

			while (res.next()) {
				existe = true;
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("Nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			}
			// Liberamos los recursos
			res.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error, No se pudo buscar en la db");
		}
		if (existe) {
			return persona;
		} else {
			return null;
		}

	}

	public void modificarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();
		try {
			String consulta = "UPDATE persona SET id = ? , nombre = ? , edad = ? , profesion = ? ,telefono = ? where id = ?";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

			// reemplazo los interrogantes de la query
			estatuto.setInt(1, miPersona.getIdPersona());
			estatuto.setString(2, miPersona.getNombrePersona());
			estatuto.setInt(3, miPersona.getEdadPersona());
			estatuto.setString(4, miPersona.getProfesionPersona());
			estatuto.setInt(5, miPersona.getTelefonoPersona());
			estatuto.setInt(6, miPersona.getIdPersona());

			estatuto.executeUpdate();// ejecuto la query

			JOptionPane.showMessageDialog(null,
					"Se hs modificado Correctamente el registro con id :" + miPersona.getIdPersona());

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"Error , no se logro modificar el registro con id : " + miPersona.getIdPersona());
		}

	}

}
