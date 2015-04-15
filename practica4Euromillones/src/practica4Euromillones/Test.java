package practica4Euromillones;

public class Test {
	public static void main(String[] args) {
		Apuesta a1 = new Apuesta(5,2,50,11);
		System.out.println(a1.toString());

		System.out.println("-----------------");
		Boleto b1 = new Boleto(5,5,2,50,11);
		System.out.println(b1.toString());
	}
	
}
