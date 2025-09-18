package Repaso2;

public class Conjunto {
	String DNI;
	String Nombre;
	String Apellidos;
	
	
	public Conjunto(String dNI, String nombre, String apellidos) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
	}
	
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	
	
	
}
