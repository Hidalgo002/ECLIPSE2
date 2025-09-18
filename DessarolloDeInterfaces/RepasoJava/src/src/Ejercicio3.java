package src;

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
