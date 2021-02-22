package com.educacionit.clase8;

import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
	
	public ArrayList<Persona> fila = new ArrayList();
	
	public int cuantaPersonasHay() {
		return fila.size();
	}

	public void agregarPersona(Persona persona) {
		if(!fila.contains(persona)) {
			System.out.println("Se agrego a " + persona.getDni() + " a la fila ");
			fila.add(persona);			
		}else {
			System.out.println(persona.getDni() + " ya se encuentra en la fila, no se Agrego ");
		}
	}
	
	public void eliminarPersonaDeLaFila(Persona persona) {
		if(fila.contains(persona)) {
			fila.remove(persona);
			System.out.println("Se borro de la fila a " + persona.getNombre());
		}else {
			System.out.println(persona.getNombre() + " No se encuentra en la fila!");
		}
		
	}
	
	public void mostrarLaFila() {
		for(Persona p : fila) {
			System.out.println("Nombre : " + p.getNombre() + ", DNI :" +p.getDni());
		}
	}
	
}
 