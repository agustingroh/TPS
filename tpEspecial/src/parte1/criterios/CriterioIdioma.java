package parte1.criterios;
import parte1.Participante;

public  class CriterioIdioma extends Criterio {
    private String idioma;

    public CriterioIdioma (String idioma){
        this.idioma = idioma;
    }

    public boolean cumple(Participante p){

        return p.getIdiomas().contains(this.idioma);

    }

}