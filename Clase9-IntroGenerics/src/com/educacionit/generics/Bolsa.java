package com.educacionit.generics;

import java.util.ArrayList;
import java.util.Iterator;

//clase bolsa  - NO GENERICA!
//Iterable indica que se trata de una coleccion o serie sobre la que se puede iterar.
//Obliga a dispones de un metodo que permita crear un objeto Iterator que nos peermita recorrer la coleccion 

public class Bolsa implements Iterable {

	private ArrayList lista = new ArrayList();
	private int tope;

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	// metodo para agregar objetos a nuestra bolsa
	public void agregar(Object objeto) {
		if (lista.size() <= tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("No caben mas elementos , la bolsa se encuentra completa");
		}
	}

	@Override
	public Iterator iterator() {
		// Un Iterator es el objeto que permite recorrer una coleccion y que proporciona
		// una serie de metodos utiles
		// hasNext() y el next()
		return lista.iterator();
	}
}
