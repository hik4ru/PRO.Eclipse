package _03ejercicios._04aulas;

public class AulaInformatica extends Aula {

	// ATRIBUTOS
	
	private int pcs;
	private final static int ALUMNOS_POR_ORDENADOR = 2;
	
	// CONSTRUCTORES
	
	public AulaInformatica(int codigo, double longitud, double anchura, int pcs){
		super(codigo,longitud,anchura);
		this.pcs = pcs;
	}

	// GETTERS Y SETTERS
	
	public int getPcs() {
		return pcs;
	}

	public void setPcs(int pcs) {
		this.pcs = pcs;
	}
	
	// OTROS
	
	@Override
	public int capacidad(){
		return pcs*ALUMNOS_POR_ORDENADOR;
	}
	
	@Override
	public String toString(){
		return "Aula de informática: \n" + super.toString();
	}
	
}
