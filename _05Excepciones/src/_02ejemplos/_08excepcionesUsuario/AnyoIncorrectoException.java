package _02ejemplos._08excepcionesUsuario;

public class AnyoIncorrectoException extends FechaException {
	public AnyoIncorrectoException(){
		super();
	}
	public AnyoIncorrectoException(String mensaje){
		super(mensaje);
	}
}
