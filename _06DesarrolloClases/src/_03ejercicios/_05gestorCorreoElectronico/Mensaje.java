package _03ejercicios._05gestorCorreoElectronico;

public class Mensaje {
			
	//VARIABLES
	
	private int codigo;
	private String emisor, destino, asunto, texto;
	private static int siguienteCodigo = 1;
	
	//CONSTRUCTORES
	
	public Mensaje (String emisor, String destino, String asunto, String texto){
		this.emisor = emisor;
		this.destino = destino;
		this.asunto = asunto;
		this.texto = texto;
		codigo = siguienteCodigo;
		siguienteCodigo++;
	}
	
	//GETTERS
	
	public String getEmisor(){
		return emisor;
		
	
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Mensaje)) return false;
		Mensaje m = (Mensaje) o;
		return this.codigo == m.codigo;
	}
	
	public static boolean validarEmail(String email){
		int posArroba = email.indexOf('@');
		int pospunto = email.indexOf('.');
		if(posArroba == -1 || 
			posPunto == -1 ||
			posArroba == 0 ||
			posPunto == email.lenght()-1 ||
			pos Punto <= posArroba+1)
		return false;
		)
	}
	}
	
	public String getDestinatario(){
		return destino;
	}
	
	public String getAsunto(){
		return asunto;
	}
	
	public String getTexto(){
		return texto;
	}
	
	

}
