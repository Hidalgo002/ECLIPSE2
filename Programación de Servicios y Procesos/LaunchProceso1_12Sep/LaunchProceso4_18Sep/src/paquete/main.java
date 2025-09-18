package paquete;

public class main {

	public static void main(String[] args) {
		String ruta = "ipconfig";

		
		GeneradorProceso lanzador = new GeneradorProceso();
		lanzador.ejecutar(ruta);
		System.out.println("Proceso completado");

	}

}
