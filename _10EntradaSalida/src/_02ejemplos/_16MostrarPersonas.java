package _02ejemplos;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _16MostrarPersonas {
	public static void main(String[] args) {
		try(DataInputStream f = new DataInputStream(new FileInputStream("personas.bin"))) {
			while (true) {
				String nombre = f.readUTF();
				int edad = f.readInt();
				double peso = f.readDouble();
				double est = f.readDouble();
				
				System.out.println("Nombre: " + nombre);
				System.out.println("Edad: " + edad);
				System.out.println("Peso: " + peso);
				System.out.println("Estatura: " + est);
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
