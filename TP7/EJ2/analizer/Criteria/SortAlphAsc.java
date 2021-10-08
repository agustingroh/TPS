package analizer.Criteria;

public class SortAlphAsc extends Sort {

    public  int sorter(Palabra p1, Palabra p2){
      return  p1.getWord().compareToIgnoreCase(p2.getWord());
    }
    
}
