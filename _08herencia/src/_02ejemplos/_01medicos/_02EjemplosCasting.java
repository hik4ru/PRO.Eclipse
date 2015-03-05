package _02ejemplos._01medicos;

public class _02EjemplosCasting {
	//Casting implicito
	Object o = new Cirujano();
	
	/*
	 * Casting explicito: permite guardar cualquier objeto
	 * en cualquier otro tipo si los tipos de la izquierda
	 * y la derecha son compatibles
	 */
	Medico m = (Medico) o;
	
	/*
	 * Pero no hacen magia: pueden dar error de ejecucion
	 * aunque compilen bien
	 */
	MedicoDeCabecera mc = (MedicoDeCabecera) o;
	String s = (String) o;
	Scanner e = (Scanner) o;
}
