import java.util.ArrayList;

public class Pelicula extends Producto {
    private int cantidad;
    private int cantidadMin;
    private ArrayList<Cliente> clientes;

    public Pelicula(String nombre,int cantidad) {
        this(nombre,cantidad, 1);
    }

    public Pelicula(String nombre,int cantidad, int cantidadMinima) {
        super(nombre);
        this.cantidad = cantidad;
        this.cantidadMin = cantidadMinima;
        this.clientes = new ArrayList<Cliente>();
        
    }

    private void descontar() {
        if (this.cantidad > 1)
            this.cantidad = this.cantidad - 1;
    }

    public void agregarCliente(Cliente c) {
        if (this.cantidad > this.cantidadMin)
            clientes.add(c);
    }

    public void alquilar(Cliente c) {
        this.descontar();
        if (clientes.size() < this.cantidad)
            this.clientes.add(c);

    }

    public boolean sePuedeAlquilar() {
        if (this.cantidad > this.cantidadMin)
            return true;

        return false;
    }

    public int getCantidad(){
        return this.cantidad;
    }
}
