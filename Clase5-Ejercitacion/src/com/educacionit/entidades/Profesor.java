package com.educacionit.entidades;

import java.util.Date;

public class Profesor extends Empleado {

	private String[] cursos;

	public Profesor() {
		super();

	}

	public Profesor(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			Float sueldo, String[] cursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.cursos = cursos;
	}

	@Override
	public String mostrarTipoPersona() {
		return getNombre() + " " + getApellido() + " Es Profesor";
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

}
