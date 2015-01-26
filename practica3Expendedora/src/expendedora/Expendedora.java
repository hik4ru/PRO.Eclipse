package expendedora;

import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

public class Expendedora {

	// ATRIBUTOS
	
	private double credito, precio, cambio, recaudacion;
	private int stock;
	
	// CONSTRUCTOR
	
	public Expendedora (double cambio, int stock, double precio){
		
	}
	
	// CONSULTORES
	
	public double getCredito(){
		return credito;
	}
	
	public double getCambio(){
		return cambio;
	}
	
	public double getRecaudacion(){
		return recaudacion;
	}
	
	public int getStock(){
		return stock;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	// OTROS
	
	@Override
	public String toString(){
		return "Credito: " + credito + " euros" +
				"\nCambio: " + cambio + " euros" +
				"\nStock: " + stock + " unidades" +
				"\nRecaudacion: " + recaudacion + " euros ";
	}
	
	public void introducirDinero (double importe){
		credito += importe;
	}
	
	public double solicitarDevolucion(){
		return credito;
	}
	
	public double comprarProducto() throws NoHayCambioException, NoHayProductoException, CreditoInsuficienteException{
		if (cambio < precio) throw new NoHayCambioException();
		else {
			if (stock <= 0) throw new NoHayProductoException();
			else {
				if (credito < precio) throw new CreditoInsuficienteException();
				else return credito-precio;
			}
		}
	}
	
}
