package Repaso2;

public class Administracion extends Conjunto {
	public int salario;
	public String estudios;
	public int antiguedad;
	
	

	@Override
	public String toString() {
		return "Administracion [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", estudios=" + estudios + ", antiguedad=" + antiguedad + "]";
	}
	
	

	public Administracion(String dni, String nombre, String apellidos, int salario, String estudios, int antiguedad) {
		super(dni, nombre, apellidos);
		this.salario = salario;
		this.estudios = estudios;
		this.antiguedad = antiguedad;
	}



	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
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
	
	
	
	
	
	
	
}
