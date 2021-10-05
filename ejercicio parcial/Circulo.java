public class Circulo extends Figura {
    
    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio=radio;
    }

    public double getArea(){
        return Math.PI*this.radio*this.radio;
    }

}
