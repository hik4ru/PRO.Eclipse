package _03ejercicios._03academia;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;

import _03ejercicios._04aulas.Aula;

public class Academia {

	private String nombre;
	private String direccion;
	private Set listaAulas;
	
	public Academia(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaAulas = new TreeSet<Aula>();
	}
	
	public void ampliar(Aula a){
		listaAulas.add(a);
	}
	
	public void quitar(Aula a){
		if(listaAulas.contains(a)) listaAulas.remove(a);
		else System.out.println("El aula no existe en la academia");
	}
	
	public void getNumAulas(){
		listaAulas.size();
	}
	
	public String toString(){
		String res = "Nombre: " + nombre +
				"\nDireccion: " + direccion +
				"\nAulas: \n";
//		for(Object i: listaAulas){
//			res += "\n\n" + i.toString();
//		}
		
		Iterator<Aula> it = listaAulas.iterator();
		while(it.hasNext()){
			Aula a = it.next();
			res += "\n" + a.toString();
		}
		return res;
	}
	
}
