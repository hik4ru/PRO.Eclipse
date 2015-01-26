package _02ejemplos._08excepcionesUsuario;

public class MesIncorrectoException extends FechaException {
	public MesIncorrectoException(){
		super();
	}
	public MesIncorrectoException(String mensaje){
		super(mensaje);
	}
}
