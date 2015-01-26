package _03ejercicios._07gestorvuelos;

import _02ejemplos.TiempoV2;

public class Vuelo {
	
	private String identificador, origen, destino;
	private TiempoV2 horasalida, horallegada;
	private int numP;
	private String asientos[];
	final static int CAPACIDAD = 50;
	
	//CONSTRUCTOR
	
	public Vuelo(String id, String orig, String dest, TiempoV2 hsal, TiempoV2 hlleg){
		identificador = id;
		origen = orig;
		destino = dest;
		horasalida = hsal;
		horallegada = hlleg;
		
		//numero pasajeros cero
		numP = 0;
		
		//creamos el array
		asientos = new String[51];
	}
	
	//GETTERS
	
	public String getIdentificador(){
		return identificador;
	}
	
	public String getOrigen(){
		return origen;
	}
	
	public String getDestino(){
		return destino;
	}
	
	public boolean hayLibres(){
//		if(numP < CAPACIDAD) return true;
//		else return false;
		return numP < CAPACIDAD;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Vuelo)) return false;
		Vuelo v = (Vuelo) o;
		return this.identificador.equals(v.identificador);
	}
	
	private int asientoLibre(char pref){
		int i;
		if(pref == 'P'){
			for(i =2; i<asientos.length; i+=2){
				if(asientos[i] == null) return i;
			}
			return 0;
		}
		else{
			for (i=1; i<asientos.length; i+=2){
				if(asientos[i] == null) return i;
			}
			return 0;
		}
	}
	
	public int reservarAsiento(String pas, char pref) throws VueloCompletoException{
		if(hayLibres() == false) throw new VueloCompletoException("Vuelo lleno");
		else {
			if(asientoLibre(pref) == 'P'){
				if(asientoLibre('P') != 0){
					asientos[asientoLibre('P')] = pas;
					return asientoLibre('P');
				} else {
					asientos[asientoLibre('V')] = pas;
					return asientoLibre('V');
				}
			} else {
				if(asientoLibre('V') != 0){
					asientos[asientoLibre('V')] = pas;
					return asientoLibre('V');
				} else {
					asientos[asientoLibre('P')] = pas;
					return asientoLibre('P');
				}
			}
		}
	}
	
	public void cancelarReserva(int numAsiento){
		asientos[numAsiento] = null;
		numP--;
	}
	
	@Override
	public String toString(){
		String s = identificador + " " + origen + " " + destino + " " + " " + 
				   horasalida.toString() + " " + horallegada.toString() + "\n";
		s += "Pasajeros: \n";
		
		for (int i = 1; i < asientos.length; i++) {
			if (asientos[i] != null) s += asientos[i] + "\n";
		}
		
		return s;
	}
}
