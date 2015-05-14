package _02ejemplos;

import java.io.File;

public class _02Comprobaciones {

	public static void main(String[] args) {
		System.out.println("--Exists--");
		System.out.println(new File("carta.txt").exists());
		System.out.println(new File("carta2.txt").exists());
		System.out.println(new File("src").exists());
		
		System.out.println("--isFile--");
		System.out.println(new File("carta.txt").isFile());
		System.out.println(new File("carta2.txt").isFile());
		System.out.println(new File("src").isFile());
		
		System.out.println("--isDirectory--");
		System.out.println(new File("carta.txt").isDirectory());
		System.out.println(new File("carta2.txt").isDirectory());
		System.out.println(new File("src").isDirectory());
		
		System.out.println("--length--");
		System.out.println(new File("carta.txt").length());
		System.out.println(new File("carta2.txt").length());
		System.out.println(new File("src").length());
	}
}
