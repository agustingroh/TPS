import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Peluquero extends Persona{

    private LibroDeTurnos libroDeTurnos;
    public Peluquero(String nombre,String apellido){        
        super(nombre,apellido);
        this.libroDeTurnos = new LibroDeTurnos(LocalTime.parse("08:00:00"), LocalTime.parse("17:00:00"));
   
        
    }


    public void agregarTurno(Persona cliente, LocalDate date, LocalTime initTime, LocalTime endTime){
        
        libroDeTurnos.agregarTurno(cliente, date, initTime, endTime);
    }


     public  ArrayList<Turno>  getTurnosDisponibles(LocalDate fecha){


         return libroDeTurnos.obtenerTurnosDisponibles(fecha);
     }
 
     

    
}
