package paquete;

import java.io.File;
import java.util.Scanner;

/*5. Crea un programa que dado un fichero (hay que comprobar que existe primero) 
 * compruebe los permisos que tiene y los muestre de la siguiente manera rwx o _wx 
 * (como el Linux). Si tiene todos los permisos tiene que dar la opción al usuario de 
 * cambiarlos tecleando r,w,x (las demás opciones dan error)*/

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.err.println("Introduzca el nombre del fichero: ");
		String nombre = entrada.next();
		File fichero = new File(nombre);
		
		
		if(fichero.exists()) {
			System.out.println("El fichero existe.");
			System.out.println("Nombre: " + fichero.getName());
			if(fichero.canRead()) {
				System.out.print("r");
			}
			else {
				System.out.print("_");
			}
			if(fichero.canWrite()) {
				System.out.print("w");
			}
			else {
				System.out.print("_");
			}
			if(fichero.canExecute()) {
				System.out.print("x");
			}
			else {
				System.out.print("_");
			}
			
			System.out.print("Pulse la tecla del permiso que quiere cambiar: ");
			
			
			entrada.close();
			
		}
		else {System.out.println("El fichero no existe.");
	}

	}}
