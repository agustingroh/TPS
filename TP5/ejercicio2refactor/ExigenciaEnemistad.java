package ejercicio2refactor;

public class ExigenciaEnemistad extends Exigencia {
	
	public boolean puedeIngresar(Persona p, Casa c) {
		if (c.getAlumnos().size()<c.getnAlumnos()) {
			for (int i =0; i<c.getCualidadesRequeridas().size(); i++) {
			 	if (!p.getCualidades().contains(c.getCualidadesRequeridas().get(i))) {
			 		return false;
			 	}
			}
			
			if (c.getCasaEnemiga().puedeIngresar(p)) {  // funciona.. no se porque.. :D //si la casa enemiga tambien tiene como enmiga a esta otra casa entra en un bucle, deberia preguntar solo si cumple con las cualidades de la casa enemiga
				return false;
			}else {return true;}
		}
		return false;
	}
}