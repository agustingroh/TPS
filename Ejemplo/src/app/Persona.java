package app;

public class Persona {
    
    private String nombre;
    private String apellido;


    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
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
public static void main(String[] args) {
    System.out.println("Hola" +  args[0]);
}
}
