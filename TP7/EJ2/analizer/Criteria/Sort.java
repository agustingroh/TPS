package analizer.Criteria;

import java.util.Comparator;

public abstract class Sort implements Comparator<Palabra>{

    public abstract int sorter(Palabra p1, Palabra p2);

    @Override
    public int compare(Palabra p1, Palabra p2) {
       return this.sorter(p1,p2);
     
    }
    
}

// Collections.sort(milista, new Alfabetico())