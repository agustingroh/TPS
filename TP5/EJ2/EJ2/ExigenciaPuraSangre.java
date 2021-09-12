
package EJ2;


import java.util.ArrayList;
import java.util.Arrays;


public class ExigenciaPuraSangre extends Exigencia {
    

    public  boolean tieneFamilia(ArrayList<Alumno> alumnosEscuela,Alumno ingresante){
        for (Alumno alumno : alumnosEscuela) {
            if(ingresante.familia(alumno))return true;
        } 
        return false;   
    }


}
