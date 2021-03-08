package com.educacionit.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormController") //http://localhost:8080/MiPrimerAppWeb/FormController
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FormController() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Nos llego tu Request/Peticion al metodo DoGet del servlet FormController");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nos llego tu Request/Peticion al metodo DoPost del servlet FormController");
		//capturamos los valores de los parametros que vienen en la peticion 
		String em = request.getParameter("email");
		String un = request.getParameter("uname");
		String pa = request.getParameter("pass");
		String ge = request.getParameter("gender");
		String[] co = request.getParameterValues("course");
		
		//generamos una respuesta HTML para actualizar la vista del usuario 
		response.setContentType("text/html");
		
		//comenzamos a escribir el html del response 
		
		PrintWriter pw = response.getWriter();
		pw.write("<h1>Gracias por contactarnos </h1>");
		pw.write("<h2>Corrobore que los datos que recibimos en el Back End esten correcto o reenvie sus datos :</h2>");
		
		pw.write("<h3>Email Recibido :"+ em + "</h3>");
		pw.write("<h3>Nombre Recibido :" + un + "</h3>");
		pw.write("<h3>Clave Recibida :" + pa + "</h3>");
		pw.write("<h3>Genero Recibido :" + ge + "</h3>");
		pw.write("<h3>Cursos Recibidos :");
		
		for(String cursoAux : co ) {
			pw.write(cursoAux + " ");
		}
		
//		co = [java , php  , .net]
		
		pw.write("</h3>");
		
//		doGet(request, response);
//		16:50 Retomamos

	}

}
