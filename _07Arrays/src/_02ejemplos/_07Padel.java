package _02ejemplos;

public class _07Padel {

	/*
	 * Definir una matriz que permita representar 5 equipos de padel
	 * Cada equipo está formado por 2 personas de las que nos interesa su nombre
	 * Inicializar el array con nombres
	 */
	
	public static void main(String[] args) {
		
		String n[][] = {
						{"Miguel","Paco"},
						{"Juan","Pedro"},
						{"Daniel","Victor"},
						{"Antonio","Borja"},
						{"Morcilla","Nutella"}
						};
		for(int i =0; i < n.length; i++){
			System.out.println("Equipo " + (i+1) + ":");
			for(int j = 0; j < n[0].length; j++){
				System.out.println(n[i][j]);
			}
			System.out.println("");
		}
		
	}

}
