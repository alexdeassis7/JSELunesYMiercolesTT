package com.educacionit.entidades;

public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosdisponibles;

	// inicializador de bloque : es un conjunto de instruccion que se ejecuta
	// previo a la llamada de cualquier constructor
	{
		asientosdisponibles = new boolean[getAsiento()];
		for (int i = 0; i < getAsiento(); i++) {
			asientosdisponibles[i] = true;
		}

	}

	public Vuelo() {
	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			pasajeros += 1;
			System.out.println(p1.getNombre() + " Ya se puede ir hacer el Check In para viajar");
		} else {
			faltaAsiento();
		}
	}

	private void faltaAsiento() {
		System.out.println("Ya no quedan asientos vaya a buscar vuelo a otra Aerolinea");
	}

	public int getAsientos() {
		return getAsiento();
	}

	public int getAsiento() {
		return 150;
	}

	private boolean asientoDisponible() {
		return pasajeros < getAsiento();
	}

}
