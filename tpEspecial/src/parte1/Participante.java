package parte1;

import java.util.ArrayList;
import java.util.List;



public class Participante extends Persona{

	private List<String>generosMusicales;
	private List<String>idiomas;
	private List<String>instrumentos;
	
	public Participante(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		this.generosMusicales=new ArrayList<>();
		this.idiomas=new ArrayList<>();
		this.instrumentos=new ArrayList<>();
	}

	public ArrayList<String> getInstrumentos (){
		return new ArrayList<String>(this.instrumentos);
	}

	public void addInstrumento (String instrumentos){
		this.instrumentos.add(instrumentos);
	}

	public ArrayList<String> getIdiomas (){
		return new ArrayList<String>(this.idiomas);
	}

	public void addIdioma (String idioma){
		this.idiomas.add(idioma);
	}


	public ArrayList<String> getGeneros (){
		return new ArrayList<String>(this.generosMusicales);
	}

	public void addGenero (String genero){
		this.generosMusicales.add(genero);
	}

}
