package src;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Hairdress {
    private String name;
    private int maxEmployeeNumber;
    private ArrayList<Day> days = new ArrayList<Day>();
    private ArrayList<Person> barbers = new ArrayList<Person>();

    public Hairdress(String name) {
        this.name = name;
        this.maxEmployeeNumber = 4;
    }

    public void addNewEmployee(Person p) {
        if (barbers.size() < this.maxEmployeeNumber) {
            barbers.add(p);
        } else {
            System.out.println("La capacidad maxima de empleados se ha superado");
        }
    }

    public ArrayList<Appointment> getAvailableAppointments(LocalDate date) {
        // buscar en this.shifts el objeto que tiene date
        // for (day : shifts)
        // if (day.getDate() == date)
        // Encontraste el dia que se especifico
        // break;

        // [LocalTime, LocalTime, LocalTime] = day.getAvailableAppointments();

    }

    public ArrayList<Day> getShifts() {
        return this.shifts;
    }

    public void setShifts(ArrayList<Day> shifts) {
        this.shifts = shifts;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNewTurn(LocalDateTime t, Person client) {

    }

    private Day createDay(LocalDate date) {
        for (Day day : this.days)
            if (day.getDate() == date)
                return day;
        Day newDay = new Day(date);
        this.days.add(newDay);
        return newDay;
    }


    public void createAppointment(Person barber, Person client, LocalDate reservationDay, LocalTime time) {
        // crear un dia con horarios de trabajo estandard

        //

        Day newDay = createDay(reservationDay);
        Appointment myAppointment = new Appointment(barber,client,time);
        newDay.addAppointment(myAppointment);

       

    }

    public static void main(String[] args) {
        Hairdress hairdress1 = new Hairdress("Manolo");
        
        System.out.println("Peluqueria: " + hairdress1.getName());
        hairdress1.addNewEmployee(new Person("Juan", "Castany", 12547864));
        hairdress1.addNewEmployee(new Person("Ivan", "Filoni", 2878942));
        hairdress1.addNewEmployee(new Person("Amadeo", "Gorodon", 45232323));
        hairdress1.addNewEmployee(new Person("Fabian", "Aguierre", 1234567));
       




        // [LocalTime, LocalTime] = hairdress1.getAvailableAppointments(LocalDate.now());
        // Imprimirla y permitir al usuario elejir

        hairdress1.createAppointment()
        

        


    }

}