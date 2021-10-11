import java.util.Comparator;

public abstract class Sort implements Comparator <Planta>{

    private Sort siguiente;

    public Sort(Sort s){
        siguiente= s;
    }

    public Sort(){
        siguiente=null;
    }

    public abstract int ordernar(Planta planta1, Planta planta2);

    @Override
    public int compare(Planta planta1, Planta planta2){
        if(ordernar(planta1, planta2)==0 && siguiente!=null)
           return siguiente.ordernar(planta1, planta2);

        return this.ordernar(planta1, planta2);
    }
    
}
