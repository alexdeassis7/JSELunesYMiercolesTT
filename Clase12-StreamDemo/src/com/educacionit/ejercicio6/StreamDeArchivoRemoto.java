package com.educacionit.ejercicio6;

import java.io.*;
import java.net.MalformedURLException;
import java.net.*;

public class StreamDeArchivoRemoto {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://www.infobae.com/economia/2021/03/08/ganancias-cuanto-vas-a-dejar-de-pagar-por-mes-si-se-aprueban-los-cambios-al-impuesto/");

			BufferedReader elBuffer = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));

			boolean eof = false;
			String unaLinea;

			while (!eof) {

				unaLinea = elBuffer.readLine();

				if (unaLinea != null) {
					System.out.println(unaLinea);
				} else {
					eof = true;
				}
			}

		} catch (MalformedURLException e) {
			System.out.println("La url no es valida" + e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println("No podemos leer de internet " + e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
