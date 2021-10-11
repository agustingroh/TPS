import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Vivero {

    private ArrayList<Planta> plantas;

    public Vivero (){
        this.plantas = new ArrayList<>();
    }

    public void agregarPlanta(Planta p){
        if(!this.plantas.contains(p))
            this.plantas.add(p);
    }


    public ArrayList<Planta> obentenerPlantas(Filter f){
        ArrayList<Planta> plantasFiltradas = new ArrayList<>();
        for (Planta planta : plantas) {
            if(f.cumple(planta)) plantasFiltradas.add(planta);
        }
        return plantasFiltradas;
    }


    public static void main(String[] args) {
        Vivero v1= new Vivero();

        Planta pp1 = new Planta("Test 1", 5,5);
        Planta pp2 = new Planta("Test 2", 2,6);
        Planta pp3 = new Planta("Test 3", 2,7);
        v1.agregarPlanta(pp1);
        v1.agregarPlanta(pp2);
        v1.agregarPlanta(pp3);

        // Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
        ArrayList<Planta> resultado = v1.obentenerPlantas(new FilterAND(new FilterNivelRiegoInf(3), new FilterNivelSolSup(5)));
       Collections.sort(resultado,new SortNivelSol());
        System.out.println(resultado);
    }
    
}
