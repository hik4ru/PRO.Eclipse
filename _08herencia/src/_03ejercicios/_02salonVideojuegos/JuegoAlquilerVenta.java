package _03ejercicios._02salonVideojuegos;

public abstract class JuegoAlquilerVenta extends Juego {
	protected double precio;
	protected int copias;
	
	public JuegoAlquilerVenta(String t, String f, int a, double p, int c){
		super(t, f, a);
		precio = p;
		copias = c;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCopias() {
		return copias;
	}
	
	@Override
	public String toString(){
		return super.toString() +
				"\nPrecio: " + precio + 
				"\nCopias Disponibles: " + copias;
	}
}
