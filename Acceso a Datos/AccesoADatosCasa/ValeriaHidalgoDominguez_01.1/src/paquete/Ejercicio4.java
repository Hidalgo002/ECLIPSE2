package paquete;

import java.io.File;
import java.util.Scanner;

//4. Crea un programa que dado un directorio (compruebe primero que es un directorio y si lo es) 
//liste todos los ficheros y directorios que contiene. 
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.err.println("Introduzca el nombre del directorio: ");
		String nombre = entrada.next();
		File directorio = new File(nombre);
		entrada.close();
		
		System.out.print("¿Es un directorio?: ");
		boolean direct = directorio.isDirectory();
			if(direct==true) {
				System.out.println("Sí.");
				System.out.println("Contenido del directorio:");
        		File[] archivos = directorio.listFiles();
        		for (File archivo : archivos) {
        			System.out.println("--> " + archivo.getName());
                } 
			}
			else {System.out.println("No.");}
	}
}
