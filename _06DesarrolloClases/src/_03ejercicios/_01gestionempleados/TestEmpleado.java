package _03ejercicios._01gestionempleados;

import java.util.Scanner;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Empleado e1 = leerEmpleado();
		Empleado e2 = leerEmpleado();
		
		if (e1.getSueldoBruto()>e2.getSueldoBruto()) e2.IncrementarSueldo(20);
		else if (e2.getSueldoBruto()>e1.getSueldoBruto()) e1.IncrementarSueldo(20);
		
		if (e1.Antiguedad()>e2.Antiguedad()) e1.IncrementarSueldo(10);
		else if (e2.Antiguedad()>e1.Antiguedad()) e2.IncrementarSueldo(10);
		
		System.out.println(Empleado.calcularIRPF(e1.getSueldoBruto()));
		System.out.println(Empleado.calcularIRPF(e2.getSueldoBruto()));
	}
	public static Empleado leerEmpleado (){
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce Nombre del Empleado");
		String nombre = tec.nextLine();
		System.out.println("Introduce DNI del Empleado");
		String dni = tec.nextLine();
		System.out.println("Introduce anyo de ingreso del Empleado");
		int anyo = tec.nextInt();
		System.out.println("Introduce sueldo bruto del Empleado");
		double sueldo = tec.nextDouble();
		
		Empleado e = new Empleado(nombre,dni,anyo,sueldo);
		
		return e;
	}

}
