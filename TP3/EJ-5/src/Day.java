package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Day {
   private LocalTime startTime;
   private LocalTime endTime;
   private int slots;
   private LocalDate date;
   private ArrayList<Appointment> appointments; 


  public Day(LocalDate date){
      this.date=date;
      this.appointments = new ArrayList<Appointment>();
   }
   
   private  boolean isOccupied(Person barber, LocalTime time){

   }


   public void newApointment(Appointment ap){
      

      // Verificar que esa hora no este ocupada antes de hacer el new appointment

      this.appointments.add(ap);
   }

 //  public Appointment[] getAvailableAppointments() {
     
   // }

   public LocalDate getDate() {
      return this.date;
   }

  // horario del turno disponible = 0800 + index*0.5
   // public getTurnByTime(LocalDateTime time){
   //    for(int i=0;i<shifts.length;i++){
   //       if(shifts[i].getTime()==time){

   //       }
   //    }
   // }


}
