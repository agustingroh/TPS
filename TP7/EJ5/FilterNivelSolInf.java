public class FilterNivelSolInf extends Filter{
    private int nivelSol;

    public FilterNivelSolInf(int nivelSol){
        this.nivelSol=nivelSol;
    }

    public boolean cumple (Planta p){
        if(p.getSol()<this.nivelSol)
            return true;

        return false;

    }
}
