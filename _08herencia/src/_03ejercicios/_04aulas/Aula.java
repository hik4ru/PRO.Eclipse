package _03ejercicios._04aulas;

public class Aula {

	private int codigo;
	private double longitud, anchura;
	private final static double METROS_POR_ALUMNO = 1.4;
	
	// CONSTRUCTORES
	
	public Aula(int codigo, double longitud, double anchura){
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}

	// GETTERS Y SETTERS
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	
	// OTROS
	
	protected double superficie(){
		return longitud * anchura;
	}
	
	public int capacidad(){
		return (int)(superficie()/METROS_POR_ALUMNO);
	}
	
	@Override
	public String toString(){
		return "Codigo: " + codigo + "\n" +
			   "Superficie: " + superficie() + " m2\n" +
			   "Capacidad: " + capacidad() + " personas";
	}
	
}
