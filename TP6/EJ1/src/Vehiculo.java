public class Vehiculo extends Producto {
private Cliente cliente;
private double kms;
private String patente;


public Vehiculo(String nombre,double kms, String patente){
    super(nombre);
    this.kms=kms;
    this.patente=patente;
}
public boolean sePuedeAlquilar(){
    if(this.cliente==null)return true;
    
    return false;
}

public void alquilar(Cliente c){
    this.cliente=c;
}





}
