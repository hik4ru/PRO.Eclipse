package _03ejercicios._10listaAdmitidos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ComprobarAdmision {
	public static void main(String[] args) {
		Set<Inscripcion> admitidas = new HashSet<>();
		admitidas.add(new Inscripcion("1", "pepe", "b1"));
		admitidas.add(new Inscripcion("2", "luis", "b1"));
		admitidas.add(new Inscripcion("3", "juan", "a1"));
		admitidas.add(new Inscripcion("4", "pepa", "b1"));
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce nif: ");
		String nif = tec.nextLine();
		
		if(admitidas.contains(new Inscripcion(nif, null, null))){
			System.out.println("Admitido");
		} else {
			System.out.println("No admitido");
		}
	}
}
