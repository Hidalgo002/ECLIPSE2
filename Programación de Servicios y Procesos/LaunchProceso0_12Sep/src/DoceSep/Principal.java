package DoceSep;

public class Principal {

	public static void main(String[] args) {
		String ruta = "C:/Users/DAM/Notepad++/notepad++.exe";
		GeneradorProceso lanzador = new GeneradorProceso();
		lanzador.ejecutar(ruta);
		System.out.println("Proceso ejecutado.");

	}

}
