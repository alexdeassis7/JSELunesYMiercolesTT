package com.educacionit;

import java.util.Random;

public class Persona {
	// atributo de clase
	private static int contador = 0;

	// atributos de instancia
	private int id;
	private String nombre;
	private String apellido;
	private byte edad;
	private Documento documento;

	public Persona() {
		contador++;
		id = contador;
	}

	public Persona(String nombre, String apellido, Documento documento) {
		contador++;
		this.id = contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}

	public boolean mayorEdad() {
		return edad >= 18;
	}

	public String mostrarAtributos() {
		String mensaje = "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", "
				+ documento.mostrarAtributos() + " , edad = " + edad + " y es "
				+ (mayorEdad() ? "Mayor edad" : " Menor de edad");
		return mensaje;
	}

	public byte asignarEdad() {
		Random nuevaEdad = new Random();
		return (byte) nuevaEdad.nextInt(127);
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

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	
	public static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento="
				+ documento + "]";
	}

}
