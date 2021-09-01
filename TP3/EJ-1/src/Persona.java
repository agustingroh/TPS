import java.util.Date;

class Persona {

    private int dni;
    private String doB;
    private String sexo = "F";
    private String name = "N";
    private String surname;
    private double weigth;
    private double heigth;


    public Persona(int dni) {
        this(dni,"N", "N", "01-01-2000", "F", 1.0, 1.0);  
    }

    
    public Persona(int dni, String name, String surname) {
        this(dni, name, surname,"01-01-2000", "F", 1.0, 1.0);   // Se terminan repitiendo los valores por default
    }

    // Se define un constructor que acepta todos los parametros del objeto. Es una buena practica? 
    // Luego se reutiliza esta definicion llamando a los constructores que no definen todos los valores
    // Nuestra preocupacion es que se repiten los valores default, example la fecha de nacimiente, sexo, peso y altura.
    public Persona( int dni, String name, String surname, String doB, String sexo, double weigth, double heigth) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.doB = doB;
        this.sexo = sexo;
        this.heigth = heigth;
        this.weigth = weigth;

    }



}