package mainprogram;

//PERSONAS
class Persona{
	protected String Nombre;
	protected String DNI;
	protected String Direccion;
	protected String Telefono;
	
	//CONSTRUCTOR
	Persona(String nombre,String DNI,String direccion,String Telefono){
   		
		this.Nombre=nombre;
		this.DNI=DNI;
		this.Direccion=direccion;
		this.Telefono=Telefono;
	}
	
}

class alumno extends Persona{
	private String Ciclo;
	private String Curso;
	private  String Notas;
	
	//CONSTRUCTOR
	alumno(String nombre,String DNI,String direccion,String Telefono){
		
		super(nombre,DNI,direccion,Telefono);
	}
	
	public String getName() {
		return this.Nombre;
	}
	
}
class profesor extends Persona{
	private String codProf;
	private String departamento;
	private String modulos;
	private String  horario;
	
	//CONSTRUCTOR
	profesor(String nombre,String DNI,String direccion,String Telefono){
		
		super(nombre,DNI,direccion,Telefono);
	}
	
	//GETTERS Y SETTERS 
	
	public String getNombre() {
		return this.Nombre;
	}
}
