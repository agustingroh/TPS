package parte1.criterios;
import parte1.Participante;

public  class CriterioGenero extends Criterio {
    private String genero;

    public CriterioGenero (String genero){
        this.genero = genero;
    }

    public boolean cumple(Participante p){

        return p.getGeneros().contains(this.genero);

    }

}