import java.util.ArrayList;

public abstract class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean sePuedeAlquilar();

    public abstract void alquilar(Cliente c);

    public abstract ArrayList<Cliente> obtenerClienteConVencimiento();
}
