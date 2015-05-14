package _02ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07LeeNombre {

	public static void main(String[] args) {
		InputStreamReader isr;
		BufferedReader br;
		
		//InputStreamReader lee caracteres de otros streams
		
		try{
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			System.out.println("Introduce tu nombre: ");
			String nombre = br.readLine();
			System.out.println(nombre);
			
		} catch(IOException e){
			System.out.println("Error de E/S");
		}
	}
	
}
