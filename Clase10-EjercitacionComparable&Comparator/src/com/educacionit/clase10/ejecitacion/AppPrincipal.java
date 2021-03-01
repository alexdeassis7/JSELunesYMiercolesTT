package com.educacionit.clase10.ejecitacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AppPrincipal {

	public static void main(String[] args) {

		List<Persona> personas = Arrays.asList(new Persona("Mario", 187, 22), new Persona("Pepe", 173, 52),
				new Persona("Manuel", 158, 27), new Persona("David", 164, 25), new Persona("Alberto", 184, 80));

		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		System.out.println();
		System.out.println("\n#########  Personas ordenadas por altura ######### :");
		Collections.sort(personas, new OrdenadorPorAltura());
		
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}

		Set<Persona> personas2 = new TreeSet<>();

		personas2.add(new Persona("Mario", 187, 22));

		personas2.add(new Persona("Pepe", 173, 52));

		personas2.add(new Persona("Manuel", 158, 27));

		personas2.add(new Persona("David", 164, 25));

		personas2.add(new Persona("Alberto", 184, 80));
		System.out.println();
		System.out.println("#########  Personas ordenadas por edad ######### :");
		
		for (Persona persona : personas2) {
			System.out.println(persona.toString());
		}
	}

}
