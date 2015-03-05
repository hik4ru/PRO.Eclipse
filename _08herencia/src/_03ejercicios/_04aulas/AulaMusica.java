package _03ejercicios._04aulas;

public class AulaMusica extends Aula {

	private boolean tienePiano;
	
	public AulaMusica(int codigo, double longitud, double anchura, boolean piano){
		super(codigo,longitud,anchura);
		tienePiano = piano;
	}

	public boolean isTienePiano() {
		return tienePiano;
	}

	public void setTienePiano(boolean tienePiano) {
		this.tienePiano = tienePiano;
	}
	
	// OTROS
	
	@Override
	public String toString(){
		return "Aula de música: \n" + super.toString();
	}
	
}
