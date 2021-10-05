import java.time.LocalDate;

public class Camion implements Comparable<Camion>{

    private double capacidad;
    private LocalDate fechaDeingreso;


    public Camion(double capacidad,LocalDate fechaDeIngreso){
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


    // public boolean prioridadDeCarga(Transporte camion){
    //     Camion aux = (Camion)camion;
    //     if(this.getFechaDeIngreso().compareTo(aux.getFechaDeIngreso())>0)return true;
    //     return false;
    // }

   
    @Override
    public int compareTo(Camion c){
    Camion aux = (Camion)c;
    return aux.fechaDeingreso.compareTo(this.getFechaDeIngreso());
    }


    @Override
    public String toString(){
        return "Capacidad: " + this.getCapacidadDeCarga() + " Fecha de ingreso " + this.getFechaDeIngreso(); 
    }

}
