public class FilterNOT extends Filter{

    private Filter f1;
   

    public FilterNOT(Filter f1){
        this.f1=f1;       
    }

    public boolean cumple(Planta p){
        return !f1.cumple(p);
    }

    
}
