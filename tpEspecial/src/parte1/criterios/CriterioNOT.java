package parte1.criterios;
import parte1.Participante;



public  class CriterioNOT extends Criterio {
	Criterio c1;
	
	public CriterioNOT(Criterio c1) {
		this.c1=c1;
	}
	
	@Override 
	public boolean cumple(Participante participante) {
		return !c1.cumple(participante);
	}

}