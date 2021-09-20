import java.util.ArrayList;

public class Trabajo {
    private String nombre;
    public ArrayList<String> palabrasClave;

    public Trabajo(String nombre){
        this.palabrasClave =  new ArrayList<String>();
        this.nombre=nombre;
    }

    public void agregarPalabrasClave(ArrayList<String> palabrasClave){
        this.palabrasClave.addAll(palabrasClave);
    }


    public boolean esUnEvaluadorApto(Evaluador e){
        for (String palabra : palabrasClave) {
         if(!e.contienePalabraClave(palabra)) return false;;
        }
        return true;
    }
    
    public boolean contienePalabraClave(String palabraClave){
        return this.palabrasClave.contains(palabraClave);
    }

    public String getNombre(){
        return this.nombre;
    }


    public String toString(){
        return "Nombre del trabajo: " + this.getNombre();
    }


}
