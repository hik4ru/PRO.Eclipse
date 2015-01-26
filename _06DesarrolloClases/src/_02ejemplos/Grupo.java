package _02ejemplos;

public class Grupo {
	private String nombre;
	private int maxAlumnos;
	private Alumno delegado;
	
	//constructores
	
	public Grupo(String nombre, int maxAlumnos, Alumno delegado){
		this.nombre = nombre;
		this.maxAlumnos = maxAlumnos;
		this.delegado = delegado;
	}
	public Grupo(String nombre, int maxAlumnos){
		this.nombre = nombre;
		this.maxAlumnos = maxAlumnos;
	}
	
	//getters
	
	public String getNombre(){
		return nombre;
	}
	public int getMaxAlumnos(){
		return maxAlumnos;
	}
	public Alumno getDelegado(){
		return delegado;
	}
	
	//setters
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setMaxAlumnos(int maxAlumnos){
		this.maxAlumnos = maxAlumnos;
	}
	public void setDelegado(Alumno delegado){
		this.delegado = delegado;
	}
	
	//equals y compareTo
	
	@Override
	/*
	 * Dos grupos son iguales si tienen el mismo nombre
	 */
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Grupo)) return false;
		Grupo g = (Grupo) o;
		return this.nombre.equals(g.nombre);
	}
	/*
	 * Un grupo es menor/mayor/igual si su nombre es mejor/mayor/igual
	 */
	public int compareTo(Object o){
		Grupo g = (Grupo) o;
		return this.nombre.compareTo(g.nombre);
	}
	
	//toString
	public String toString(){
		if(delegado == null){
			return "Nombre: " + nombre +
					"\nMaximo alumnos: " + maxAlumnos;
		} else return "Nombre: " + nombre +
				"\nMaximo alumnos: " + maxAlumnos +
				"\nDelegado: " + delegado.toString();
	}
}
