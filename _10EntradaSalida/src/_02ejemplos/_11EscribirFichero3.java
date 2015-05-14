package _02ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _11EscribirFichero3 {

public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			//Abrir archivo
			fos = new FileOutputStream("nombre.txt");
			
			//Escribir archivo
			fos.write('h');
			fos.write('i');
			fos.write('k');
			fos.write('a');
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
		
		
		FileInputStream fis = null;
		
		try {
			//Abrir
			fis = new FileInputStream("nombre.txt");
			
			//Leer
			int dato;
			do {
				dato = fis.read();
				if (dato != -1) {
					System.out.print((char)dato);
				}
			} while (dato!=-1);
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
