public class Computadora  extends Sorter{
    private int velocidad;

    public Computadora(int velocidad){
        this.velocidad = velocidad;
    }


    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public String toString(){
        return "Velocidad: " + this.getVelocidad();
    }

    public boolean sort(Object o){
        
    }
}
