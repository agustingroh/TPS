import java.time.LocalDate;


// Los productos congelados aire deberian extender directamente de ProductoRefrigerado , pero 
// perderiamos la clase ProductoCongelado
public class ProductoCongeladoAire extends ProductoRefrigerado {

    private double nitrogeno;
    private double oxigeno;
    private double dioxidoCarbono;
    private double  vaporAgua;

  public ProductoCongeladoAire (int numeroDeLote,LocalDate fechaDeVencimiento,String nombre,LocalDate envasado,String origen,double tempConservacion,int codigo,double dioxidoCarbono,double oxigeno,double vaporAgua,double nitrogeno){
      super(numeroDeLote,fechaDeVencimiento,nombre,envasado,origen,tempConservacion,codigo);
      this.nitrogeno=nitrogeno;
      this.oxigeno=oxigeno;
      this.dioxidoCarbono=dioxidoCarbono;
      this.vaporAgua=vaporAgua;
  }


    public double getNitrogeno() {
        return this.nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return this.oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxidoCarbono() {
        return this.dioxidoCarbono;
    }

    public void setDioxidoCarbono(double dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public double getVaporAgua() {
        return this.vaporAgua;
    }

    public void setVaporAgua(double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }

}