package _03ejercicios._04nevera;

import java.util.Arrays;

public class Nevera {

	public static void main(String[] args) {
		Alimento listaAlimentos[] = {
				new Alimento("lechuga",100),
				new Alimento("nata",400),
				new Alimento("mermelada",300),
				new Alimento("pavo",150)
		};
		
		Arrays.sort(listaAlimentos);
		for (int i = 0; i < listaAlimentos.length; i++) {
			System.out.println(listaAlimentos[i]);
		}
	}

}
