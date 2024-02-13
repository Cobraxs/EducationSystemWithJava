package mainprogram;

import java.util.ArrayList;

class modulo{
	private String nombre;
	private profesor profesor;
	private ArrayList<alumno> alumnos;
	
	modulo(String nombre, profesor profesor){
		this.nombre=nombre;
		this.profesor=profesor;
		this.alumnos= new ArrayList<>();
	}
	
	public String getName() {
		return this.nombre;
	}
	
	public void addAlumno(alumno al) {
		alumnos.add(al);
		
	}
	public void deleteAlumno(alumno al) {
		alumnos.remove(al);
		
	}
}