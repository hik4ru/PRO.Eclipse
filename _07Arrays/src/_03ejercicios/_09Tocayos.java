package _03ejercicios;

public class _09Tocayos {

	public static void main(String[] args) {
		
		String grupo1[] = {"miguel","josé","ana","maría"};
		String grupo2[] = {"ana", "josé", "luján", "juan","josé", "pepa", "ángela", "sofía", "andrés", "bartolo"};
		
		tocayos(grupo1, grupo2);
		
	}
	
	public static void tocayos(String v1[], String v2[]){
		int cont = 0;
		
		for (int i=0; i<v1.length; i++){
			boolean enc = false;
			for (int j = 0; j < v2.length && !enc; j++){
				if (v1[i].equals(v2[j])){
					enc = true;
					cont++;
					System.out.println(v1[i] + " tiene un tocayo en el segundo grupo");
				}
			}
		}
		System.out.println("Hay " + cont + " personas con tocayo");
	}
	
}
