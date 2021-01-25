package com.educacionit.clase3.programa;

import java.util.Scanner;
import com.educacionit.clase3.modelos.Passenger;
import com.educacionit.clase3.modelos.PassengerDos;

public class AppPrincipal {

	public static void main(String[] args) {
		// Al ser private ya no se pueden acceder
		// directamente a los atributos
		// p1.nombre = "Martin";
		// p1.edad = -18;
/*
		Scanner teclado = new Scanner(System.in);
		Passenger p1 = new Passenger();
		int edadIngresada = 0;
		String nombreIngresado = "";

		System.out.println("Ingrese por favor el nombre del pasajero ");
		nombreIngresado = teclado.nextLine();
		System.out.println("Ingrese por favor la edad del pasajero ");
		edadIngresada = teclado.nextInt();

		Passenger p2 = new Passenger(nombreIngresado, edadIngresada);

		// utilizamos los Get y Set
		p1.setEdad(edadIngresada);
		p1.setNombre(nombreIngresado);
		System.out.println("P1 " + p1.toString());
		System.out.println("P2 " + p2.toString());

		System.out.println("Accedemos a los atributos mediante los Getters");
		System.out.println("p1.getNombre() : " + p1.getNombre());
		System.out.println("p1.getEdad() : " + p1.getEdad());
*/
		//invoco al constructor 2
		PassengerDos carmelo = new PassengerDos(1);
		System.out.println(carmelo.toString());
		
		//invoco al constructor 3
		PassengerDos pablo = new PassengerDos(2 , 1);
	    System.out.println(pablo.toString());
				
	    System.out.println("utilizamos los getters del Objeto Pablo");
		System.out.println("getBolsos(): " + pablo.getBolsos());
		System.out.println("getBolsosPagos(): " + pablo.getBolsosPagos());
		System.out.println("getTotalAPagar(): " + pablo.getTotalaPagar());
		System.out.println("getTarifaXBolso(): " + pablo.getTarifaXbolso());
		
		
	}
}
