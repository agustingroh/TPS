package ejercicio2refactor;

import java.util.ArrayList;

public class Sombrero {
		private ArrayList  <Casa> casas;
		
		public Sombrero() {
			this.casas = new ArrayList<Casa>();		}
		
	public void addCasa(Casa c) {
		this.casas.add(c);
	}
	
	public Casa obtenerCasaNombre (String nombre) {
		for (Casa casa : casas) {
			if(casa.getNombre().equals(nombre))
				return casa;
			
		}
		return null;
	}
	
	public boolean alumnoTieneCasa (Persona p) {
		for (Casa casa: this.casas) {
			if (casa.contieneAlumno(p)) {
				return true;
			}
		}
		return false;
	}
}
