
package paquete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*ENUNCIADO:

• Utilizando la clase Process Builder, ejecutar el comando ipconfig (recordad
que al ser un comando se encuentra en el PATH de Windows)
• Si la ejecución del comando no ha sido satisfactoria se mostrará un mensaje
de error.
• Precisaremos un poco más el tratamiento de excepciones.
• Las de tipo IOException ➔ mostraremos el registro de la pila de excepción para
así poder apreciar el nombre y mensaje asociado a la excepción.
• Las de tipo InterruptedException ➔ mostraremos el mensaje de proceso
interrumpido.
• Si el comando se ha ejecutado correctamente, devolveremos el mensaje
“Ejecución correcta” y, en caso contrario “Ejecución con errores”. 
  
*RECOMENDACIONES Y PISTAS:
• Puesto que vamos a ejecutar un comando, es interesante que herede la
entrada y salida del padre (utilizar inheritIO).
• Dado que tenemos que controlar si el comando se ha ejecutado correctamente
o no, sería buena idea trabajar con el código de retorno. Para ello, deberemos
realizar un waitFor y el entero que devuelve el proceso lanzado cuando
termina será el código de retorno.
•En cuanto a las variables de entorno, podemos lanzarlo sin mencionarlos especificamente como el "notepad.exe" porque están
en el camino y en las variables de entorno. Podemos lanzarlos donde queramos.

*ENUNCIADO FINAL
• Lanzar el comando ipconfig /all con las mismas características anteriormente
mencionadas. Habrá que tratar /all como el parámetro del y tratarlo de
manera diferente al nombre del comando.
*/


public class GeneradorProceso {
	public void ejecutar(String ruta) {
		
		List<String> nombreArgumentos = new ArrayList<>();
		
		if(ruta==null || ruta.isEmpty()) {
			System.out.println("Falta el nombre del comando.");
			System.exit(1);//Si falla, saldrá un uno.NUNCA PONER CERO
		}
		nombreArgumentos.add(ruta); //Añadimos el primer argumento, la ruta
		
		ProcessBuilder pb = new ProcessBuilder(nombreArgumentos);
		pb.command(nombreArgumentos);
		

		//llamada a inheritIO()
		//hace que el proceso herede la E/S estandar del proceso padre
		//Así podemos ver el resultado del comando, en este caso, el ipconfig
		
		pb.inheritIO();
		
		try {
			Process proceso = pb.start();
			int codigoRetorno = proceso.waitFor();//Esperamos a que se acabe el proceso, y cuando se acaba, se rellena el Codigo de Retorno
			System.out.println("===================CODIGO DE RETORNO=================  \n El comando devuelve: "+codigoRetorno+"\n======================================================");
				if(codigoRetorno==0) {
					System.out.println("Ejecución Correcta.");//Si devuelve cero
				}
				else {System.out.println("Ejecución con Errores.");}
			
			}
		catch(IOException e){
			System.out.println("Ha habido un error catastrofico durante la ejecución del comando.\nINFORMACIÓN ADICIONAL: ");
			e.printStackTrace();
			
			
			}
	}
}
