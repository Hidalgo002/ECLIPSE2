package Repaso2;

public class Administracion extends Conjunto {

	public String estudios;
	public int antiguedad;
	
	

	@Override
	public String toString() {
		return "Administracion [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos +", estudios=" + estudios + ", antiguedad=" + antiguedad + "]";
	}
	
	

	
	public Administracion(String dni, String nombre, String apellidos, double salario, String estudios,
			int antiguedad) {
		super(dni, nombre, apellidos, salario);
		this.estudios = estudios;
		this.antiguedad = antiguedad;
	}



	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}




	@Override
	protected double salario() {
		int getSalario = 0;
		return getSalario*antiguedad;
	}
	
	
	
	
	
	
	
}
