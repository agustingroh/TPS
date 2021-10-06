package parte1;

public  class CriterioMayorEdad extends Criterio {
    private int edad;

    public CriterioIdioma (int edad){
        this.edad = edad;
    }

    public boolean cumple(Participante p){

        return p.getEdad() >= (this.edad);

    }

}