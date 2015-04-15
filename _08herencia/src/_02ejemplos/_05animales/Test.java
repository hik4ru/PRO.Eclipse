package _02ejemplos._05animales;

public class Test {

	public static void main(String[] args) {
		
		
		Animal[] animalesCirco = {
				new Leon(),
				new Tigre(),
				new Leon(),
		};
		
		//Podemos agrupar tigres y leones en un array de Felino
		Animal[] animalesCirco2 = {
				new Leon(),
				new Tigre(),
				new Leon(),
		};
		
		//Podemos agrupar perros y gatos en un array de Animal
		Animal[] animalesDomesticos = {
				new Perro(),
				new Gato()
		};
		
		//Podemos recorrer los arrays llamando a métodos de la clase Animal
		for (int i = 0; i < animalesCirco.length; i++) {
			animalesCirco[i].comer();
			animalesCirco[i].dormir();
		}
		
		//Podemos recorrer el array de animales domesticos llamando a metodos de la clase Animal
		for (int j = 0; j < animalesDomesticos.length; j++) {
			animalesDomesticos[i].comer();
			animalesDomesticos[i].dormir();
			//Pero no puedo llamar a vacunar (solo lo tienen perros y gatos)
			//animalesDomesticos[i].vacunar();
		}
		
		//Podemos agrupar perros y gatos en un array de AnimalDomestico
		AnimalDomestico[] animalesDomesticos2 = {
				new Perro(),
				new Gato()
		};
		
		//Podemos recorrer el array vacunando a los AnimalesDomestico
	}

}
