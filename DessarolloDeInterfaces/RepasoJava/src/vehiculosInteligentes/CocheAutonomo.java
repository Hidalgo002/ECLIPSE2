package vehiculosInteligentes;

import java.time.LocalDate;

public class CocheAutonomo extends VehiculoInteligente{
	private int nivelAutonomia;
	private double velocidadMaxima;
	private String matricula;
	private int numeroPasajeros;
	private String softwareVersion;
	


	public CocheAutonomo(int id, String modelo, boolean sensoresActivos, double bateriaNivel, LocalDate fechaActivacion,
			int nivelAutonomia, double velocidadMaxima, String matricula, int numeroPasajeros, String softwareVersion) {
		super(id, modelo, sensoresActivos, bateriaNivel, fechaActivacion);
		this.nivelAutonomia = nivelAutonomia;
		this.velocidadMaxima = velocidadMaxima;
		this.matricula = matricula;
		this.numeroPasajeros = numeroPasajeros;
		this.softwareVersion = softwareVersion;
	}


	public int getNivelAutonomia() {
		return nivelAutonomia;
	}


	public void setNivelAutonomia(int nivelAutonomia) {
		this.nivelAutonomia = nivelAutonomia;
	}


	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}


	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}


	public String getSoftwareVersion() {
		return softwareVersion;
	}


	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	
	public static void activarModoAutonomo() {
		
	}
	
}
