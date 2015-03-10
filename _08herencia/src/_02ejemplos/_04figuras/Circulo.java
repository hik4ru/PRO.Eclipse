package _02ejemplos._04figuras;

public class Circulo extends Figura {

	// ATRIBUTOS
	
	public double radio;
	
	// CONSTRUCTORES
	
	public Circulo(double r){
		radio = r;
	}
	
	// GETTERS Y SETTERS

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// OTROS
	
	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	@Override
	public String toString() {
		return "Circulo: " +
				"\nRadio: " + radio +
				"\n" + super.toString();
	}

}
