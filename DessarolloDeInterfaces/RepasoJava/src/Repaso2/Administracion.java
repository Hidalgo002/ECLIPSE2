package Repaso2;

public class Administracion extends Conjunto {
	int Salario;
	String estudios;
	int antiguedad;
	
	
	@Override
	public String toString() {
		return "Administracion [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Salario=" + Salario
				+ ", estudios=" + estudios + ", antiguedad=" + antiguedad + "]";
	}

	
	

	public Administracion(String dNI, String nombre, String apellidos, int salario, String estudios, int antiguedad) {
		super(dNI, nombre, apellidos);
		Salario = salario;
		this.estudios = estudios;
		this.antiguedad = antiguedad;
	}




	public int getSalario() {
		return Salario;
	}


	public void setSalario(int salario) {
		Salario = salario;
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
