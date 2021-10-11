public class FilterAND extends Filter{

    private Filter f1;
    private Filter f2;

    public FilterAND(Filter f1 , Filter f2){
        this.f1=f1;
        this.f2=f2;
    }

    public boolean cumple(Planta p){
        return f1.cumple(p) && f2.cumple(p);
    }
    
}
