public class TrabajoPoster extends Trabajo {
    
    public TrabajoPoster(){
        super();
    }


    public boolean esUnEvaluadorApto(Evaluador e){
        for (String palabra : this.palabrasClave) {
         if(e.poseeConocimiento(palabra)) return true;;
        }
        return false;
    }
}
