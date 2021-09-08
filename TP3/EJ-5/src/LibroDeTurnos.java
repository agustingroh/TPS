import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class LibroDeTurnos {


    private ArrayList<Turno> turnos;
    private LocalTime initShift;
    private LocalTime endShift;


    public LibroDeTurnos(LocalTime initShift, LocalTime endShift){
        this.turnos = new ArrayList<Turno>();
        this.initShift = initShift;
        this.endShift = endShift;        
    }
             

    public void agregarTurno(Persona cliente, LocalDate date, LocalTime initTime, LocalTime endTime ) {
        
        // TO DO, validacion de initShift y endShift
        
        this.turnos.add(new Turno(cliente, date, initTime, endTime));
        
    }


    public ArrayList<Turno> obtenerTurnosExistente(LocalDate date) {
        ArrayList<Turno> turnosAsignados = new ArrayList<Turno>();
        
        for(Turno turno : this.turnos) {
            if(turno.getDate() == date)
                turnosAsignados.add(turno);
        }
        // to do retornar la lista ordenada por horario de inicio
        return turnosAsignados;
    }


    public ArrayList<Turno> obtenerTurnosDisponibles(LocalDate date) {
        ArrayList<Turno> turnosDisponibles = new ArrayList<Turno>();
                                                 
        Turno turnoDisponible = new Turno(date, this.initShift, this.endShift);        

        for (Turno turnoExistente : this.obtenerTurnosExistente(date)) 
                
                turnoDisponible.setFinishTime(turno.getInitTime());
                
                if(turnoDisponible.getInitTime() != turnoExistente.getInitTime)
                    turnosDisponibles.add(turnoDisponible); 

                Turno turnoDisponible = new Turno(date, turno.getFinishTime(), this.endShift );
        }

        return turnosDisponibles
    }


    public static void main(String[] args) {
        LibroDeTurnos libro = new LibroDeTurnos(LocalTime.parse("08:00:00"), LocalTime.parse("17:00:00"));
        libro.agregarTurno(new Persona("Juan", "Carlos"), LocalDate.now(), LocalDate.parse("08:30:00"), LocalDate.parse("09:30:00"));
        System.out.println(libro.obtenerTurnosDisponibles(LocalDate.now()));
    }

}