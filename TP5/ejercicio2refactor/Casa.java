package ejercicio2refactor;

import java.util.ArrayList;

public class Casa {
	
	private String nombre;
	private int nAlumnos;
	private ArrayList <Persona> alumnos;
	private ArrayList <String> cualidadesRequeridas;
	private Exigencia exigencia;
	private Casa casaEnemiga;
	
	
	public Casa(String nombre, int nAlumnos) {
		this.nombre = nombre;
		this.nAlumnos = nAlumnos;
		this.alumnos = new ArrayList<Persona>();
		this.cualidadesRequeridas= new ArrayList<String>();
		this.exigencia = new ExigenciaComun();
		this.casaEnemiga= null;
	}
	
	
	public Casa getCasaEnemiga() {
		return casaEnemiga;
	}


	public void setCasaEnemiga(Casa casaEnemiga) {
		this.casaEnemiga = casaEnemiga;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean puedeIngresar(Persona p) {
		return exigencia.puedeIngresar(p, this);
	}

	public int getnAlumnos() {
		return nAlumnos;
	}

	public void setnAlumnos(int nAlumnos) {
		this.nAlumnos = nAlumnos;
	}
	
	public void addAlumno(Persona p) {
		//if ()    COMO AGREGO EL METODO QUE CREE EN SOMBRERO?????????? 
		if (this.puedeIngresar(p)&& this.cantidadAlumnos()<this.nAlumnos) {
			this.alumnos.add(p);
		}
	}
	
	public int cantidadAlumnos() {
		return this.alumnos.size();
	}
	
	public void addCualidad(String cuali) {
		this.cualidadesRequeridas.add(cuali);
	}
	public ArrayList<String> getCualidadesRequeridas(){
		return (ArrayList<String>) this.cualidadesRequeridas.clone();
	}
	
	public ArrayList<Persona> getAlumnos(){
		return (ArrayList<Persona>) this.alumnos.clone();
	}
	
	public void setExigencia (Exigencia ex) {
		exigencia =ex;
	}
	
	public boolean contieneAlumno (Persona p) {
		return this.alumnos.contains(p);
	}
	
	
	//public boolean yaTieneCasa (Casa c) {
	///	if
	//}
	
	public static void main(String[] args) {
		
		Sombrero s1 = new Sombrero();
		
		
		Casa c1 = new Casa("casa1", 3);
		Casa c2 = new Casa("casa1", 3);
		
		
		
		
		c1.addCualidad("humilde");
		c1.addCualidad("inteligente");
		c1.addCualidad("sano");
		c1.addCualidad("malo");
		
		c2.addCualidad("valiente");
		c2.addCualidad("inteligente");
		
		Persona alumno1 = new Persona("juan","perez", 34567 );   //puede entrar a las 2 casas segun cualidades
		
		alumno1.addCualidad("humilde");
		alumno1.addCualidad("inteligente");
		alumno1.addCualidad("sano");
		alumno1.addCualidad("agil");
		alumno1.addCualidad("malo");
		alumno1.addCualidad("valiente");
		
		
		Persona alumno2 = new Persona("juan","perez", 3457 );
		
		alumno2.addCualidad("humilde");
		alumno2.addCualidad("inteligente");
		alumno2.addCualidad("sano");
		alumno2.addCualidad("agil");
		alumno2.addCualidad("malo");
		
		Persona alumno3 = new Persona("juan","perez", 3467 );
		
		alumno3.addCualidad("humilde");
		alumno3.addCualidad("inteligente");
		alumno3.addCualidad("sano");
		alumno3.addCualidad("agil");
		alumno3.addCualidad("malo");
		
		Persona alumno4 = new Persona("juan","perez", 3567 );
		
		c1.addAlumno(alumno1);
		c1.addAlumno(alumno3);
		
		
		
		
		
		s1.addCasa(c1);
		
		
		System.out.println(s1.alumnoTieneCasa(alumno4));
		
		
		s1.obtenerCasaNombre("c1");
		
		
		/*
		System.out.println(c1.puedeIngresar(alumno1));
		System.out.println(c1.puedeIngresar(alumno2));
		System.out.println(c1.puedeIngresar(alumno3));
		System.out.println(c1.puedeIngresar(alumno4));
		System.out.println(c1.getAlumnos().size());
		
		
		Persona familiar1 = new Persona ("pepe","alvarez", 12);
		Persona familiar2 = new Persona ("pepe","alvarez", 124);
		Persona familiar3 = new Persona ("pepe","alvarez", 1232);
		
		alumno2.addFamiliar(familiar1);
		alumno2.addFamiliar(familiar2);
		alumno2.addFamiliar(familiar3);
		
		familiar2.addCualidad("humilde");
		familiar2.addCualidad("inteligente");
		familiar2.addCualidad("sano");
		familiar2.addCualidad("agil");
		familiar2.addCualidad("malo");
		
		
		c1.addAlumno(familiar2);
		
		System.out.println(c1.puedeIngresar(alumno1));
		System.out.println(c1.puedeIngresar(alumno2));
		
		c1.setExigencia(new ExigenciaPuraSangre());
		
		System.out.println(c1.puedeIngresar(alumno1));
		System.out.println(c1.puedeIngresar(alumno2)); 
		
		
		c1.setExigencia(new ExigenciaEnemistad());
		c1.setCasaEnemiga(c2);
		c2.setCasaEnemiga(c1);
		
		
		System.out.println(c1.puedeIngresar(alumno1));
		System.out.println(c1.puedeIngresar(alumno2)); 
		*/
		
	}



	
}
