
import java.util.ArrayList;
import java.util.List;

// Deberia ser una clase abstracta? y que cada "Cereal" posea sus propios minerales? 
// no se repetiria creando una clase abstracta ?
public class Cereal {
    protected List<String> minerales;
    private ArrayList<String> granos;
    private String nombre;   

    public Cereal(List<String> minerales, List<String> granos, String nombre) {
        this.minerales = new ArrayList<String>();
        this.granos = new ArrayList<String>();
        this.minerales.addAll(minerales);
        this.granos.addAll(granos);
        this.nombre = nombre;
    }

    public boolean esUnLoteApto(Lote l) {
        for (String mineral : this.minerales) {
            if (!l.contineMinerales(mineral))
                return false;
        }
        return true;
    }


    public void agregarListaDeMinerales(List<String> minerales) {
        this.minerales.addAll(minerales);
    }

  

    @Override
    public String toString() {
        String aux = "";
        for (String string : granos) {
            aux += string + ",";
        }
        return "Granos: " + aux;
    }

}
