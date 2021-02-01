package com.educacionit.entidades;

import java.util.Date;

public class Administrativo extends Empleado {

	public Administrativo() {
		super();
	}

	public Administrativo(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			Float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);

	}

	@Override
	public String toString() {
		return "Administrativo [toString() = ] " + super.toString() + "]";
	}

	@Override
	public String mostrarTipoPersona() {
		return getNombre() + " " + getApellido() + " Es Administrativo";
	}

}
