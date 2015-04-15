package _03ejercicios._03genericos;

public class Genericos1 {
	
	public static void main(String[] args) {
		System.out.println(minimo("bbb","aaa"));
		
		Object v1[] = {4,2,5,7,4,6};
		System.out.println(minimo(v1));
	}
	
	//apartado a
	public static <T extends Comparable<T>> T minimo (T o1, T o2) {
		if(((Comparable)o1).compareTo(o2) < 0) return o1;
		else return o2;
	}
	
	public static <T extends Comparable<T>> T maximo (T o1, T o2) {
		if(((Comparable)o1).compareTo(o2) > 0) return o1;
		else return o2;
	}
	
	public static Object minimo (Object o1[]){
		int min=0;
		for (int i = 0; i < o1.length; i++) {
			if(((Comparable)o1[i]).compareTo(o1[min]) < 0) min = i;
		}
		return o1[min];
	}
	
	public static <T extends Comparable<T>> T maximo (T o1[]){
		int max=0;
		for (int i = 0; i < o1.length; i++) {
			if(((Comparable)o1[i]).compareTo(o1[max]) > 0) max = i;
		}
		return o1[max];
	}
}
