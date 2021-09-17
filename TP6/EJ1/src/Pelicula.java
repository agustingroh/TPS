import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula extends Producto {
    private int cantidad;
    private int cantidadMin;
    

    public Pelicula(String nombre, int cantidad) {
        this(nombre, cantidad, 1);
    }

    public Pelicula(String nombre, int cantidad, int cantidadMinima) {
        super(nombre);
        this.cantidad = cantidad;
        this.cantidadMin = cantidadMinima;
     

    }

    private void descontar() {
        if (this.cantidad > 1)
            this.cantidad = this.cantidad - 1;
    }



    public void alquilar() {
        if (this.sePuedeAlquilar()) {            
                this.descontar();
        }
    }

    public boolean sePuedeAlquilar() {
        if (this.cantidad > this.cantidadMin)
            return true;

        return false;
    }

    public int getCantidad() {
        return this.cantidad;
    }

   

  

    public String toString() {
        return "Producto: " + super.getNombre();
    }

}
