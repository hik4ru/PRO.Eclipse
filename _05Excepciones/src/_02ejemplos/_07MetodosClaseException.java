package _02ejemplos;

import java.util.Scanner;

public class _07MetodosClaseException {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce dos números enteros positivos: ");
		try{
			int a = tec.nextInt();
			int b = tec.nextInt();
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("------- printStackTrace -------");
			e.printStackTrace();
			
			System.out.println("------- getMessage -------");
			System.out.println(e.getMessage());
			
			System.out.println("------- toString -------");
			System.out.println(e.toString());
		}
	}

}
