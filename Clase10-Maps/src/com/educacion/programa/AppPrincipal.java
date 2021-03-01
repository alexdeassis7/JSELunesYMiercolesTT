package com.educacion.programa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.educacion.modelo.JugadorSeleccion;

public class AppPrincipal {

	public static void main(String[] args) {

		// tenemos 3 implementacion :

		// HashMap :los elemento no tedran un orden especifico , no acepta clave
		// duplicada ni valores nulos
		// TReeMap : lo ordena de forma natural
		// LinkedHashMap:conserva el orden de insercion ,no acepta clave duplicada ni
		// valores nulos

		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
		nombreMap.size();// numero de elementos
		nombreMap.isEmpty();
		nombreMap.put(4, "alex"); // agrego un elemento
		nombreMap.get(4);
		nombreMap.clear();
		nombreMap.remove(4);
		nombreMap.containsKey(4);
		nombreMap.containsValue("alex");
		nombreMap.values();// devuelve una "collection " con los valores del map

		// ejemplo de hashMap
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Casillas");
		map.put(2, "Pique");
		map.put(11, "capdevilla");
		map.put(16, "Busquets");
		map.put(18, "Pedrito");
		map.put(7, "Villa");
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xabi alonso");
		map.put(8, "Xavi Hernandez");
		map.put(6, "Iniesta");

		// imprimo el map con un itterator

		Iterator it = map.keySet().iterator();
		System.out.println("mostramos el HashMap con un ITERATOR :");
		while (it.hasNext()) { // hasNext : comprueba que siguen quedando elementos en el iterator
			Integer key = (Integer) it.next(); // next : me retorna el siguiente elemento del iterador
			System.out.println("Clave: " + key + " -> valor:" + map.get(key));
		}

		// ##################################################################################33
		// ejemplo de hashMap
		Map<Integer, String> TreeMap = new TreeMap<Integer, String>();
		TreeMap.put(1, "Casillas");
		TreeMap.put(2, "Pique");
		TreeMap.put(11, "capdevilla");
		TreeMap.put(16, "Busquets");
		TreeMap.put(18, "Pedrito");
		TreeMap.put(7, "Villa");
		TreeMap.put(15, "Ramos");
		TreeMap.put(5, "Puyol");
		TreeMap.put(14, "Xabi alonso");
		TreeMap.put(8, "Xavi Hernandez");
		TreeMap.put(6, "Iniesta");

		// imprimo el map con un itterator

		Iterator itTreeMap = TreeMap.keySet().iterator();
		System.out.println("mostramos el HashMap con un ITERATOR :");
		while (itTreeMap.hasNext()) { // hasNext : comprueba que siguen quedando elementos en el iterator
			Integer key = (Integer) itTreeMap.next(); // next : me retorna el siguiente elemento del iterador
			System.out.println("Clave: " + key + " -> valor:" + TreeMap.get(key));
		}

		// ##################################################################################33
		// ejemplo de hashMap
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(2, "Pique");
		linkedHashMap.put(11, "capdevilla");
		linkedHashMap.put(16, "Busquets");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(7, "Villa");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(14, "Xabi alonso");
		linkedHashMap.put(8, "Xavi Hernandez");
		linkedHashMap.put(6, "Iniesta");

		// imprimo el map con un itterator

		Iterator itLinkedHashMap = linkedHashMap.keySet().iterator();
		System.out.println("mostramos el linkedHashMap con un ITERATOR :");
		while (itLinkedHashMap.hasNext()) { // hasNext : comprueba que siguen quedando elementos en el iterator
			Integer key = (Integer) itLinkedHashMap.next(); // next : me retorna el siguiente elemento del iterador
			System.out.println("Clave: " + key + " -> valor:" + linkedHashMap.get(key));
		}

		System.out.println("********* Trabajando con los métodos de Map *********");
		System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = " + TreeMap.size());
		System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = " + TreeMap.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = " + TreeMap.get(6));
		System.out.println(
				"Borramos un elemento del Map el 18 (porque fue sustituido): treeMap.remove(18)" + TreeMap.remove(18));
		System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: treeMap.get(18) = "
				+ TreeMap.get(18));
		System.out.println(
				"Vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = " + TreeMap.containsKey(18));
		System.out.println(
				"Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = " + TreeMap.containsKey(1));
		System.out.println("Vemos si existe el valo 'Villa' en el Map: treeMap.containsValue('Villa')"
				+ TreeMap.containsValue("Villa"));
		System.out.println("Vemos si existe el valo 'Ricardo' en el Map: treeMap.containsValue('Ricardo') ="
				+ TreeMap.containsValue("Ricardo"));
		System.out.println("Borramos todos los elementos del Map: treeMap.clear()");
		TreeMap.clear();
		System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = " + TreeMap.size());
		System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = " + TreeMap.isEmpty());

		System.out.println("********* TreeMap con Objetos y como Clave un String *********");

		Map<String, JugadorSeleccion> jugadores = new TreeMap<String, JugadorSeleccion>();
		jugadores.put("Casillas", new JugadorSeleccion(1, "Casilla", "Arquero"));
		jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "Lateral Derecho"));
		jugadores.put("Pique", new JugadorSeleccion(13, "Pique", "Central"));
		jugadores.put("Puyol", new JugadorSeleccion(5, "Puyol", "Central"));
		jugadores.put("Capdevila", new JugadorSeleccion(11, "Capdevila", "Lateral Izquierdo"));
		jugadores.put("Xabi", new JugadorSeleccion(14, "Xabi Alonso", "Medio Centro"));
		jugadores.put("Busquets", new JugadorSeleccion(16, "Busquets", "Medio Centro"));
		jugadores.put("Xavi", new JugadorSeleccion(8, "Xavi Hernandez", "Centro Campista"));
		jugadores.put("Pedrito", new JugadorSeleccion(18, "Pedrito", "Interior Izquierdo"));
		jugadores.put("Iniesta", new JugadorSeleccion(6, "Iniesta", "Interior Derecho"));
		jugadores.put("Villa", new JugadorSeleccion(7, "Villa", "Delantero"));

		for(Entry<String , JugadorSeleccion> jugador : jugadores.entrySet()  ) {
			String clave = jugador.getKey();
			JugadorSeleccion valor = jugador.getValue();
			System.out.println(clave + " -> " + valor.toString());
		}
		
	}

}
