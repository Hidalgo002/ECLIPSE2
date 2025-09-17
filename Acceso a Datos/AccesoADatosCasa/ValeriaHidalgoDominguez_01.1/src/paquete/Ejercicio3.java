package paquete;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//3. Crea un programa que cree un fichero dentro de un directorio 
//(ambos nombres son introducidos por el usuario por teclado) 

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.err.println("CREAR CARPETA Y ARCHIVO: ");
		
		System.err.println("Introduzca el nombre del directorio: ");
		String nombreD = entrada.next();
		File directorio = new File(nombreD);
		
		System.err.println("Introduzca el nombre del archivo: ");
		String nombreA = entrada.next();
		File fichero = new File(directorio,nombreA);
		
		entrada.close();
		
		//1.Crear directorio
		directorio.mkdir();
		
		//2.Introducir el archivo
		try {
			fichero.createNewFile();
			}
		
		catch(IOException io) {
			io.printStackTrace(); 
			}
		}

		

	}

