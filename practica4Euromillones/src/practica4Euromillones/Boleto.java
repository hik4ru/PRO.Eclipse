package practica4Euromillones;

public class Boleto {

	private static final int MAXAPUESTAS = 5;
	private Apuesta apuestas[];
	private int numApuestas;
	
	public Boleto(int numApuestas, int numNumeros, int numEstrellas, int maxValorNumeros, int maxValorEstrellas) throws IllegalArgumentException{
		this.numApuestas = numApuestas;
		this.numNumeros = numNumeros;
	}
	
}
