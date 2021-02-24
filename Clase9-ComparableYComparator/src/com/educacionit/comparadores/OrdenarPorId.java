package com.educacionit.comparadores;

import java.util.Comparator;

import com.educacionit.modelos.Persona;

//utilizanmos un comparador de elementos , que seria una clase de apoyo 
//que va a ser utilizada por los metodos de ordenamiento 

public class OrdenarPorId implements Comparator<Persona>{

	//El metodo compare() debe retorna lo siguiente
	//CONDICION              VALOR QUE DEBE RETORNAR
	//o1 < o2                 un numero menor a cero
	//o1 == o2                cero
	//o1 >  o2                un numero mayor a cero 
	
	
	@Override
	public int compare(Persona o1, Persona o2) {
		
		return o1.getIdPersona() - o2.getIdPersona();
	}

}
