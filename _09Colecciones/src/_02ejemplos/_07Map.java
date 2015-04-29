package _02ejemplos;

import java.util.Map;
import java.util.TreeMap;

public class _07Map {

	public static void main(String[] args) {
		//Map para almacenar palabras y número de veces que aparece
		Map <String, Integer> veces = new TreeMap<>();
		
		//Añadimos algunas parejas
		veces.put("casa", 10);
		veces.put("barco", 5);
		veces.put("fuego", 8);
		System.out.println(veces.toString());
		
		//Hacemos busquedas
		System.out.println("-----------------");
		System.out.println(veces.get("casa"));
		System.out.println(veces.get("estufa"));
	}

}
