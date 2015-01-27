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
		this.cambio = cambio;
		this.stock = stock;
		this.precio = precio;
		credito = 0;
		recaudacion = 0;
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
	
	public double redondear(double num){
		num = Math.round(num*100)/100.0;
		return num;
	}
	
	public void introducirDinero (double importe){
		credito += importe;
		credito = redondear(credito);
	}
	
	public double solicitarDevolucion(){
		double cambio = credito;
		credito = 0;
		cambio = redondear(cambio);
		return cambio;
	}
	
	public double comprarProducto() throws NoHayCambioException, NoHayProductoException, CreditoInsuficienteException{
		if (cambio < precio) throw new NoHayCambioException();
		else {
			if (stock <= 0) throw new NoHayProductoException();
			else {
				if (credito < precio) throw new CreditoInsuficienteException();
				else {
					recaudacion += precio;
					recaudacion = redondear(recaudacion);
					double cambio = credito-precio;
					cambio = redondear(cambio);
					credito = 0;
					return cambio;
				}
			}
		}
	}
}
