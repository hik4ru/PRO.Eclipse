package _02ejemplos;

import java.io.IOException;

public class _01LeeNombre {

	public static void main(String[] args) {
		try {
			System.out.println("Introduce tu nombre: ");
			String nombre = "";
			int num;
			
			do {
				num = System.in.read();
				if(num != 10){
					//Salto de linea
					nombre = nombre + (char)num;
				}
			} while (num != 10);
			
			System.out.println(nombre);
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}
	}

}
