package _03ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Programa que muestre en MAYUSCULAS el contenido
 * de un fichero cuyo nombre indique el usuario.
 * Se mostrará un mensaje de error en caso de que el
 * fichero indicado no exista o no se pueda abrir.
 */
public class _04DuplicarFicheroMayusculasLineaALinea {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero origen: ");
		String nomFichOrigen = tec.nextLine();
		System.out.println("Nombre del fichero destino: ");
		String nomFichDestino = tec.nextLine();

		try (FileReader fr = new FileReader(nomFichOrigen);
				BufferedReader br = new BufferedReader(fr);) {
			try (FileWriter fw = new FileWriter(nomFichDestino);
					BufferedWriter bw = new BufferedWriter(fw);) {

				String s;
				while((s = br.readLine()) != null){

					bw.write(s.toUpperCase());
					bw.newLine();
					
				}

				}
			} catch (FileNotFoundException e) {
				System.out.println("El fichero no existe o no se puede abrir");
			} catch (IOException e) {
				System.out.println("Error de lectura o al cerrar el fichero");
			}
	}
}
