package ficheros;
import java.io.*;


public class Fichero {
	
	public static void main(String[] args) {
		
		//Dentro de new File se pone la ruta del archivo o fichero
		File fichero = new File("FicheroEjemplo.txt");
		
		if(fichero.exists()) {
			System.out.println("El fichero existe.");
			System.out.println("Nombre: " + fichero.getName());
			System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
			System.out.println("Tamaño: " + fichero.length());
			System.out.println("Permiso de lectura: " + fichero.canRead());
			System.out.println("Permiso de escritura: " + fichero.canWrite());
			System.out.println("Permiso de edición: " + fichero.canExecute());
			
			FileWriter escritura = new FileWriter(fichero);
			PrintWriter pw = new PrintWriter)escritura);
			
			for (int i = 0; i<10;:i++)
			pw.write(i)

				
			System.out.println("TEXTO QUE CONTIENE EL FICHERO: ");	
			try {//Como accedemos al disco, tenemos que usar try-catch.
				//Este Try va a cargar un buffer y leer caracter a caracter del archivo
					//1. Devuleve caracter a caracter
					FileReader lector = new FileReader(fichero);
					//2. Lleno el buffer de los carácteres y los leo línea a línea
					BufferedReader buffer = new BufferedReader(lector);
					//3. Defino línea
					String linea;
					//4.Se le línea por línea mientras sea distinto a null, es decir, hasta que haya acabado la linea
					while((linea=buffer.readLine()) !=null) {
						System.out.println("          |"+ linea +"|");
					}
				
				}
			catch(IOException e) {
				e.getMessage();
			}
			
			
		}
		else {
			System.out.println("No existe el fichero.");
			
			//Si el fichero no existe, crearemos el fichero con try-catch.
			
			try {//Usamos try-catch con la lectura y acceso del disco
				fichero.createNewFile();
				}
			
			catch(IOException io) {
				io.printStackTrace();//Con catch, se crea un fichero con el nombre del fichero que estamos buscando.
				}
			}
		
	}
}
