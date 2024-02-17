package mainprogram;

import java.util.ArrayList;

class modulo{
	
	//PROPIEDADES
	private String nombre;
	private profesor profesor;
	private ArrayList<alumno> alumnos;
	
	
	//GETTER Y SETTERS 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<alumno> alumnos) {
		this.alumnos = alumnos;
	}

	
	//METODOS GENERALES
	
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
	
	public boolean SearchAlumno(alumno al) {
		for(alumno alumno:alumnos) {
			
			if(al.getName()==alumno.getName()) {
				return true;
			}
		};
		return false;
		
	}
}