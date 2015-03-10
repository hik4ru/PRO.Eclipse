package practica4Euromillones;

import java.util.Arrays;

public class Apuesta {

	// ATRIBUTOS
	
	private int numeros[];
	private int estrellas[];
	
	// CONSTRUCTORES
	
	public Apuesta(int numNumeros, int numEstrellas, int maxValorNumeros, int maxValorEstrellas){
		numeros = new int[numNumeros];
		estrellas = new int[numEstrellas];
		int num, cont;
		boolean enc;
		
		for(int i=0; i < numeros.length; i++){
			num = (int) (Math.random() * maxValorNumeros + 1);
			cont = 0;
			enc = false;
			while (cont < i && !enc){
				if (num == numeros[cont]) enc = true;
				cont ++;
			}
			if (!enc) numeros[cont] = num;
			else i--;
		}
		
		for(int i=0; i < estrellas.length; i++){
			num = (int) (Math.random() * maxValorEstrellas + 1);
			cont = 0;
			enc = false;
			while (cont < i && !enc){
				if (num == estrellas[cont]) enc = true;
				cont ++;
			}
			if (!enc) estrellas[cont] = num;
			else i--;
		}
		
		ordenar(numeros, estrellas);
	}
	
	// OTROS
	
	@Override
	public boolean equals (Object o){
		if (o == null) return false;
		else if (this == o) return true;
		else if (!(o instanceof Apuesta)) return false;
		else {
			Apuesta a = (Apuesta) o;
			int cont = 0;
			while (cont < numeros.length){
				if(this.numeros[cont] == a.numeros[cont]) cont++;
				else return false;
			}
			cont = 0;
			while (cont < estrellas.length){
				if(this.estrellas[cont] == a.estrellas[cont]) cont++;
				else return false;
			}
			return true;
		}
	}
	
	public void ordenar(int[] num, int[] est){
		Arrays.sort(num);
		Arrays.sort(est);
	}
	
	@Override
	public String toString(){
		String cadena = "";
		for (int i = 0; i < numeros.length; i++) {
			cadena += String.format("%02d ", numeros[i]);
		}
		cadena += "- (";
		for (int i = 0; i < estrellas.length; i++) {
			cadena += String.format("%02d ", estrellas[i]);
		}
		cadena = cadena.substring(0, cadena.length()-1);
		cadena += ")";
		return cadena;
	}

}
