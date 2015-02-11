package _02ejemplos;

public class _04Busquedas {
	
	public static void main(String[] args) {
		int v1[] = {1,3,8,20,30};
		int v2[] = {10,-1,3,20,12};
		
		System.out.println(todoPositivo(v1));
		System.out.println(todoPositivo(v2));
		System.out.println("------------");
		System.out.println(esCreciente(v1));
		System.out.println(esCreciente(v2));
	}
	
	//Devuelve true si TODOS los elementos de v son mayores que cero
	public static boolean todoPositivo(int v[]){
		
		for(int i=0; i < v.length; i++){
			if (v[i] < 1) return false;
		}
		return true;
		
	}
	
	public static boolean esCreciente (int v[]){
		boolean creciente = true;
		int i = 1;
		
		while (i<v.length && creciente){
			if (v[i] <= v[i-1]) creciente = false;
			i++;
		}
		
		return creciente;
	}
	
	public static boolean hayPicos(int v[]){
		boolean picos = false;
		int i = 1;
		
		while (i<v.length && !picos){
			if (v[i] < v[i-1]) picos = true;
			i++;
		}
		
		return picos;
	}
}
