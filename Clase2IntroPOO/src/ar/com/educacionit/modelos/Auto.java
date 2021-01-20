
//package al que pertenece la clase
package ar.com.educacionit.modelos;

//definicion de la clase Auto
//public : es un modificador de accceso que permite que esta clase se pueda
//utilizar en cualquier otro package dentro de la app
public class Auto {
	// atributo :definene las caracteristicas
	public String marca;
	public String modelo;
	public String color;
	public int anio;
	public String transmision;
	public int cantPuertas;

	// Metodos constructores
	// SOBRECARGA DE METODOS CONSTRUCTORES
	// constructor Vacio
	// al momento de definir otro constructor
	// se perdera el contructor vacio
	public Auto() {

	}

	public Auto(String marca, String modelo, String color, int anio, String transmision, int cantPuertas) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.transmision = transmision;
		this.cantPuertas = cantPuertas;
	}

	public Auto(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Auto(int anio, String transmision) {
		this.anio = anio;
		this.transmision = transmision;
	}

	// no se puede crear constructores
	// sobrecargados con la misma firma
//	public Auto (String color , String modelo) {
//		this.color = color ;
//		this.modelo = modelo ;
//	}

	// metodos
	public void acelerar(int kmXhs) {
		System.out.println("Estoy acelerando mi " + marca + " a " + kmXhs + " Km x hs");
	}

	public void frenar() {
		System.out.println("Estoy frenando mi " + marca);
	}

	public void cargarCombustible(float listrosAcargar, String tipoDeCombustible) {
		System.out.println("Cargame por favor " + listrosAcargar + " litros de " + tipoDeCombustible);
	}

	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anio=" + anio + ", transmision="
				+ transmision + ", cantPuertas=" + cantPuertas + "]";
	}

}
