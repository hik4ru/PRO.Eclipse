package _03ejercicios._05listaEspera;

import java.util.*;

public class ListaEsperaPorGravedad {

	private TreeSet<Paciente> pacientesEsperando;
	
	public ListaEsperaPorGravedad(){
		pacientesEsperando = new TreeSet<>();
	}
	
	public void addPaciente(Paciente p){
		pacientesEsperando.add(p);
	}
	
	public Paciente getPrioritario(){
		Iterator<Paciente> it = pacientesEsperando.iterator();
		if(it.hasNext()) return it.next();
		else return null;
	}
	
	public void borrarPrioritario(){
		Iterator<Paciente> it = pacientesEsperando.iterator();
		if(it.hasNext()) pacientesEsperando.remove(it.next());
	}
}
