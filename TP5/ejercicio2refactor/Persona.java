package ejercicio2refactor;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	private ArrayList <String> cualidades;
	private ArrayList <Persona> familiares;
	
	public Persona(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cualidades = new ArrayList<String>();
		this.familiares = new ArrayList<Persona>();
;
	}
	public ArrayList<String> getCualidades(){
		return (ArrayList<String>) this.cualidades.clone();
	}
	public ArrayList<Persona> getFamiliares(){
		return (ArrayList<Persona>) this.familiares.clone();
	}
	
	public boolean tieneCualidad (String cuali) {
		return this.cualidades.contains(cuali);
	}
	
	public void addFamiliar(Persona p) {
		this.familiares.add(p);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void addCualidad(String cuali) {
		this.cualidades.add(cuali);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@ Override
	public boolean equals(Object o) {
		Persona aux= (Persona) o;
		return this.dni == aux.getDni();
	
	}
	
	
	
}
