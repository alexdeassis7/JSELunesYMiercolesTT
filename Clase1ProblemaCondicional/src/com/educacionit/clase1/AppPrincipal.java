package com.educacionit.clase1;

import java.util.Scanner;

/*3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga $16 por cada hora.
Si trabaja más de 40 horas  se le paga $16 por cada una de 
las primeras 40 horas y $20 por cada hora extra.*/

public class AppPrincipal {

	public static void main(String[] args) {
		// defino mis variabels de trabajo
		int hsTrabajadas = 0, hsExtras = 0, salarioSemanal = 0, precioHsExtra = 20, precioHsBase = 16;
		Scanner teclado = new Scanner(System.in);
		// Que entra ?
		System.out.println("Ingrese por favor las horas trabajadas esta semana ");
		hsTrabajadas = teclado.nextInt();
		// Procesamiento
		if (hsTrabajadas > 40) {
			hsExtras = hsTrabajadas - 40;
			salarioSemanal = hsExtras * precioHsExtra + 40 * precioHsBase;
		} else {
			salarioSemanal = hsTrabajadas * 16;
		}
		// Que sale?
		System.out.println("su salario semana es de : " + salarioSemanal + " pesos.");

	}

}
