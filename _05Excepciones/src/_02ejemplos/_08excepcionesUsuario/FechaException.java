package _02ejemplos._08excepcionesUsuario;

public class FechaException extends Exception {
	public FechaException(){
		super();
	}
	public FechaException(String mensaje){
		super(mensaje);
	}
}
