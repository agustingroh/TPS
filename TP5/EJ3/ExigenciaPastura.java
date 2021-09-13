public class ExigenciaPastura extends Exigencia{
    public static final int CANTIDADHECTAREASMINIMA= 50;
    public boolean exigencia(Lote l, Cereal c) {
        // la lista de minerales en cereal esta como protected , eso esta bien?
        if(areaApta(l) && mineralesAptos(l, c))
            return true;
        else
            return false;     
    }

    private boolean mineralesAptos(Lote l, Cereal c){
        for (Mineral m : l.getMinerales()) {
            if (!c.contieneMinerales(m))
                return false;
        }
        return true;
    }

    private boolean areaApta(Lote l){
        if(l.cantidadHectareas()>=CANTIDADHECTAREASMINIMA)
            return true;
        else
            return false;    
    
    }

}
