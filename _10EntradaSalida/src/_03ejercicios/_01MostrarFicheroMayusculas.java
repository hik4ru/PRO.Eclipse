package _03ejercicios;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Programa que muestre en MAYUSCULAS el contenido
 * de un fichero cuyo nombre indique el usuario.
 * Se mostrará un mensaje de error en caso de que el
 * fichero indicado no exista o no se pueda abrir.
 */
public class _01MostrarFicheroMayusculas {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero: ");
		String nomFich = tec.nextLine();
		
		try(FileReader f = new FileReader(nomFich)) {
			
			int dato;
			while ((dato = f.read())!=-1) {
				String s = "" + (char)dato;
				System.out.print(s.toUpperCase());
			
			}			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe o no se puede abrir");
		} catch (IOException e) {
			System.out.println("Error de lectura o al cerrar el fichero");
		}
	}
}
