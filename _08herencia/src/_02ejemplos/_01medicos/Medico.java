package _02ejemplos._01medicos;

public class Medico {
	private boolean trabajaEnHospital;

	public boolean isTrabajaEnHospital() {
		return trabajaEnHospital;
	}

	public void setTrabajaEnHospital(boolean trabajaEnHospital) {
		this.trabajaEnHospital = trabajaEnHospital;
	}
	
	public void tratarPaciente(){
		System.out.println("Como medico, voy a tratar a un paciente");
	}
	
	@Override 
	public String toString() {
		return "Soy un medico";
	}
}
