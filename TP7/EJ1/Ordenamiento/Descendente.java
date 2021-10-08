package Ordenamiento;

import java.util.Collections;
import java.util.ArrayList;

public class Descendente extends Ordenamiento{
    

    public void ordenar(ArrayList<String> l){
        Collections.sort(l, Collections.reverseOrder());
    }
}
