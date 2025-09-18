package paquete;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneradorProceso {
	public void ejecutar(String rutaDirectorio, String nombreEjecutable) {

		List<String> nombreArgumentos = new ArrayList<>();
		nombreArgumentos.add(nombreEjecutable);
		File directorio = new File(rutaDirectorio);
		ProcessBuilder pb = new ProcessBuilder(nombreArgumentos);
		pb.command(nombreArgumentos);
		pb.directory(directorio);
		// se puede hacer en una línea
		//pb.command(nombreArgumentos).directory(new File(rutaDirectorio));
		try {
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}