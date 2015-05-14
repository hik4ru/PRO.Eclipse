package _03ejercicios;

import java.io.BufferedReader;
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
public class _02DuplicarFicheroMayusculas {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero origen: ");
		String nomFichOrigen = tec.nextLine();
		System.out.println("Nombre del fichero destino: ");
		String nomFichDestino = tec.nextLine();

		try (FileReader fo = new FileReader(nomFichOrigen);) {
			try (FileWriter fd = new FileWriter(nomFichDestino);) {

				int dato;
				while ((dato = fo.read()) != -1) {
					String s = "" + (char) dato;

					fd.write(s.toUpperCase());
					System.out.print(s.toUpperCase());

				}
			} catch (FileNotFoundException e) {
				System.out.println("El fichero no existe o no se puede abrir");
			} catch (IOException e) {
				System.out.println("Error de lectura o al cerrar el fichero");
			}
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe o no se puede abrir");
		} catch (IOException e) {
			System.out.println("Error de lectura o al cerrar el fichero");
		}
	}
}
