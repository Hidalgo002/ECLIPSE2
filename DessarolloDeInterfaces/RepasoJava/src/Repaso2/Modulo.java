package Repaso2;

public class Modulo {
	String nombre;
	int horas;
	Profesor profesor;
	
	boolean convalidable;
	@Override
	public String toString() {
		return "Modulo [nombre=" + nombre + ", horas=" + horas + ", profesor=" + profesor + ", convalidable="
				+ convalidable + "]";
	}
	
	
	public Modulo(String nombre, int horas, Profesor profesor, boolean convalidable) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.profesor = profesor;
		this.convalidable = convalidable;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public boolean isConvalidable() {
		return convalidable;
	}
	public void setConvalidable(boolean convalidable) {
		this.convalidable = convalidable;
	}
	
	
	
}
