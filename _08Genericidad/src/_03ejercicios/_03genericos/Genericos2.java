package _03ejercicios._03genericos;

public class Genericos2 {

	public static void main(String[] args) {
		System.out.println(minimo("bbb","aaa"));
		
		Object v1[] = {4,2,5,7,4,6};
		System.out.println(minimo(v1));
	}

	
	/*
	 * Con <T extends Comparable <T>> damos más información al compilador
	 * para evitar errores antes de ejecutar el programa
	 */
	public static <T extends Comparable<T>> T minimo (T o1, T o2) {
		if(((Comparable)o1).compareTo(o2) < 0) return o1;
		else return o2;
	}
	
	public static <T extends Comparable<T>> T maximo (T o1, T o2) {
		if(((Comparable)o1).compareTo(o2) > 0) return o1;
		else return o2;
	}
}
