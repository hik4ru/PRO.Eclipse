package _02ejemplos._01medicos;

public class TestMedicos {

	public static void main(String[] args) {
		
		System.out.println("---------- Medico ----------");
		
		/*
		 * Un medico tiene
		 *  - atributo trabajaEnHospital
		 *  - metodo tratarPaciente
		 */
		
		Medico m1 = new Medico();
		System.out.println(m1.isTrabajaEnHospital());
		m1.tratarPaciente();
		
		/*
		 * Un MedicoDeCabecera tiene
		 * por ser MedicoDeCabecera
		 *  - atributo visitaLasCasas
		 *  - metodo aconsejarPaciente
		 */
		
		System.out.println("---------- MedicoDeCabecera ----------");
		
		MedicoDeCabecera mc1 = new MedicoDeCabecera();
		System.out.println(mc1.isVisitaLasCasas());
		mc1.aconsejarPaciente();
		
		/*
		 * Por ser Medico
		 *  - atributo trabajaEnHospital
		 *  - metodo tratarPaciente
		 */
		
		System.out.println(mc1.isTrabajaEnHospital());
		mc1.tratarPaciente();
		
		System.out.println("---------- Cirujano ----------");
		
		// Un cirujano tiene su propio tratarPaciente
		
		Cirujano c = new Cirujano();
		c.tratarPaciente();
		
		System.out.println("---------- toString ----------");
		System.out.println(m1.toString());
		System.out.println(mc1.toString());
		System.out.println(c.toString());
		
	}

}
