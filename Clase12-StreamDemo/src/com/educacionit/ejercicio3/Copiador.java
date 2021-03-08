package com.educacionit.ejercicio3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copiador {
	public static void main(String[] args) throws IOException {

		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");
		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);

		int unCaracter;

		System.out.println("El Archivo se esta copiando desde fuente.txt a destino.txt");

		while ((unCaracter = in.read()) != -1) { // leeemos el archivo de origen
			out.write(unCaracter);// escribimos en el archivo de destino
		}

		in.close();
		out.close();

		System.out.println("Se logro copiar el archivo con exito!");
	}
}
