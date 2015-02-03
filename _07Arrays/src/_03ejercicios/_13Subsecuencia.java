package _03ejercicios;

public class _13Subsecuencia {
	
	public static void main(String[] args) {
		
		int v1[]={23,8,12,6,7,9,10,11,2};
		int v2[]={1,2,3};
		
		System.out.println(v1.toString());
		System.out.println(Subsecuencia(v1));
		System.out.println(v2.toString());
		System.out.println(Subsecuencia(v2));
	}
	
	public static int Subsecuencia(int v[]){
		
		boolean enc = false;
		int i = 0;
		
		while (i < v.length-2 && !enc){
			if(v[i] == v[i+1]-1 && v[i] == v[i+2]-2) enc = true;
			i++;
		}
		
		return i-1;
	}
	
}
