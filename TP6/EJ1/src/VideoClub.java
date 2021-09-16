import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VideoClub {

    Stock stock;
    ArrayList<Cliente> clientes;

    public VideoClub() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void alquilar(Producto p, Cliente c) {
        p.alquilar(c);
    }

    public boolean sePuedeAlquilar(Producto p) {
        return p.sePuedeAlquilar();
    }

    public void agregarCliente(Cliente c) {
        this.clientes.add(c);
    }

    public Cliente obtenerCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre))
                return cliente;
        }
        return null;
    }

    public static void main(String[] args) {

        VideoClub videoClub = new VideoClub();

        Vehiculo v1 = new Vehiculo("Ford",45000, "AG285RG");
        Pelicula p1 = new Pelicula("Rapido y Furioso",3);
        Cliente c1 = new Cliente("Juan");
        videoClub.agregarCliente(c1);

        if (videoClub.sePuedeAlquilar(p1)) {
            videoClub.alquilar(p1, videoClub.obtenerCliente("Juan"));
        } else
            System.out.println("No se puede alquilar");

        System.out.println(p1.getCantidad());
        System.out.println(videoClub.sePuedeAlquilar(v1));

        // Alquila un producto, retorna true si se pudo alquilar
        // false otherwise
        // videoClub.alquilar( new Producto(),
        // new Cliente(),
        // LocalDate.parse("2020-21-10"));

        // retorna una lista con los clientes
        // que tienen un producto a la espera de devolucion
        // videoClub.getClientesDeudores();

    }
}
