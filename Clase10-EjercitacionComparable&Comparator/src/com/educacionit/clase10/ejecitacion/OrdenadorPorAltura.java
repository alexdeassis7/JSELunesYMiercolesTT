package com.educacionit.clase10.ejecitacion;

import java.util.Comparator;

public class OrdenadorPorAltura implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {		
		return  (o2.getAltura() - o1.getAltura());
	}

}
