public class PuntoGeometrico {
    private double x;
    private double y;

    PuntoGeometrico() {
        this(0, 0);
    }

    PuntoGeometrico(double x, double y) {
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

    public void desplazarPunto(double x, double y) {
        setX(x);
        setY(y);
    }

    public static void main(String[] args) {
    }

}
