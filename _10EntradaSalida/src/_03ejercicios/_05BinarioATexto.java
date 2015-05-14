package _03ejercicios;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class _05BinarioATexto {
	
	/*
	 * Programa que cree un fichero de texto con la información
	 * contenida en el fichero binario personas.bin.
	 * El fichero contendrá un dato en cada línea y separará los
	 * datos de dos personas mediante una línea de guiones "-----"
	 */
	
	public static void main(String[] args) {
		try(
				DataInputStream fo = new DataInputStream(new FileInputStream("personas.bin"));
				BufferedWriter fd = new BufferedWriter(new FileWriter("personas.txt"))
			) {
			
			while (true) {
				String nombre = fo.readUTF();
				int edad = fo.readInt();
				double peso = fo.readDouble();
				double est = fo.readDouble();
				
				fd.write(nombre); fd.newLine();
				fd.write(String.valueOf(edad)); fd.newLine();
				fd.write(String.valueOf(peso)); fd.newLine();
				fd.write(String.valueOf(est)); fd.newLine();
				fd.write("-----"); fd.newLine();
			}
		} catch (EOFException e) {
			//Esto no es un error. El fichero se ha terminado.
			System.out.println("-----FIN-----");
		} catch (FileNotFoundException e){
			System.out.println("Fichero no existe o no se puede abrir");
		} catch (IOException e){
			System.out.println("Error al leer o cerrar el fichero");
		}
	}
}
