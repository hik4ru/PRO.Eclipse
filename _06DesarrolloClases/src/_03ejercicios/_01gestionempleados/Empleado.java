package _03ejercicios._01gestionempleados;

import java.util.Calendar;

public class Empleado {

	//ATRIBUTOS
	
	private String nombre, dni;
	private int anyoingreso;
	private double sueldobruto;
	
	//CONSTRUCTORES
	
	public Empleado(String nombre, String dni, int anyoingreso, double sueldobruto){
		setNombre(nombre);
		setDNI(dni);
		setAnyoIngreso(anyoingreso);
		setSueldoBruto(sueldobruto);
	}
	public int Antiguedad(){
		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		if (anyoingreso < anyoActual)
			return anyoingreso-anyoActual;
		else
			return 0;
	}
	public void IncrementarSueldo(double porcentaje){
		sueldobruto = sueldobruto + sueldobruto * porcentaje / 100;
	}
	@Override
	public String toString(){
		return "Nombre: " + nombre + 
				"\nDni: " + dni + 
				"\nAño de ingreso: " + anyoingreso + 
				"\nSueldo bruto anual: " + sueldobruto + " €";
	}
	@Override
	public boolean equals(Object o){
		if (o == null) return false;
		else if (this == o) return true;
		else if (!(o instanceof Empleado)) return false;
		else {
			Empleado e = (Empleado) o;
			if(this.dni == e.dni) return true;
			else return false;
		}
	}
	public int compareTo(Object o){
		Empleado e = (Empleado) o;
		if(this.dni.compareTo(e.dni) > 0) return 1;
		else if(this.dni.compareTo(e.dni) < 0) return -1;
		else return 0;
	}
	public static double calcularIRPF(double salario){
		double irpf;
		if (salario < 800) irpf = 3;
		else if (salario < 1000) irpf = 10;
		else if (salario < 1500) irpf = 15;
		else if (salario < 2100) irpf = 20;
		else irpf = 30;
		return irpf;
	}
	
	//CONSULTORES
	
	public String getNombre(){
		return nombre;
	}
	public String getDNI(){
		return dni;
	}
	public int getAnyoIngreso(){
		return anyoingreso;
	}
	public double getSueldoBruto(){
		return sueldobruto;
	}
	
	//MODIFICADORES
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setDNI(String dni){
		this.dni = dni;
	}
	public void setAnyoIngreso(int anyoingreso){
		this.anyoingreso = anyoingreso;
	}
	public void setSueldoBruto(double sueldobruto){
		this.sueldobruto = sueldobruto;
	}
	
}
