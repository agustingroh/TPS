import java.time.LocalDate;



public class Persona {
    private String nombre;
    private String apellido;
    private int pasaporte;
    private LocalDate fechaNacimiento;
    private String estado;

    public static final String VIAJANDO="viajando"; 
    public static final String CONCENTRACION="concentracion";
    public static final String PAISORIGEN="paisorigen";  


    public Persona(String nombre,String apellido,int pasaporte,LocalDate fechaNacimiento,String estado){
        this.nombre=nombre;
        this.apellido=apellido;
        this.pasaporte=pasaporte;
        this.fechaNacimiento=fechaNacimiento;
        this.estado=estado;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPasaporte() {
        return this.pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public boolean estaDisponible(Persona p){
        if(p.getEstado()==VIAJANDO || p.getApellido()==CONCENTRACION)return false;
        return true;
    }



    public String toString(){
        return "Nombre: " +  this.getNombre() + " Estado: " + this.getEstado() + " Fecha de nacimiento: " + this.getFechaNacimiento();
        
    }
    
    public static void main(String[] args) {
        

        Persona p1= new Persona("Agustin","Isasmendi",4564812,LocalDate.parse("2019-03-29"),Persona.CONCENTRACION);

        System.out.print(p1);
    }


}
