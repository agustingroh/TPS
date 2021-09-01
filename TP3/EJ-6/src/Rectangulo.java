public class Rectangulo  {
    private PuntoGeometrico vertice1;
    private PuntoGeometrico vertice2;
    private PuntoGeometrico vertice3;
    private PuntoGeometrico vertice4;
   
    /*
     * A la clase Rectángulo del ejercicio 3 implementarla nuevamente, guardando
     * solo un vértice y las longitudes de los lados. Implementar la misma interfaz
     * que en el ejercicio 3.
     */

   

    Rectangulo(PuntoGeometrico v, double lado1, double lado2, String direccion) {
        this.setVertices(v, lado1, lado2, direccion);

    }

    Rectangulo(PuntoGeometrico v1, PuntoGeometrico v2, PuntoGeometrico v3, PuntoGeometrico v4) {

        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
        this.vertice4 = v4;
    }

    // Seteo los vertices a partir de un unico punto y dos lados
    private void setVertices(PuntoGeometrico v, double lado1, double lado2, String direccion) {
        this.setVertice1(v.getX(), v.getY());
        if (direccion == "acostado") {
            this.setVertice4(v.getX() + lado1, v.getY());
            this.setVertice2(v.getX(), v.getY() + lado2);
            this.setVertice3(v.getX() + lado1, v.getY() + lado2);
        } else {
            this.setVertice2(v.getX(), v.getY() + lado1);
            this.setVertice3(v.getX() + lado2, v.getY() + lado1);
            this.setVertice4(v.getX() + lado2, v.getY());            
        }

    }

    public void getPosXVertice1() {
        System.out.println("Posicion x vertice 1: " + this.vertice1.getX());
    }

    public void getPosXVertice2() {
        System.out.println("Posicion x vertice 2: " + this.vertice2.getX());
    }

    public void getPosXVertice3() {
        System.out.println("Posicion x vertice 3: " + this.vertice3.getX());
    }

    public void getPosXVertice4() {
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
        if (calcularLado1() == calcularLado2())
            return true;
        return false;
    }

    public double calcularLadoSuperior() {
        return calcularLado1();
    }

    public void posicion() {
        if (calcularLado1() > calcularLado2())
            System.out.println("Posicion: Acostado");
        else
            System.out.println("Posicion: Parado");
    }

    public void desplazarEnEjeX(double pos) {
        this.vertice1.setX(vertice1.getX() + pos);
        this.vertice2.setX(vertice2.getX() + pos);
        this.vertice3.setX(vertice3.getX() + pos);
        this.vertice4.setX(vertice4.getX() + pos);
        ;
    }

    public void desplazarEnEjeY(double pos) {
        this.vertice1.setY(vertice1.getY() + pos);
        this.vertice2.setY(vertice2.getY() + pos);
        this.vertice3.setY(vertice3.getY() + pos);
        this.vertice4.setY(vertice4.getY() + pos);
        ;
    }
}
