package _03ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _03LeerFicheroLineaALinea {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre del fichero: ");
		String nomFich = tec.nextLine();
		
		try(FileReader fr = new FileReader(nomFich)){
			try(BufferedReader br = new BufferedReader(fr)) {
				
				String linea;
				while((linea = br.readLine()) != null){
					System.out.println(linea.toUpperCase());
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
