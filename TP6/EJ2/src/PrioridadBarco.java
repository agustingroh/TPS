public class PrioridadBarco extends PrioridadCarga {
    

    public boolean prioridadTransporte(Transporte c, Transporte t){
        if(c.getCapacidadDeCarga()>t.getCapacidadDeCarga())return true;
        return false;
    }
    
}
