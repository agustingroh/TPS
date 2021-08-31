

public class Sistema {
    public static void main(String[] args) {

        /*
        V2             V3
        *---------------*
        |               |
        |               |
        *---------------*
        V1              V4
        */ 
        PuntoGeometrico verticeInicial= new PuntoGeometrico(0,0);
        // Rectangulo 1                (Vertice incial,lado1,lado2)
        Rectangulo rec1= new Rectangulo (verticeInicial,7,2,"acostado");  

        // // V1
        // rec1.setVertice1(0, 0);
        // // V2
        // rec1.setVertice2(0, 7);
        // // V3
        // rec1.setVertice3(2, 7);
        // //V4
        // rec1.setVertice4(2, 0);

        // Rectangulo 2
        Rectangulo rec2= new Rectangulo();
        rec2.setVertice1(0, 0);
        rec2.setVertice2(0, 3);
        rec2.setVertice3(7, 3);
        rec2.setVertice4(7, 0);
        
        // Desplazamiento en x
       // rec1.getPosXVertice1(); 
        rec1.desplazarEnEjeX(2);
        rec1.getPosXVertice1();

        // Posicion de los rectangulos
         rec1.posicion();
        // rec2.posicion();

        // Areas
        System.out.println("El area del rectangulo 1 es: " + rec1.calcularArea() + " cm2");
        System.out.println("El area del rectangulo 2 es: " + rec2.calcularArea() + " cm2" );


        // Es cuadrado true/false
         System.out.println("Es cuadrado :" + rec2.esCuadrado());

        // Comparacion areas rectangulos
         System.out.println(rec1.compararArea(rec2));        
    }
}
