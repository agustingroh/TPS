package analizer.Criteria;
import java.util.ArrayList;

class Frecuency extends Criteria {

    private int n;
    
    public Frecuency(int N) {
        this.n = N;
    }

    public ArrayList<Palabra> get(ArrayList<Palabra> palabras) {
        ArrayList<Palabra> aux = new ArrayList<Palabra>();
        
        //Load aux lista with non repetead Palabras
        for(Palabra p : palabras) {
            if(!aux.contains(p))
                aux.add(p);
        }
        //Update the counter of each non repeated word
        for(Palabra noRepP : aux) {
            for(Palabra repP : palabras) {
                if(noRepP.equals(repP)){
                    int a = noRepP.getCounter();
                    a += 1;
                    noRepP.setCounter(a);
                }
            }
        }
        return aux;
    }
}