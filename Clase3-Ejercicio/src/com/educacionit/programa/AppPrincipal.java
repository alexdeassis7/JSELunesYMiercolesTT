package com.educacionit.programa;

import java.util.Scanner;

import com.educacionit.Documento;
import com.educacionit.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Persona[] personas;
		int cantidadPersonas = 0;

		System.out.println("Ingrese la cantidad de personas que va a cargar :");
		cantidadPersonas = teclado.nextInt();
		personas = new Persona[cantidadPersonas];

		for (int i = 0; i < personas.length; i++) {
			Persona personaAux = new Persona();
			Documento documentoAux = new Documento();

			System.out.println("Ingrese el Nombre de la persona " + (i + 1));
			personaAux.setNombre(teclado.next());

			System.out.println("Ingrese el Apellido de la persona " + (i + 1));
			personaAux.setApellido(teclado.next());

			System.out.println("Ingrese el Tipo de Documento de la persona " + (i + 1));
			documentoAux.setTipoDocumento(teclado.next());

			System.out.println("Ingrese el numero de Documento de la persona " + (i + 1));
			documentoAux.setNumeroDocumento(teclado.nextInt());
			
			personaAux.setDocumento(documentoAux);
						
			System.out.println("Ingrese la edad de la persona " + (i + 1));
			personaAux.setEdad(teclado.nextByte());
			
			personas[i] = personaAux;
			
		}

		teclado.close();
		
		System.out.println("Estos son los datos de las personas");
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].mostrarAtributos());
		}
		
		
		System.out.println("Cantidad de persona creadas :" + Persona.getContador());
		
		
//		Persona p1 = new Persona();
//		Persona p2 = new Persona();
//		Persona p3 = new Persona();
//		Persona p4 = new Persona();
//		Persona p5 = new Persona();
//		Persona p51 = new Persona();
//		Persona p511 = new Persona();
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//		System.out.println(p3.toString());
//		System.out.println(p4.toString());
//		System.out.println(p5.toString());
//
//		System.out.println("Cantidad de objetos Persona Creados: " + Persona.contador);
//		Persona.contador = 125;
//		System.out.println(p1.contador);
//		System.out.println(p2.contador);

	}

}
