package com.educacioit.programa;

import com.educacioit.modelos.MiPropiaException;
import com.educacioit.modelos.Persona;

public class AppTestPrograma {

	public static void main(String[] args) {

		Persona persona1 = new Persona(23, "Agustin Kolque");

//		Persona[] clientes = {new Persona(1, "matias") , new Persona(2 , "Melina")};
//		Persona[] clientes = {persona1 , new Persona(2 , "Melina")};
//		
//		System.out.println(clientes[0].toString());
//		System.out.println(clientes[1].toString());
//	
		
		try {
			persona1.metodoQuePuedeGenerarUnError(false);
		} catch (MiPropiaException e) {
			System.out.println("GetMessage() Redefinido ");
			System.out.println(e.getMessage());
		}

	}

}
