package Repaso2;

public class Directivo extends Conjunto {
	int Salario;
	boolean salesiano;
	boolean turno;
	@Override
	
	
	public String toString() {
		return "Directivo [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Salario=" + Salario
				+ ", salesiano=" + salesiano + ", turno=" + turno + "]";
	}
	
	
	
	
	public Directivo(String dNI, String nombre, String apellidos, int salario, boolean salesiano, boolean turno) {
		super(dNI, nombre, apellidos);
		Salario = salario;
		this.salesiano = salesiano;
		this.turno = turno;
	}




	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
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
