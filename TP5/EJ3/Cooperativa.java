import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cooperativa {
    private ArrayList<Lote> lotes;
    private String nombre;
    private ArrayList <String> mineralesPrimarios;

    public Cooperativa(String nombre,ArrayList<String>mineralesPrimarios) {
        this.nombre = nombre;
        this.lotes = new ArrayList<Lote>();
        this.mineralesPrimarios = new ArrayList<String>();
        this.mineralesPrimarios.addAll(mineralesPrimarios);
   
    }

    public void agregarListaDeMineralesPrimarios(ArrayList<String> minerales){
      this.mineralesPrimarios.addAll(minerales);
    }


    public boolean sePuedeSembrarUnCerealEnUnlote(Lote lote, Cereal c) {
        return c.esUnLoteApto(lote);
        
    }

    public  ArrayList <Lote> lotesQueEnLosQueSePuedeSembrarUnDeterminadoCereal(Cereal c){
        ArrayList <Lote> lotesAptosParaElCereal = new ArrayList<Lote>();
        for (Lote lote : this.lotes) {           
           if(c.esUnLoteApto(lote)) lotesAptosParaElCereal.add(lote);
        }

        return lotesAptosParaElCereal;
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


    public boolean tipoDelote(Lote l){
        for (String m : this.mineralesPrimarios) {
           if(!l.contineMinerales(m))return false;
        }
        return true;
    }



  

    public static void main(String[] args) {
        ArrayList mineralesPrimarios = new ArrayList<String>(Arrays.asList("calcita", "yeso","azufre"));
        Cooperativa cooperativa = new Cooperativa("Test",mineralesPrimarios);

        Cereal cosechaGruesa = new Cereal(new ArrayList<String>(Arrays.asList("calcita", "yeso","azufre")),new ArrayList<String>(Arrays.asList("girasol", "maiz")), "Grano de cosecha gruesa");

        Cereal cosechaFina = new Cereal(new ArrayList<String>(Arrays.asList("calcita", "yeso","azufre","fluorita")),new ArrayList<String>(Arrays.asList("trigo", "avena")), "Grano de cosecha fina");


        Cereal pastura = new Pastura(new ArrayList<String>(Arrays.asList("calcita", "yeso","azufre","fluorita")),new ArrayList<String>(Arrays.asList("trigo", "avena")), "pastura",50);

        // Lotes
        Lote l1 = new Lote(new ArrayList<String>(Arrays.asList("calcita")),51);        
        Lote l2 = new Lote(new ArrayList<String>(Arrays.asList("calcita", "yeso","azufre")),48);
        Lote l3 = new Lote(new ArrayList<String>(Arrays.asList("calcita", "yeso","azufre","fluorita")),52);

        cooperativa.agregarLote(l1);
        cooperativa.agregarLote(l2);
        cooperativa.agregarLote(l3);

        // ***************************** TEST *********************************//
        // TEST-> SE PUEDE SEMBRAR UN CEREAL EN UN DETERMINADO LOTE
        System.out.println("Se puede sembrar el cereal en el lote : " + cooperativa.sePuedeSembrarUnCerealEnUnlote(l1, cosechaGruesa)); 

        System.out.println("Se puede sembrar el cereal en el lote : " + cooperativa.sePuedeSembrarUnCerealEnUnlote(l2, cosechaGruesa)); 

        // Pastura (checkea cantidad de hectareas ademas de minerales)
        System.out.println("Se puede sembrar pastura en el lote : " + cooperativa.sePuedeSembrarUnCerealEnUnlote(l3, pastura)); 


        // TIPO DE LOTE
        if(cooperativa.tipoDelote(l1))
        System.out.println("Lote especial");
        else
        System.out.println("Lote comun");


        
    // 2) en qué lotes se puede sembrar un determinado cereal
        ArrayList <Lote> lotesAptos = new ArrayList<Lote>();
        lotesAptos = cooperativa.lotesQueEnLosQueSePuedeSembrarUnDeterminadoCereal(cosechaFina);
        for (Lote lote : lotesAptos) {
            System.out.println("Numero de lote:" + lote);
        }
    }

}
