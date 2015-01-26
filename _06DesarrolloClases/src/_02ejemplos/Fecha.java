package _02ejemplos;

public class Fecha {
	
	private int dia, mes, anyo;
	
	//GETTERS
	
	public int getDia(){
		return dia;
	}
	public int getMes(){
		return mes;
	}
	public int getAnyo(){
		return anyo;
	}
	
	//SETTERS
	
	public void setDia(int dia){
		if (this.dia < 1) dia = 1;
		else if (this.dia > 31) dia = 31;
		else this.dia = dia;
	}
	public void setMes(int mes){
		if (this.mes < 1) mes = 1;
		else if (this.mes > 12) mes = 12;
		else this.mes = mes;
	}
	public void setAnyo(int anyo){
		this.anyo = anyo;
	}
	
	//
	
	public Fecha(int dia, int mes, int anyo){
		setDia(dia);
		setMes(mes);
		setAnyo(anyo);
	}
	public Fecha(int anyo){
		setDia(1);
		setMes(1);
		setAnyo(anyo);
	}
	
	@Override
	public String toString(){
		return dia+"/"+mes+"/"+anyo;
	}
	@Override
	public boolean equals(Object o){
		if (o == null) return false;
		else if (this == o) return true;
		else if (!(o instanceof Fecha)) return false;
		else {
			Fecha f = (Fecha) o;
			if(this.dia == f.dia && this.mes == f.mes && this.anyo == f.anyo)
				return true;
			else
				return false;
		}
	}
	
	public int compareTo(Object o){
		Fecha f = (Fecha) o;
		if(this.anyo < f.anyo) return -1;
		else if(this.anyo > f.anyo) return 1;
		else if(this.mes < f.mes) return -1;
		else if(this.mes > f.mes) return 1;
		else if(this.dia < f.dia) return -1;
		else if(this.dia > f.dia) return 1;
		else return 0;
	}
}
