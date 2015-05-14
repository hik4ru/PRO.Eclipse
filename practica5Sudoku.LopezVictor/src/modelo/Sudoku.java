package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Sudoku {
	private int datos[][];
	public final static int TAMANYO = 9;

	/**
	 * Crea Sudoku vacï¿½o (todo ceros);
	 */
	public Sudoku(){
		datos = new int[TAMANYO][TAMANYO];
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				datos[i][j] = 0;
			}
		}
	}
	
	
	
	/**
	 * Crea sudoku a partir de los datos de una matriz. ------------------------------ ¿ESTÁ BIEN?
	 */
	public Sudoku(int datos[][]){
		this.datos = new int[TAMANYO][TAMANYO];
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				this.datos[i][j] = datos[i][j];
			}
		}
	}
	
	
	
	/**
	 * Crea sudoku a partir de los datos que se encuentran en el fichero cuyo nombre se 
	 * indica como parï¿½metro.
	 * @param nombreFichero nombre del fichero que contiene los datos
	 * @throws FileNotFoundException si el fichero especificado no existe.
	 */
	public Sudoku(String nombreFichero) throws FileNotFoundException{
		try (
				BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
		){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	/**
	 * Asigna al sudoku los datos de la matriz que se recibe como parï¿½metro.
	 * @param datos los datos con los que se inicializa el juego.
	 */
	public void setDatos(int datos[][]){
		
	}
	
	

	/**
	 * Devuelve la matriz de datos del sudoku
	 * @return la matriz de datos
	 */
	public int[][] getDatos(){
		return null;
	}
	
	
	
	/**
	 * Devuelve el dato de la fila y columna indicados
	 * @param fila fila del elemento a devolver
	 * @param columna columna del elemento a devolver
	 * @return el elemento de la fila y columna indicados
	 */
	public int getDato(int fila, int columna){
		return 0;
	}
	
	
	
	/**
	 * Asigna el valor dado al elemento de la fila y columna indicados.
	 * @param fila fila del elemento a modificar
	 * @param columna columna del elemento a modificar
	 * @param valor valor asignado al elemento
	 */
	public void setDato(int fila, int columna, int valor){
		
	}
	
	
	
	/**
	 * Si el elemento no estï¿½ vacï¿½o(0), comprueba que el elemento no se repite en la misma fila, 
	 * en la misma columna ni en la misma region.
	 * Los elementos vacios se consideran vï¿½lidos.
	 * @param fila fila del elemento a comprobar
	 * @param columna columna del elemento a comprobar
	 * @return true si el elemento es vï¿½lido, false en caso contrario.
	 */
	public boolean validarElemento(int fila, int columna){
		return false;
	}
	
	
	
	/**
	 * Comprueba si el sudoku estï¿½ resuelto. La comprobaciï¿½n consistirï¿½ en
	 * - Comprobar que no hay repetidos en filas, columnas, y cuadrantes (metodo validarElemento).
	 * - Comprobar que no hay celdas vacias
	 * @return true si estï¿½ resuelto, false en caso contrario.
	 */
	public boolean resuelto(){
		return false;
	}
	
	
	
	/**
	 * Devuelve el sudoku al estado en que se encontraba inmediatamente despues
	 * de ejecutarse el constructor, sea cual sea el constructor que se ha usado para 
	 * crearlo.
	 */
	public void reiniciar(){
		
	}

}
