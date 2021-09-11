package EJ2;

import java.util.ArrayList;

public class Casa {
    private int CantidadAlumnos;
    private ArrayList <Cualidad> cualidades;
    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Casa(Cualidad cualidad,String nombre, int cantidadAlumnos){
        this.CantidadAlumnos = cantidadAlumnos;
        this.cualidades = new ArrayList<Cualidad>();
        this.nombre = nombre;
        this.alumnos= new ArrayList<Alumno>();
  
    }

    public boolean puedeIngresar(Alumno a){
      for (Cualidad cualidad : cualidades) {
          if(!a.cumploCualidad(cualidad)) return false;
      }

      return true;   
     }
    

}
