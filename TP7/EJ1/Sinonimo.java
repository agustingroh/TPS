import java.util.ArrayList;
import java.util.List;

public class Sinonimo extends CriterioBusqueda {
    
   public Sinonimo (String palabra){
       super(palabra);
   }

    
   public ArrayList<String> obtenerLista(Palabra p){
      return p.getSinonimos();
   }
   
}
