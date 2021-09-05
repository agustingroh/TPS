public class EmpleadoContratado extends Empleado {
    private double salarioSemanal;
    private int semanas;

    public EmpleadoContratado(String nombre, String apellido,double salarioSemanal){
        super(nombre, apellido);
        this.salarioSemanal=salarioSemanal;
        this.semanas=4;
    }


    public double getSalarioMensual(){
        return this.getSalarioSemanal()*this.semanas;
    }

    public double getSalarioSemanal(){
        return this.salarioSemanal;
    }
    
}
