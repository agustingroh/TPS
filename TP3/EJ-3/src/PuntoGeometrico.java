/*El valor por defecto de los mismos es (0,0)
La funcionalidad que posee la clase es la siguiente:
● Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
(cierto desplazamiento en X y cierto desplazamiento en Y).
● Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
euclídea con otro punto acorde a la siguiente formula:
Distancia 2 = ( X 1 – X 2 ) 2 + (Y 1 – Y 2 ) 2
La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
cuadrada.
*/

public class PuntoGeometrico extends CalculosGeometricos {

    private double x;
    private double y;

    PuntoGeometrico() {
        this(0, 0);
    }

    PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static double distanciaEuclidea(PuntoGeometrico a,PuntoGeometrico b){       
        double distEuc = Math.sqrt((Math.pow((a.getX() - b.getX()),2))+ (Math.pow((a.getY() - b.getY()),2)));
        return distEuc;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void desplazarPunto(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double distanciaEuclidea(PuntoGeometrico a){       
        PuntoGeometrico.distanciaEuclidea(this, a);
    }

    public static void main(String[] args) {


        PuntoGeometrico p1 = new PuntoGeometrico(10,10);
        PuntoGeometrico p2 = new PuntoGeometrico(20,20);

        p1.distanciaEuclidea(p2);

        PuntoGeometrico.distanciaEuclidea(p1, p2);
    }

}