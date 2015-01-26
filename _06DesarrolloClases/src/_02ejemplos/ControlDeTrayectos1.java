package _02ejemplos;

import java.util.Scanner;

public class ControlDeTrayectos1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		TiempoV1 salida = new TiempoV1();
		System.out.println("Instante de salida");
		System.out.print("hora: ");
		salida.hora = tec.nextInt();
		System.out.print("minuto: ");
		salida.minuto = tec.nextInt();
		System.out.println("segundo: ");
		salida.segundo = tec.nextInt();
		
		TiempoV1 llegada = new TiempoV1();
		System.out.println("Instante de llegada");
		System.out.print("hora: ");
		llegada.hora = tec.nextInt();
		System.out.print("minuto: ");
		llegada.minuto = tec.nextInt();
		System.out.println("segundo: ");
		llegada.segundo = tec.nextInt();
		
		System.out.println("Salida: " + salida.toString());
		System.out.println("Llegada: " + llegada.toString());
	}

}
