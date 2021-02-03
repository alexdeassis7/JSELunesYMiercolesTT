package com.educacionit.clase6;

public class BloquesAnidados {

	public static void main(String[] args) {
		System.out.println("inicio la app");
		int nums[] = { 4, 8, 16, 32, 65, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

//		for (int i = 0; i < nums.length; i++) {
//
//			try {
//				System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
//			} catch (ArithmeticException objetoE) {
//				System.out.println("No se puede dividir por cero en los numero Reales!");
////				System.out.println(objetoE.getMessage());
////				objetoE.printStackTrace();
////				objetoE.getCause();
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("Te desbordaste desbordaste del array de denominadores ");
//
//			}
//		  
//		 }

		// Los bloques Try pueden anidarse de la siguiente manera:

		try { // try Externo

			for (int i = 0; i < nums.length; i++) {

				try { // Try interno

					System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);

				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir por cero en los numero Reales!");
				}

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Te desbordaste desbordaste del array de denominadores ");
		}

		System.out.println("finalizo la app");
	}

}
