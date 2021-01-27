package com.educacionit.entidades;

public class AppPrincipal {

	public static void main(String[] args) {

		VueloCarga cv = new VueloCarga();
		cv.agregarPaquete(1, 2, 3);
		cv.agregarPaquete(5, 2, 2);
		cv.agregarPaquete(1, 2, 3);
		cv.agregarPaquete(50, 20, 20);

		Passenger nico = new Passenger("nico", 13);
		Passenger pepe = new Passenger("pepe", 15);
		Passenger marce = new Passenger("marce", 18);
		Passenger matias = new Passenger("matias", 19);
		for (int i = 0; i < 4; i++) {
			cv.agregarPasajero(matias);
			cv.agregarPasajero(marce);
			cv.agregarPasajero(pepe);
			cv.agregarPasajero(nico);
		}
		
		Vuelo v = new Vuelo();
		
		for (int i = 0; i < 50; i++) {
			v.agregarPasajero(matias);
			v.agregarPasajero(marce);
			v.agregarPasajero(pepe);
			v.agregarPasajero(nico);
		}
		
		
	}

}
