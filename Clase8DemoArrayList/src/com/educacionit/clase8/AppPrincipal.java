package com.educacionit.clase8;

public class AppPrincipal {

	public static void main(String[] args) {
		Persona p = new Persona("99999", "Candela", "Torres");
		Persona p1 = new Persona("22222", "Carmelo", "Martinez");
		Persona p2 = new Persona("33333", "Diego", "Perez");
		Persona p3 = new Persona("555555", "Fede", "Gonzalez");
		Persona p4 = new Persona("99999", "Juan", "Varela");
		Persona p5 = new Persona("555555", "Fede", "Gonzalez");

		Banco b1 = new Banco();
		
		b1.agregarPersona(p);
		b1.agregarPersona(p1);
		b1.agregarPersona(p2);		
		b1.agregarPersona(p3);
		b1.agregarPersona(p4);
		b1.agregarPersona(p5);
		b1.mostrarLaFila();
		
	}

}
