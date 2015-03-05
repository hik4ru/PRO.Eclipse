package _02ejemplos._01medicos;

public class Cirujano extends Medico {
	
	@Override
	public void tratarPaciente(){
		System.out.println("Como cirujano, voy a tratar a un paciente");
	}
	
	public void hacerIncision(){
		System.out.println("Como cirujano, voy a hacer una incision");
	}
	
	@Override
	public String toString(){
		return "Soy un cirujano";
	}
}
