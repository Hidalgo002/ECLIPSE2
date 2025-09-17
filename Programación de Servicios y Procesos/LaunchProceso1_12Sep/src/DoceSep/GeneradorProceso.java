package DoceSep;

import java.util.ArrayList;
import java.util.List;

public class GeneradorProceso{
	public void ejecutar (String ruta){
		List <String> nombreArgumentos = new ArrayList<>();
		
		ProcessBuilder pb = new ProcessBuilder(ruta);
		
		try {
			Process proceso = pb.start(); //Se puede poner como --> pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
