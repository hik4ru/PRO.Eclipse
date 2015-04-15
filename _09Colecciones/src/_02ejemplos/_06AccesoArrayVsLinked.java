package _02ejemplos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _06AccesoArrayVsLinked {

	public static void main(String[] args) {
		
		final int NUMELEM = 1000000;
		
		/*
		 * Diferencia de tiempo entre acceder al principio
		 * y al final de un ArrayList
		 */
		List<Integer> lista1 = new ArrayList<>();
		
		for (int i = 1; i <= NUMELEM; i++) {
			lista1.add(i);
		}
		
		long t1 = System.currentTimeMillis();
		
		for (int i = 1; i <= NUMELEM; i++) {
			lista1.get(10000);
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		lista1 = new LinkedList<>();
		
		for (int i = 1; i <= NUMELEM; i++) {
			lista1.add(i);
		}
		
		t1 = System.currentTimeMillis();
		
		for (int i = 1; i <= NUMELEM; i++) {
			lista1.get(10000);
		}
		t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
}
