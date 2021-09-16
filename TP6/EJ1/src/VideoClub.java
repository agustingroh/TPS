import java.time.LocalDate;
import java.util.ArrayList;

/*
1. Sistema de Alquiler
Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido diversificarse e incorporar a su cartera de negocios el alquiler de autos. 
Para modernizarse,abandonará los registros en papel e implementará un sistema unificado de alquiler.
El sistema debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar control de los ítems alquilados a cada cliente. Las películas poseen información filmográfica y la cantidad de copias que se dispone de la misma. 
De los vehículos, se registra marca, kms y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados a un cliente por vez.
Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los clientes que poseen alquileres vencidos.
*/

public class VideoClub {

    ArrayList<Cliente> clientes;
    ArrayList<Producto> productos;

    public VideoClub() {
        this.clientes = new ArrayList<Cliente>();
        this.productos = new ArrayList<Producto>();
    }

    public void alquilar(Producto p, Cliente c, LocalDate fecha) {
        p.alquilar(c);
        c.setFechaDevolucion(fecha);
    }

    public boolean sePuedeAlquilar(Producto p) {
        return p.sePuedeAlquilar();
    }

    public void agregarCliente(Cliente c) {
        this.clientes.add(c);
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    public Cliente obtenerCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre))
                return cliente;
        }
        return null;
    }

    public ArrayList<Cliente> obtenerClientesItemsVencidos() {
        ArrayList<Cliente> clientesConDeudas = new ArrayList<Cliente>();
        ArrayList<Cliente> aux = new ArrayList<Cliente>();
        for (Producto producto : productos) {
            aux = producto.obtenerClienteConVencimiento();
            if (aux != null) {
                clientesConDeudas.addAll(aux);
            }
        }
        return clientesConDeudas;

    }

    public static void main(String[] args) {

        VideoClub videoClub = new VideoClub();

        Vehiculo v1 = new Vehiculo("Ford", 45000, "AG285RG");
        Pelicula p1 = new Pelicula("Rapido y Furioso", 3);
        Cliente c1 = new Cliente("Juan");
        Cliente c2 = new Cliente("Pedro");
        videoClub.agregarCliente(c1);
        videoClub.agregarCliente(c2);
        videoClub.agregarProducto(v1);
        videoClub.agregarProducto(p1);

        if (videoClub.sePuedeAlquilar(p1)) {
            videoClub.alquilar(p1, videoClub.obtenerCliente("Juan"), LocalDate.parse("2021-09-15"));
            videoClub.alquilar(v1, videoClub.obtenerCliente("Pedro"), LocalDate.parse("2021-09-15"));
        } else
            System.out.println("No se puede alquilar");

        System.out.println("Cantidad de peliculas disponibles Rapido y Furioso");
        System.out.println(p1.getCantidad());

        System.out.println(
                "El vehiculo Ford, Patente AG285RG , se encuentra disponible: " + videoClub.sePuedeAlquilar(v1));

        // Clientes con items vencidos
        ArrayList<Cliente> clientesItemsVencidos = videoClub.obtenerClientesItemsVencidos();
        if (clientesItemsVencidos != null) {
            System.out.println("********** Lista de deudores **************");
            for (Cliente cliente : clientesItemsVencidos) {
                System.out.println(cliente);
            }
        } else {
            System.out.println("No hay clientes con deudas");
        }

    }
}
