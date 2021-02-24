package com.educacionit.collection;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class AppPrincipal {

	public static void main(String[] args) {
		// Metodos para el manejo de Colas
		// Para insertar : add(e) y offer(e)
		// Para Extraer : remove() lanza exception y poll() simplemente retorna null
		// Para consultar el Frente de la cola : Element() peek()

		// creamos una cola indicando el tipo de dato generico como 'Integer'
		Queue<Integer> cola = new LinkedList<>();

		// Insertamos Datos en la cola
		cola.offer(3);
		cola.offer(14);
		cola.offer(12);
		cola.offer(7);
		cola.offer(10);

		// Imprimimos las cola para ver sus datos
		System.out.println("Cola: " + cola);

		System.out.println("proximo elemento a desencolar :  " + cola.peek());
		// Imprimimos las cola para ver sus datos
		System.out.println("Cola: " + cola);

		// Usamos una estructura repetitiva para desencolar
		while (cola.poll() != null) {// desencolamos y ese valor desencolado se compara con null
			System.out.println(cola);
			// peek : muestra null si la colsa esta vacia
			System.out.println(cola.peek());
		}

		// Desencolamos con element() : lanza un NoSuchElementException si la cola esta
		// vacia
		// cola.element();

		// Ahora creamos una cola con elemento de diferentes tipos
		LinkedList colaMixta = new LinkedList();
		colaMixta.offer(3);
		colaMixta.add(14.7);
		colaMixta.offer(12);
		colaMixta.add(7);
		colaMixta.offer(10);
		colaMixta.add(10.5);
		colaMixta.offer(3);
		colaMixta.add("cadena");
		colaMixta.add("pepe");

		System.out.println("Cola Mixta : " + colaMixta);

		// creamo otra cola
		Queue queue = new LinkedList<>();
		try {
			queue.remove();
		} catch (NoSuchElementException e) {

			System.out.println("no podes extraer elementos de una cola que esta VACIA!");
		}

		queue.add("Item1");

		queue.add("Item2");

		// usamos el metodo offer para encolar , si algo sale mal retornara false o sino
		// retorna true
		if (queue.offer("Item3")) {
			System.out.println("Se agrego correctamente el Item3 a la cola ");
		}
		queue.add("Item4");
		System.out.println(queue);

		System.out.println("Validamos si un determinado elemento existe dentro de la cola ");
		System.out.println("Existe el item2? " + queue.contains("Item2"));
		
		//desencolamos el primer elemento de la cola 
		System.out.println("Removimos el : " + queue.remove());
		System.out.println(queue);
		
		System.out.println("Proximo elemento a Desencolar es : " + queue.element());
	}

}
