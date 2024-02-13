package mainprogram;

public class main {

	public static void main(String[] args) {
		
		//Registro de alumnos 
          alumno Jose= new alumno("Jose villatoro","55525343D","Villalba","63747347");
		
		//Registro de profesores 
		profesor Zenobia = new profesor("Zenobia","55525343E","Torrelodones","611543232");
		profesor Benito= new profesor("Benito","53525343E","Navalagamella","622543732");
		profesor Sara=  new profesor("Sara","5648393A","Colmenarejo","64734334");
		profesor Teresa= new profesor("Teresa","5546546T","Alcalá de Henares","63343322");
		// CRECIÓN DEL CICLO
		ciclo DAW= new ciclo("DAW");
		ciclo ASIR= new ciclo("ASIR");
		
	
		//CREACION DE CURSOS 
		DAW.addCourse();
		DAW.addCourse();
		ASIR.addCourse();
		ASIR.addCourse();
		//CREACIÓN DE MODULOS
		DAW.addModule("Programacion", Zenobia,1);
		DAW.addModule("Entornos de desarrollo", Sara,1);
		DAW.addModule("Lenguaje de marcas", Sara,1);
		DAW.addModule("Base de datos", Benito,1);
		DAW.addModule("Sistemas",Teresa,1);
		//DAW.addAlumno(Jose,"Lenguaje de marcas");
		//DAW.addAlumno(Jose,"Programacion");
		DAW.DesmatricularAlumno(Jose,"Programacion");
	   DAW.matricularAlumnoGradoCompleto(Jose, 1);
			
		//DAW.addAlumno(listaAlumnos.get(0),"Base de datoss");
		
		
	  
	}

}
