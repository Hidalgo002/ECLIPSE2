package vehiculosInteligentes;

import java.time.LocalDate;

public class VehiculoInteligente {
	private int id;
	private String modelo;
	private boolean sensoresActivos;
	private double bateriaNivel;
	private LocalDate fechaActivacion;
	

	public VehiculoInteligente(int id, String modelo, boolean sensoresActivos, double bateriaNivel,
			LocalDate fechaActivacion) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.sensoresActivos = sensoresActivos;
		this.bateriaNivel = bateriaNivel;
		this.fechaActivacion = fechaActivacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isSensoresActivos() {
		return sensoresActivos;
	}

	public void setSensoresActivos(boolean sensoresActivos) {
		this.sensoresActivos = sensoresActivos;
	}

	public double getBateriaNivel() {
		return bateriaNivel;
	}

	public void setBateriaNivel(double bateriaNivel) {
		this.bateriaNivel = bateriaNivel;
	}

	public LocalDate getFechaActivacion() {
		return fechaActivacion;
	}

	public void setFechaActivacion(LocalDate fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}
	
	/*public static void mostrarInfo() {
		System.out.println("CATÁLOGO DE LIBROS");
		for (int i = 0; i < Libros.size(); i++) {
	        Libro libro = Libros.get(i);
	        System.out.println(libro);
	    }
	}*/
	
}
