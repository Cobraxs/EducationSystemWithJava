package mainprogram;

import java.util.ArrayList;

//CICLO
//Prueba git
class ciclo{
private  int cursosYear;
private String nombreCiclo;
private ArrayList<curso> cursos;

//CONSTRUCTOR

ciclo(String nombreCiclo){
	  this.nombreCiclo=nombreCiclo;
	  this.cursos= new ArrayList<>();
}

public void addCourse() {
	  cursosYear++;
	  curso curso= new curso(cursosYear);
	  cursos.add(curso);
	  System.out.println("Se ha creado el "+cursosYear+" anio. de "+this.nombreCiclo);
	  
	  
}

public void addModule(String nombre, profesor profesor, int year) {
	  
	for(curso c: cursos) {
		if(c.getYear()==year) {
			modulo newModule= new modulo(nombre.toUpperCase(),profesor);
			c.addModulo(newModule);
		}
	}
	  modulo Module= new modulo(nombre,profesor);
	  System.out.println("Se ha creado el modulo "+Module.getName()+" impartida por "+profesor.getNombre());
	  
}

public void addAlumno(alumno alumno,String Modulo) {
	  
	  for(curso c:cursos) {
		  
           for(modulo m: c.getModulo()) {
        	     if(m.getName()==Modulo) {
        	    	 m.addAlumno(alumno);
        	    	 System.out.println("Se ha matriculado al alumno "+alumno.getName()+" a la asignatura "+m.getName());
        	     }
           }
	  }
}
public void matricularAlumnoGradoCompleto(alumno alumno, int year) {
	  
	  for(curso c:cursos) {
		  
		  if(c.getYear()==year) {
			  
			  for(modulo m: c.getModulo()) {
				  m.addAlumno(alumno);
				  System.out.println("Se ha matriculado al alumno "+alumno.getName()+" a la asignatura "+m.getName());
			  }
			  
		  }
         }
	  }
public void matricularAlumnoModulo(alumno alumno, String modulo) {
	  
	  for(curso c:cursos) {
		 
			  
			  for(modulo m: c.getModulo()) {
				  System.out.println(m.getName()+"|"+modulo.toUpperCase());
				  if(m.getName()==modulo.toUpperCase()) {
					  
					  m.addAlumno(alumno);
					  System.out.println("Se ha matriculado al alumno "+alumno.getName()+" a la asignatura "+m.getName());
					  
				  }
			  
		  }
       }
	  }

public void DesmatricularAlumno(alumno alumno,String Modulo) {
	  
	  for(curso c:cursos) {
		  
         for(modulo m: c.getModulo()) {
        	 boolean alumnopresente=m.SearchAlumno(alumno);
      	     if(m.getName()==Modulo &&  alumnopresente==true) {
      	    	
      	    	 m.deleteAlumno(alumno);
      	    	 System.out.println("Se ha desmatriculado al alumno "+alumno.getName()+" a la asignatura "+m.getName());
      	     }else if(m.getName()==Modulo && alumnopresente==false){
      	    	 System.out.println("El  alumno no se ha podido desmatricular,  "+alumno.getName()+" no est� matriculado la asignatura "+m.getName()+".");
      	     }
         }
	  }
}

public void AlumnosMatriculadosModulo(String Modulo) {
	  
	  for(curso c:cursos) {
		  
       for(modulo m: c.getModulo()) {
      	 System.out.println("Entr�"+m.getName()+"|"+Modulo.toUpperCase());
      	    if(m.getName()==Modulo.toUpperCase()) System.out.println();
           if(m.getName()==Modulo.toUpperCase()) {
          	 for(alumno alumno : m.getAlumnos()) {
          		 System.out.println(alumno.getName());
          	 };
           }
       }
	  }
}


}