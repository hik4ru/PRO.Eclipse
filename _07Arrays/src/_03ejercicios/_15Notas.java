package _03ejercicios;

public class _15Notas {

	public static void main(String[] args) {
		double notas[][] = {
				{2,3,8,5,2},
				{7,7,8,9,8},
				{2,1,3,2,4}
		};
		
		String alumnos[] = {"Pepe", "Juan", "Pedro"};
		String asignaturas[] = {"PRO", "BDA", "SI", "LMI", "ED"};
		mostrarPorAlumno(notas);
		mostrarPorAsignatura(notas);
		mostrarPorAlumnoConNombres(notas, alumnos, asignaturas);
		mostrarPorAsignaturaConNombres(notas, alumnos, asignaturas);
		mostrarMediaPorAlumno(notas, alumnos);
		mostrarMediaPorAsignatura(notas, asignaturas);
	}
	
	public static void mostrarPorAlumno(double n[][]){
		for(int i =0; i < n.length; i++){
			System.out.println("Alumno " + (i+1) + ":");
			for(int j = 0; j < n[0].length; j++){
				System.out.println(n[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void mostrarPorAsignatura(double n[][]){
		int i,j;
		for(i =0; i < n[0].length; i++){
			System.out.println("Asignatura " + (i+1) + ":");
			for(j = 0; j < n.length; j++){
				System.out.println("Alumno " + (j+1) + ": " + n[j][i]);
			}
			System.out.println("");
		}
	}
	
	public static void mostrarPorAlumnoConNombres(double n[][], String alu[], String asig[]){
		for(int i =0; i < n.length; i++){
			System.out.println(alu[i] + ":");
			for(int j = 0; j < n[0].length; j++){
				System.out.println(asig[j] + ": " + n[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void mostrarPorAsignaturaConNombres(double n[][], String alu[], String asig[]){
		int i,j;
		for(i =0; i < n[0].length; i++){
			System.out.println(asig[i] + ":");
			for(j = 0; j < n.length; j++){
				System.out.println(alu[j] + ": " + n[j][i]);
			}
			System.out.println("");
		}
	}
	
	public static void mostrarMediaPorAlumno (double n[][], String alu[]){
		
		double media;
		
		for(int i =0; i < n.length; i++){
			
			media = 0;
			System.out.println(alu[i] + ":");
			
			for(int j = 0; j < n[0].length; j++){
				media += n[i][j];
			}
			
			System.out.println("Media: " + (media/n[0].length));
			System.out.println("");
		}
		
	}
	
	public static void mostrarMediaPorAsignatura (double n[][], String asig[]){
		
		int i,j;
		double media;
		
		for(i =0; i < n[0].length; i++){
			
			media = 0;
			
			System.out.println(asig[i] + ":");
			
			for(j = 0; j < n.length; j++){
				media += n[j][i];
			}
			
			System.out.println("Media: " + (media/n.length));
			System.out.println("");
		}
		
	}

}
