
import java.time.LocalDate;

public class Barco implements Comparable<Barco>{

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

    // public boolean prioridadDeCarga(Transporte barco){
    //     Barco aux = (Barco)barco;
    //     if(this.getCapacidadDeCarga()>aux.getCapacidadDeCarga())return true;
    //     return false;
    // }
    

    @Override
    public String toString(){
        return "Capacidad: " + this.getCapacidadDeCarga() + " Fecha de ingreso " + this.getFechaDeIngreso(); 
    }

    @Override
    public int compareTo(Barco b){
                
        int capacidad =(int)(b.getCapacidadDeCarga()-this.getCapacidadDeCarga());  
        return capacidad;
    }



  


}
