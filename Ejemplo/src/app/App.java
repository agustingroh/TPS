package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private List<Persona> personas;

    public App(){
        this.personas= new ArrayList<Persona>();
    }

    public void agregarPersona(Persona p) {
        personas.add(p);
    }

    public List<Persona> obtenerListaDePersonas(){
        List aux = new ArrayList<Persona>();
        aux= personas;
        return aux;
    }


    public static void main(String[] args) {
    	System.out.println("Hola " + args[0]);
    	/*
        App app = new App();
        System.out.println("n- Nuevo usuario");
        System.out.println("l- mostrar listado de personas");
        System.out.println("U) Unload cargo from ship <srcStackIndex>");
        System.out.println("M) Move cargo between stacks <srcStackIndex> <dstStackIndex>");
        System.out.println("K) Clear dock");
        System.out.println("P) Print ship stacks");
        System.out.println("S) Search for cargo <name>");
        System.out.println("q - quit");
*/
    	/*
        String options = null;
        Scanner scan = new Scanner(System.in); // Capturing the input
        do {
            options = scan.nextLine();
            switch (options) {
                case "n":
                    System.out.println("*****nuevo usuario*******");
                    Scanner aux = new Scanner(System.in);
                    System.out.println("Ingresar nombre");
                    String nombre = aux.nextLine();
                    System.out.println("Ingrese apellido");
                    String apellido = aux.nextLine();
                    app.agregarPersona(new Persona(nombre,apellido));      
                    options="z";
                    break;
                case "l":
                System.out.println("*****lista de usuarios*******");
                    List<Persona> empleados =  app.obtenerListaDePersonas();
                    for (Persona persona : empleados) {
                        System.out.println("Nombre: " + persona.getNombre() + " Apellido: " +  persona.getApellido());
                    }
                    break;
                case "U":
                    // do what you want
                    break;
                case "M":
                    break;

                default:
                System.out.println("n- Nuevo usuario");
                System.out.println("l- mostrar listado de personas");
                System.out.println("U) Unload cargo from ship <srcStackIndex>");
                System.out.println("M) Move cargo between stacks <srcStackIndex> <dstStackIndex>");
                System.out.println("K) Clear dock");
                System.out.println("P) Print ship stacks");
                System.out.println("S) Search for cargo <name>");
                System.out.println("q - quit");
                // Add the rest of your cases
            }
        } while (!options.equals("Q")); // quitting the program
    }
*/
}
