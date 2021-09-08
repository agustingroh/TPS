import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {

    private Persona cliente;
    private LocalDate date;
    private LocalTime initTime;
    private LocalTime finishTime;

    public Turno(Persona cliente, LocalDate date, LocalTime initTime, LocalTime endTime) {
        this.cliente = cliente;
        this.date = date;
        this.initTime = initTime;
        this.finishTime = finishTime;
    }
    
    public Turno(LocalDate date, LocalTime initTime, LocalTime endTime) {
        this.date = date;
        this.initTime = initTime;
        this.finishTime = finishTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getInitTime() {
        return initTime;
    }

    public LocalTime getFinishTime() {
        return finishTime;
    }

    public void setInitTime(LocalTime initTime) {
        this.initTime = initTime;
    }

    public void setFinishTime(LocalTime finishTime) {
        this.finishTime = finishTime;
    }
    


}