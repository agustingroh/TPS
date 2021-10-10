

public class FilterGetTitle extends FilterSplitWord {

    public FilterGetTitle(String author){
        super(author);
    }
   

    public  String getList(Documento c){
        return c.getTitulo();
    }
    
}
