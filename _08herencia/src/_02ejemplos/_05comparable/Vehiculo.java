package _02ejemplos._05comparable;

public class Vehiculo implements Comparable{
	private String matricula;
	private String modelo;
	private String marca;
	
	public Vehiculo(String matricula, String marca, String modelo){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String toString(){
		return matricula + " - " + marca + " - " + modelo;
	}
	
	public int compareTo(Object o){
		Vehiculo v = (Vehiculo) o;
		if(this.matricula.compareTo(v.matricula) < 0) return -1;
		else if(this.matricula.compareTo(v.matricula) > 0) return 1;
		else return 0;
	}
}
