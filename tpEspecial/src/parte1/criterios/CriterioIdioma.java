package parte1;

public  class CriterioIdioma extends Criterio {
    private String idioma;

    public CriterioIdioma (String idioma){
        this.idioma = idioma;
    }

    public boolean cumple(Participante p){

        return p.getIdiomas().contains(this.idioma);

    }

}