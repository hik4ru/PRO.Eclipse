package _03ejercicios._06conjuntos;

public interface Conjunto {

	public void anyadir() throws ElementoDuplicado;
	public void quitar() throws ElementoNoEncontrado;
	public void pertenece();
		
}
