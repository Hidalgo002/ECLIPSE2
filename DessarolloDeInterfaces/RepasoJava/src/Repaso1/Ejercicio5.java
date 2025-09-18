package Repaso1;

/*Ejercicio 5: Calcular el factorial de un número entero positivo a
través de la recursividad.*/
import java.util.Scanner;

public class Ejercicio5 {
	
	public static int factorial(int numero) {

		if (numero==0 || numero==1) {
			return 1;
		}
		return numero * factorial (numero-1);
		}
	
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		System.out.println("Número de dígitos: "+factorial(numero));
	}
}
