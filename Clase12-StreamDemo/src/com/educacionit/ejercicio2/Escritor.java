package com.educacionit.ejercicio2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) throws IOException {
		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");

		FileWriter out = new FileWriter(outputFile);

		String informacion = "Soy el mensaje que tenes que persistir en el archivo";

		for (int i = 0; i < informacion.length(); i++) {
			out.write(informacion.charAt(i));
		}

		out.close();

		System.out.println("El Archivo se escribio correctamente !");

	}

}
