package _02ejemplos._02alumnos;

public class Persona {
	private String dni;
	private String nombre;
	
	public Persona(){}
	
	public Persona(String dni, String nombre){
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString(){
		return dni + " - " + nombre;
	}
}
