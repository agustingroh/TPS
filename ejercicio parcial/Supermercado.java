
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;



public class Supermercado {
    ArrayList<Producto> productos;
    ArrayList<Producto> productosEnOferta;
    private DayOfWeek diaDescuento;
    private double descuento;

    


    public Supermercado(){
        this.productos = new ArrayList<Producto>();
        this.productosEnOferta = new ArrayList<Producto>();
        this.diaDescuento = DayOfWeek.MONDAY;
        this.descuento=20;
    }



    public void addProductoEnOferta(Producto p){
        productosEnOferta.add(p);
    }

    public void addProducto(Producto p){
        productos.add(p);
    }

    public ArrayList<Producto> productosEnOferta(){
        ArrayList<Producto> productosOferta = new ArrayList<Producto>();
        for (Producto producto : this.productos) {
            if(producto.enOferta())productosOferta.add(producto);
        }
        return productosOferta;
    }

    public double obtenerPrecio(Producto p){
        if(this.productosEnOferta.contains(p) && LocalDate.now().getDayOfWeek().name().equals(this.diaDescuento.name()))
            return p.getPrecioFinal()-(p.getPrecio()*this.descuento/100);
        else 
            return p.getPrecioFinal();
    }


    public void setDiaDeDescuento(DayOfWeek dia){
        this.diaDescuento=dia;
    }

    public void setDescuentoSupermercado(double descuento){
        this.descuento=descuento;
    }

    


    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        Producto producto1 = new Producto("mouse", 500);
        Producto producto2 = new Producto("teclado", 800);

        // Producto 1 default sin descuento
        System.out.println(producto1.getPrecioFinal());

        // Seteo la oferta del producto
        producto1.setOferta(new Descuento(DayOfWeek.MONDAY,3));
       
        System.out.println(producto1.getPrecioFinal());
        System.out.println(producto1.enOferta());


        System.out.println("Le saco la oferta al producto");
        producto1.setOferta(new SinDescuento()) ;
        System.out.println(producto1.enOferta());
        System.out.println(producto1.getPrecioFinal());
        


        Figura myCirculo = new Circulo(5.64189);

        System.out.println(myCirculo);
    }
}
