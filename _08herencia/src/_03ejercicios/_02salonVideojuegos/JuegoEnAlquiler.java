package _03ejercicios._02salonVideojuegos;

public class JuegoEnAlquiler extends JuegoAlquilerVenta {
	private int dias;
	public JuegoEnAlquiler(String t, String f, int a, double p, int c, int d){
		super(t, f, a, p, c);
		dias = d;
	}
	
	public void alquilar(){
		copias--;
	}
	
	public void devolver(){
		copias++;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nDias: " + dias;
	}
}
