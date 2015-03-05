package _03ejercicios;

public class _17Cuadradas {

	public static void main(String[] args) {
		int m[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		System.out.println("Diagonal");
		mostrarDiagonal(m);
		System.out.println("Fila del máximo: " + filaDelMayor(m));
		
		System.out.println("Intercambiar");
		intercambiarFilas(f1,f2,m);
	}
	
	public static void mostrarDiagonal(int m[][]){
		for(int i=0; i<m.length; i++){
			System.out.println(m[i][i]);
		}
	}
	
	public static int filaDelMayor(int m[][]){
		int filaDelMayor = 0;
		int mayor = m[0][0];
		//int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				if(m[i][j] > mayor) {
					mayor = m[i][j];
					filaDelMayor = i;
				}
			}
		}
		return filaDelMayor;
	}
	
	public static void intercambiarFilas(int f1, int f2, int m[][]){
		for (int j = 0; j < m[0].length; j++) {
			int aux = m[f1][j];
			m[f1] = m[f2];
			m[f2] = aux;
		}
	}
}
