package _03ejercicios._04nevera;

public class Alimento implements Comparable<Alimento> {

	private String nombre;
	private int calorias;
	
	public Alimento(String nombre, int calorias){
		this.nombre = nombre;
		this.calorias = calorias;
	}
	
	public int compareTo(Alimento o){
		Alimento a = (Alimento) o;
		if(this.calorias > a.calorias) return 1;
		else if (this.calorias < a.calorias) return -1;
		else return this.nombre.compareTo(a.nombre);
	}
	
	public String toString(){
		return nombre + ", " + calorias + " calorias";
	}
}
