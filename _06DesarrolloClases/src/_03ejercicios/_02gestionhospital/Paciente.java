package _03ejercicios._02gestionhospital;

public class Paciente {
	
// ATRIBUTOS
	
private String nombre;
private int edad, estado;
	
// CLASE OBJETO

public Paciente(String n, int e){
	 nombre = n;
	 edad = e;
	 estado = (int)(Math.random()*5)+1;
}

// GETTERS

public int getEdad(){
	return edad;
}

public int getEstado(){
	return estado;
}

// SETTERS

public void mejorar(){
	estado++;
	if(estado>6)
		estado = 6;
}

public void empeorar(){
	estado--;
	if(estado<1)
		estado = 1;
}

// OTROS

@Override
public String toString(){
	return nombre + " " + edad + " " + estado;
}

public int compareTo(Object o){
	Paciente e = (Paciente) o;
	if (this.estado < e.estado) return 1;
	else if (this.estado > e.estado) return -1;
	else if (this.edad > e.edad) return 1;
	else if (this.edad < e.edad) return -1;
	else return 0;
	
//	public int compareTo(Object o){
//		Paciente e = (Paciente) o;
//		if (this.estado == p.estado) return this.edad - p.edad;
//		else return p.estado - this.estado;
}

}
