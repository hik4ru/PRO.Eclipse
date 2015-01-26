package _03ejercicios;

public class _03Dados {
	final static int LANZAMIENTOS = 100000;
	final static int FRECUENCIA = 1000;

	public static void main(String[] args) {
		int veces[] = new int[7];
		for(int cont = 1; cont <= LANZAMIENTOS; cont++){
			int dado = (int) (Math.random()* 6 + 1);
			/*
			 *  ACTUALIZAR CONTADOR
			 *  if (dado == 1) veces[1]++;
			 *  else if(dado == 2) veces[2]++;
			 *  else if(dado == 3) veces[3]++;
			 *  else if(dado == 4) veces[4]++;
			 *  else if(dado == 5) veces[5]++;
			 *  else veces[6]++;
			 */
			
			veces[dado]++;
			if(cont % FRECUENCIA == 0){
				System.out.println("Numero de lanzamientos: " + cont);
				/*
				 *  MOSTRAR ESTADISTICAS
				 *  Syso("1: " + (100.0 * veces[1]/cont));
				 *  Syso("2: " + (100.0 * veces[2]/cont));
				 *  Syso("3: " + (100.0 * veces[3]/cont));
				 *  Syso("4: " + (100.0 * veces[4]/cont));
				 *  Syso("5: " + (100.0 * veces[5]/cont));
				 *  Syso("6: " + (100.0 * veces[6]/cont));
				 */
				for (int i = 1; i < veces.length; i++){
					System.out.format("%d: %7.4f\n", i, 100.0 * veces[i]/cont);
				}
			}
		}
	}

}
