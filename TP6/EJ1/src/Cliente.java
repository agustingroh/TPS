import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nombre;   
    private ArrayList<Alquiler> productosAlquilados;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.productosAlquilados = new ArrayList<Alquiler>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarProductoAlquilado(Producto p,LocalDate fecha) {
        productosAlquilados.add(new Alquiler(p,fecha));
    }


    public ArrayList<Producto> obtenerListaDeProductosAlquilados(){
        ArrayList <Producto> productos = new ArrayList<Producto>();
        for (Alquiler alquiler : productosAlquilados) {          
            productos.add(alquiler.getProducto());
        }  
        return productos;
    }



    public boolean tieneProductosQueDevolver(){
        for (Alquiler alquiler : productosAlquilados) {
           if(alquiler.isVencido()) return true;
        }  
        return false;
    }


    public ArrayList<Producto> listaDeProductosVencidos(){
        ArrayList <Producto> productosVencidos = new ArrayList<Producto>();
                for (Alquiler producto : this.productosAlquilados) {
            if(producto.isVencido()) productosVencidos.add(producto.getProducto());
        }
        return productosVencidos;
    }


    public boolean equals(Object o) {
        Cliente aux = (Cliente) o;
        return aux.getNombre().equals(this.getNombre());
    }




  


    public String toString() {
        return "Cliente: " + this.nombre;
    }
}