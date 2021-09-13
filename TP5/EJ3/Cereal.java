
import java.util.ArrayList;
import java.util.List;

// Deberia ser una clase abstracta? y que cada "Cereal" posea sus propios minerales? 
// no se repetiria creando una clase abstracta ?
public class Cereal {
    protected List<Mineral> minerales;
    private ArrayList<String> granos;
    private String nombre;
    private Exigencia exigencia;

    public Cereal(List<Mineral> minerales, List<String> granos,String nombre) {
        this(minerales,granos,nombre,new ExigenciaNormal());       
    }


    public Cereal(List<Mineral> minerales, List<String> granos,String nombre, Exigencia exigencia) {
        this.minerales = new ArrayList<Mineral>();
        this.granos = new ArrayList<String>();
        this.minerales.addAll(minerales);   
        this.granos.addAll(granos);
        this.nombre=nombre;        
        this.exigencia= exigencia;
    }


    public boolean esUnLoteApto(Lote l){
       return this.exigencia.exigencia(l, this);
    }

    

    public void agregarListaDeMinerales(List<Mineral> minerales) {
        this.minerales.addAll(minerales);
    }

    public boolean contieneMinerales(Mineral m){
        return this.minerales.contains(m);
    }

    public boolean contieneMinerales(ArrayList<Mineral> m) {
        for (Mineral mineral : m) {
            if (minerales.contains(mineral))
                return true;
        }
        return false;
    }

    public List<Mineral> getMinerales() {
        return this.minerales;
    }

    public void setMinerales(List<Mineral> minerales) {
        this.minerales = minerales;
    }

    @Override
    public String toString(){
        String aux="";
        for (String string : granos) {
            aux+=string + ",";
        }
        return "Granos: " + aux;
    }

}
