
public class FilterNOT extends Filter{


    private Filter a;
    

    public FilterNOT(Filter a){
        this.a=a;
       
    }

    public  boolean valid(Documento c){
        return (!a.valid(c));
    }
    
}
