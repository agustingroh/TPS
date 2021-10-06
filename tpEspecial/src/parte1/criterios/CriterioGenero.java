package parte1;

public  class CriterioGenero extends Criterio {
    private String genero;

    public CriterioIdioma (String genero){
        this.genero = genero;
    }

    public boolean cumple(Participante p){

        return p.getGeneros().contains(this.genero);

    }

}