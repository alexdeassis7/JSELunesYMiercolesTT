package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static String db = "personas";
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;
	Connection conn = null;

	public Conexion() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Se logro establecer correctamente conexion a la base : " + db);
			}

		} catch (SQLException e) {
			System.out.println("Error a intentar obtener la Conexion a la db " + db);
			e.printStackTrace();
			e.getCause();
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Error al intenentar obtener el Driver de Conexion");
			e.printStackTrace();
			e.getCause();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Sucedio un Error Inesperado");
			e.printStackTrace();
			e.getCause();
			System.out.println(e.getMessage());
		}

	}

	public Connection getConnection() {
		return conn;
	}

	public void desconectar() {
		try {
			conn.close();
			System.out.println("Se desconecto de la db " + db);
		} catch (SQLException e) {
			System.out.println("no se pudo Cerrar la conexion a la DB");
			e.printStackTrace();
			e.getCause();
			System.out.println(e.getMessage());
		}
	}
//	public static void main(String[] args) {
//		Conexion cn = new Conexion();
//	}

}
