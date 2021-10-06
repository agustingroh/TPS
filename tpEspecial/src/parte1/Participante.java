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

	public List<String> getInstrumentos (){
		return new ArrayList<String>(this.instrumentos);
	}

	public void addInstrumento (String ins){
		this.instrumentos.add(ins);
	}

	public List<String> getIdiomas (){
		return new ArrayList<String>(this.idiomas);
	}

	public void addInstrumento (String idioma){
		this.idiomas.add(idioma);
	}


	public List<String> getGeneros (){
		return new ArrayList<String>(this.idiomas);
	}

	public void addGenero (String genero){
		this.generos.add(genero);
	}

}
