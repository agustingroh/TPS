package parte1;

import java.util.ArrayList;
import java.util.List;

public class Coach extends Persona{
	
	private List<Participante> participantes;
	
	public Coach(String nombre,String apellido,int edad) {
		super(nombre,apellido,edad);
		this.participantes=new ArrayList<>();
	}
	
	
	public void agregarParticipante(Participante p) {
		this.participantes.add(p);
	}
 

	// TO DO 
	public List<String> listaDeInstrumentosParticipantes(){
	List <String> lista = new ArrayList<String>();
		for (Participante participante : this.participantes) {
			List<String> aux =	participante.obtenerInstrumentos();
			for (String instrumento : aux) {
				if(!lista.contains(instrumento))
				lista.add(instrumento);
			}
		
		}
		return lista;
	}

	public int cantidadDeParticipantes(){
		return this.participantes.size();
	}


	public double promedioEdadParticipantes(){
		double suma=0;
		for (Participante participante : participantes) {
			suma+= participante.getEdad();
		}

		return suma/this.cantidadDeParticipantes();
	}
	


}
