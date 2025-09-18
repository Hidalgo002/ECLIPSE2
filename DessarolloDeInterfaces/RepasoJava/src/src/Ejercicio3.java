package src;

/*Ejercicio 3: A partir de un array de enteros, recorrerlo y obtener
por pantalla la cantidad total de números pares.*/
public class Ejercicio3 {
	
	public static void main(String[] args) {
		int[] arrayE = {1,2,3,4}; 
		int n=0;
		
		for(int i=0;i<arrayE.length;i++){		
			if(arrayE[i]%2 == 0) {
				n++;
			}
					
		}
		
		System.out.println("Cantidad de números pares: " + n);
	}

}
