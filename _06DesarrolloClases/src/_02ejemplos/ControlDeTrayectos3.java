package _02ejemplos;

import java.util.Scanner;

public class ControlDeTrayectos3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Instante de salida");
		
		System.out.print("hora: ");
		int h = tec.nextInt();
		
		System.out.print("minuto: ");
		int m = tec.nextInt();
		
		System.out.println("segundo: ");
		int s = tec.nextInt();
		
		TiempoV2 salida = new TiempoV2(h, m, s);
		System.out.println(salida.getHora());
		
		
		System.out.println("Instante de llegada");
		
		System.out.print("hora: ");
		h = tec.nextInt();
		
		System.out.print("minuto: ");
		m = tec.nextInt();
		
		System.out.println("segundo: ");
		s = tec.nextInt();
		
		TiempoV2 llegada = new TiempoV2(h, m, s);
		
		System.out.println("Salida: " + salida.toString());
		System.out.println("Llegada: " + llegada.toString());
	}

}
