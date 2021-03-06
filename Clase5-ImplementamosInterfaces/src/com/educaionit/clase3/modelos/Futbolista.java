package com.educaionit.clase3.modelos;

//clase hija
public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		// invocamos a los atributos de la clase padre
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento () => Clase Hija Futbolista");
	}

	// piso el metodo de la clase padre
	@Override
	public void partidoFutbol() {
		System.out.println("Jugar un Partido() => Clase Hija Futbolista");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista() => Clase Hija Futbolista");
	}

	@Override
	public void entrenar() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	@Override
	public void jugarPartido() {
		System.out.println("Juega Un Partido (Clase Futbolista)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

}
