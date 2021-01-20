package ar.com.educacionit.programa;

import ar.com.educacionit.modelos.Auto;

public class AppPrincipal {

	public static void main(String[] args) {

		// instanciamos un objeto de la clase Auto con el constructor vacio
		Auto a1 = new Auto();
		// instanciamos un objeto de la clase Auto con el constructor con todos
		// parametros
		Auto a2 = new Auto("chevrolet", "cruze", "blanco", 2015, "manual", 4);

		System.out.println("mostramos los atributos del objeto A2");
		System.out.println(a2.toString());

		// instanciamos un objeto de la clase Auto con el constructor con 2 parametros
		Auto a3 = new Auto("jeep", "grand cheroke");
		System.out.println(a3.toString());

		// accedo a los atributo del objeto a1
		System.out.println("mostramos los atributos del objeto A1");
//		System.out.println("marca:" + a1.marca);
//		System.out.println("marca:" + a1.modelo);
//		System.out.println("marca:" + a1.color);
//		System.out.println("marca:" + a1.anio);
//		System.out.println("marca:" + a1.transmision);
//		System.out.println("marca:" + a1.cantPuertas);
		System.out.println(a1.toString());

		System.out.println("modificamos los estados de los atributos :");
		a1.anio = 2017;
		a1.modelo = "focus";
		a1.marca = "ford";
		a1.color = "plata";
		a1.transmision = "automatica";
		a1.cantPuertas = 5;

		// accedo a los atributo del objeto a1
//		System.out.println("mostramos los atributos del objeto A1");
//		System.out.println("marca:" + a1.marca);
//		System.out.println("modelo:" + a1.modelo);
//		System.out.println("color:" + a1.color);
//		System.out.println("anio:" + a1.anio);
//		System.out.println("transmision:" + a1.transmision);
//		System.out.println("cantidad de puertas:" + a1.cantPuertas);
		System.out.println(a1.toString());
		
		
		System.out.println("**************************");
		System.out.println("imvocamos a los metodos del objeto a1");
		a1.cargarCombustible(100, "nafta super");
		a1.acelerar(120);
		a1.frenar();
		
		System.out.println("**************************");
		System.out.println("imvocamos a los metodos del objeto a2");
		a2.cargarCombustible(50, "nafta Infinia");
		a2.acelerar(150);
		a2.frenar();
		

		System.out.println("**************************");
		System.out.println("imvocamos a los metodos del objeto a3");
		a3.cargarCombustible(130, "Gas Oil");
		a3.acelerar(200);
		a3.frenar();

	}

}
