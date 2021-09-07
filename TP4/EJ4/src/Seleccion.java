import java.time.LocalDate;
import java.util.ArrayList;

public class Seleccion {


    ArrayList<Persona> personas;
    
    public Seleccion(){
        this.personas=  new ArrayList<Persona>();
    }


    public void agregarPersona(Persona persona){
        personas.add(persona);
    }





    public static void main(String[] args) {
        Persona p1= new Persona("Agustin","Isasmendi",4564812,LocalDate.parse("2019-03-29"),Persona.CONCENTRACION);

        System.out.println(p1);
    }
}