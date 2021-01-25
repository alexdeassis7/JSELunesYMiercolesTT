package com.educacionit.clase3.modelos;

public class Passenger {
	private String nombre;
	private int edad;

	public Passenger() {

	}

	public Passenger(String nombre, int edad) {
		this.nombre = nombre;
		// invocamos al setters de Edad
		// dentro del constructor
		setEdad(edad);
	}

	// Metodos Setters : me permiten modificar el estado
	// de un atributo private
	public void setEdad(int edad) {
		if (edad > 1 && edad < 150) {
			// si la edad esta en los rangos validos la seteamos
			this.edad = edad;
		} else {
			System.out.println("La edad no se pudo setear!");
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodos Getters : me sirven para obtener el estado de un atributo
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String toString() {
		return "Passenger [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
