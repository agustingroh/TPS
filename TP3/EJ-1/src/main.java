/*1 Persona

int -> +-2147483647
long -> +-9223372036854775808

Implementar una clase llamada Persona con las siguientes características:
Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
Valores por defecto:
● El DNI es un valor obligatorio, no posee valor por defecto.     ->CONSTRUCTOR se pide al crear
● En caso de la fecha de nacimiento será el 1 de enero de 2000.    
● Sexo será Femenino por defecto.                                   
● El nombre por defecto es N y el apellido es N.             
● El peso y la altura son 1 por defecto.                         
Acorde a lo anterior se deben crear los constructores. 
-> Con DNI, 
-> DNI ,nombre y apellido, 
-> DNI, nombre, apellido y Fecha de nacimiento…..
La responsabilidad de la clase es la siguiente:
-------● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
de masa corporal el cual es peso / altura 2
-------● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
● Saber si está cumpliendo años.
● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años
● Métodos set de cada parámetro, excepto de DNI.
● Saber si puede votar. Es necesario ser mayor de 16 años.
● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
● Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo.*/



/* 
    Consultas:

    SOBRECARGA DE CONSTRUCTORES Y VALORES POR DEFECTO
    * El archivo Persona.java repite codigo en los valores por default. 
    * El archivo Persona_2.java repite codigo dentro de los constructores. 
    * IMPORTANTE: Ademas tenemos un constructor vacio y segun el ejercicio no estaba permitido
    * Da la impresion que ninguna esta bien implementada  
    
    
    SETEO DE ATRIBUTOS EN CONSTRUCTORES:
    * Cuando seteamos los valores de los atributos , es una buena practica hacerlo
    a traves de los setters de del objeto. Ej this.edad = setEdad(25);
    * 

    * public Persona(int dni) {
        this.edad = 15;
            O
        this.setEdad(15);
    }


    VALORES DEFECTO EN ATRIBUTOS
    * Se puede inicializar los valores por default en la declaracion de los atributos?
    * Es una buena practica?
    Ej. private int edad = 25;


    CLASES DE FECHAS
    * Las fechas tienen que ser del tipo LocalDate?
    * Como se trabaja cuando hay valores por defecto como en este ejercicio?
    * El metodo setDoB, deberia recibir un string o directamente un objeto fecha?
*/


class Main {
 
    

    public static void main(String[] args) {
        Persona_2 p = new Persona_2(25147123);
        p.setDoB("01-01-1990");
        p.setName("Juan");
        p.setSurname("Test");
        p.setWeigth(90.0);
        p.setHeigth(1.95);        
        System.out.println("Es adulto: " + p.isAdult());
        System.out.println("Soy: " + p.isInShape());
        System.out.println(p);
        
    }

}
