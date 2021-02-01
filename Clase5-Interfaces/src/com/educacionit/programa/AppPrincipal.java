package com.educacionit.programa;

import com.educacionit.interfaces.IConstantes;
import com.educacionit.interfaces.ISeries;
import com.educacionit.modelos.DeDos;
import com.educacionit.modelos.DeTres;

public class AppPrincipal implements IConstantes {

	public static void main(String[] args) {

		DeDos ob = new DeDos();

		for (int i = 0; i < 5; i++) {
			System.out.println("Siguiente Valor es " + ob.getSiguiente());
		}

		System.out.println("\n Reiniciando");
		ob.reiniciar();

		for (int i = 0; i < 5; i++) {
			System.out.println("Siguiente Valor es " + ob.getSiguiente());
		}

		System.out.println("\n iniciando en 100");
		ob.setComenzar(100);

		for (int i = 0; i < 5; i++) {
			System.out.println("Siguiente Valor es " + ob.getSiguiente());
		}

		// Demostracion de referencia de interface
		/* podemos crear una variable de referencia de interfaz */
		ISeries ob2;
		DeDos dosOb = new DeDos();
		DeTres tresOb = new DeTres();

		for (int i = 0; i < 5; i++) {
			ob2 = dosOb;
			System.out.println("Siguiente valor DeDos es : " + ob2.getSiguiente());
			ob2 = tresOb;
			System.out.println("Siguiente valor DeTres es : " + ob2.getSiguiente());

		}

		// Una variable de interfaz solo tiene conocimiento de los metodos declarador
		// por su declaracion de interfaz. Por lo tanto, ob no se puede utilizar para
		// acceder a
		// variables o metodos que puedan ser del objeto
//		ob2 = dosOb;
//		System.out.println("Siguiente valor DeDos es : " + ob2.getAnterior()); ERROR!!!

		// Utilizamos las contantes :

		int numero[] = new int[11];

		for (int i = MIN; i < 11; i++) {
			if (i >= MAX) {
				System.out.println(MSJERROR);
			} else {
				numero[i] = i;
				System.out.println(numero[i]);
			}

		}

	}
}
