package _02ejemplos;

import java.util.Iterator;
import java.util.TreeMap;

public class _09Papas {

	public static void main(String[] args) {
		String papas[] = {"Pablo","Juan","Juan","Sixto","Pablo","Damaso","Juan","Pablo"};
		
		TreeMap<String,Integer> veces = new TreeMap<>();
		for (int i = 0; i < papas.length; i++) {
			if(veces.containsKey(papas[i])){
				int num = veces.get(papas[i]);
				veces.put(papas[i], num+1);
				System.out.println(papas[i] + " " + veces.get(papas[i]));
			} else {
				veces.put(papas[i], 1);
				System.out.println(papas[i] + " " + veces.get(papas[i]));
			}
		}
		
		
		System.out.println(veces);

	}

}
