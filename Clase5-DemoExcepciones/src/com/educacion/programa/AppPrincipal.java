package com.educacion.programa;

public class AppPrincipal {

	public static int numerador = 10;
	public static int denominador = 2;
	public static float division ;

	public static void main(String[] args) {

		// 1
		System.out.println("Antes de hacer la division");
		try {
			// instrucciones que son propensas a lanzar una Exception
			// 2
			division = numerador / denominador;
		} catch (ArithmeticException e) {
			// instrucciones que ejecutaremos cuando se lanze una exception
			division = 0;
			System.out.println(e.getMessage());

		} finally {
			// instrucciones que se ejecutan , tanto si hay como sino hay exceptions

			System.out.println("Division :" + division);
			// 3
			System.out.println("Despues de la division ");
		}

	}

}
