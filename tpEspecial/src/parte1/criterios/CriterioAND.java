package parte1.criterios;
import parte1.Participante;

public  class CriterioAND extends Criterio {
    private Criterio c1;
	private Criterio c2;
	
	public CriterioAND(Criterio c1, Criterio c2) {
		this.c1=c1;
		this.c2=c2;
	}
	
	@Override 
	public boolean cumple(Participante participante) {
		return c1.cumple(participante) && c2.cumple(participante);
	}

}