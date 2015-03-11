package _02ejemplos._04figuras;

public class Rectangulo extends Figura {

	private double longitud;
	private double anchura;
	
	public Rectangulo(double l, double a){
		longitud = l;
		anchura = a;
	}
	
	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
	@Override
	public String toString() {
		return "Rectangulo: " +
				"\nLongitud: " + longitud +
				"\nAnchura: " + anchura +
				"\n" + super.toString();
	}

	@Override
	public double calcularArea() {
		return longitud * anchura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (longitud + anchura);
	}

}
