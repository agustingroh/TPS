public class RequerimientoComputadora  extends Requerimiento{

    public  boolean requerimiento (Object o1, Object o2){
        Computadora c1 = (Computadora) o1;
        Computadora c2 = (Computadora) o2; 
        if(c1.getVelocidad()>c2.getVelocidad()) return true;

        return false;
    }
    
}
