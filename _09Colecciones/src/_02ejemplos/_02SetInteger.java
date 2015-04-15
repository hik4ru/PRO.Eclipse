package _02ejemplos;


import java.util.TreeSet;

public class _02SetInteger {
	public static void main(String[] args) {
		//Cuando se utilizan colecciones conviene usar la notación <>
		//para evitar errores de ejecucion y detectarlos en compilación
		TreeSet numeros1 = new TreeSet();
		numeros1.add(1);
		numeros1.add("hola");
		System.out.println(numeros1.toString());
		
		TreeSet<Integer> numeros2 = new TreeSet<>();
		numeros2.add(1);
		numeros2.add("hola");
	}
}
