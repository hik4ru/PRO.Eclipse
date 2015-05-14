package _03ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _21CuentaPalabras {

	public static void main(String[] args) {
		try (
				BufferedReader br = new BufferedReader(new FileReader("GRID notas.txt"))
			){
			
			int cont=0;
			String linea;
			while((linea = br.readLine()) != null ){
				cont += new StringTokenizer(linea, " ").countTokens();
			}
			System.out.println(cont);
		} catch (FileNotFoundException e) {
			
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
}
