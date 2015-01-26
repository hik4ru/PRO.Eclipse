package _02ejemplos;

public class FechasIguales {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(10,2,2000);
		Fecha f2 = new Fecha(10,2,2000);
		Fecha f3 = new Fecha(11,3,2001);
		
		System.out.println(f1 == f2);
		System.out.println(f1 == f3);
	}

}
