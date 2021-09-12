
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lote {
    protected List<Mineral> minerales;
    protected static int id;
    private int numeroDeLote;
    private List<Cereal> cereales;

    // public abstract String tipoLote(ArrayList <Mineral> m);

    public Lote(ArrayList<Mineral> m, ArrayList<Cereal> c) {
        this.cereales = new ArrayList<Cereal>(c);
        this.minerales = new ArrayList<Mineral>(m);
        this.numeroDeLote = Lote.id;
        Lote.id = Lote.id + 1;
    }

    public void agregarMineral(Mineral nuevoMin) {
        minerales.add(nuevoMin);
    }

    public void agregarCereal(Cereal cereal) {
        cereales.add(cereal);
    }

    public int numeroDeLote() {
        return this.numeroDeLote;
    }

    public boolean tipoLote(ArrayList<Mineral> m) {
        for (Mineral mineral : m) {
            if (minerales.contains(mineral))
                return true;
        }
        return false;
    }

    public boolean cerealApto(Cereal c) {
        return cereales.contains(c);
    }

    // Preguntar: El lote deberia tener una lista de posibles cereales?
    public ArrayList<Cereal> cerealSem() {
        ArrayList<Cereal> cerealesSem = new ArrayList<Cereal>();
        for (Cereal cereal : cereales) {
            if (cereal.contieneMinerales(new ArrayList<Mineral>(this.minerales)))
                cerealesSem.add(cereal);
        }
        return cerealesSem;
    }

    public String toString() {
        return "Id: " + this.numeroDeLote();
    }

}
