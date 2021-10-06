package parte1.criterios;
import parte1.Participante;

public  class CriterioInstrumento extends Criterio {
    private String instrumento;

    public CriterioInstrumento (String instrumento){
        this.instrumento = instrumento;
    }

    public boolean cumple(Participante p){

        return p.getInstrumentos().contains(this.instrumento);

    }

}