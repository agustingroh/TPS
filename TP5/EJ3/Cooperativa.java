import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cooperativa {
    private ArrayList<Lote> lotes;
    private String nombre;

    public Cooperativa(String nombre) {
        this.nombre = nombre;
        this.lotes = new ArrayList<Lote>();
    }

    public boolean puedeSembrarse(Lote lote, Cereal c) {
        return c.esUnLoteApto(lote);
        
    }

  
    public ArrayList<Lote> lotesPorCereal(Cereal cereal) {
        ArrayList<Lote> lotesAptos = new ArrayList<Lote>();
        for (Lote lote : lotes) {
           if(cereal.esUnLoteApto(lote))
                lotesAptos.add(lote);
        }
        return lotesAptos;
    }

    public void agregarLote(Lote nuevoLote) {
        lotes.add(nuevoLote);
    }


    public boolean tipoLote(Lote l,ArrayList<Mineral> m){
        return l.tieneMineral(m);

    }

    public static void main(String[] args) {
        Cooperativa cooperativa = new Cooperativa("Test");

        ArrayList<Mineral> minerales = new ArrayList<Mineral>();

        Mineral azufre = new Mineral("azufre",Mineral.PRIMARIO);
        Mineral cobalto = new Mineral("cobalto",Mineral.SECUNDARIO);
        minerales.add(azufre);
        minerales.add(cobalto);

        List<String> granoGrueso = Arrays.asList( "Girasol", "Maiz");
        List<String> granoFino = Arrays.asList("trigo", "avena");
        List<String> pastura = Arrays.asList("alfalfa", "trébol", "subterráneo");        
           
        Cereal cereal1 = new Cereal( minerales,granoGrueso,"Grano grueso");
        Cereal cereal2 = new Cereal( minerales,granoFino,"Grano fino");
        Cereal cereal3 = new Cereal( minerales,pastura,"pastura",new ExigenciaPastura());

        ArrayList <Cereal> listaCereales = new ArrayList<Cereal>();
        listaCereales.add(cereal1);
        listaCereales.add(cereal2);
        listaCereales.add(cereal3);




        ArrayList<Mineral> mineralesLote = new ArrayList<Mineral>();
        mineralesLote.add(cobalto);
       
        Lote l1 = new Lote(mineralesLote,50);
        cooperativa.agregarLote(l1);


        // Comprobar si se puede sembrar un cereal en un determinado lote
        System.out.println("Cereal por lote," + " Cereal-> grano grueso: "  + cooperativa.puedeSembrarse(l1,cereal1));
        l1.agregarMineral(azufre);
        System.out.println("Cereal por lote," + " Cereal-> pasturas: "  + cooperativa.puedeSembrarse(l1,cereal3));
      


        ArrayList<Lote> lotesAptos = new ArrayList<Lote>();
        lotesAptos = cooperativa.lotesPorCereal(cereal3);
        System.out.println("Lotes aptos para sembrar cereales de pastura->" + lotesAptos);
    


        ArrayList<Mineral> mineralesPrimarios = new ArrayList<Mineral>();

        Mineral clorita = new Mineral("clorita",Mineral.PRIMARIO);
      
        mineralesPrimarios.add(clorita);
        

        // Tipo de lote
 
        if(cooperativa.tipoLote(l1, mineralesPrimarios)){
            System.out.println("Lote especial");
        }else{
            System.out.println("Lote comun");
        }
       

 
      

    }

}
