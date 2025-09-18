package vehiculosInteligentes;

import java.time.LocalDate;

public class DroneAereo extends VehiculoInteligente{
	private double altitud;
	private int numeroHelices;
	private double pesoCargaMax;
	private boolean gpsIntegrado;
	private String fabricante;


	public DroneAereo(int id, String modelo, boolean sensoresActivos, double bateriaNivel, LocalDate fechaActivacion,
			double altitud, int numeroHelices, double pesoCargaMax, boolean gpsIntegrado, String fabricante) {
		super(id, modelo, sensoresActivos, bateriaNivel, fechaActivacion);
		this.altitud = altitud;
		this.numeroHelices = numeroHelices;
		this.pesoCargaMax = pesoCargaMax;
		this.gpsIntegrado = gpsIntegrado;
		this.fabricante = fabricante;
	}


	public double getAltitud() {
		return altitud;
	}


	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}


	public int getNumeroHelices() {
		return numeroHelices;
	}


	public void setNumeroHelices(int numeroHelices) {
		this.numeroHelices = numeroHelices;
	}


	public double getPesoCargaMax() {
		return pesoCargaMax;
	}


	public void setPesoCargaMax(double pesoCargaMax) {
		this.pesoCargaMax = pesoCargaMax;
	}


	public boolean isGpsIntegrado() {
		return gpsIntegrado;
	}


	public void setGpsIntegrado(boolean gpsIntegrado) {
		this.gpsIntegrado = gpsIntegrado;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public static void despegar() {
		
	}
}
