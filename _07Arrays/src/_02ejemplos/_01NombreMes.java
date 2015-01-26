package _02ejemplos;

import java.util.Scanner;

public class _01NombreMes {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce numero de mes: ");
		int n = tec.nextInt();
		System.out.println("Nombre del mes: " + nombreMes(n));
	}
	
	public static String nombreMes(int numeroMes){
		String nombres[] = {"enero", "febrero", "marzo", "abril",
							"mayo", "junio", "julio", "agosto", 
							"septiembre", "noviembre", "diciembre"};
		return nombres[numeroMes-1];
	}
	
	public static String nombreMes2(int numeroMes){
		String nombres[] = {"", "enero", "febrero", "marzo", "abril",
							"mayo", "junio", "julio", "agosto", 
							"septiembre", "noviembre", "diciembre"};
		return nombres[numeroMes];
	}
}


