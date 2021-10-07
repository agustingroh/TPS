package parte1;

import java.util.ArrayList;
import java.util.List;
import parte1.criterios.Criterio;
import parte1.criterios.CriterioIdioma;
import parte1.listas.ListaSegunRequerimiento;
import parte1.listas.RequerimientoGenero;
import parte1.listas.RequerimientoIdioma;


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

	public ArrayList<String> listaRequerimiento (ListaSegunRequerimiento c){
		return c.obtenerLista(this);
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

	public static void main(String[] args) {
		Coach c = new Coach("manolo", "nn", 22);

		Participante pp1 = new Participante("a", "a", 20);
		pp1.addIdioma("ingles");
		pp1.addIdioma("frances");
		pp1.addGenero("pop");
	



		Participante pp2 = new Participante("b", "b", 30);
		pp2.addIdioma("italiano");
		pp2.addIdioma("Aleman");
		pp2.addGenero("rock");
	

		Participante pp3 = new Participante("c", "c", 40);
		pp3.addIdioma("portugues");
		pp3.addIdioma("ingles");
		pp3.addGenero("jazz");
	

		c.agregarParticipante(pp1);
		c.agregarParticipante(pp2);
		c.agregarParticipante(pp3);


		// TEST IDIOMAS
		System.out.println("\n******************TEST IDIOMAS*******************");
		ArrayList<String> listaDeIdioamas = c.listaRequerimiento(new RequerimientoIdioma());
		for (String idioma : listaDeIdioamas) {
			System.out.println(idioma);
		}


		// TEST GENEROS
		System.out.println("\n******************TEST GENEROS*******************");
		ArrayList<String> listaDeGeneros = c.listaRequerimiento(new RequerimientoGenero());
		for (String genero : listaDeGeneros) {
			System.out.println(genero);
		}
	

		//TEST FILTROS
		System.out.println("\n******************TEST FILTROS*******************");
		ArrayList<Participante> listaDeParticipantesPorIdioma = c.busqueda(new CriterioIdioma("ingles"));
		for (Participante participante : listaDeParticipantesPorIdioma) {
			System.out.println(participante);
		}

		

	}

}
