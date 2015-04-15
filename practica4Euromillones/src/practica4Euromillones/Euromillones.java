package practica4Euromillones;

import java.util.Scanner;

public class Euromillones {

	private static final int NUMNUMEROS = 5;
	private static final int NUMESTRELLAS = 2;
	private static final int MAXVALORNUMEROS = 50;
	private static final int MAXVALORESTRELLAS = 11;
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean demasiadasApuestas = false;
		
		do {
			try {
				demasiadasApuestas = false;
				System.out.println("Introduzca el numero de apuestas que quiere realizar: ");
				int numApuestas = tec.nextInt();
				Boleto b = new Boleto(numApuestas, NUMNUMEROS, NUMESTRELLAS, MAXVALORNUMEROS, MAXVALORESTRELLAS);
				System.out.println(b.toString());
			} catch (IllegalArgumentException e) {
				System.out.println("Por favor, introduzca un numero correcto de apuestas. Recuerde que el valor maximo de apuestas es 5.");
				demasiadasApuestas = true;
			}
		} while (demasiadasApuestas);
	}

}
