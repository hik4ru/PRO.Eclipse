package _03ejercicios._04reservaslibreria;

import java.util.Scanner;

public class TestReservas {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		// INICIALIZANDO VARIABLES
		
		String nif1, nombre1, tel1, nif2, nombre2, tel2;
		int codigo1=0, ejemplares1=0, codigo2=0, ejemplares2=0;
		
		// RESERVA 1
		
		System.out.println("Creando reserva 1:");
		System.out.println("Nif 1:");
		nif1 = tec.nextLine();
		System.out.println("Nombre 1:");
		nombre1 = tec.nextLine();
		System.out.println("Telefono 1:");
		tel1 = tec.nextLine();
		System.out.println("Codigo 1:");
		codigo1 = tec.nextInt();
		System.out.println("Numero de ejemplares 1:");
		ejemplares1 = tec.nextInt();
		
		Reserva r1 = new Reserva(nif1,nombre1,tel1,codigo1,ejemplares1);
		Reserva r2;
		
		do {
		System.out.println("Creando reserva 2:");
		System.out.println("Nif 2:");
		tec.nextLine();
		nif2 = tec.nextLine();
		System.out.println("Nombre 2:");
		nombre2 = tec.nextLine();
		System.out.println("Telefono 2:");
		tel2 = tec.nextLine();
		System.out.println("Codigo 2:");
		codigo2 = tec.nextInt();
		System.out.println("Numero de ejemplares 2:");
		ejemplares2 = tec.nextInt();

		r2 = new Reserva(nif2,nombre2,tel2,codigo2,ejemplares2);
		
		System.out.println("---");
		
		if (r1.equals(r2)) System.out.println("Las reservas no pueden ser iguales");
		else System.out.println("Las reservas son diferentes");
		
		} while (r1.equals(r2));
		
	}
}
