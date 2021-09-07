import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco {
    
    protected double temperaturaConservacion;
    protected int codigo;

    public ProductoRefrigerado(int numeroDeLote,LocalDate fechaDeVencimiento,String nombre,LocalDate envasado,String origen,double tempConservacion,int codigo){
        super(numeroDeLote,fechaDeVencimiento,nombre, envasado,origen);
        this.temperaturaConservacion=tempConservacion;
        this.codigo=codigo;
   }

    public double getTemperaturaConservacion() {
        return this.temperaturaConservacion;
    }

    public void setTemperaturaConservacion(double temperaturaConservacion) {
        this.temperaturaConservacion = temperaturaConservacion;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
}
