package Repaso2;

public class Directivo extends Conjunto {
	public boolean salesiano;
	public boolean turno;
	
	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos +", salesiano=" + salesiano + ", turno=" + turno + "]";
	}

	

	public Directivo(String dni, String nombre, String apellidos, int salario, boolean salesiano, boolean turno) {
		super(dni, nombre, apellidos, salario);
		this.salario = salario;
		this.salesiano = salesiano;
		this.turno = turno;
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



	@Override
	protected double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
