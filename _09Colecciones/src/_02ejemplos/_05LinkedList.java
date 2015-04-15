package _02ejemplos;

import java.util.LinkedList;
import java.util.List;

public class _05LinkedList {

	public static void main(String[] args) {
		
		final int NUMELEM = 100001;
		
		/*
		 * Diferencia de tiempo entre insertar al principio
		 * y al final de un LinkedList
		 */
		List<Integer> lista1 = new LinkedList<>();
		long t1 = System.currentTimeMillis();
		
		for (int i = 1; i < NUMELEM; i++) {
			lista1.add(i);
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		lista1.clear();
		t1 = System.currentTimeMillis();
		for (int i = 1; i < NUMELEM; i++) {
			lista1.add(0,i);
		}
		t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
}
