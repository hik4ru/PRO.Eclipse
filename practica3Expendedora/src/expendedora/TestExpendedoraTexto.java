package expendedora;

import java.util.Scanner;

import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

public class TestExpendedoraTexto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Expendedora exp1 = new Expendedora(100, 50, 1.3);
		
		int opcion; 
		
		do {
			
			System.out.println("Elija una opcion: \n\n" +
					   "1.- Introducir dinero\n" + 
					   "2.- Solicitar devolucion\n" +
					   "3.- Comprar producto\n" +
					   "4.- Fin");
			
			opcion = tec.nextInt();
			
			if (opcion == 1) {
				
				System.out.println("Por favor, introduzca el importe deseado: ");
				exp1.introducirDinero(tec.nextDouble());
				estado(exp1);
				
			} else if (opcion == 2) {
				
				System.out.println("Se le será realizado un reintegro de su crédito");
				exp1.solicitarDevolucion();
				estado(exp1);
				
			} else if (opcion == 3) {
				
				System.out.println("Se ha realizado la compra");
				try {
					exp1.comprarProducto();
				} catch (NoHayCambioException e) {
					System.out.println("No ha sido posible realizar su compra, no hay cambio disponible en la maquina.");
					e.printStackTrace();
				} catch (NoHayProductoException e) {
					System.out.println("No ha sido posible realizar su compra, no hay producto disponible en la maquina.");
					e.printStackTrace();
				} catch (CreditoInsuficienteException e) {
					System.out.println("No ha sido posible realizar su compra, su credito es insuficiente.");
					e.printStackTrace();
				}
				estado(exp1);
				
			} else if (opcion != 4) {
				System.out.println("Opcion incorrecta. Por favor, elija correctamente.");
			}

		} while (opcion != 4);
		
	}
	
	public static void estado(Expendedora exp){
		System.out.format("Credito: %5.2 euros\n", exp.getCredito() +
						  "Cambio: %5.2 euros\n", exp.getCambio() +
						  "Stock: %2 unidades\n", exp.getStock() +
						  "Recaudacion: %6.2\n", exp.getRecaudacion());
	}
}
