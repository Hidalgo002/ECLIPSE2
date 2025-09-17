package paquete;
import java.io.*;


public class RWX {
	
	public static void main(String[] args) {
		
		//Dentro de new File se pone la ruta del archivo o fichero
		File fichero = new File("FicheroEjemplo.txt");
		
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			}
			catch(IOException e){
				e.getMessage();
			}
			

			System.out.println("Nombre: " + fichero.getName());
			System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
			System.out.println("Tamaño: " + fichero.length());
			System.out.println("Permiso de lectura: " + fichero.canRead());
			System.out.println("Permiso de escritura: " + fichero.canWrite());
			System.out.println("Permiso de edición: " + fichero.canExecute());
			
			
			try {
				
				//OPCIÓN 1
				/*	FileWriter escritura = new FileWriter(fichero);
					PrintWriter pw = new PrintWriter(escritura);*/
				//OPCIÓN 2	
				BufferedWriter pw = new BufferedWriter(new FileWriter(fichero, true));
				
				for (int i = 0; i<10;i++) {//escribimos 10 números 
					pw.write("Línea: " + i);
					pw.newLine();
						}
				
				pw.close();
					
				System.out.println("TEXTO QUE CONTIENE EL FICHERO: ");	
		
				FileReader lector = new FileReader(fichero);
				BufferedReader buffer = new BufferedReader(lector);
				String linea;
				while((linea=buffer.readLine()) !=null) {
						System.out.println("          |"+ linea +"|");
						
				}
				lector.close();
					
				}
				
			
			catch(IOException e) {
				e.getMessage();
			}	
			
			finally {
				System.out.println("Fin del programa.");
			}
		}
	}
}

