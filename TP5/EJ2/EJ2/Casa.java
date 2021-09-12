package EJ2;

import java.util.ArrayList;
import java.util.Arrays;

public class Casa {
    private int CantidadAlumnos;

    // cada casa tiene una condicion para el ingreso distinta

    // [cualidadLeal,cualidadEducado]
    private ArrayList<String> cualidades; // Dudoso
    private String nombre;
    private ArrayList<Alumno> alumnos;
    private Exigencia exigencia;

    public Casa(String nombre, int cantidadAlumnos, ArrayList<String> cualidades, Exigencia exigencia) {
        this.CantidadAlumnos = cantidadAlumnos;
        this.cualidades = cualidades;
        this.nombre = nombre;
        this.alumnos = new ArrayList<Alumno>();
        alumnos.add(new Alumno("harry", new ArrayList<String>(Arrays.asList("leal", "inteligente", "educado"))));
        // alumnos.add(new Alumno("Juan", new ArrayList<String>(Arrays.asList("leal", "inteligente", "educado"))));
        this.exigencia = exigencia;

    }

    public boolean puedeIngresar(Alumno a) {
        if (familia(a) && this.compleCualidad(a)) {
           return true;
        }

        return false;
    }

    private boolean compleCualidad(Alumno a) {
        for (String cualidad : cualidades) {
            if (!a.cumploCualidad(cualidad))
                return false;
        }

        return true;
    }

    private boolean familia(Alumno a) {
        return this.exigencia.tieneFamilia(new ArrayList<Alumno>(this.alumnos), a);
    }

    public void agregarCualidades(String nuevaCualidad) {
        cualidades.add(nuevaCualidad);
    }

    public static void main(String[] args) {

         Casa griffindor = new Casa("Griffindor",100,new ArrayList<String>(Arrays.asList("leal","inteligente","educado")),new ExigenciaPuraSangre());
        
        Alumno a1 = new Alumno("jorge", new ArrayList<String>(Arrays.asList("leal", "inteligente", "educado")));
        a1.agregarFamiliar(new Alumno("Juan", new ArrayList<String>(Arrays.asList("leal", "inteligente", "educado"))));
         System.out.println( griffindor.puedeIngresar(a1));

    }

}
