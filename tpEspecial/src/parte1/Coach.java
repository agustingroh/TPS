package parte1;

import java.util.ArrayList;
import java.util.List;
import parte1.criterios.Criterio;
import parte1.listas.ListaSegunRequerimiento;


public class Coach extends Persona{
	
	private List<Participante> participantes;
	private  Comportamiento comportamiento; 
	
	public Coach(String nombre,String apellido,int edad) {
		super(nombre,apellido,edad);
		this.participantes=new ArrayList<>();
		this.comportamiento = null;    // como hacia ariel????
	}
	
	
	public void agregarParticipante(Participante p) {
		this.participantes.add(p);
	}

	public ArrayList<Participante> getParticipantes(){
		return new ArrayList<>(this.participantes);
	}
	
	public void setComportamiento(Comportamiento c){
		this.comportamiento = c;
	}

	// TO DO 
/*	public List<String> listaDeInstrumentosParticipantes(){
	List <String> lista = new ArrayList<String>();
		for (Participante participante : this.participantes) {
			int cantidad =	participante.obtenerCantidadInstrumentos();
			for (int i =0; i<cantidad ; i++){
				String elemento = participante.getInstrumento(i);
				if(!lista.contains(elemento))
				lista.add(elemento);
			}
		
		}
		return lista;
	}*/

	public ArrayList<String> listaRequerimiento (ListaSegunRequerimiento c){

		return c.obtenerLista(this);

	}

	/*public List<String> listaSegunCriterioParticipantes(){
		ArrayList <String> lista = new ArrayList<String>();
		for (Participante participante: this.participantes ){
			ArrayList<String> liataParticipante = participante.getInstrumentos

			for (int i =0; i<listaParticipante.size(); i++){
				if (!lista.contains(listaParticipante.get(i))){
					lista.add(listaParticipante.get(i));
				}
			}
		}
		return lista;
	}*/

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
	
	//filtros

	public ArrayList<Participante> busqueda (Criterio criterio){
		ArrayList<Participante> participantesQueCumplen = new ArrayList<Participante> ();

		for (Participante participante : this.participantes){
			if (criterio.cumple(participante)){
				participantesQueCumplen.add(participante);
			}
		}
		return participantesQueCumplen;
	}


}
