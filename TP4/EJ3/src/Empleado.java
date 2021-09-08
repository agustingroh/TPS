/*3 - Sueldos
Una empresa de informática posee tres tipos de empleados. Los empleados contratados
reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
cantidad de ventas realizadas.
Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
la semana.
*/
public abstract class Empleado {

    private Persona persona;
   

    public Empleado(String nombre, String apellido){
        this.persona= new Persona(nombre, apellido);     
    }
    
    public abstract double getSalarioSemanal();    

    public String toString(){
        return "Nombre: " + this.persona.getNombre() + " Apellido: " + this.persona.getApellido() + "salario semanal: " + this.getSalarioSemanal();
     }



    public static void main(String[] args) {

        
        EmpleadoContratado empleado2= new EmpleadoContratado("Marta", "Cantallops",45000);
        System.out.println(empleado2);

        EmpleadoHoraExtra empleado3 = new EmpleadoHoraExtra("Seba","Groh",45000);
        empleado3.setHorasTrabajdas(1);
        empleado3.setMontoExtra(600);
        System.out.println(empleado3);
        


        EmpleadoComision empleado4 = new EmpleadoComision("Omar","Groh",45000,2,1.5);
        System.out.println(empleado4);
    }
}
