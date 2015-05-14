package _02ejemplos;

import java.io.File;
import java.io.IOException;

public class _01NombreFichero {

	public static void main(String[] args) {
		//Se puede crear un File de un fichero que existe ...
		File f1 = new File("carta.txt");
		
		//... o de uno que no existe
		File f2 = new File("cartas\\carta2.txt");
		
		//Métodos relacionados con el nombre
		System.out.println("getName: " + f1.getName());
		System.out.println("getPath: " + f1.getPath());
		System.out.println("getAbsolutePath: " + f1.getAbsolutePath());
		System.out.println("getParent: " + f1.getParent());
		
		System.out.println("-----------");
		
		System.out.println("getName: " + f2.getName());
		System.out.println("getPath: " + f2.getPath());
		System.out.println("getAbsolutePath: " + f2.getAbsolutePath());
		System.out.println("getParent: " + f2.getParent());
		
		System.out.println("-----------");
		
		File f3 = new File("cartas\\..\\cartas\\carta2.txt");
		
		System.out.println("getName: " + f3.getName());
		System.out.println("getPath: " + f3.getPath());
		System.out.println("getAbsolutePath: " + f3.getAbsolutePath());
		System.out.println("getParent: " + f3.getParent());

		System.out.println("-----------");
		
		try {
			System.out.println("getCanonicalPath: " + f2.getCanonicalPath());
			System.out.println("getCanonicalPath: " + f3.getCanonicalPath());
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
