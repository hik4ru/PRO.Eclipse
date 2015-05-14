package _03ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class _28Notas {

	public static void main(String[] args) {
		
		File notas = new File("notas.bin");
		
		try (
				DataInputStream br = new DataInputStream(new InputStre("notas.bin"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("notas.bin"));
			){
			
			int cont=0;
			String linea;
			while((linea = br.readLine()) != null ){
				cont++;
			}
			
			
			
		} catch ( e) {
			// TODO: handle exception
		}
	}
}
