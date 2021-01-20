package ar.com.educacionit.clase2;

/*1)Calcular el promedio de 50 valores almacenados en un Vector.
 *  Determinar además cuantos son mayores que el promedio, imprimir 
 *  el promedio, el número de datos mayores que el promedio y una lista
 *   de valores mayores que el promedio .*/
public class AppPrincipal {

	public static void main(String[] args) {
		float[] arrayValores = new float[10];
		float[] arrayDeValoresMayoresAlPromedio;

		float sumatoria = 0, promedio = 0;
		int cantidadDeDatosMayoresAlPromedio = 0;

		// Cargamos el array de manera aleatoria
		for (int i = 0; i < arrayValores.length; i++) {
			arrayValores[i] = (float) Math.random() * 100 + 1;
			sumatoria += arrayValores[i];
		}
		// calculo el promedio
		promedio = sumatoria / arrayValores.length;
		System.out.println("El promedio es : " + promedio);

		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				cantidadDeDatosMayoresAlPromedio++;
			}
		}

		arrayDeValoresMayoresAlPromedio = new float[cantidadDeDatosMayoresAlPromedio];

		int j = 0; // indice para arrayDeValoresMayoresAlPromedio

		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				arrayDeValoresMayoresAlPromedio[j] = arrayValores[i];
				j++;
			}
		}

		System.out.println("La cantida de datos mayores que el promedio es : " + cantidadDeDatosMayoresAlPromedio);
		System.out.println("el vector de datos iniciales es :");
		for (int i = 0; i < arrayValores.length; i++) {
			System.out.print(arrayValores[i] + "-");
		}
		
		System.out.println("\nestos son los datos del vector que tiene los valores mayores al promedio :");
		for (int i = 0; i < arrayDeValoresMayoresAlPromedio.length; i++) {
			System.out.print(arrayDeValoresMayoresAlPromedio[i] + "-");
		}
		
		
		

	}

}

//otra forma de inicializar un vector :

//int[] edades = { 18, 45, 56, 45, 12, 26 };
//int[] edades2 = new int[6];
//edades2[0]= 18 ;
//edades2[1]= 45 ;
//edades2[2]= 56 ;
//edades2[3]= 45 ;
//edades2[4]= 12 ;
//edades2[5]= 26 ;

//System.out.println("cantidad de elementos " + edades.length);
