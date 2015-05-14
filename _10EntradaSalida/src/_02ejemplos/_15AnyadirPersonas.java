package _02ejemplos;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _15AnyadirPersonas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("¿Sobreescribir el archivo? (S/N)");
		char respuesta = tec.nextLine().toUpperCase().charAt(0);
		boolean append = true;
		
		try {
			
			while (true) {
				
			}
			
		} catch (EOFException e) {
			// TODO: handle exception
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
