package _02ejemplos;

import java.util.Scanner;

public class ControlDeTrayectos2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		TiempoV2 salida = new TiempoV2();
		
		System.out.println("Instante de salida");
		
		System.out.print("hora: ");
		salida.setHora(tec.nextInt());
		
		System.out.print("minuto: ");
		salida.setMinuto(tec.nextInt());
		
		System.out.println("segundo: ");
		salida.setSegundo (tec.nextInt());
		
		TiempoV2 llegada = new TiempoV2();
		
		System.out.println("Instante de llegada");
		
		System.out.print("hora: ");
		llegada.setHora (tec.nextInt());
		
		System.out.print("minuto: ");
		llegada.setMinuto (tec.nextInt());
		
		System.out.println("segundo: ");
		llegada.setSegundo (tec.nextInt());
		
		System.out.println("Salida: " + salida.toString());
		System.out.println("Llegada: " + llegada.toString());
	}

}
