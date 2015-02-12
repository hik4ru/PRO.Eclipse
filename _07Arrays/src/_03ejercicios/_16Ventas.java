package _03ejercicios;

public class _16Ventas {

	public static void main(String[] args) {
		int ventas[][] = {
				{200,123,228,15},
				{2,163,128,150},
				{20,223,248,105}};
		
		double precios[] = {1.5,33,46,180};
		
		
	}
	
	public static int distribuidorQueMasVende(int ventas[][]){
		
		int disMax=-1, suma, sumaMax=0;
		for(int i = 0; i < ventas.length; i++){
			suma = 0;
			for(int j = 0; j < ventas[0].length; j++){
				suma += ventas[i][j];
			}
			if (suma > sumaMax){
				sumaMax = suma;
				disMax = i;
			}
		}
		
		return disMax;
		
	}
	
	public static int articuloMasVendido(int ventas[][]){
		
		int artMax=0, total, totalMax=0;
		
		for(int i = 0; i < ventas[0].length; i++){
			total = 0;
			for(int j = 0; j < ventas.length; j++){
				total += ventas[j][i];
			}
			if(total > totalMax){
				totalMax = total;
				artMax = i;
			}
		}
		
		return artMax;
		
	}
	
	public static void comision(int ventas[][], double precios[]){
		
		double totalVentas[][] = new double[ventas.length][ventas[0].length];
		
		for(int i = 0; i < ventas.length; i++){
			for(int j = 0; j < ventas[0].length; j++){
				totalVentas[i][j] = (ventas[i][j] * precios[j]);
			}
			if(sumarArray(totalVentas[i]) > 70000) imprimirComision8(i, totalVentas[i]);
			else if (sumarArray(totalVentas[i]) > 30000) imprimirComision5(i, totalVentas[i]);
		}
		
	}
	
	public static double sumarArray(double n[]){
		double total=0;
		for(int i = 0; i < n.length; i++){
			total += n[i];
		}
		return total;
	}
	
	public static void imprimirComision5(int i, double v[]){
		System.out.println("Distribuidor nº: " + i);
		System.out.println("Importe de ventas: " + sumarArray(v) + " €");
		System.out.println("Porcentaje de comisión: 5%");
		System.out.println("Importe de comisión: " + (sumarArray(v)*0.05) + " €");
	}
	
	public static void imprimirComision8(int i, double v[]){
		System.out.println("Distribuidor nº: " + i);
		System.out.println("Importe de ventas: " + sumarArray(v) + " €");
		System.out.println("Porcentaje de comisión: 8%");
		System.out.println("Importe de comisión: " + (sumarArray(v)*0.08) + " €");
	}
	
}
