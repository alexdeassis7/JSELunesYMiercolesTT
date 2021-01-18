package ar.com.educacionit.clase1;

import java.util.Scanner;

/*Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres hay en un 
 * grupo de estudiantes*/
public class AppPrincipal {

	//Punto de inicio de ejecucion de la app 
	//funcion principal 
	public static void main(String[] args) {
		//defino mis variables de trabajo 
		float porcentajeH = 0 , porcentajeM = 0 , numHombres = 0 , numMujeres = 0, totalAlumnos = 0 ;
		Scanner teclado = new Scanner(System.in);
//		que entra ? 
		
		System.out.println("ingrese el numero de mujeres de sus grupo de estudiantes ");
		numMujeres = teclado.nextFloat();
		System.out.println("ingrese el numero de Hombres de sus grupo de estudiantes");
		numHombres = teclado.nextFloat();
//		que se procesa ?
		totalAlumnos = numMujeres + numHombres ;
		porcentajeM = numMujeres * 100 / totalAlumnos ;
		porcentajeH = numHombres * 100 / totalAlumnos ;		
//		que sale?
		System.out.println("El porcetaje de mujeres es : " + porcentajeM);
		System.out.println("El porcetaje de hombres es : " + porcentajeH);
				
	} 
}
