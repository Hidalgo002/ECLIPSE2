package Repaso2;

public class Profesor extends Conjunto {
	int Salario;
	int numAsignaturas;
	boolean esTutor;
	
	@Override
	public String toString() {
		return "Profesor [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Salario=" + Salario
				+ ", numAsignaturas=" + numAsignaturas + ", esTutor=" + esTutor + "]";
	}
	
	

	public Profesor(String dNI, String nombre, String apellidos, int salario, int numAsignaturas, boolean esTutor) {
		super(dNI, nombre, apellidos);
		Salario = salario;
		this.numAsignaturas = numAsignaturas;
		this.esTutor = esTutor;
	}



	public int getSalario() {
		return Salario;
	}

	public void setSalario(int salario) {
		Salario = salario;
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
