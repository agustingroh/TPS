public class FilterNivelRiegoInf extends Filter {

    private int nivelRiego;

    public FilterNivelRiegoInf(int nivelRiego){
        this.nivelRiego=nivelRiego;
    }

    public boolean cumple (Planta p){
        if(p.getRiego()<this.nivelRiego)
            return true;

        return false;

    }

    
}
