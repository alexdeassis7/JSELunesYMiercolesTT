package com.educacionit.clase3.modelos;

public class PassengerDos {
	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalaPagar;
	private int totalEquipaje;

	// contructor 1
//	public PassengerDos() {
//	}

	// constructor 2 con un parametro ->invoca al constructor 4 (privado)
	public PassengerDos(int bolsos) {
		// utilizamos el this para invocar al constructor privado!
		this(bolsos > 1 ? 50.0d : 25.0d);
		this.bolsos = bolsos;
		totalaPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
	}

	// constructor 3 con dos parametros: invoca al constructor 2 que a su
	// vez invoca al constructor 4 privado
	public PassengerDos(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalaPagar = bolsos * tarifaXbolso;
	}

	// constructor 4 privado
	private PassengerDos(double tarifaXbolso) {
		this.tarifaXbolso = tarifaXbolso;
	}
	//Defino todos los getters
	public int getBolsos() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public double getTotalaPagar() {
		return totalaPagar;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}


	public String toString() {
		return "PassengerDos [bolsos=" + bolsos + ", bolsosPagos=" + bolsosPagos + ", tarifaXbolso=" + tarifaXbolso
				+ ", totalaPagar=" + totalaPagar + ", totalEquipaje=" + totalEquipaje + "]";
	}
	

}
