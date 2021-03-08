package com.educacionit.ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LectorMejorado {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");

		BufferedReader readerMejorado = new BufferedReader(new FileReader(inputFile));

		String lineaLeida = "";
		boolean eof = false;

		while (!eof) {
			lineaLeida = readerMejorado.readLine();

			if (lineaLeida != null) {
				System.out.println(lineaLeida);
			}else {
				eof = true; //aca se modifica el valor de eof por que finalizamos de leer el file
			}
		}
		
		readerMejorado.close();
		
	}

}
