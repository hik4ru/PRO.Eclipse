package _02ejemplos;

public class _02PasoDeParametros {

	public static void main(String[] args) {
		int edades[] = {25,28,33};
		mostrar(edades);
		incrementar(edades);
		mostrar(edades);
	}
	
	public static void mostrar(int v[]){
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
	}
	
	public static void incrementar(int v[]){
		v[0]++;
		v[1]++;
		v[2]++;
	}
}
