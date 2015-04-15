package _02ejemplos;

import java.util.TreeSet;
public class _01Set {
	public static void main(String[] args){
		TreeSet numeros = new TreeSet();
		//anyadir elementos
		numeros.add(20);
		numeros.add(12);
		numeros.add(25);
		System.out.println(numeros.toString()); // aparecen ordenados
		
		//NO admite duplicados (los duplicados se sobreescriben)
		numeros.add(1);
		numeros.add(1);
		numeros.add(1);
		numeros.add(1);
		System.out.println(numeros.toString());
		
		//Busqueda
		System.out.println(numeros.contains(2));
		System.out.println(numeros.contains(20));
		
		//6 numeros del 1 al 49 ordenados y sin duplicados
		numeros.clear();
		while(numeros.size()!=6){
			numeros.add((int)(Math.random()*49+1));
		}
		System.out.println(numeros.toString());
	}
}