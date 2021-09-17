
import java.util.ArrayList;

import java.util.List;

public class Lote {
    protected List<String> minerales;
    protected static int id;
    private int numeroDeLote;
    private int cantidadHectareas;

    public Lote(ArrayList<String> m, int cantidadHectareas) {

        // Minerales del lote
        this.minerales = new ArrayList<String>(m);
        this.numeroDeLote = Lote.id;
        Lote.id = Lote.id + 1;
        this.cantidadHectareas = cantidadHectareas;
    }

    public int getCantidadHectareas() {
        return this.cantidadHectareas;
    }

    public int numeroDeLote() {
        return this.numeroDeLote;
    }

    public boolean contineMinerales(String m){
        return this.minerales.contains(m);
    }


   



    public String toString() {
        return this.numeroDeLote() + " cantidad de hectareas -> " + this.getCantidadHectareas();
    }

}
