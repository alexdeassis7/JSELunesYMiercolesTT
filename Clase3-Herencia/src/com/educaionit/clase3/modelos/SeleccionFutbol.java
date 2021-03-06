package com.educaionit.clase3.modelos;

//Clase padre abstract
public abstract class SeleccionFutbol {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public SeleccionFutbol() {
	}

	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void concentrarse() {
		System.out.println("Concentrarse() => Clase Padre");
	}

	public void viajar() {
		System.out.println("Viajar() => Clase Padre");
	}

	//METODO ABSTRACTO : no se implementa en la clase abstracta pero si en las clase hijas
	public abstract void entrenamiento() ; 
	
	public void partidoFutbol() {
		System.out.println("partidoFutbol() => Clase Padre");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
