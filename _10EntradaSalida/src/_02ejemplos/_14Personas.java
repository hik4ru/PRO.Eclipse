package _02ejemplos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class _14Personas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
				
		try (DataOutputStream f = new DataOutputStream(new FileOutputStream("personas.bin"))) {
			String nombre = "";
			do {
				System.out.println("Nombre: ");
				nombre = tec.nextLine();
				if(!nombre.equals("")){
					System.out.println("Edad: ");
					int edad = tec.nextInt();
					System.out.println("Peso: ");
					double peso = tec.nextDouble();
					System.out.println("Estatura: ");
					double est = tec.nextDouble();
					tec.nextLine(); //Vaciar teclado
					
					//Escribimos la info en el stream
					f.writeUTF(nombre);
					f.writeInt(edad);
					f.writeDouble(peso);
					f.writeDouble(est);
					
				}
			} while (!nombre.equals(""));
		} catch (FileNotFoundException e) {
			System.out.println("No se puede crear o abrir el fichero");
		} catch (Exception e) {
			System.out.println("Error al escribir o al cerrar el fichero");
		}
	}
}
