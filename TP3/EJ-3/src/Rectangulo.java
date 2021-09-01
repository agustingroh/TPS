import javax.lang.model.util.ElementScanner6;

/*Implementar la clase Rectángulo.
Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
los atributos de la clase.
La funcionalidad que debe proveer un rectángulo es la siguiente
● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
Y.
● Calcular el Área del rectángulo.
● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
del mismo es mayor que la del otro.
● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
propiedades para que sea un cuadrado.
● Determinar el largo del lado superior.
● Determinar si está acostado o parado (si el alto es más que el ancho).
*/

public class Rectangulo extends PuntoGeometrico {
    private PuntoGeometrico vertice1;
    private PuntoGeometrico vertice2;
    private PuntoGeometrico vertice3;
    private PuntoGeometrico vertice4;


    Rectangulo(PuntoGeometrico v1, PuntoGeometrico v2, PuntoGeometrico v3, PuntoGeometrico v4) {
        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
        this.vertice4 = v4;
    }



    public void getPosXVertice1(){
        System.out.println("Posicion x vertice 1: " + this.vertice1.getX()); 
    }

    public void getPosXVertice2(){
        System.out.println("Posicion x vertice 2: " + this.vertice2.getX()); 
    }

    public void getPosXVertice3(){
        System.out.println("Posicion x vertice 3: " + this.vertice3.getX()); 
    }

    public void getPosXVertice4(){
        System.out.println("Posicion x vertice 4: " + this.vertice4.getX()); 
    }


    public PuntoGeometrico getVertice1() {
        return this.vertice1;
    }

    public void setVertice1(double x, double y) {
        this.vertice1 = new PuntoGeometrico(x, y);
    }

    public PuntoGeometrico getVertice2() {
        return this.vertice2;
    }

    public void setVertice2(double x, double y) {
        this.vertice2 = new PuntoGeometrico(x, y);
    }

    public PuntoGeometrico getVertice3() {
        return this.vertice3;
    }

    public void setVertice3(double x, double y) {
        this.vertice3 = new PuntoGeometrico(x, y);
    }

    public PuntoGeometrico getVertice4() {
        return this.vertice4;
    }

    public void setVertice4(double x, double y) {
        this.vertice4 = new PuntoGeometrico(x, y);
    }



    // Lado superior
    public double calcularLado1() {
        return (this.vertice4.getX() - this.vertice1.getX());
    }

    public double calcularLado2() {
        return (this.vertice2.getY() - this.vertice1.getY());
    }

    public double calcularArea() {
        return (this.calcularLado1() * this.calcularLado2());
    }

    public int compararArea(Rectangulo rec) {
        if (this.calcularArea() > rec.calcularArea()) {
            return 1;
        } else if (this.calcularArea() < rec.calcularArea()) {
            return -1;
        }
        return 0;
    }

    public boolean esCuadrado() {
        return (this.calcularLado1() == this.calcularLado2());
    }

    public double calcularLadoSuperior() {
        return this.calcularLado1();
    }

    public void posicion() {
        if (calcularLado1() > calcularLado2())
            System.out.println("Posicion: Acostado");
        else
            System.out.println("Posicion: Parado");
    }

    public void desplazarEnEjeX(double pos){
        this.vertice1.setX(vertice1.getX()+pos);
        this.vertice2.setX(vertice2.getX()+pos);
        this.vertice3.setX(vertice3.getX()+pos);
        this.vertice3.setX(vertice3.getX()+pos);
    }

    public void desplazarEnEjeY(double pos){
        this.vertice1.setY(vertice1.getY()+pos);
        this.vertice2.setY(vertice2.getY()+pos);
        this.vertice3.setY(vertice3.getY()+pos);
        this.vertice3.setY(vertice3.getY()+pos);;
    }
}
