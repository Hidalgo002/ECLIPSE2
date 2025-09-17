package DoceSep;



public class GeneradorProceso{
	public void ejecutar (String ruta){
		ProcessBuilder pb = new ProcessBuilder(ruta);
		
		
		try {//Lo que hace si el programa ha ido bien
			Process proceso = pb.start(); //Se puede poner como --> pb.start();
		} catch (Exception e) {//Lo que hace si el programa ha salido mal
			e.printStackTrace();
		}
		
	}

}
