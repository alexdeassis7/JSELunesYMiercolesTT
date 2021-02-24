package com.educacionit.generics.programa;

import com.educacionit.generics.Bolsa;
import com.educacionit.generics.BolsaGenerica;
import com.educacionit.generics.Chocolatina;
import com.educacionit.generics.Golosina;

public class AppPrincipal {

	public static void main(String[] args) {

		Bolsa bolsa = new Bolsa(5);

		Chocolatina c = new Chocolatina("Milka");
		Chocolatina c1 = new Chocolatina("Ferrero");
		Chocolatina c2 = new Chocolatina("Cofler");

		Golosina g = new Golosina("gomitas");
		Golosina g1 = new Golosina("chicles");

		// agregamos chocolatinas y golosinas a nuestra bolsa
		bolsa.agregar(c);
		bolsa.agregar(c1);
		bolsa.agregar(c2);
		bolsa.agregar(g);
		bolsa.agregar(g1);

		for (Object o : bolsa) {
			if (o instanceof Chocolatina) {
				Chocolatina chocolatina = (Chocolatina) o;
				System.out.println(chocolatina.getMarca());
			} else {
				Golosina golosina = (Golosina) o;
				System.out.println(golosina.getNombre());
			}
		}

		System.out.println("************* Bolsa Generica *************");
		BolsaGenerica<Chocolatina> bolsa2 = new BolsaGenerica<Chocolatina>(3);

		BolsaGenerica<Golosina> bolsa3 = new BolsaGenerica<Golosina>(2);
		// lleno mi bolsa de chocolatinas
		bolsa2.agregar(c);
		bolsa2.agregar(c1);
		bolsa2.agregar(c2);
//		bolsa2.agregar(c);
//		bolsa2.agregar(c1);
//		bolsa2.agregar(c2);


		// lleno mi bolsa de golosinas
		bolsa3.agregar(g);
		bolsa3.agregar(g1);

		System.out.println("-----bolsa de Chocolatinas-----");
		for (Chocolatina chocolatina : bolsa2) {
			System.out.println(chocolatina.getMarca());
		}
		
		System.out.println("-----bolsa de golosinas-----");
		for (Golosina golosina : bolsa3) {
			System.out.println(golosina.getNombre());
		}

	}

}
