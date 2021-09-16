import java.time.LocalDate;
import java.util.ArrayList;

public class Vehiculo extends Producto {
    private Cliente cliente;
    private double kms;
    private String patente;

    public Vehiculo(String nombre, double kms, String patente) {
        super(nombre);
        this.kms = kms;
        this.patente = patente;
    }

    public boolean sePuedeAlquilar() {
        if (this.cliente == null)
            return true;

        return false;
    }

    public void alquilar(Cliente c) {
        this.cliente = c;
    }

    public ArrayList<Cliente> obtenerClienteConVencimiento() {
        ArrayList<Cliente> clientesConDeuda = new ArrayList<Cliente>();
        LocalDate now = LocalDate.now();
        if (this.cliente.getFechaDeDevolucion().compareTo(now) < 0) {
            clientesConDeuda.add(this.cliente);
            return clientesConDeuda;
        }
        return null;
    }

}
