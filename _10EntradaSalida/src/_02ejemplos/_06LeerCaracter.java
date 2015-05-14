package _02ejemplos;

import java.io.IOException;
import java.io.InputStreamReader;

public class _06LeerCaracter {
	public static void main(String[] args) {
		InputStreamReader isr;
		
		//InputStreamReader lee caracteres de otros streams
		isr = new InputStreamReader(System.in);
		
		try{
			int num = isr.read();
			System.out.println(num);
			System.out.println((char)num);
		} catch(IOException e){
			System.out.println("Error de E/S");
		}
	}
}
