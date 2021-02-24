package com.educacionit.programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.comparadores.OrdenarPorId;
import com.educacionit.modelos.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Carlos", "Ana", "Dionisio", "Bernardo");

		System.out.println("Lista Original: " + nombres);

		// Sort nos ordena una lista cualquiera
		Collections.sort(nombres);

		System.out.println("Lista Ordenada: " + nombres);

		Set<String> otrosNombres = new TreeSet<>();
		otrosNombres.add("Mario");
		otrosNombres.add("Fernando");
		otrosNombres.add("Omar");
		otrosNombres.add("Juana");

		System.out.println("conjunto Tree Set Ordenado: " + otrosNombres);
		//las colecciones nombres y otrosNombres funcionan correctamente por que cada elemento 
		//de estas colecciones son comparables entre si , para que un obejto sea comparable su clase
		//debe implementar la interface comparable de el packa java.lang
		
		
		
		Set<Persona> personas = new TreeSet<>();
		personas.add(new Persona(1 ,"Mario"));
		personas.add(new Persona(2 ,"Fernando"));
		personas.add(new Persona(3 ,"Omar"));
		personas.add(new Persona(4 ,"Juana"));
		
		System.out.println("conjunto Ordenado de Personas  : " + personas );
		
		//Utilizamos un segundo criterio de ordenamineto en otra coleccion de Personas 
		List<Persona> otrasPersonas = Arrays.asList(new Persona(4, "Juana") ,new Persona(2 ,"Fernando")
				,new Persona(1 ,"Mario") , new Persona(3 ,"Omar") );
		
		System.out.println("Listas de otras Personas : " + otrasPersonas);
		
		//uso mi comparador de ID
//		OrdenarPorId oId = new OrdenarPorId();
		Collections.sort(otrasPersonas, new OrdenarPorId());
		System.out.println("Lista de otras Personas Ordenadas por ID : " + otrasPersonas);
		
		
		//Otra Forma  seria enviando el comparador en el constructor ...
		Set<Persona> personasOrdenandasPorId = new TreeSet<>(new OrdenarPorId());
		personasOrdenandasPorId.add(new Persona(3 ,"Omar"));
		personasOrdenandasPorId.add(new Persona(4 ,"Juana"));
		personasOrdenandasPorId.add(new Persona(2 ,"Fernando"));
		personasOrdenandasPorId.add(new Persona(1 ,"Mario"));
		System.out.println("Listas de  Personas Ordenadas por ID : " + personasOrdenandasPorId);
		
		
		
		

	}

}
