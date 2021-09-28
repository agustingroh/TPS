public class RequerimientoProceso extends Requerimiento {
   


    public  boolean requerimiento (Object o1, Object o2){
        Proceso prooceso1 = (Proceso) o1;
        Proceso proceso2 = (Proceso) o2; 
        if(prooceso1.getMemoria()>proceso2.getMemoria()) return true;

        return false;
    }
}
