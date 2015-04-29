package _03ejercicios._01varios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _01Varios {
	
	public static void main(String[] args) {
		int v[] = {5,5,1,2,1,6,8};
		System.out.println(Arrays.toString(quitarDuplicados(v)));
	}

	public static int[] quitarDuplicados(int v[]){
		
		//Para descartar elementos duplicados copiamos los elementos a un Set
		//Utilizamos LinkedHashSet para no alterar el orden
		
		Set<Integer> s = new LinkedHashSet<>();
		
		for (int i = 0; i < v.length; i++) {
			s.add(v[i]);
		}
		
		//Creamos array del tamaño del set
		int result[] = new int[s.size()];
		
		//Copiamos los elementos al array
		//Para cada elemento de tipo Integer que hay en S, guardalo en la variable Valor
		int i = 0;
		for (Integer valor: s) {
			result[i] = valor;
			i++;
		}
		
		//Otra forma de copiar los elementos (iterator)
		i = 0;
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()){
			result[i] = it.next();
			i++;
		}
		
		//Devolvemos array
		return result;
	}
	
	public int[] union1(int v1[], int v2[]){
		
		Set<Integer> s = new LinkedHashSet<>();
		
		for (int i = 0; i < v1.length; i++) {
			s.add(v1[i]);
		}
		
		for (int i = 0; i < v2.length; i++) {
			s.add(v2[i]);
		}
		
		int result[] = new int[s.size()];
		
		int i = 0;
		for (Integer valor: s) {
			result[i] = valor;
			i++;
		}
		
		quitarDuplicados(result);
		
		return result;
	}
	
	public int[] union2(int v1[], int v2[]){
		
		Set<Integer> s = new LinkedHashSet<>();
		
		for (int i = 0; i < v1.length; i++) {
			s.add(v1[i]);
		}
		
		for (int i = 0; i < v2.length; i++) {
			s.add(v2[i]);
		}
		
		int result[] = new int[s.size()];
		
		int i = 0;
		for (Integer valor: s) {
			result[i] = valor;
			i++;
		}
		
		return result;
	}
	
	public static int[] interseccion(int v1[], int v2[]){
		Collection<Integer> c1 = new ArrayList<>();
		
		//Copiamos v1 en c1
		for (int num: v1) {
			c1.add(num);
		}
		
		//Coleccion a la que iremos añadiendo los elementos comunes
		Collection <Integer> interseccion = new ArrayList<>();
		
		//Recorremos v2 y comprobamos si sus elementos están también en v1
		for (int i = 0; i < v2.length; i++) {
			if(c1.contains(v2[i])) interseccion.add(v2[i]);
		}
		
		//Creamos array del tamaño del set
		int result[] = new int[interseccion.size()];
		
		//Copiamos los elementos al array
		int i = 0;
		for (Integer valor : result) {
			result[i] = valor;
			i++;
		}
		
		return result;
	}
	
}
