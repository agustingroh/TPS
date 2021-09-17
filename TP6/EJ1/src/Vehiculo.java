import java.time.LocalDate;
import java.util.ArrayList;

public class Vehiculo extends Producto {
    private double kms;
    private String patente;
    private boolean alquilado;


    public Vehiculo(String nombre, double kms, String patente) {
        super(nombre);
        this.kms = kms;
        this.patente = patente;
        this.alquilado = false;
    }

    public boolean sePuedeAlquilar() {
        if(this.alquilado!=true) return true;

        return false;
         
    }

    public void alquilar(){
        this.alquilado=true;
    }




// TO DO
// Que se deberia hacer en este caso que tiene un solo cliente como maximo?
// Deberiamos mover el codigo a producto? y crear un ArrayList en Vehiculo que al momento de alquilar se checkee la cantidad <1

    

  

      public String toString(){
          return "Producto: " + super.getNombre();
      }
  

}
