public class CalculosGeometricos {

    CalculosGeometricos(){     
    }

    public double distanciaEuclidea(PuntoGeometrico a,PuntoGeometrico b){       
        double distEuc = Math.sqrt((Math.pow((a.getX() - b.getX()),2))+ (Math.pow((a.getY() - b.getY()),2)));
        return distEuc;
    }
}
