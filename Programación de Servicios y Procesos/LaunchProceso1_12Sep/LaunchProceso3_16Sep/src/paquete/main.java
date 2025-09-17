package paquete;

public class main {

	public static void main(String[] args) {
		String ruta = "C:\\Users\\DAM\\Notepad++";
		String nombre = "notepad.exe";
		GeneradorProceso lanzador = new GeneradorProceso();
		lanzador.ejecutar(ruta,nombre);
		System.out.println("Proceso completado");

	}

}
