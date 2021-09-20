public class TrabajoPoster extends Trabajo {
    
    public TrabajoPoster(String nombre){
        super(nombre);
    }


    public boolean esUnEvaluadorApto(Evaluador e){
        for (String palabra : this.palabrasClave) {
         if(e.contienePalabraClave(palabra)) return true;;
        }
        return false;
    }
}
