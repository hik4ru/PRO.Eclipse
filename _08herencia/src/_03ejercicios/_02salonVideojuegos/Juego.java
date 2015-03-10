package _03ejercicios._02salonVideojuegos;

public class Juego {

	// ATRIBUTOS
	
	protected String titulo, fabricante;
	protected int anyo;
	
	// CONSTRUCTORES
	
	public Juego(String titulo, String fabricante, int anyo){
		this.titulo = titulo;
		this.fabricante = fabricante;
		this.anyo = anyo;
	}

	// GETTERS Y SETTERS
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	// OTROS
	
	public String toString(){
		return "Titulo: " + titulo +
				"\nFabricante: " + fabricante + 
				"\nAnyo: " + anyo;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		else if (this == o) return true;
		else if (!(o instanceof Juego)) return false;
		else {
			Juego j = (Juego) o;
			return titulo.equals(j.titulo) && fabricante.equals(j.fabricante) && anyo == j.anyo;
		}
	}

	public int compareTo(Object o ){
		Juego j = (Juego) o;
		int compTitulo = titulo.compareTo(j.titulo);
		if(compTitulo != 0) return compTitulo;
		
		int compFab = fabricante.compareTo(j.fabricante);
		if(compFab != 0) return compTitulo;
		
		if(anyo < j.anyo) return -1;
		else if(anyo > j.anyo) return 1;
		else return 0;
	}
}
