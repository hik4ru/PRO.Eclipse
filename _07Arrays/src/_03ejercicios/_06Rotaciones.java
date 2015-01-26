package _03ejercicios;

import java.util.Arrays;

public class _06Rotaciones {

	public static void main(String[] args) {
		int numeros[] = {1,2,3,4,5,6,7,8,9};
		for (int i=1; i<= numeros.length; i++){
			rotarDerecha(numeros);
			System.out.println(Arrays.toString(numeros));
		}

	}
	
	public static void rotarDerecha (int v[]){
		int aux = v[v.length -1];
		for(int i=v.length-1; i>0; i--){
			v[i] = v[i-1];
		}
		v[0] = aux;
	}

}
