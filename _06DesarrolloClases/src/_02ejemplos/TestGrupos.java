package _02ejemplos;

import org.omg.Messaging.SyncScopeHelper;

public class TestGrupos {

	public static void main(String[] args) {
	//Podemos crear un grupo ....
	
	// ... sin delegado
	
	Grupo g1 = new Grupo("1dam",20);
	System.out.println(g1.toString() + "\n---");
	
	// ... con delegado
	
	Alumno a2 = new Alumno(1,"pepe");
	Grupo g2 = new Grupo("1smr", 20, a2);
	System.out.println(g2.toString() + "\n---");
	
	
	// ... con delegado creado "al vuelo"
	
	Grupo g3 = new Grupo("2dam", 25, new Alumno(2,"ana"));
	System.out.println(g3.toString() + "\n---");
	
	// ... asignar un delegado a g1
	
	g1.setDelegado(new Alumno(3,"pedro"));
	System.out.println(g1.toString() + "\n---");
	
	// ¿g1 y g2 tienen el mismo delegado?
	
	if(g1.getDelegado().equals(g2.getDelegado())){
		System.out.println("g1 y g2 tienen el mismo delegado");
	} else {
		System.out.println("g1 y g2 tienen distinto delegado");
	}
	System.out.println("---");
	
	// ¿Los delegados de g1 y g2 se llaman igual?
	
	if (g1.getDelegado().getNombre().equals(g2.getDelegado().getNombre())){
		System.out.println("Los delegados de g1 y g2 se llaman igual");
	} else {
		System.out.println("Los delegados de g1 y g2 se llaman diferente");
	}
	System.out.println("---");
	
	// ¿los delegados de g1 y g2 tienen la misma inicial?
	
	if(g1.getDelegado().getNombre().charAt(0) == g2.getDelegado().getNombre().charAt(0)){
		System.out.println("Los delegados de g1 y g2 tienen la misma inicial");
	} else {
		System.out.println("Los delegados de g1 y g2 tienen diferente inicial");
	}
	
	}
}
