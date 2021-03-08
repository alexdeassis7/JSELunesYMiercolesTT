package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelos.PersonaVO;


@WebServlet("/FormPersonaController")
public class FormPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturamos todos los parametros del Request!
		//(estos son los datos que ingresa el user en el formulario)
		String nombreRecibido = request.getParameter("nombre");
		String telefonoRecibido = request.getParameter("telefono");
		int edadRecibido = Integer.parseInt(request.getParameter("edad"));
		String profesionRecibido = request.getParameter("profesion");
		
		PersonaVO pvo = new PersonaVO(edadRecibido, telefonoRecibido,nombreRecibido, profesionRecibido);
		
		PersonaDAO pdao = new PersonaDAO();
		pdao.registrarPersona(pvo);
		
		//redirecciono a otra vista!
		response.sendRedirect("vistas/About.html");
	}

}
