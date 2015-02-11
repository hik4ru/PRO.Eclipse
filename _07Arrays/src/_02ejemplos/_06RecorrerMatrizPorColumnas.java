package _02ejemplos;

public class _06RecorrerMatrizPorColumnas {
	public static void main(String[] args){
		int n[][]={{1,2,3,4,5},{6,7,8,9,10}};
		for (int j = 0; j < n[0].length; j++) {
			for (int i = 0; i < n.length; i++) {
				System.out.println("Fila " + i + " Columna " + j + " = " +n[i][j]);
			}
		}
	}
}
