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
		// TODO Auto-generated constructor stub
	}


	

}
