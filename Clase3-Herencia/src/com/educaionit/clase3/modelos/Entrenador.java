package com.educaionit.clase3.modelos;

//clase hija
public class Entrenador extends SeleccionFutbol {

	private String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento (Clase hija entrenador)");
	}
	//pisamos el metodo de la clase padre 
	@Override
	public void partidoFutbol() {
		System.out.println("DpartidoFutbol = > Clase Hija Entrenador");
	}

	public void planificarEntrenamiento() {
		System.out.println("Planificar Entrenamiento = > Clase Hija Entrenador");
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

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}


}
