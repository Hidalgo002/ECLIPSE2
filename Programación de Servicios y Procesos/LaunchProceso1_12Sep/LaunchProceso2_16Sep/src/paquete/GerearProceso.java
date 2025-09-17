package DoceSep;

import java.util.ArrayList;
import java.util.List;

public class GeneradorProceso{
	public void ejecutar (){
		List <String> nombreArgumentos = new ArrayList<>();
			nombreArgumentos.add("C:/Carpeta/SumarDosNumeros.exe");//Primer argumento
			nombreArgumentos.add("18"); //Argumento 1 para mi programa de sumar
			nombreArgumentos.add("20"); //Argumento 2 para mi programa de sumar
		//Primero creamos un objeto de la case ProcessBuilder, cuando hacemos el metodo start, se crea un proceso
		ProcessBuilder pb = new ProcessBuilder(ruta);
		
		
		try {//Lo que hace si el programa ha ido bien
			Process proceso = pb.start(); //Se puede poner como --> pb.start();
		} catch (Exception e) {//Lo que hace si el programa ha salido mal
			e.printStackTrace();
		}
		
	}

}