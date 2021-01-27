package com.educaionit.clase3.programa;

import java.util.ArrayList;
//importo todo lo que esta dentro del package
import com.educaionit.clase3.modelos.*;

public class AppPrincipal {

	public static void main(String[] args) {

		// creo un ArrayList de objetos SeleccionFutbol .
		// Independientemente de la clase hija a la que pertenezca el objeto
		ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "RT123GG");
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interiro Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 40, "Lic.En Fisioterapia", 13);

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

		System.out.println("Entrenamiento : todos los integrantes tienen su funcion en un entrenamiento (Especializacion )");

		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ->");
			integrante.entrenamiento();
		}



		// PARTIDO DE FUTBOL
		System.out.println(
				"Partido de futbol : todos los integrantes tienen su funcion en un entrenamiento (Especializacion )");

		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " ->");
			integrante.partidoFutbol();
		}
		
		//ejecutamos  los metodos propios de cada clase !
		System.out.println("Planificar entrenamiento : solo el entrenador tiene este metodo ");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " ->");
		((Entrenador)delBosque).planificarEntrenamiento();
		
		System.out.println("Entrevista: solo el futbolista tiene este metodo ");
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " ->");
		((Futbolista)iniesta).entrevista();
		
		System.out.println("Masaje : solo el Masajista tiene este metodo ");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " ->");
		((Masajista)raulMartinez).darMasaje();
		
		
		
		
		
		// MASAJE
//		System.out.println("Masaje: solo en masajista tiene el metodo para dar un masaje :");
//		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " ->");
//		raulMartinez.darMasaje();
	}

}
