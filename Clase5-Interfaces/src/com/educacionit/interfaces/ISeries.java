package com.educacionit.interfaces;

public interface ISeries {

	// las Variables declaradas en una interfaz NO SON VARIABLES DE INSTACIA.En
	// cambio
	// son implicitamente public , final y static .Pro lo tanto , son
	// esencialmente CONSTANTES!

	// en una interfaz , los metodos son implicitamente publicos
	int getSiguiente();// Retorna el siguiente numero de la serie

	void reiniciar(); // reinicia la serie

	void setComenzar(int x); // establece un valor inicial

//	default  public void mostrarMensaje() {
//		System.out.println("este metodo solo podes hacerlo en el JDK 8 o superior ");
//	}

}
