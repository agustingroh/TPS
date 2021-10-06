package parte1;

public  class CriterioNOT extends Criterio {
	Criterio c1;
	
	public CriterioNot(Criterio c1) {
		this.c1=c1;
	}
	
	@Override 
	public boolean cumple(Participante participante) {
		return !c1.cumple(participante);
	}

}