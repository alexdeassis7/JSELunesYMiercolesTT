package com.educacionit.entidades;

public class VueloCarga extends Vuelo {
	public int asientos = 12;
	public float espacioMaximoDeCarga = 1000;
	public float espacioCargaUsado;

	public void agregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;

		if (espacioDeCargaDisponible(size)) {
			espacioCargaUsado += size;
			System.out.println("paquete agregado , gracias");
		} else {
			faltaEspacio();
		}
	}

	private boolean espacioDeCargaDisponible(double tamanio) {
		return espacioCargaUsado + tamanio <= espacioMaximoDeCarga;
	}

	private void faltaEspacio() {
		System.out.println("no tenemos mas espacio en la bodega ");

	}

	@Override
	public int getAsiento() {
		return 12;
	}
}
