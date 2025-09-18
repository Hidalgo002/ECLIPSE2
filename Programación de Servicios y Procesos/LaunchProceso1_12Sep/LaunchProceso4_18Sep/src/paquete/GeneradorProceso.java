
package paquete;

import java.io.File;
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
		nombreArgumentos.add(ruta); //Añadimos el primer argumento, la ruta
		
		ProcessBuilder pb = new ProcessBuilder(nombreArgumentos);
		pb.command(nombreArgumentos);
		

		try {
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
