package paquete;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//La variable 'nombreEjecutable' es el sistituto a cualquier .exe
public class GeneradorProceso {

	public static void main(String rutaDirectorio, String nombreEjecutable) {
		List <String> nombreArgumentos = new ArrayList<>();
		File directorio = new File(rutaDirectorio);
		ProcessBuilder pb = new ProcessBuilder(nombreArgumentos);
		pb.command(nombreEjecutable);
		pb.directory(directorio);
		
		
		try {
			Process proceso = pb.start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
