import java.time.LocalDate;

public class ProductoFresco{


    // Preguntar si esta bien utilizado el protected en este caso
    protected LocalDate envasado;
    protected String origen;
    protected String nombre;
    protected LocalDate fechaDeVencimiento;
    protected int numeroDeLote;

    public ProductoFresco(int numeroDeLote,LocalDate fechaDeVencimiento,String nombre,LocalDate envasado,String origen){
        this.fechaDeVencimiento=fechaDeVencimiento;
        this.numeroDeLote=numeroDeLote;
        this.envasado = envasado;
        this.origen = origen;
        this.nombre = nombre;
    }


    public LocalDate getEnvasado() {
        return this.envasado;
    }

    public void setEnvasado(LocalDate envasado) {
        this.envasado = envasado;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeVencimiento() {
        return this.fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public int getNumeroDeLote() {
        return this.numeroDeLote;
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
 

    public String toString(){
        return "Nombre:" + this.getNombre() + " Origen:" + this.getOrigen();
    }

    public static void obtenerDatos(ProductoFresco p){
        System.out.println(p);
    }
  
    public static void main(String[] args) {
        ProductoFresco p1= new ProductoFresco(123456, LocalDate.parse("2021-05-02"),"Manolo",LocalDate.parse("2021-05-02"),"La huerta de mi casa");
        ProductoFresco.obtenerDatos(p1);
    }

    
}
