package _03ejercicios._06conjuntos;

public class ConjuntoArray<T> implements Conjunto<T> {

	// ATRIBUTOS
	
	Object elementos[];
	private int numElementos;
	private final int MAX = 10;
	
	// CONSTRUCTOR
	
	public ConjuntoArray(){
		
	}
	
	//OTROS
	
	@Override
	public void anyadir(T elemento) throws ElementoDuplicado {
		
	}
	
	@Override
	public void quitar(T elemento) throws ElementoNoEncontrado {
		
	}
	
	@Override
	public boolean pertenece(T elemento) {
		return false;
	}
}
