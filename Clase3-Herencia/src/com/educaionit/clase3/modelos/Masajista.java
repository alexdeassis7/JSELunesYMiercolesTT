package com.educaionit.clase3.modelos;

//clase Hija
public class Masajista extends SeleccionFutbol {
	private String titulacion;
	private int anioExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int anioExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.anioExperiencia = anioExperiencia;
	}

	public void darMasaje() {
		System.out.println("Dar masaje() => clase hija masajista");
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

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAnioExperiencia() {
		return anioExperiencia;
	}

	public void setAnioExperiencia(int anioExperiencia) {
		this.anioExperiencia = anioExperiencia;
	}

}
