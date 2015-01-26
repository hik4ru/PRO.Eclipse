package _02ejemplos;

public class TiempoV2 {
	//Atributos
	private int hora, minuto, segundo;
	
	//Constructor que recibe hora, minuto y segundo
	public TiempoV2 (int hora, int minuto, int segundo){
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}
	public TiempoV2 (int hora, int minuto){
		setHora(hora);
		setMinuto(minuto);
		setSegundo(0); //this.segundo = 0;
		//this(hora, minuto,0); <-- Llamada al constructor de tres parametros
	}
	public TiempoV2 (){
		//setHora(0);
		//setMinuto(0);
		//setSegundo(0);
		this(0,0,0);
	}
	
	//Metodos consultores (getter)
	public int getHora(){
		return hora;
	}
	public int getMinuto(){
		return minuto;
	}
	public int getSegundo(){
		return segundo;
	}
	
	//Metodos modificadores (setter)
	public void setHora(int hora){
		if(hora<0) this.hora=0;
		else if(hora>23) this.hora = 23;
		else this.hora = hora;
	}
	public void setMinuto(int minuto){
		if(minuto<0) this.minuto=0;
		else if(minuto>59) this.minuto = 59;
		else this.minuto = minuto;
	}
	public void setSegundo(int segundo){
		if(segundo<0) this.segundo=0;
		else if(segundo>59) this.segundo = 59;
		else this.segundo = segundo;
	}
	
	//Metodos
	@Override
	public String toString(){
		return hora + ":" + minuto + ":" + segundo;
	}
	public boolean equals(Object o){
		if (o == null) return false;
		else if (this == o) return true;
		else if (!(o instanceof Fecha)) return false;
		else {
			TiempoV2 t = (TiempoV2) o;
			if(this.segundo == t.segundo && this.minuto == t.minuto && this.hora == t.hora)
				return true;
			else
				return false;
		}
	}
	public int compareTo(Object o){
		TiempoV2 t = (TiempoV2) o;
		if(this.hora > t.hora) return 1;
		else if(this.hora < t.hora) return -1;
		else if(this.minuto > t.minuto) return 1;
		else if(this.minuto < t.minuto) return -1;
		else if(this.segundo > t.segundo) return 1;
		else if(this.segundo < t.segundo) return -1;
		else return 0;
	}
}
