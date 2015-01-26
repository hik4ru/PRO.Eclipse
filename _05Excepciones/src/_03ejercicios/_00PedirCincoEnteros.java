package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _00PedirCincoEnteros {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//------------------------------------------------------------------
		
		System.out.println("A - El programa muestra un mensaje y termina");
		
		int fallos = 0;
		try{
			for(int i=1; i<=5; i++){
			System.out.println("Introduce número "+ i + ": ");
			int num = tec.nextInt();
			} 
		} catch (InputMismatchException e){
			tec.nextLine();
			System.out.println("Te has equivocado");
			fallos++;
		}
		if (fallos == 0) System.out.println("No has cometido ningún fallo");
		else System.out.println("Has cometido " + fallos + " fallos");
		System.out.println("Fin del programa");
		
		//------------------------------------------------------------------
		
		System.out.println("B - El programa muestra un mensaje y le pide el siguiente número");
		
		fallos = 0;
		for(int i=1; i<=5; i++){
			try{
				System.out.println("Introduce número "+ i + ": ");
				int num = tec.nextInt();
			} catch (InputMismatchException e) {
				tec.nextLine();
				System.out.println("Te has equivocado");
				fallos++;
			}
		}
		if (fallos == 0) System.out.println("No has cometido ningún fallo");
		else System.out.println("Has cometido " + fallos + " fallos");
		System.out.println("Fin del programa");
		
		//------------------------------------------------------------------
		
		System.out.println("C - El programa muestra un mensaje y le vuelve a pedir el número");
		
		fallos = 0;
		for(int i=1; i<=5; i++){
			try{
				System.out.println("Introduce número "+ i + ": ");
				int num = tec.nextInt();
			} catch (InputMismatchException e) {
				tec.nextLine();
				System.out.println("Te has equivocado");
				i --;
				fallos++;
			}
		}
		if (fallos == 0) System.out.println("No has cometido ningún fallo");
		else System.out.println("Has cometido " + fallos + " fallos");
		System.out.println("Fin del programa");
		
		//------------------------------------------------------------------
		
		System.out.println("D - El programa muestra un mensaje y le vuelve a pedir los cinco números");
		
		fallos = 0;
		for(int i=1; i<=5; i++){
			try{
				System.out.println("Introduce número "+ i + ": ");
				int num = tec.nextInt();
			} catch (InputMismatchException e) {
				tec.nextLine();
				System.out.println("Te has equivocado");
				i = 0;
				fallos++;
			}
		}
		if (fallos == 0) System.out.println("No has cometido ningún fallo");
		else System.out.println("Has cometido " + fallos + " fallos");
		System.out.println("Fin del programa");
		
	}

}
