package _02ejemplos._01medicos;

public class MedicoDeCabecera extends Medico {
	private boolean visitaLasCasas;
	
	public boolean isVisitaLasCasas() {
		return visitaLasCasas;
	}

	public void setVisitaLasCasas(boolean visitaLasCasas) {
		this.visitaLasCasas = visitaLasCasas;
	}

	public void aconsejarPaciente(){
		System.out.println("Como médico de cabecera, aconsejo a mis pacientes");
	}
	
	@Override
	public String toString(){
		return super.toString() + " de cabecera";
	}
}
