public class FilterRiego extends Filter {
    private int nivelRiego;

    private FilterRiego(int riego){
        this.nivelRiego=riego;
    }

    public boolean cumple (Planta p){
        if(p.getRiego()<this.nivelRiego)
            return true;

        return false;

    }
    
}
