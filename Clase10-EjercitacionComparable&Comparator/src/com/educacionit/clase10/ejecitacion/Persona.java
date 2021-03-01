package com.educacionit.clase10.ejecitacion;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private int altura;
	private Integer edad;

	public Persona(String nombre, int altura, int edad) {
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona o) {		
		return this.edad.compareTo(o.edad);
	}

	@Override
	public String toString() {
		return  nombre + "- altura:" + altura + "- edad:" + edad + "]";
	}

	
}
