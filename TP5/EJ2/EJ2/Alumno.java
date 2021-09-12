package EJ2;
/*
De un alumno se conoce su nombre, su conjunto de cualidades y el conjunto de familiares que asisten a la
escuela. Para que una casa pueda aceptar a un nuevo alumno, además de haber lugar, el
alumno tiene que poseer todas las cualidades que la casa requiera. Es importante destacar que
los alumnos pueden ser asignados como máximo a una única casa.
*/

import java.util.ArrayList;
import java.util.Arrays;



public class Alumno {

    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;

    public Alumno(String nombre, ArrayList<String> cualidades) {
        this.nombre = nombre;
        this.cualidades = cualidades;
        this.familiares = new ArrayList<Alumno>();

    }

    public boolean cumploCualidad(String cualidadRequerida) {
        return this.cualidades.contains(cualidadRequerida);

    }

    public boolean familia(Alumno a) {
        return this.familiares.contains(a);
    }

    public void agregarFamiliar(Alumno a) {
        familiares.add(a);
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {
        Alumno aux = (Alumno) o;

        return aux.getNombre().equals(this.getNombre());
    }

}
