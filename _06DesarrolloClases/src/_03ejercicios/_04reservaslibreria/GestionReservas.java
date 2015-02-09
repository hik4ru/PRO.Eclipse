package _03ejercicios._04reservaslibreria;

import java.util.Scanner;

public class GestionReservas {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		final String opciones[] = {"Realizar reserva","Cancelar reserva","Pedido","Recepcion","Salir"};
		ListaReservas listaReservas = new ListaReservas();
		int opcion;
		
		do {
			opcion = menu(opciones, tec);
			switch(opcion){
			case 1: 
				reservar(listaReservas,tec);
				break;
				
			case 2: 
				cancelar(listaReservas,tec);
				break;
				
			case 3: 
				pedido(listaReservas,tec);
				break;
				
			case 4: 
				recepcion(listaReservas,tec);
				break;
			}
		} while (opcion !=5);
	}
	
	public static int menu(String opciones[], Scanner tec){
		int opcion;
		do {
			for (int i = 0; i < opciones.length; i++) {
				System.out.println("(" + (i+1) + ") " + opciones[i] + "\n");
			}
			opcion = tec.nextInt();
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}
	
	public static void reservar(ListaReservas l, Scanner tec){
		System.out.println("NIF: ");
		String nif = tec.nextLine();
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		System.out.println("Telefono: ");
		String tel = tec.nextLine();
		System.out.println("Codigo libro: ");
		String cod = tec.nextLine();
		System.out.println("Numero de ejemplares: ");
		String ejem = tec.nextLine();
		
		try{
			l.reservar(nif, nombre, tel, cod, ejem);
		} catch (ListaLlenaException e){
			System.out.println(e.getMessage());
		} catch (ElementoDuplicadoException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void cancelar(ListaReservas l){
		
	}
}
