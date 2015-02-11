package _02ejemplos;

public class _05RecorrerMatrizPorFilas {
	public static void main(String[] args){
		int n[][]={{1,2,3,4,5},{6,7,8,9,10}};
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.println("fila " + i + " Columna " + j + " = " +n[i][j]);
			}
		}
	}
	
	
	
}	
