package Repaso2;

public class Alumno extends Conjunto{
	public String fechaNacimiento;
	public boolean sexo;
	public boolean repetidor;
	Modulo modulo;
	
	
	


	@Override
	public String toString() {
		return "Alumno [fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", repetidor=" + repetidor
				+ ", modulo=" + modulo + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	


	public Alumno(String dni, String nombre, String apellidos, String fechaNacimiento, boolean sexo, boolean repetidor,
			Modulo modulo) {
		super(dni, nombre, apellidos);
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.repetidor = repetidor;
		this.modulo = modulo;
	}




	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public boolean isSexo() {
		return sexo;
	}


	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}


	public boolean isRepetidor() {
		return repetidor;
	}


	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}


	public Modulo getModulo() {
		return modulo;
	}


	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}
	
	

	
	
	
}
