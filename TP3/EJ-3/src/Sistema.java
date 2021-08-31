import javax.swing.plaf.synth.SynthSpinnerUI;

/*Implementar la clase punto geométrico, la cual posee dos valores de coordenada X, Y.
El valor por defecto de los mismos es (0,0)
La funcionalidad que posee la clase es la siguiente:
● Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
(cierto desplazamiento en X y cierto desplazamiento en Y).
● Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
euclídea con otro punto acorde a la siguiente formula:
Distancia 2 = ( X 1 – X 2 ) 2 + (Y 1 – Y 2 ) 2
La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
cuadrada.
Implementar la clase Rectángulo.
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
● Determinar si está acostado o parado (si el alto es más que el ancho).*/

class Sistema {


    public static void main(String[] args) {

        /*
        V2             V3
        *---------------*
        |               |
        |               |
        *---------------*
        V1              V4
        */ 
     
        // Rectangulo 1
        Rectangulo rec1= new Rectangulo();
        // V1
        rec1.setVertice1(0, 0);
        // V2
        rec1.setVertice2(0, 7);
        // V3
        rec1.setVertice3(2, 7);
        //V4
        rec1.setVertice4(2, 0);

        // Rectangulo 2
        Rectangulo rec2= new Rectangulo();
        rec2.setVertice1(0, 0);
        rec2.setVertice2(0, 3);
        rec2.setVertice3(7, 3);
        rec2.setVertice4(7, 0);
        
        // Desplazamiento en x
        rec1.getPosXVertice1(); 
        rec1.desplazarEnEjeX(2);
        rec1.getPosXVertice1();

        // Posicion de los rectangulos
        rec1.posicion();
        rec2.posicion();

        // Areas
        System.out.println("El area del rectangulo 1 es: " + rec1.calcularArea() + " cm2");
        System.out.println("El area del rectangulo 2 es: " + rec2.calcularArea() + " cm2" );


        // Es cuadrado true/false
        System.out.println("Es cuadrado :" + rec2.esCuadrado());

        // Comparacion areas rectangulos
        System.out.println(rec1.compararArea(rec2));        
    }
}