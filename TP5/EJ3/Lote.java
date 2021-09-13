
import java.util.ArrayList;

import java.util.List;

public class Lote {
    protected List<Mineral> minerales;
    protected static int id;
    private int numeroDeLote;
    private int cantidadHectareas;

    public Lote(ArrayList<Mineral> m, int cantidadHectareas) {

        // Minerales del lote
        this.minerales = new ArrayList<Mineral>(m);
        this.numeroDeLote = Lote.id;
        Lote.id = Lote.id + 1;
        this.cantidadHectareas = cantidadHectareas;
    }

    public int cantidadHectareas() {
        return this.cantidadHectareas;
    }

    public int numeroDeLote() {
        return this.numeroDeLote;
    }

    public boolean tieneMineral(ArrayList<Mineral> m) {
        for (Mineral mineral : m) {
            if (!this.minerales.contains(mineral))
                return false;
        }
        return true;
    }

    public void agregarMineral(Mineral m) {
        if (!this.minerales.contains(m))
            this.minerales.add(m);
    }

    public List<Mineral> getMinerales() {
        return new ArrayList<Mineral>(this.minerales);
    }

    public String toString() {
        return "Id: " + this.numeroDeLote();
    }

}
