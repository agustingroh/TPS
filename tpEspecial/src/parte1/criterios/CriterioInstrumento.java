package parte1;

public  class CriterioInstrumento extends Criterio {
    private String instrumento;

    public CriterioIdioma (String instrumento){
        this.instrumento = instrumento;
    }

    public boolean cumple(Participante p){

        return p.getInstrumentos().contains(this.instrumento);

    }

}