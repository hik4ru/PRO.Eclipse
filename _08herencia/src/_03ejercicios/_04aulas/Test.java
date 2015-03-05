package _03ejercicios._04aulas;

public class Test {

	public static void main(String[] args) {
		Aula a = new Aula(1,10,5);
		AulaInformatica ai = new AulaInformatica(2,10,5,20);
		AulaMusica am = new AulaMusica(3,10,5,true);
		
		System.out.println(a);
		System.out.println("---------");
		System.out.println(ai);
		System.out.println("---------");
		System.out.println(am);
		System.out.println("---------");
	}

}
