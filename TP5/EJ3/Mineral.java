import java.util.ArrayList;

// Se deberia crear una clase mineral primario y secundario?
public class Mineral {
    private String nombre;
    private String tipo;

    public static final String PRIMARIO = "primario";
    public static final String SECUNDARIO = "segundario";

    public Mineral(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo =tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo(){
        return this.tipo;
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public boolean equals(Object o){
        Mineral aux = (Mineral)o;
        return (this.getNombre().equals(aux.getNombre()) &&  this.getTipo().equals(aux.getTipo()));

    }

}
