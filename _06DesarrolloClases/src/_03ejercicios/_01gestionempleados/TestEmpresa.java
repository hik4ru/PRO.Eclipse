package _03ejercicios._01gestionempleados;

public class TestEmpresa {

	public static void main(String[] args) {
		Empresa e = new Empresa("MatisseDam");
		
		Empleado emp1 = new Empleado("pepe","111111",2000,1000);
		Empleado emp2 = new Empleado("juan","222222",2001,1100);
		
		try{
			e.contratar(emp1);
			e.contratar(emp2);
			e.contratar(new Empleado("ana","333333",2002,1200));
		} catch (PlantillaCompletaException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println(e.toString());
	}

}
