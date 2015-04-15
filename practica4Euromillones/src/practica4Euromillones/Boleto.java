package practica4Euromillones;

public class Boleto {

	private final int MAXAPUESTAS = 5;
	private Apuesta apuestas[];
	private int numApuestas;
	private boolean enc;
	
	public Boleto(int numApuestas, int numNumeros, int numEstrellas, int maxValorNumeros, int maxValorEstrellas) throws IllegalArgumentException{
		apuestas = new Apuesta[numApuestas];
		if (numApuestas > MAXAPUESTAS)
			throw new IllegalArgumentException();
		else {
			for (int i = 0; i < numApuestas; i++) {
				apuestas[i] = new Apuesta(numNumeros, numEstrellas, maxValorNumeros, maxValorEstrellas);
				enc = false;
				for (int j = 0; j < i && !enc; j++) {
					if(apuestas[i].equals(apuestas[j])) {
						enc = true;
						i--;
					}
				}
			}
		}
	}
	
	@Override
	public String toString(){
		String papeleta ="         EUROMILLONES" +
						"\n" + apuestas.length + " apuesta(s)" +
						"\n" + "================================" +
						"\n";
		for (int i = 0; i < apuestas.length; i++) {
			papeleta += "  " + (i+1) + ": " + apuestas[i].toString() + "\n";
		}
		papeleta += "================================";
		return papeleta;
	}
}
