package _02ejemplos._04figuras;

public class TestArrayFiguras {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(20);
		Circulo c2 = new Circulo(30);
		Rectangulo r1 = new Rectangulo(10,12);
		Rectangulo r2 = new Rectangulo(25,42);
		
		Figura v[] = {c1,c2,r1,r2};
		
		//Recorremos para calcular la suma de las áreas
		double suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma += v[i].calcularArea();
		}
		System.out.println("Suma: " + suma);
		
		System.out.println("---------------");
		
		//Recorremos los circulos y mostramos su radio
		for (int i = 0; i < 2; i++) {
			System.out.println(((Circulo)v[i]).getRadio());
		}
		
		System.out.println("---------------");
		
		//Recorremos todo el array y mostramos radio de los circulos
		for (int i = 0; i < v.length; i++) {
			if(v[i] instanceof Circulo){
				System.out.println(((Circulo)v[i]).getRadio());
			}
		}
	}
}
