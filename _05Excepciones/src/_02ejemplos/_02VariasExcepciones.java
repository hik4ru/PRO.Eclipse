package _02ejemplos;

import java.util.Scanner;

public class _02VariasExcepciones {

	public static void main(String[] args) {
		/*
		 * El usuario introduce su NIF.
		 * A continuacion introduce dos posiciones de su NIF,
		 * se dividen los n�meros de dichas posiciones y
		 * se muestra el resultado.
		 */
		try{
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce NIF:");
		String nif = tec.next();
		
		System.out.println("Indica dos posiciones del NIF:");
		int pos1 = tec.nextInt();
		int pos2 = tec.nextInt();
		
		//Numero que hay en la priemra posici�n
		int num1 = Integer.parseInt(""+nif.charAt(pos1));
		int num2 = Integer.parseInt(""+nif.charAt(pos2));
		
		//Division de los dos numeros
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error en los datos de entrada");
		} catch (NumberFormatException e) {
			System.out.println("La posici�n escogida no tiene un n�mero");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("La posici�n escogida es incorrecta");
		} catch (ArithmeticException e) {
			System.out.println("Divisi�n por cero");
		}
		System.out.println("Si has cometido alg�n error, vuelve a ejecutar el programa");
	}

}
