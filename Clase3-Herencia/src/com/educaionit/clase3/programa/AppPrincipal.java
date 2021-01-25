package com.educaionit.clase3.programa;

import java.util.ArrayList;
//importo todo lo que esta dentro del package
import com.educaionit.clase3.modelos.*;

public class AppPrincipal {

	public static void main(String[] args) {

		// creo un ArrayList de objetos SeleccionFutbol .
		// Independientemente de la clase hija a la que pertenezca el objeto
		ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "RT123GG");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interiro Derecho");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 40, "Lic.En Fisioterapia", 13);

		// agrego todos los objetos al array
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// Concentracion
		System.out.println("Todos los integrante comienzan un concentracion (Todos ejecutan el mismo metodo )");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ->");
			integrante.concentrarse();

		}
		System.out.println("*********************************************");
		// VIAJE
		System.out.println("Todos los integranteviajhan a jugar un partido  (Todos ejecutan el mismo metodo )");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ->");
			integrante.viajar();

		}
		
		//Ejecutamos los metodos propios de la clase hija 
		System.out.println("Entrenamiento : solamente el entrenador y el futbolista tienen metodos para entrenar :");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " ->");
		delBosque.dirigirEntrenamiento();
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " ->");
		iniesta.entrenar();
		
		//MASAJE 
		System.out.println("Masaje: solo en masajista tiene el metodo para dar un masaje :");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " ->");
		raulMartinez.darMasaje();
		
		//PARTIDO DE FUTBOL 
		System.out.println("Partido de futbol :solamente el entrenador y el futbolista tienen metodos para el partido ");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " ->");
		delBosque.dirigirPArtido();
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " ->");
		iniesta.jugarPartido();
		
		
		
		
		

	}

}
