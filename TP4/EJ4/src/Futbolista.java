import java.time.LocalDate;


class Futbolista extends Persona {
    


    private int posicion;
    private int golesConvertidos;
    private int diestro;

    public static enum POSICION {
        ARQUERO, DEFENSOR, DELANTERO;
    }; 

    public Futbolista(String nombre, String apellido, int pasaporte, LocalDate fechaNacimiento, String estado) {
        super(nombre, apellido, pasaporte, fechaNacimiento, estado);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        System.out.println(Futbolista.POSICION.ARQUERO);
    }
}