package expendedora;

import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

public class TestExpendedoraTexto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Expendedora exp1 = new Expendedora(100, 50, 1.3);
		
//		while(menu() != 4){
//			switch(menu()){
//			case '1':
//				System.out.println("Por favor, introduzca el importe deseado: ");
//				double dinero = tec.nextDouble();
//				exp1.introducirDinero(dinero);
//				estado(exp1);
//				break;
//			case '2':
//				System.out.println("Se le será realizado un reintegro de su crédito");
//				exp1.solicitarDevolucion();
//				estado(exp1);
//				break;
//			case '3':
//				System.out.println("Se ha realizado la compra");
//				try {
//					exp1.comprarProducto();
//				} catch (NoHayCambioException e) {
//					System.out.println("No ha sido posible realizar su compra, no hay cambio disponible en la maquina.");
//				} catch (NoHayProductoException e) {
//					System.out.println("No ha sido posible realizar su compra, no hay producto disponible en la maquina.");
//				} catch (CreditoInsuficienteException e) {
//					System.out.println("No ha sido posible realizar su compra, su credito es insuficiente.");
//				}
//				estado(exp1);
//				break;
//			case '4':
//				break;
//			}
//		}
		
		int opcion;
		
		do {
			
			opcion = menu();
			
			if (opcion == 1) {
				
				System.out.println("Por favor, introduzca el importe deseado: ");
				exp1.introducirDinero(tec.nextDouble());
				estado(exp1);
				
			} else if (opcion == 2) {
				
				System.out.println("Se le ha realizado un reintegro de su crédito");
				exp1.solicitarDevolucion();
				estado(exp1);
				
			} else if (opcion == 3) {
				
				System.out.println("Se ha realizado la compra por un importe de " + exp1.getPrecio() + " euros.");
				try {
					exp1.comprarProducto();
				} catch (NoHayCambioException e) {
					System.out.println("No ha sido posible realizar su compra, no hay cambio disponible en la maquina.");
				} catch (NoHayProductoException e) {
					System.out.println("No ha sido posible realizar su compra, no hay producto disponible en la maquina.");
				} catch (CreditoInsuficienteException e) {
					System.out.println("No ha sido posible realizar su compra, su credito es insuficiente.");
				}
				estado(exp1);
				
			} else if (opcion != 4) {
				System.out.println("Opcion incorrecta. Por favor, elija correctamente.");
			}

		} while (opcion != 4);
		
		System.out.println("Ha utilizado usted una máquina VictorWare. Tenga un buen dia.");
		
	}
	
	public static void estado(Expendedora exp){
		System.out.println("Credito: " + exp.getCredito() + " euros\n" +
						  "Cambio: " + exp.getCambio() + " euros\n" +
						  "Stock: " + exp.getStock() + " unidades\n"+
						  "Recaudacion: " + exp.getRecaudacion() + " euros");
	}
	
	private static int menu(){
		Scanner tec = new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("1.- Introducir dinero\n" + 
					   		   "2.- Solicitar devolucion\n" +
					           "3.- Comprar producto\n" +
					           "4.- Fin\n\n" +
					   		   "Elija una opcion: ");
			try{ 
				opcion = tec.nextInt();
				if(opcion < 1 || opcion > 4) System.out.println("Opción seleccionada no valida");
			} catch (InputMismatchException e) {
				System.out.println("Valor alfanumérico no valido.");
				opcion = 0;
			}
			
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}
	
	
}
