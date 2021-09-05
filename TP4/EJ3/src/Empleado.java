/*3 - Sueldos
Una empresa de informática posee tres tipos de empleados. Los empleados contratados
reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
cantidad de ventas realizadas.
Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
la semana.
*/
public class Empleado {

    private Persona persona;
    private double salario;

    public Empleado(String nombre, String apellido){
        this.persona= new Persona(nombre, apellido);
        this.salario=0;
    }
    
    public double getSalarioSemanal(){
        return salario;
    }

    public String toString(){
        return "Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido();
     }

    public static void salarioEmpleado(Empleado empleado){
        System.out.println(empleado);
        System.out.println("Salario semanal: " + empleado.getSalarioSemanal());

    } 

    public static void main(String[] args) {

        Empleado empleado1= new Empleado("Agustin", "Groh");
        EmpleadoContratado empleado2= new EmpleadoContratado("Marta", "Cantallops",45000);
        Empleado.salarioEmpleado(empleado1);
        Empleado.salarioEmpleado(empleado2);

        EmpleadoHoraExtra empleado3 = new EmpleadoHoraExtra("Seba","Groh",45000);
        empleado3.setHorasTrabajdas(1);
        empleado3.setMontoExtra(600);
        Empleado.salarioEmpleado(empleado3);
        


        EmpleadoComision empleado4 = new EmpleadoComision("Omar","Groh",45000,2,5);
        Empleado.salarioEmpleado(empleado4);
    }
}
