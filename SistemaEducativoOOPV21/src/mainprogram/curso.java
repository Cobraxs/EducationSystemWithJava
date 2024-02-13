package mainprogram;

import java.util.ArrayList;

//CICLO

class curso{
	private int year;
	private ArrayList<modulo> modulos;
	
	curso(int anio){
		this.year=anio;
		this.modulos= new ArrayList<>();
	}
	
	//GETTERS Y SETTERS
	
	public int getYear() {
		return this.year;
	}
	
	public void addModulo(modulo p) {
		
		modulos.add(p);
		
	}
	
	//Revisar, esto todavía no está terminado. PREGUNTAR EN CLASE
	public void removeModulo(String name) {
		
 
		for(modulo modulo : modulos) {
			System.out.println(modulo.getName());
		}
	}
	public ArrayList<modulo> getModulo(){
		return modulos;
	}
	
}