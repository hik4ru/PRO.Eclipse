package _03ejercicios._01gestionempleados;

public class Empresa {
	public final static int MAX = 100;
	private String nombre;
	private Empleado plantilla[];
	private int numEmpleados;
	
	public Empresa(String nombre){
		this.nombre = nombre;
		plantilla = new Empleado[MAX];
		numEmpleados = 0;
	}
	public void contratar(Empleado e) throws PlantillaCompletaException {
		if(numEmpleados == MAX) throw new PlantillaCompletaException("Plantilla completa");
		plantilla[numEmpleados] = e;
		numEmpleados++;
	}
	
	@Override
	public String toString(){
		String res= "Nombre: " + this.nombre;
		if(numEmpleados != 0){
			res += "\nEmpleados:";
			for (int i = 0; i < numEmpleados; i++) {
				res += "\n" + plantilla[i].toString();
			}
		}
		return res;
	}
}
