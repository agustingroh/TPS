


public class Producto {

    private String nombre;
    private double precio;
    private ComportamientoProducto comportamiento;


    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio = precio;
        this.comportamiento = new SinDescuento();
    }

    public void setOferta(ComportamientoProducto cp){
        this.comportamiento=cp;
    }
  

    public double getPrecio(){
        return this.precio;
    }

    public double getPrecioFinal(){              
        return comportamiento.getPrecio(this);    

    }

    public boolean enOferta(){
        return (this.getPrecio()==this.getPrecioFinal()) ;


    }

    public String getNombre(){
        return this.nombre;
    }

    public String toString(){
        return "nombre:" + getNombre();
    }
    
}
