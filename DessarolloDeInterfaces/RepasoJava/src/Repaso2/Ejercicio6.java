package Repaso2;

public class Ejercicio6 {
	
	public static void main(String[] args) {
			Profesor profesor1 = new Profesor("25369W","Alfonso","Domingo",2500,5,true);
			Profesor profesor2 = new Profesor("25379W","Rocío","Hidalgo",2501,4,true);

			Administracion admin1 = new Administracion("29874K", "Lucía", "Lázaro", 2000, "Administración y Finanazas", 6);
			Administracion admin2 = new Administracion("26474K", "Macarena", "Rubio", 2050, "Administración y Finanazas", 4);

			Directivo direct1 = new Directivo("287450Q", "Pablo", "Elche",1000, true, false);
			Directivo direct2 = new Directivo("287960Q", "María", "Gallego",1900, false, true);

			Modulo modulo1 = new Modulo("Matemáticas", 5, profesor1, false);
			Modulo modulo2 = new Modulo("Historia", 6, profesor2, true);

			Alumno alumno1 = new Alumno("854751G", "Claudia", "Ferrer", "25-6-99", true, false, modulo1);
			Alumno alumno2 = new Alumno("858741G", "Carmelo", "Ríos", "6-8-99", false, false, modulo2);

			
			Profesor[] profesor = {profesor1,profesor2};
			Administracion[]administracion = {admin1,admin2};
			Directivo[] directivo = {direct1,direct2};
			Modulo[] modulo = {modulo1, modulo2};
			Alumno[] alumno = {alumno1,alumno2};
			
			for(Profesor Profesor : profesor){
				System.out.println(Profesor.toString());
			}
			
			for(Administracion Administracion : administracion){
				System.out.println(Administracion.toString());
			}
			
			for(Directivo Directivo : directivo){
				System.out.println(Directivo.toString());
			}
			
			for(Modulo Modulo : modulo){
				System.out.println(Modulo.toString());
			}
			
			for(Alumno Alumno : alumno){
				System.out.println(Alumno.toString());
			}
			
				
	}

}
