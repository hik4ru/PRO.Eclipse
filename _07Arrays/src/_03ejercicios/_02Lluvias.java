package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class _02Lluvias {
	public static void main(String[] args) {
		double lluvias[] = new double[31];
		try {
			leerArray(lluvias,"lluviasenero.txt");
			System.out.println("Lluvias del mes: " + suma(lluvias));
			
			
			
			
			int primerDiaDeLluviaX = posPrimero(19,lluvias);
			if(primerDiaDeLluviaX == -1) System.out.println("Ningun dia llovio 19 litros");
			else System.out.println("El primer dia que llovio 19 litros fue el: " + (primerDiaDeLluviaX + 1));
			
			int ultimoDiaDeLluviaX = posUltimo(19,lluvias);
			// FALTA POR ACABAR (EJERCICIO 8) !!!!!!!!!!
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
			e.printStackTrace();
		}
	}
	
	//2.1
	public static void leerArray(double v[], String nombreFichero) throws FileNotFoundException{
		Scanner f = new Scanner(new File(nombreFichero)).useLocale(Locale.US);
		for (int i = 0; i < v.length; i++) {
			v[i] = f.nextDouble();
		}
	}
	
	//2.2
	public static double suma(double v[]){
		double suma = 0;
		for(int i = 0; i<v.length; i++){
			suma += v[i];
		}
		return suma;
	}
	
	//2.3
	public static double media(double v[]){
		double media = suma(v) / v.length;
		return media;
	}
	
	//2.4
	public static double maximo(double v[]){
		double maximo = v[0];
		for (int i=0; i < v.length; i++){
			if (maximo < v[i]) maximo = v[i];
		}
		return maximo;
	}
	
	//2.5
	public static double minimo(double v[]){
		double minimo = v[0];
		for (int i=0; i < v.length; i++){
			if (minimo > v[i]) minimo = v[i];
		}
		return minimo;
	}
	
	//2.6
	public static int posMaximo(double v[]){
		double maximo = v[0];
		int posMaximo = 0;
		for (int i=0; i < v.length; i++){
			if (maximo < v[i]) {
				maximo = v[i];
				posMaximo = i;
			}
		}
		return posMaximo;
	}
	
	//2.7
	
	
	//2.8
	public static int contarApariciones(double v[], double x){
		int cont = 0;
		for (int i = 0; i < v.length; i++){
			if (v[i] == x) cont++;
		}
		return cont;
	}
	
	//2.9
	public static double sumaParcial(double v[], int izq, int der){
		double s = 0;
		for (int i = izq; i <= der; i++){
			s += v[i];
		}
		return s;
	}
	
	//2.10
	public static int menoresQueElSiguiente(double v[]){
		int cont = 0;
		for (int i = 0; i < v.length-1; i++){
			if (v[i] < v[i+1]) cont ++;
		}
		return cont;
	}
	
	//8
	
	public static int posPrimero (double litros, double v[]){
		boolean encontrado = false;
		int i=0;
		while (i < v.length && !encontrado){
			if (v[i] == litros) encontrado = true;
			else i++;
		}
		if (encontrado) return i;
		else return -1;
	}
	
	public static int posUltimo (double litros, double v[]){
		boolean encontrado = false;
		int i=0;
		while (i < v.length && !encontrado){
			if (v[i] == litros) encontrado = true;
			else i++;
		}
		if (encontrado) return i;
		else return -1;
	}
	
}
