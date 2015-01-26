package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01Excepcion {

	public static void main(String[] args) {
		pedirTresNumeros();
		//dividirDosNumeros();
	}
	public static void pedirTresNumeros() {
		System.out.println("Introduce numero 1: ");
		int n1 = leerEnteroPositivo();
		System.out.println("Introduce numero 2: ");
		int n2 = leerEnteroPositivo();
		System.out.println("Introduce numero 3: ");
		int n3 = leerEnteroPositivo();
	}
	public static int leerEnteroPositivo() {
		//La inputMismatchException NO se puede EVITAR
		Scanner tec = new Scanner(System.in);
		int num=-1;
		do{
			try{
				num = tec.nextInt();
			}catch (InputMismatchException e){
				tec.nextLine();
				System.out.println("Tienes que introducir un entero");
			}
		} while (num<0);
		return num;
	}
	public static void dividirDosNumeros() {
		//La excepcion de division por cero se puede EVITAR
		System.out.println("Introduce numero 1: ");
		int n1 = leerEnteroPositivo();
		System.out.println("Introduce numero 2: ");
		int n2 = leerEnteroPositivo();
		if (n2!=0) System.out.println("La division es: " + (n1/n2));
		else System.out.println("No se puede dividir");
	}
}
