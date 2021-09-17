import java.util.List;
import java.util.ArrayList;

public class Pastura extends Cereal {

    private int cantidadHectareasMinima;

    public Pastura (List<String> minerales, List<String> granos,String nombre,int cantidadHectareasMinima){
        super(minerales,granos,nombre);
        this.cantidadHectareasMinima=cantidadHectareasMinima;
    }

    public boolean esUnLoteApto(Lote l){
        if(l.getCantidadHectareas()<this.cantidadHectareasMinima) return false;
        return (super.esUnLoteApto(l));    
    }
    
}
