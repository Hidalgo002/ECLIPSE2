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
		String nombre = entrada.nextLine();
		File fichero = new File(nombre);
		
		
		if(fichero.exists()) {
			System.out.println("El fichero existe.");
			System.out.println("Nombre: " + fichero.getName()+"\nPERMISOS:");
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
			System.out.println("");
			if(fichero.canRead()==true&&fichero.canWrite()==true&&fichero.canExecute()==true) {
				System.out.print("Pulse la tecla del permiso que quiere cambiar: ");
				String letras = entrada.nextLine();
				String[] output = letras.split(" ");
				for (int i=0;i<output.length;i++) {
					if(output[i].equals("r")) {
						System.out.println("Permiso de LECTURA: REVOCADO.");
						fichero.setReadable(false);
					}
					else if(output[i].equals("w")) {
						System.out.println("Permiso de ESCRITURA: REVOCADO.");
						fichero.setWritable(false);
					}
					else if(output[i].equals("x")) {
						System.out.println("Permiso de EJECUCIÓN: REVOCADO.");
						fichero.setExecutable(false);
					}
			 		}
				}
			
			
			
			entrada.close();
			
			
			
		}
		else {System.out.println("El fichero no existe.");
		}

	}
}
