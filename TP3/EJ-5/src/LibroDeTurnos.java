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
        Turno turno = new Turno(cliente, date, initTime, endTime);        
        this.turnos.add(turno);        
    }


    public ArrayList<Turno> obtenerTurnosExistente(LocalDate date) {
        ArrayList<Turno> turnosAsignados = new ArrayList<Turno>();
        
        for(Turno turno : this.turnos) {
            if(turno.getDate().equals(date)){
                turnosAsignados.add(turno);
            }

        }
        // to do retornar la lista ordenada por horario de inicio
        return turnosAsignados;
    }


    public ArrayList<Turno> obtenerTurnosDisponibles(LocalDate date) {
        ArrayList<Turno> turnosDisponibles = new ArrayList<Turno>();
        Turno turnoDisponible = new Turno(date, this.initShift, this.endShift);        
       
        for (Turno turnoExistente : this.obtenerTurnosExistente(date)) {
                turnoDisponible.setFinishTime(turnoExistente.getInitTime());
                if(!turnoDisponible.getInitTime().equals(turnoExistente.getInitTime())) {
                    turnosDisponibles.add(turnoDisponible); 
                }
                turnoDisponible = new Turno(date, turnoExistente.getFinishTime(), this.endShift );
        }

        turnosDisponibles.add(turnoDisponible);

        return turnosDisponibles;
    }


    public static void main(String[] args) {

        // Los turnos se deben insertar en orden. 
        
        // Para evitar este bug hay que ordenar la lista de turnos cada vez que se inserta un elemento (metodo no eficiente)
                
        // Tal vez sea necesario crear una nueva clase Periodo. Permite determinar un periodo de tiempo. Esto seria usado en Turno y 
        //se podria crear un metodo que retorne una lista de periodos o horarios disponibles para ese dia en particular
        LibroDeTurnos libro = new LibroDeTurnos(LocalTime.parse("08:00:00"), LocalTime.parse("10:00:00"));
        libro.agregarTurno(new Persona("Juan", "Carlos"), LocalDate.now(), LocalTime.parse("08:30:00"), LocalTime.parse("09:30:00"));
        libro.agregarTurno(new Persona("Juan", "Carlos"), LocalDate.now(), LocalTime.parse("09:40:00"), LocalTime.parse("10:30:00"));
        System.out.println("\n");
        System.out.println("Turnos Disponibles:  " + libro.obtenerTurnosDisponibles(LocalDate.now()));
        System.out.println("Turnos Asignados:  " + libro.obtenerTurnosExistente(LocalDate.now()));
    } 


}