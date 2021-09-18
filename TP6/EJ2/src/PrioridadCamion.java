public class PrioridadCamion extends PrioridadCarga{
    
   
    

        public boolean prioridadTransporte(Transporte c, Transporte t){
            if(c.getFechaDeIngreso().compareTo(t.getFechaDeIngreso())>0)return true;
            return false;
        }
        
    
    
}
