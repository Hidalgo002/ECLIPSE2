package Repaso2;

public class Profesor extends Conjunto {
	public int salario;
	public int numAsignaturas;
	public boolean esTutor;
	
	

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", numAsignaturas=" + numAsignaturas + ", esTutor=" + esTutor + "]";
	}

	
	
	public Profesor(String dni, String nombre, String apellidos, int salario, int numAsignaturas, boolean esTutor) {
		super(dni, nombre, apellidos);
		this.salario = salario;
		this.numAsignaturas = numAsignaturas;
		this.esTutor = esTutor;
	}



	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
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
	


	
	
	
	
	
}
