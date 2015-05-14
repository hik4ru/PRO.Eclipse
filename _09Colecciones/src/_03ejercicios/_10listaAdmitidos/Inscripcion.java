package _03ejercicios._10listaAdmitidos;

public class Inscripcion {
	private String nif;
	private String nombre;
	private String nivel;
	
	public Inscripcion(String nif, String nombre, String nivel){
		this.nif = nif;
		this.nombre = nombre;
		this.nivel = nivel;
	}
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Inscripcion)) return false;
		return this.nif.equals(((Inscripcion)o).nif);
	}
	public int hashCode(){
		return this.nif.hashCode();
	}
}
