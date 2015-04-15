package _03ejercicios._05academia;

import _03ejercicios._04aulas.Aula;
import _03ejercicios._04aulas.AulaInformatica;
import _03ejercicios._04aulas.AulaMusica;

public class TestAcademia {

	public static void main(String[] args) {
		Academia a = new Academia("prueba", "Calle Murillo, 5");
		a.ampliar(new Aula(1,10,10));
		a.ampliar(new AulaInformatica(2,10,5,20));
		a.ampliar(new AulaMusica(3,10,5,true));
	
		a.ordenar();
		System.out.println(a);
	}

}
