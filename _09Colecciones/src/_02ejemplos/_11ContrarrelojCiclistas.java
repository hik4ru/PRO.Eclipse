package _02ejemplos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _11ContrarrelojCiclistas {
	public static void main(String[] args) {
		Map<Ciclista, Long> corriendo = new HashMap<>();
		Set<Ciclista> hanLlegado = new TreeSet<>();
		Scanner tec = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			System.out.println("Dorsal: ");
			int dorsal = tec.nextInt();
			if (dorsal != 0) {
				Ciclista c = new Ciclista(dorsal);
				if (hanLlegado.contains(c)) {
					System.out.println("El corredor ya ha terminado");
				} else {
					if (corriendo.containsKey(c)) {
						// llegada
						long tardado = System.currentTimeMillis()
								- corriendo.get(c);
						System.out.println(c + " ha tardado " + tardado);
						hanLlegado.add(c);
						corriendo.remove(c);// opcional
					} else {
						// salida
						corriendo.put(c, System.currentTimeMillis());
					}
				}
			}
		}
	}
}
