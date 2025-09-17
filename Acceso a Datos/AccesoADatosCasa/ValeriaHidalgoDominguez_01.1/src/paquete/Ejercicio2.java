package paquete;

import java.io.File;
import java.util.Scanner;

//2. Crea un programa que compruebe que existe un fichero y si existe que lo borre. (Borrar.txt)
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.err.println("Introduzca el nombre del archivo a borrar: ");
		String nombre = entrada.next();
		File fichero = new File(nombre);
		entrada.close();
		
		if(fichero.exists()) {
			fichero.delete();
			System.out.println("El archivo ha sido borrado con éxito.");
		}
		else {
			System.out.println("El archivo no existe.");
		}
	}
}
