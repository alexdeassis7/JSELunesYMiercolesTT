package com.educacion.modelo;

public class JugadorSeleccion {

	private int dorsal;
	private String nombre;
	private String demarcacion;

	public JugadorSeleccion() {
	}

	public JugadorSeleccion(int dorsal, String nombre, String demarcaci�n) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.demarcacion = demarcaci�n;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDemarcaci�n() {
		return demarcacion;
	}

	public void setDemarcaci�n(String demarcaci�n) {
		this.demarcacion = demarcaci�n;
	}

	@Override
	public String toString() {
		return this.dorsal + "  --  " + this.nombre + "  --  " + this.demarcacion;
	}

}
