package _03ejercicios;

public class _10PrimerImpar {

	public static void main(String[] args) {
		int numeros[] = {2,8,20,1,9,22,4,2,1};
		System.out.println("La suma de los números a partir del primer impar es: " + impar(numeros));
	}
	
	public static int impar(int v[]){
		boolean encontrado = false;
		int i=0, suma=0;
		while (i < v.length && !encontrado){
			if (v[i]%2 == 1) {
				encontrado = true;  
			} else i++;
		}
		if (encontrado){
			while(i < (v.length-1)){
				suma += v[i+1];
				i++;
			}
			return suma;
		} else return -1;
	}

}
