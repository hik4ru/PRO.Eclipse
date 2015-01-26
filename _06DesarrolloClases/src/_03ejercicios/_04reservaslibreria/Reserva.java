package _03ejercicios._04reservaslibreria;

import _02ejemplos.Alumno;

public class Reserva {

	private String nif;
	private String nombre;
	private String tel;
	private int codigo;
	private int ejemplares;
	
	// Constructores
	
	public Reserva(String nif, String nombre, String tel, int codigo, int ejemplares){
		this.nif = nif;
		this.nombre = nombre;
		this.tel = tel;
		this.codigo = codigo;
		this.ejemplares = ejemplares;
	}
	public Reserva(String nif, String nombre, String tel, int codigo){
		this.nif = nif;
		this.nombre = nombre;
		this.tel = tel;
		this.codigo = codigo;
		ejemplares = 1;
	}
	
	// GETTERS
	
	public String getNif(){
		return nif;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getTel(){
		return tel;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public int getEjemplares(){
		return ejemplares;
	}
	
	// SETTERS
	
	public void setEjemplares(int ejemplares){
		this.ejemplares = ejemplares;
	}
	
	// OTROS
	
	@Override
	public String toString(){
		return "NIF del cliente: " + nif +
				"\nNombre del cliente: " + nombre +
				"\nTelefono del cliente " + tel +
				"\nCodigo del libro: " + codigo +
				"\nNumero de ejemplares: " + ejemplares;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Reserva)) return false;
		Reserva a = (Reserva) o;
		return (nif.equals(a.nif) && codigo == a.codigo);
	}
	
	public int compareTo(Object o){
		Reserva a = (Reserva) o;
		if(this.codigo > a.codigo) return 1;
		else if(this.codigo < a.codigo) return -1;
		else return 0;
	}
}
