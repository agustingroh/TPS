public abstract class Producto {
    private String nombre;

    public Producto(String nombre){
        this.nombre=nombre;
    }

    public abstract boolean sePuedeAlquilar();
    

    public abstract void alquilar(Cliente c);
}
