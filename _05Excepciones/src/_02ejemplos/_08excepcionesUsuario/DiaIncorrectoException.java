package _02ejemplos._08excepcionesUsuario;

public class DiaIncorrectoException extends FechaException {
	public DiaIncorrectoException(){
		super();
	}
	public DiaIncorrectoException(String mensaje){
		super(mensaje);
	}
}
