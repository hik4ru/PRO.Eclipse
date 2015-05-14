package _02ejemplos;

import java.io.IOException;

public class _02LeeEdad {

	public static void main(String[] args) {
		try {
			System.out.println("Introduce tu edad: ");
			String sEdad = "";
			int num;
			
			do {
				num = System.in.read();
				if(num != 13){
					//Salto de linea
					sEdad = sEdad + (char)num;
				}
			} while (num != 13);
			
			int edad = Integer.parseInt(sEdad);
			System.out.println(edad);
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}
	}

}
