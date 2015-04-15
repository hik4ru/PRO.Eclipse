package _03ejercicios._01varios;

import java.util.TreeSet;

public class Varios {

	public Varios(){
		
	}
	
	public static int[] quitarDuplicados (int v[]){
		
		TreeSet numeros = new TreeSet();
		for (int i = 0; i < v.length; i++) {
			numeros.add(v[i]);
		}
		int n[] = new int[numeros.size()];
		for (int i = 0; i < n.length; i++) {
			n[i] = numeros.get(i);
		}
		return n;
	}
	
	public static int[] union1 (int v1[], int v2[]){
		int n[] = new int[v1.length + v2.length];
		int i = 0;
		for (int j = 0; i < v1.length; i++) {
			n[i] = v1[j];
			i++;
		}
		for (int j = 0; j < v2.length; j++) {
			n[i] = v2[j];
			i++;
		}
		n = quitarDuplicados(n);
		return n;
	}
}
