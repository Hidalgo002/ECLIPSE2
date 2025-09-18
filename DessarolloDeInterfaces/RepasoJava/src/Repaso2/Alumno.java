package Repaso2;

public class Alumno extends Conjunto{
	String fechaNacimiento;
	boolean sexo;
	boolean repetidor;
	Modulo modulo;
	
	
	@Override
	public String toString() {
		return "Alumno [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", sexo=" + sexo + ", repetidor=" + repetidor + ", modulo=" + modulo + "]";
	}


	public Alumno(String dNI, String nombre, String apellidos, String fechaNacimiento, boolean sexo, boolean repetidor,
			Modulo modulo) {
		super(dNI, nombre, apellidos);
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
