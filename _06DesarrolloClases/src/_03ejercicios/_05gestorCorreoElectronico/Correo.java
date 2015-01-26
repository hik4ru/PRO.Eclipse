package _03ejercicios._05gestorCorreoElectronico;

public class Correo {

	public static void main(String[] args) {
		Mensaje m1 = new Mensaje ("pepe@gmail.com", "ana@gmail.com", "saludo", "hola que tal");
		Mensaje m2 = new Mensaje ("ana@gmail.com", "pepe@gmail.com", "respuesta", "muy bien");
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println(Mensaje.validarEmail("tucorreo@gmail.com"));
	}

}
