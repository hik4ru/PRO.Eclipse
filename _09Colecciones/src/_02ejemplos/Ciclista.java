package _02ejemplos;

public class Ciclista implements Comparable<Ciclista> {
	private int dorsal;
	public Ciclista(int dorsal){
		this.dorsal = dorsal;
	}
	
	@Override public String toString(){
		return "Dorsal: " + dorsal;
	}
	
	@Override
	public int hashCode(){
		return new Integer(dorsal).hashCode();
	}
	
	@Override 
	public boolean equals(Object o){
		if(this== o) return true;
		if(!(o instanceof Ciclista)) return false;
		Ciclista c = (Ciclista) o;
		return this.dorsal == c.dorsal;
	}
	
	@Override
	public int compareTo(Ciclista c) {
		if (dorsal < c.dorsal) return -1;
		else if (dorsal > c.dorsal) return 1;
		else return 0;
	}
}
