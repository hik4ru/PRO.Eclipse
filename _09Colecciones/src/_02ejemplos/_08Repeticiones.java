package _02ejemplos;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class _08Repeticiones {

	public static void main(String[] args) {
		//El usuario escribe un texto y le decimos cuántas veces se repite cada palabra
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce texto: ");
		
		String texto = tec.nextLine();
		String palabras[] = texto.split(" ");
		TreeMap<String,Integer> veces = new TreeMap<>();
		
		//Recorremos palabras
		for (int i = 0; i < palabras.length; i++) {
			//Buscamos palabra en el map
			if(veces.containsKey(palabras[i])){
				int num = veces.get(palabras[i]);
				veces.put(palabras[i], num+1);
			} else {
				veces.put(palabras[i], 1);
			}
		}
		
		System.out.println(veces);
		
		//Recorrer el map
		Set<String> claves = veces.keySet();
		for (String clave : claves) {
			int valor = veces.get(clave);
			System.out.println("La palabra \"" + clave + "\" aparece " + valor + " veces");
		}

	}

}
