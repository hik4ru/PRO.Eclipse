package _02ejemplos._05animales;

public class Gato extends Felino implements AnimalDomestico {

	public void comer(){
		System.out.println("Como pienso para gatos");
	}
	
	public void hacerRuido(){
		System.out.println("Ruido de gato");
	}
	
	@Override
	public void vacunar() {
		System.out.println("Gato vacunado");
	}

	@Override
	public void cortalPelo() {
		System.out.println("Gato se corta el pelo");
	}

}
