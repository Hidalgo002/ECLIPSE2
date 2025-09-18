package Repaso2;

public class Directivo extends Conjunto {
	public int salario;
	public boolean salesiano;
	public boolean turno;
	
	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", salesiano=" + salesiano + ", turno=" + turno + "]";
	}

	

	public Directivo(String dni, String nombre, String apellidos, int salario, boolean salesiano, boolean turno) {
		super(dni, nombre, apellidos);
		this.salario = salario;
		this.salesiano = salesiano;
		this.turno = turno;
	}



	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public boolean isSalesiano() {
		return salesiano;
	}

	public void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}
	
	
	
	
}
