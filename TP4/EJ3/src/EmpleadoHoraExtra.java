public class EmpleadoHoraExtra  extends EmpleadoContratado{
    
    private double montoExtra;
    private double horasTrabajadas;


    public EmpleadoHoraExtra(String nombre, String apellido,double salarioSemanal){
        this(nombre, apellido, salarioSemanal,0, 0);
    }

    public EmpleadoHoraExtra(String nombre, String apellido,double salarioSemanal,double montoExtra,double horasTrabajadas){
        super(nombre, apellido, salarioSemanal);
        this.montoExtra=montoExtra;
        this.horasTrabajadas=horasTrabajadas;
    }

    public void setHorasTrabajdas(double horas){
        this.horasTrabajadas=horas;
    }

    public void setMontoExtra(double montoExtra){
        this.montoExtra=montoExtra;
    }

    public double getMontoExtra(){
        return this.montoExtra;
    }

    public double getHorasTrabajadas(){
        return this.horasTrabajadas;
    }

    public double getSalarioSemanal(){
        return super.getSalarioSemanal() + (this.getHorasTrabajadas()*this.getMontoExtra());
    }


}
