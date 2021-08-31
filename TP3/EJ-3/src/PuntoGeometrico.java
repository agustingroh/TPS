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

public class PuntoGeometrico extends CalculosGeometricos{

        private double x;
        private double y;

    PuntoGeometrico(){
            this(0,0);            
        }        

    PuntoGeometrico(double x, double y){
        this.setX(x);
        this.setY(y);
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

    public void desplazarPunto(double x, double y){
        setX(x);
        setY(y);
    }   

    public static void main(String[] args) {
    }

}