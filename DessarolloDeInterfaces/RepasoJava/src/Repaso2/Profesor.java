package Repaso2;

public class Profesor extends Conjunto {
	public int numAsignaturas;
	public boolean esTutor;
	
	

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos 
				+ ", numAsignaturas=" + numAsignaturas + ", esTutor=" + esTutor + "]";
	}

	
	
	public Profesor(String dni, String nombre, String apellidos, int salario, int numAsignaturas, boolean esTutor) {
		super(dni, nombre, apellidos, salario);
		this.numAsignaturas = numAsignaturas;
		this.esTutor = esTutor;
	}



	public int getNumAsignaturas() {
		return numAsignaturas;
	}

	public void setNumAsignaturas(int numAsignaturas) {
		this.numAsignaturas = numAsignaturas;
	}

	public boolean isEsTutor() {
		return esTutor;
	}

	public void setEsTutor(boolean esTutor) {
		this.esTutor = esTutor;
	}



	@Override
	protected double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	


	
	
	
	
	
}
