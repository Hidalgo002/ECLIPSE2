package paquete;

/*6. Crea un programa que permita al usuario introducir el nombre del fichero que quiere crear, 
que el programa compruebe que existe, si existe muesta la ruta dónde está. 
Sino le cambia los permisos para solo lectura.*/


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el nombre del fichero que quiere crear: ");
        String nombreFichero = entrada.nextLine();
        File fichero = new File(nombreFichero);

        if (fichero.exists()) {
            System.out.println("El fichero ya existe.");
            System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
        } else {
            try {
                if (fichero.createNewFile()) {
                    System.out.println("Fichero creado correctamente.");
                    // Establecer permisos de solo lectura
                    if (fichero.setWritable(false) && fichero.setExecutable(false)) {
                        System.out.println("Permisos cambiados: ahora es de solo lectura.");
                    } else {
                        System.out.println("No se pudieron cambiar correctamente los permisos.");
                    }
                } else {
                    System.out.println("No se pudo crear el fichero.");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el fichero:");
                e.printStackTrace();
            }
        }

        entrada.close();
    }
}

