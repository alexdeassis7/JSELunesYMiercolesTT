package com.educacioit.modelos;

//para crear una exception personalizada 
//es necesario extender de Exception 

public class MiPropiaException extends Exception {

	// redefinimos el metodo GetMessage()
	@Override
	public String getMessage() {
		return "Soy un mensaje de error customizado!";
	}

}
