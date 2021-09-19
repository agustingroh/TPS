import java.util.ArrayList;

public class Trabajo {
    public ArrayList<String> palabrasClave;

    public Trabajo(){
        this.palabrasClave =  new ArrayList<String>();
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


}
