package _03ejercicios._04reservaslibreria;

public class ListaReservas {

	public final static int MAX = 100;
	private Reserva lista[];
	private int numReservas;
	public ListaReservas(){
		lista = new Reserva[MAX];
		numReservas = 0;
	}
	
	public void reservar(String nif, String nombre, String tel, int libro, int ejemplares) throws ListaLlenaException, ElementoDuplicadoException{
		
		//if(numReservas == MAX)
		if(numReservas == lista.length)
			throw new ListaLlenaException("Maximo reservas alcanzado");
		
		Reserva r = new Reserva(nif,nombre,tel,libro,ejemplares);
		//Comprobamos si es un duplicado
		boolean enc = false;
		for (int i = 0; i < numReservas && !enc; i++) {
			if(lista[i].equals(r)) enc = true;
		}
		if (enc) throw new ElementoDuplicadoException("La reserva ya existe");
		
		//Anyadimos la reserva
		lista[numReservas] = r;
		numReservas++;
		
		//lista[numReservas++] = r;
	}
	
	@Override
	public String toString(){
		String res = "";
		for (int i = 0; i < numReservas; i++){
			res += lista[i].toString() + "\n";
		}
		return res;
	}
}
