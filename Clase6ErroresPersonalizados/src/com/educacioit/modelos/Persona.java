package com.educacioit.modelos;

public class Persona {
	private int id;
	private String nombre;

	public void metodoQuePuedeGenerarUnError(boolean lanzarError) throws MiPropiaException {
		if (lanzarError) {
			// lanzamos una Exception
			throw new MiPropiaException();
		} else {
			System.out.println("No Se Lanzo un error Personalizado");
		}

	}

	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}

}
