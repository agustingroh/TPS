import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import java.time.*;

;

public class Peluqueria {
    List<Peluquero> peluqueros;
    private String nombre;

    public Peluqueria(String nombre) {
        this.nombre = nombre;
        this.peluqueros = new ArrayList<Peluquero>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void nuevoEmpleado(Peluquero p) {
        peluqueros.add(p);
    }

    public ArrayList<Turno> listaDeTurnosDisponibles(LocalDate fecha) {
        ArrayList<Turno> turnosDisponibles = new ArrayList<Turno>();
        for (Peluquero peluquero : peluqueros) {
            for (Turno turno : peluquero.getTurnosDisponibles(fecha)) {
                turnosDisponibles.add(turno);
            }
        }
        return turnosDisponibles;
    }

    private Peluquero obtenerPeluqueroPorNombre(String nombre) {

        for (Peluquero peluquero : this.peluqueros) {
            if (peluquero.getNombre() == nombre)
                return peluquero;

        }
        return null;
    }

    public void agregarTurno(Persona cliente, String peluquero, LocalDate fecha, LocalTime hora) {
        Peluquero pel = this.obtenerPeluqueroPorNombre(peluquero); 
        if (pel != null) pel.agregarTurno(cliente, fecha, hora); // auto-fix :)

    }
    //hermoso, esto corre. No hace nada pero corre jaja.
    // oy a probar la agenda

    //Por?
    

    public static void main(String[] args) {
        Peluqueria peluqueria = new Peluqueria("Manolo");
        peluqueria.nuevoEmpleado(new Peluquero("peluca", "scissors"));

    }
}
