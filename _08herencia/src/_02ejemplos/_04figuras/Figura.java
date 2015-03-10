package _02ejemplos._04figuras;

public abstract class Figura {
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	@Override
	public String toString(){
		return "Area: " + String.format("%7.2f", calcularArea()) +
		"\nPerimetro: " + String.format("%7.2f", calcularPerimetro());
	}
}
