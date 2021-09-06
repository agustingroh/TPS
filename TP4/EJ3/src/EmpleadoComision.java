public class EmpleadoComision extends EmpleadoContratado{

    private int cantidadVentas;
    private double porcentaje;
    
    public EmpleadoComision(String nombre, String apellido,double salarioSemanal,int cantidadVentas,double porcentaje){
        super(nombre, apellido,salarioSemanal);
        this.cantidadVentas=cantidadVentas;
        this.porcentaje=porcentaje;
    }

    private double getGananciaExtra(){
      return ((super.getSalarioSemanal() * this.porcentaje / 100) * (double) this.cantidadVentas);
    }

    public double getSalarioSemanal(){
        return super.getSalarioSemanal() + this.getGananciaExtra();
    }
    
}
