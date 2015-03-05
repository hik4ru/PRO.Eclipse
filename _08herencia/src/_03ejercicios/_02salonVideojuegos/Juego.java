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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo;
		result = prime * result
				+ ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		
		
		
	}

	
}
