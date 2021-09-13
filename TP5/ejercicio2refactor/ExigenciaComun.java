package ejercicio2refactor;

public class ExigenciaComun extends Exigencia {

	public boolean puedeIngresar(Persona p, Casa c) {
		for (String cualidad : c.getCualidadesRequeridas()) {
			if (!p.tieneCualidad(cualidad)) {
				return false;
			}
		}
		return true;
	}

}
	


	