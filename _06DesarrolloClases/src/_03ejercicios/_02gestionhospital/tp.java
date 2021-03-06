package _03ejercicios._02gestionhospital;

public class tp {

	public void main(String[] args) {
		Paciente p1 = new Paciente("Juan", 20);
		Paciente p2 = new Paciente("Miguel", 30);
		
		System.out.println("Comparar pacientes:");
		CompararPaciente(p1,p2);
		
		while(p1.compareTo(p2) > 0){
			System.out.println("Estado p1: " + p1.toString());
			System.out.println("Estado p2: " + p2.toString());
			p1.empeorar();
		}
		while(p2.compareTo(p1) > 0){
			System.out.println("Estado p1: " + p1.toString());
			System.out.println("Estado p2: " + p2.toString());
			p2.empeorar();
		}
	}
	
	public static String CompararPaciente(Paciente p1, Paciente p2){
		if (p1.compareTo(p2) > 0) return p2.toString();
		else if (p1.compareTo(p2) < 0) return p1.toString();
		else return "Ambos pacientes son iguales";
	}

}