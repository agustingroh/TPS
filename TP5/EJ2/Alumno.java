package EJ2;
/*
De un alumno se conoce su nombre, su conjunto de cualidades y el conjunto de familiares que asisten a la
escuela. Para que una casa pueda aceptar a un nuevo alumno, además de haber lugar, el
alumno tiene que poseer todas las cualidades que la casa requiera. Es importante destacar que
los alumnos pueden ser asignados como máximo a una única casa.
*/

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Alumno> familiares;
    private ArrayList<Cualidad> cualidades;

    public Alumno(String nombre,Cualidad cualidad) {
        this.nombre=nombre;
        this.familiares = new ArrayList<Alumno>();
        this.cualidades=new ArrayList<Cualidad>();
    }

    public boolean cumploCualidad(Cualidad c){
       return this.cualidades.contains(c);

    }

}
