public class FilterNivelSolSup extends Filter {
    private int nivelSol;

    public FilterNivelSolSup(int nivelSol){
        this.nivelSol=nivelSol;
    }

    public boolean cumple (Planta p){
        if(p.getSol()>this.nivelSol)
            return true;

        return false;

    }
}
