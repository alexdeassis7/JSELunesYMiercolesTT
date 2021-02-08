package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println("inicio app");

		PersonaDAO pd = new PersonaDAO();
//		
//		PersonaVO p1 = new PersonaVO(2, "Fabian San Martin", 22, "Analista funcional", 1155666778);
//		
//		pd.registrarPersona(p1);

		// borramos un registro (Tupla) de la DB
		String idIngresado = JOptionPane.showInputDialog("Ingrese el id de la persona que quiere Eliminar de la DB");
		pd.eliminarPersona(idIngresado);
		
		// buscamos una persona en la base

//		int idIngresado = Integer
//				.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona que quiere Buscar en la DB"));
//
//		PersonaVO personaBuscada = pd.buscarPersona(idIngresado);
//
//		if (personaBuscada != null) {
//			JOptionPane.showMessageDialog(null, personaBuscada.toString());
//		} else {
//			JOptionPane.showMessageDialog(null, "No se encontro en la db al registro con ID : " + idIngresado);
//		}

		//modificar una persona de la db 
//		PersonaVO p4 = new PersonaVO(20, "Nicola Luca", 30, "Medico", 11225050);
//		pd.modificarPersona(p4);
		
		System.out.println("fin app");
	}

}
