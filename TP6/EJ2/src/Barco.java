
import java.time.LocalDate;

public class Barco extends Transporte {

    private double capacidad;
    private LocalDate fechaDeingreso;


    public Barco(double capacidad,LocalDate fechaDeIngreso){
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

    @Override
    public String toString(){
        return "Capacidad: " + this.getCapacidadDeCarga() + " Fecha de ingreso " + this.getFechaDeIngreso(); 
    }


}
