import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract void alquilar();
    public abstract boolean sePuedeAlquilar(); 

}
