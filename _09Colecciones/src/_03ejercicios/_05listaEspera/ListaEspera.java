package _03ejercicios._05listaEspera;

import java.util.*;
import java.util.LinkedList;

public class ListaEspera {

	private List<Paciente> pacientesEsperando;
	
	public ListaEspera(){
		pacientesEsperando = new LinkedList<>();
	}
	
	public void addPaciente(Paciente p){
		pacientesEsperando.add(p);
	}
	
	public Paciente getPrioritario(){
		return pacientesEsperando.get(0);
	}
	
	public void borrarPrioritario(){
		pacientesEsperando.remove(0);
	}
}
