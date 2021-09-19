import java.util.ArrayList;

public class Evaluador {
    private ArrayList<String> temasConocidos;

    private ArrayList<String> palabrasClave;
    private String nombre;


    public Evaluador(String nombre){
        this.nombre = nombre;
        this.temasConocidos = new ArrayList<String>();
        this.palabrasClave = new ArrayList<String>();
    }

    public boolean poseeConocimiento(String tema){
        return temasConocidos.contains(tema);
    }

    public void agregarPalabrasClave(ArrayList<String> palabrasClave){
        this.palabrasClave.addAll(palabrasClave);
    }


    public boolean contienePalabraClave(String palabra){
        return this.palabrasClave.contains(palabra);
    }

    public String getNombre(){
        return this.nombre;
    }

    public String toString(){
        return "Nombre del evaluador: " + this.getNombre();
    }

    
}
