package com.educacionit.ejercicio5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorMejorado {

	public static void main(String[] args) throws IOException {

		File outputFile = new File(
				"archivosES" + File.separator + "salida" + File.separator + "bufferedWriterOutput.txt");

		String linea1 = "Hola Soy Agustin";
		String linea2 = "Adios soy Nicolas";
		String linea3 = "Buenas Tardes soy Carmelo";

		BufferedWriter writerMejorado = new BufferedWriter(new FileWriter(outputFile));

		writerMejorado.write(linea1 , 0 , linea1.length() );
		writerMejorado.newLine();

		writerMejorado.write(linea2 , 0 , linea2.length() );
		writerMejorado.newLine();

		writerMejorado.write(linea3 , 0 , linea3.length() );
		writerMejorado.newLine();
		
		writerMejorado.close();
		
		System.out.println("Se escribieron las tres lineas en el archivo bufferedWriterOutput.txt");
	
	}

}
