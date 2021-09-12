import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private ArrayList<Lote> lotes;
    private String nombre;

    public Cooperativa(String nombre) {
        this.nombre = nombre;
        this.lotes = new ArrayList<Lote>();
    }

    public ArrayList<Cereal> tiposDeCerealesSem(Lote l) {
        return l.cerealSem();
    }

    public ArrayList<Lote> lotesPorCereal(Cereal cereal) {
        ArrayList<Lote> lotesAptos = new ArrayList<Lote>();
        for (Lote lote : lotes) {
            if (lote.cerealApto(cereal))
                lotesAptos.add(lote);
        }
        return lotesAptos;
    }

    public void agregarLote(Lote nuevoLote) {
        lotes.add(nuevoLote);
    }

    public static void main(String[] args) {
        Cooperativa c1 = new Cooperativa("Test");

        ArrayList<Mineral> m = new ArrayList<Mineral>();
        Mineral azufre = new Mineral("azufre");
        Mineral cobalto = new Mineral("cobalto");
        m.add(azufre);
        m.add(cobalto);

        ArrayList<Cereal> c = new ArrayList<Cereal>();
        Cereal girasol = new Cereal("Girasol", m);
        Cereal maiz = new Cereal("maiz", m);
        c.add(girasol);
        c.add(maiz);

        c.remove(c.size() - 1);

        Lote l1 = new Lote(m, c);
        System.out.println(l1.numeroDeLote());
        c1.agregarLote(l1);

        ArrayList<Cereal> cereales = c1.tiposDeCerealesSem(l1);
        System.out.println(cereales);

        ArrayList<Lote> lotesAptos = new ArrayList<Lote>();
        lotesAptos = c1.lotesPorCereal(girasol);
        System.out.println(lotesAptos);
        lotesAptos.clear();

        System.out.println(c1.lotesPorCereal(girasol));
      

    }

}
