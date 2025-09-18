package src;
/* Ejercicio 4: Crear una matriz de enteros de n x n (tamaño lo
decide el usuario), rellenar con números aleatorios, recorrerla y
dar la suma de todos sus números.*/

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
	
	int n = 0;
	int suma = 0;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduzca el tamaño de la matriz: ");
	n = entrada.nextInt();
	entrada.close();
	
	int matriz [][] = new int[n][n];
	
		for(int i = 0; i<matriz.length;i++) {
			for(int j = 0; j<matriz.length;j++) {
				matriz[i][j] = (int)(Math.random()*10);
				System.out.print(" "+matriz[i][j]);
				suma = suma + matriz[i][j];
			}
			System.out.println( );
		}
		
		System.out.println("Suma total: " + suma);
		
		
	}
			
	
	
}
