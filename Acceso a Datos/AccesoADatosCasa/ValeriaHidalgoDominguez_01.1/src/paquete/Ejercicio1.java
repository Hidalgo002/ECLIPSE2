package paquete;
import java.io.File;
import java.util.Scanner;

//1. Realiza un programa que liste elementos de un directorio introducido por pantalla. 

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.err.println("Introduzca el nombre del directorio: ");
		String nombre = entrada.next();
		File directorio = new File(nombre);
		entrada.close();
		
		
		if(directorio.exists()) {
			System.out.println("Contenido del directorio:");
            		File[] archivos = directorio.listFiles();
            		for (File archivo : archivos) {
            			System.out.println("--> " + archivo.getName());
                    } 
            		}
		
		else {
			System.out.println("No existe el directorio.");				}
	}
}

