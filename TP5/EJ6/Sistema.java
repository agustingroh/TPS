
import java.util.ArrayList;
import java.util.Arrays;

public class Sistema {
    private Congreso congreso;

    public Sistema(){
       this.congreso = new Congreso();
    }


    public ArrayList<Evaluador> listaDeEvaluadoresAptosSegunTrabajo(Trabajo t){
        return congreso.listaDeEvaluadoresAptosPorTrabajo(t);
    }

    public void agregarTrabajo(Trabajo t){
         congreso.agregarTrabajo(t);
    }

    public void agregarEvaluador(Evaluador e){
        congreso.agregarEvaluador(e);
   }


public static void main(String[] args) {
    Sistema sistema = new Sistema();
    Evaluador e1 = new Evaluador("Juan");
    e1.agregarPalabrasClave(new ArrayList<String>(Arrays.asList("a","b","c")));
    Evaluador e2 = new Evaluador("Pedro");
    e2.agregarPalabrasClave(new ArrayList<String>(Arrays.asList("a","b","c")));
   Trabajo t1 = new Trabajo();
   t1.agregarPalabrasClave(new ArrayList<String>(Arrays.asList("a","b","c")));

   sistema.agregarEvaluador(e1);
   sistema.agregarEvaluador(e2);
   sistema.agregarTrabajo(t1);

   // Lista de evaluadores aptos para un determinado trabajo
   System.out.println(sistema.listaDeEvaluadoresAptosSegunTrabajo(t1));
}

}
