package _03ejercicios._05academia;

import java.util.Arrays;

import _03ejercicios._04aulas.Aula;

public class Academia {
	
	private final static int MAX = 10;
	private String nombre;
	private String direccion;
	private Aula listaAulas[];
	private int numAulas;
	
	public Academia(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaAulas = new Aula[MAX];
		numAulas = 0;
		
	}
	
	public void ampliar(Aula a){
		if(numAulas == listaAulas.length){
			Aula listaAux[] = new Aula[listaAulas.length*2];
			for (int i = 0; i < listaAulas.length; i++) {
				listaAux[i] = listaAulas[i];
			}
			listaAulas = listaAux;
		}
		//Añadimos el aula
		listaAulas[numAulas] = a;
		numAulas++;
	}
	
	public void quitar(Aula a){
		//Buscamos el aula
		boolean enc = false;
		int pos=0;
		for (int i = 0; i < numAulas && !enc; i++) {
			if(listaAulas[i].equals(a)){
				enc = true;
				pos = i;
			}
		}
		
		if(enc){
			/*
			 * Borramos el elemento de la posicion pos
			 * desplazando elementos a la izquierda
			 */
			for (int i = 0; i < numAulas-1; i++) {
				listaAulas[i] = listaAulas[i+1];
			}
			numAulas--;
		}
	}
	
	public int getNumAulas(){
		return numAulas;
	}
	
	public String toString(){
		String res = "Nombre: " + nombre +
				"\nDireccion: " + direccion +
				"\nAulas: \n";
		for (int i = 0; i < numAulas; i++) {
			res += "\n\n" + listaAulas[i].toString();
		}
		return res;
	}
	
	public void ordenar(){
		Arrays.sort(listaAulas,0,numAulas-1);
	}
	
}
