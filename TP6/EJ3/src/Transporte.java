
import java.time.LocalDate;

public abstract class Transporte implements Comparable<Transporte> {
    
    private double capacidad;
    private LocalDate fechaDeingreso;


    public Transporte(double capacidad,LocalDate fechaDeIngreso){
        this.capacidad = capacidad;
        this.fechaDeingreso = fechaDeIngreso;
    }


    public double getCapacidadDeCarga() {
        return this.capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDate getFechaDeIngreso() {
        return this.fechaDeingreso;
    }

    public void setFechaDeingreso(LocalDate fechaDeingreso) {
        this.fechaDeingreso = fechaDeingreso;
    }

}
