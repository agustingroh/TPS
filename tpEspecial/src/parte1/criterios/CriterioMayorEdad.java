package parte1.criterios;
import parte1.Participante;


public  class CriterioMayorEdad extends Criterio {
    private int edad;

    public CriterioMayorEdad (int edad){
        this.edad = edad;
    }

    public boolean cumple(Participante p){

        return p.getEdad() >= (this.edad);

    }

}