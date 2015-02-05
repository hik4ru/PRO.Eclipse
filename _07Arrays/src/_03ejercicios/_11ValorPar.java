package _03ejercicios;

public class _11ValorPar {

	public static void main(String[] args) {

	}

	public static boolean haypares1(int v[]) {
		int i = 0;
		while (i < v.length && v[i] % 2 != 0) {
			i++;
		}
		if (v[i] % 2 == 0)
			return true;
		else
			return false;
		
		//NO FUNCIONA
	}

	public static boolean haypares2(int v[]) {
		int i = 0;
		while (i < v.length && v[i] % 2 != 0) {
			i++;
		}
		if (i < v.length)
			return true;
		else
			return false;
		
		//SI FUNCIONA
	}

	public static boolean haypares3(int v[]) {
		int i = 0;
		while (v[i] % 2 != 0 && i < v.length) {
			i++;
		}
		if (i < v.length)
			return true;
		else
			return false;
		
		//NO FUNCIONA -- daria excepcion al comprobar la posicion de la array antes de la longitud del array
	}

	public static boolean haypares4(int v[]) {
		int i = 0;
		boolean encontrado = false;
		while (i <= v.length && !encontrado) {
			if (v[i] % 2 == 0)
				encontrado = true;
			else
				i++;
		}
		return encontrado;
		
		//NO FUNCIONA -- "i <= v.length"
	}

	public static boolean haypares5(int v[]) {
		int i = 0;
		boolean encontrado = false;
		while (i < v.length && !encontrado) {
			if (v[i] % 2 == 0)
				encontrado = true;
			i++;
		}
		return encontrado;
		
		//SI FUNCIONA
	}

	public static boolean haypares6(int v[]) {
		int i = 0;
		while (i < v.length) {
			if (v[i] % 2 == 0)
				return true;
			else
				return false;
		}
		
		//NO FUNCIONA -- solo mira la primera posicion del array
	}

	public static boolean haypares7(int v[]) {
		int i = 0;
		while (i < v.length) {
			if (v[i] % 2 == 0)
				return true;
			i++;
		}
		return false;
		
		//SI FUNCIONA
	}

}
