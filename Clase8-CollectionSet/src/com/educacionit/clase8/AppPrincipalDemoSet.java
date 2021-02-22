package com.educacionit.clase8;

import java.util.*;
import java.util.stream.Collectors;

public class AppPrincipalDemoSet {
	public static void main(String[] args) {
		// Ninguna de la implementaciones SET son sincronizadas ,es decir ,
		// no se garantiza el estado del SET si dos o mas hilos acceden de forma
		// concurrente al mismo , esto
		// lo podemos solucionar con los metodos que actuan de wrapper para dotar de
		// sincronizacion a las
		// colleciones , EJEMPLO:
//
//		Set set = Collections.synchronizedSet(new HashSet());
//		Set set2 = new HashSet(); //esto no tendria sincronizacion
//
//		SortedSet sortedSet = Collections.synchronizedSortedSet(new TreeSet());
//
//		Set linkedHashSet = Collections.synchronizedSet(new LinkedHashSet());

//		Medimos el tiempo de insercion en un HashSet
		final Set hashSet = new HashSet(1_000_000);
		final Long startHashSetTime = System.currentTimeMillis();
		// agrego un millon de elemntos en el HashSEt
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo de Insercion del HashSet :" + (endHashSetTime - startHashSetTime));

//		Medimos el tiempo de insercion en un treeSet
		final Set treeSet = new TreeSet();
		final Long startTreeSetTime = System.currentTimeMillis();
		// agrego un millon de elemntos en el HashSEt
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Tiempo de Insercion del treeSet :" + (endTreeSetTime - startTreeSetTime));

//		Medimos el tiempo de insercion en un LinkedHashSet
		final Set linkedHashSet = new LinkedHashSet();
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		// agrego un millon de elemntos en el HashSEt
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo de Insercion del LinkedHashSet :" + (endLinkedHashSetTime - startLinkedHashSetTime));

		/*
		 * Podemos crear un conjunto a partir de una colleccion existente . este es un
		 * truco para eliminar duplicados en una collection que no es de SET
		 */
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println("List de numeros :" + listNumbers);

		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		System.out.println("Set de numeros(sin duplicados!) :" + uniqueNumbers);

		// con java 8 : podemos utilizar una secuencia de funciones de filtro y
		// collecion
		// para retornar un conjunto de una collecion ,
		// por ejemplo podemos obtener solo los numeros impares de nuestra lista de
		// numeros

		Set<Integer> uniqueOddNumbers = listNumbers.stream().filter(number -> number % 2 != 0)
				.collect(Collectors.toSet());

		System.out.println("Los impares son : " + uniqueOddNumbers);

		// Realizamos operaciones Basicas :
		/*
		 * 1)Agregamos elementos a un conjunto : el metodo add() devuelve true si el
		 * conjunto no contiene el elemento especificado y false si el conjunto ya
		 * contiene el elemento especificado *
		 */
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		names.add("Fede");
		names.add("Tomas");
		names.add("Santiago");
		System.out.println("Names: " + names);
		names.add(null);

		if (names.add("Marcelo")) {
			System.out.println("Marcelo fue agregado al SET");
		}

		if (!names.add("Tom")) {
			System.out.println("Tom Ya existia dentro del SET");
		}
		System.out.println("Names: " + names);
		// Eliminar un elemento del conjunto
		// El metodo Remove() elimina el elemento especificado del conjunto si
		// esta presente (el metodo retorna tru o false si no exite )
		if (names.remove("Tom")) {
			System.out.println("Se borro a tom del SET");
		}
		System.out.println("Names: " + names);

		// eliminamos todos los elementos de un conjunto con el metodo clear()
//		System.out.println("Eliminamos todos los elementos del SET");
//		names.clear();
//		System.out.println("Names: " + names);

		// Comprobamos si un conjuto esta vacion con el metodo isEmpty() ,retorna true
		// si el conjunto no tiene elementos
		// caso contrario retorna false
		if (names.isEmpty()) {
			System.out.println("El set de nombres se encuentra vacio");
		} else {
			System.out.println("El set de nombres contiene elementos ");
		}

		// Obtengo el numero total de elementos de mi conjunto con size()
		System.out.printf("El set contiene %d Elementos en su interior ", names.size());

		// Itero el conjunto mediante un forEach
		for (String name : names) {
			System.out.print(name + " - ");
		}

		// Busqueda de un elemento en un conjunto
		// utilizamos el metodo contains que retorna true o false dependiendo si el
		// elemento existe o no en el conjunto
		System.out.println();
		if (names.contains("Fede")) {
			System.out.println("la coleccion tiene a fede en su interior ");
		}

	}
}
