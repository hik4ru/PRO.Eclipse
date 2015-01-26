package _02ejemplos;

public class Alumno {

	private int numExpediente;
	private String nombre;
	
	public Alumno(int ne, String n){
		numExpediente = ne;
		nombre = n;
	}
	public int getNumExpediente(){
		return numExpediente;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNumExpediente(int ne){
		numExpediente = ne;
	}
	public void setNombre(String n){
		nombre = n;
	}
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Alumno)) return false;
		Alumno a = (Alumno) o;
		return this.numExpediente == a.numExpediente;
	}
	public int compareTo (Object o){
		Alumno a = (Alumno) o;
		if(this.numExpediente<a.numExpediente) return -1;
		else if(this.numExpediente>a.numExpediente) return 1;
		else return 0;
	}
	@Override
	public String toString(){
		return "Exp: " + numExpediente +
				"\nNombre: " + nombre;
	}
}
