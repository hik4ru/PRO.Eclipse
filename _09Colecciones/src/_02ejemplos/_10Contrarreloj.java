package _02ejemplos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _10Contrarreloj {
	public static void main(String[] args) {
		Map<Integer, Long> corriendo = new HashMap<>();
		Set<Integer> hanLlegado = new HashSet<>();
		Scanner tec = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			System.out.println("Dorsal: ");
			int dorsal = tec.nextInt();
			if (dorsal != 0) {
				if (hanLlegado.contains(dorsal)) {
					System.out.println("El corredor ya ha terminado");
				} else {
					if (corriendo.containsKey(dorsal)) {
						// llegada
						long tardado = System.currentTimeMillis()
								- corriendo.get(dorsal);
						System.out.println(dorsal + " ha tardado " + tardado);
						hanLlegado.add(dorsal);
						corriendo.remove(dorsal);// opcional
					} else {
						// salida
						corriendo.put(dorsal, System.currentTimeMillis());
					}
				}
			}
		}
	}
	
}
