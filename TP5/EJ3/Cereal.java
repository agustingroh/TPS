
import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private String nombre;
    protected List<Mineral> minerales;

    public Cereal(String nombre, ArrayList<Mineral> m) {
        this.nombre = nombre;
        this.minerales = new ArrayList<Mineral>(m);

    }

    public boolean contieneMinerales(ArrayList<Mineral> m) {
        for (Mineral mineral : m) {
            if (minerales.contains(mineral))
                return true;
        }

        return false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Mineral> getMinerales() {
        return this.minerales;
    }

    public void setMinerales(List<Mineral> minerales) {
        this.minerales = minerales;
    }

    public String toString() {
        return "Cereal: " + getNombre();
    }

}
