package mainprogram;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
        ArrayList<alumno> listaAlumnos = new ArrayList<>();
        
        alumno Jose=new alumno("Jose Villatoro", "12345678A", "Calle del Sol 123", "123456789");
        listaAlumnos.add(new alumno("Jose Pérez", "12345678A", "Calle del Sol 123", "123456789"));
        listaAlumnos.add(new alumno("Maria Rodriguez", "23456789B", "Avenida de la Luna 456", "987654321"));
        listaAlumnos.add(new alumno("Juan García", "34567890C", "Calle de la Montaña 789", "456789012"));
        listaAlumnos.add(new alumno("Laura Martínez", "45678901D", "Plaza del Pueblo 1011", "789012345"));
        listaAlumnos.add(new alumno("Carlos Fernandez", "56789012E", "Camino del Río 1314", "234567890"));
        

		
		//Registro de profesores 
		profesor Zenobia = new profesor("Zenobia","55525343E","Torrelodones","611543232");
		profesor Benito= new profesor("Benito","53525343E","Navalagamella","622543732");
		profesor Sara=  new profesor("Sara","5648393A","Colmenarejo","64734334");
		profesor Teresa= new profesor("Teresa","5546546T","AlcalÃ¡ de Henares","63343322");
		// CRECIÃ“N DEL CICLO
		ciclo DAW= new ciclo("DAW");
		ciclo ASIR= new ciclo("ASIR");
	
		//CREACION DE CURSOS 
		DAW.addCourse();
		DAW.addCourse();
		//CREACIÃ“N DE MODULOS
		DAW.addModule("Programacion", Zenobia,1);
		DAW.addModule("Entornos de desarrollo", Sara,1);
		DAW.addModule("Lenguaje de marcas", Sara,1);
		DAW.addModule("Base de datos", Benito,1);
		DAW.addModule("Sistemas",Teresa,1);
		//DAW.addAlumno(Jose,"Lenguaje de marcas");

		
		
	   //DAW.matricularAlumnoGradoCompleto(Jose, 1);
			
		DAW.matricularAlumnoModulo(Jose,"Programacion");
		//DAW.addAlumno(listaAlumnos.get(0),"Base de datoss");
		
      DAW.matricularAlumnoModulo(Jose,"Programacion");
		//Añadir lista de alumnos a un modulo
		for (alumno alumno : listaAlumnos) {
			DAW.matricularAlumnoModulo(alumno,"Programacion");
		}
		//DAW.AlumnosMatriculadosModulo("SISTEMAS");
	  
	}

}
