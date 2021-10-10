public class FilterAND extends Filter{


    private Filter a;
    private Filter b;

    public FilterAND(Filter a, Filter b){
        this.a=a;
        this.b=b;
    }

    public  boolean valid(Documento c){
        return (a.valid(c) && b.valid(c)) ;

    }
    
}
