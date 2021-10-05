import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ColaDeCarga {
    ArrayList<Comparable> elementos = new ArrayList<Comparable>();


    public void agregar(Comparable t){
         elementos.add(t);
        Collections.sort(elementos);

       
     }

    public void imprimirLista() {
        for (Comparable elemento : elementos) {
            System.out.println(elemento);
        }
    }
 
}
