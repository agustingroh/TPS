package src;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Appointment {
    private Person barber;
    private Person client;
    private LocalTime time;

    public Appointment(Person barber, Person client, LocalTime time2) {
        this.barber = barber;
        this.client = client;
        this.time = time2;
    }

   

    public Person getBarber() {
        return this.barber;
    }

    public void setBarber(Person barber) {
        this.barber = barber;
    }

    public Person getClient() {
        return this.client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

}
