package Repaso2;

public abstract class Conjunto {
	public String dni;
	public String nombre;
	public String apellidos;
	public double salario;

	@Override
	public String toString() {
		return "Conjunto [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario="+salario+"]";
	}
	
	
	public Conjunto(String dni, String nombre, String apellidos, double salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/*================================ABSTRACT====================================*/
	protected abstract double salario();
	
	
}
