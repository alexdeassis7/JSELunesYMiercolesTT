package com.educacionit.clase1;
/*8)	Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y
segundos de un d�a desde las 0:0:0 hasta las 23:59:59*/

//comentario de linea 
/*comentario
 *  de
 *   bloque 
 * */

public class AppPrincipal {

	public static void main(String[] args) {
		
		//System.out.println("hola " + args[0] + args[1] +args[2] +args[3]);
		// For anidados
		for (int hs = 0; hs <= 23; hs++) {

			for (int min = 0; min <= 59; min++) {

				for (int seg = 0; seg <= 59; seg++) {

					System.out.println(hs + ":" + min + ":" + seg);

				}
			}

		}

	}

}
