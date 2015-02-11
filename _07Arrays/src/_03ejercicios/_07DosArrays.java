package _03ejercicios;

public class _07DosArrays {

	public static void main(String[] args) {

	}

	public static double[] sumaArraysIguales(double a[], double b[]) {
		double suma[] = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			suma[i] = a[i] + b[i];
		}
		return suma;
	}

	public static double[] sumaArrays(double a[], double b[]) {
		
		
		
		if (a.length > b.length) {
			
			double suma[] = new double[a.length];

			for (int i = 0; i < a.length; i++) {
				suma[i] += a[i];
			}
			for (int i = 0; i < b.length; i++) {
				suma[i] += b[i];
			}
			
			return suma;
			
		} else {
			
			double suma[] = new double[b.length];
			
			for (int i = 0; i < a.length; i++) {
				suma[i] += a[i];
			}
			for (int i = 0; i < b.length; i++) {
				suma[i] += b[i];
			}
			
			return suma;
			
		}
	}

}
