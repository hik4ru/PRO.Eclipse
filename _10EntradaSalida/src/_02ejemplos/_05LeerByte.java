package _02ejemplos;

import java.io.IOException;

public class _05LeerByte {

	public static void main(String[] args) {
		System.out.println("Introduce un caracter: ");
		try{
			int num = System.in.read();
			System.out.println(num);
			System.out.println((char)num);
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}
	}

}
