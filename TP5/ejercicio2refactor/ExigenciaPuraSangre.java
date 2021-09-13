package ejercicio2refactor;

public class ExigenciaPuraSangre extends Exigencia {

/*	c1.addCualidad("humilde");
	c1.addCualidad("inteligente");
	c1.addCualidad("sano");
	c1.addCualidad("malo");
	
	*				for (int i =0; i<p.getFamiliares().size(); i++) {
					for (int j =0; j<c.getAlumnos().size(); j++) {
						if (String.valueOf(p.getFamiliares().get(i).getDni()).equals(String.valueOf(c.getAlumnos().get(j).getDni()))) {
							return true;
						}
					}	
				}
	*
	*/
	
	public boolean puedeIngresar(Persona p, Casa c) {
		
		if (tieneFamiliar(p, c) && tieneCualidades(p, c)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	private boolean tieneFamiliar(Persona p, Casa c) {
		for (Persona familiar : p.getFamiliares()) {
			if ( c.contieneAlumno(familiar)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean tieneCualidades (Persona p,Casa c) {
		for (String cualidad : c.getCualidadesRequeridas()) {
			if (!p.tieneCualidad(cualidad)) {
				return false;
			}
		}
		return true;
	}
}
