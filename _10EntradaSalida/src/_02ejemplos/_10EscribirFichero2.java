package _02ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _10EscribirFichero2 {

public static void main(String[] args) {
		
		FileWriter fos = null;
		
		try {
			//Abrir archivo
			fos = new FileWriter("nombre.txt");
			
			//Escribir string: FileOutputStream tiene método para escribir Strings
			fos.write("hika");
			
		} catch (FileNotFoundException e) {
			System.out.println("No se puede crear o abrir el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//Cerrar archivo
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
		FileReader fis = null;
		
		try {
			//Abrir
			fis = new FileReader("nombre.txt");
			
			//Leer
			int dato;
			while((dato = fis.read()) != -1) {
					System.out.print((char)dato);
			}
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe o no se puede abrir");
		} catch (IOException e) {
			System.out.println("Error de lectura");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
			}
		}
	}
}
