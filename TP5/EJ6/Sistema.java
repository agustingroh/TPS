
import java.util.ArrayList;
import java.util.Arrays;

public class Sistema {
    private Congreso congreso;

    public Sistema() {
        this.congreso = new Congreso();
    }

    // Lista de evaluadores aptos para un determinado trabajo
    public ArrayList<Evaluador> listaDeEvaluadoresAptosSegunTrabajo(Trabajo t) {
        return congreso.listaDeEvaluadoresAptosPorTrabajo(t);
    }

    // lista de trabajos para un determinado evaluador
    public ArrayList<Trabajo> listaDetrabajosAptosParaUnEvaluador(Evaluador evaluador) {
        return congreso.listaDeTrabajosAptosPorEvaluador(evaluador);
    }

    // 3) cuántos trabajos tiene un evaluador determinado
    public int cantidadDeTrabajosAptosPorEvaluador(Evaluador e) {
        return congreso.cantidadDeTrabajosPorEvaluador(e);
    }

    public void agregarTrabajo(Trabajo t) {
        congreso.agregarTrabajo(t);
    }

    public void agregarEvaluador(Evaluador e) {
        congreso.agregarEvaluador(e);
    }

    public void agregarTemasEspecificos(String nuevoTema) {
        congreso.agregarTemaEspecifico(nuevoTema);
    }

    public boolean tipoDeEvaluador(Evaluador e) {
        return congreso.tipoDeEvaluador(e);
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Evaluador e1 = new Evaluador("Juan");
        e1.agregarPalabrasClave(new ArrayList<String>(Arrays.asList("a", "b")));
        Evaluador e2 = new Evaluador("Pedro");
        e2.agregarPalabrasClave(new ArrayList<String>(Arrays.asList("a", "b", "c")));
        Trabajo t1 = new Trabajo("trabajo t1");
        t1.agregarPalabrasClave(new ArrayList<String>(Arrays.asList("a", "b")));
        Trabajo t2 = new Trabajo("trabajo t2");
        t2.agregarPalabrasClave(new ArrayList<String>(Arrays.asList("a", "b", "c")));

        Trabajo t3 = new TrabajoPoster("Trabajo poster");
        t3.agregarPalabrasClave(new ArrayList<String>(Arrays.asList("a")));

        // Temas conocidos por el evaluadador
        e1.agregarTemaConocido("agentes");

        sistema.agregarEvaluador(e1);
        sistema.agregarEvaluador(e2);
        sistema.agregarTrabajo(t1);
        sistema.agregarTrabajo(t2);
        sistema.agregarTrabajo(t3);

        // Temas especificos
        sistema.agregarTemasEspecificos("agentes");
        sistema.agregarTemasEspecificos("visualizacion");

        // Lista de evaluadores aptos para un determinado trabajo
        System.out.println(sistema.listaDeEvaluadoresAptosSegunTrabajo(t1));

        // qué trabajos pueden asignarse un evaluador particular
        System.out.println(sistema.listaDetrabajosAptosParaUnEvaluador(e1));

        // 3) cuántos trabajos tiene un evaluador determinado
        System.out.println(sistema.cantidadDeTrabajosAptosPorEvaluador(e1));

        // 4 tipo de evaluador

        if (sistema.tipoDeEvaluador(e1))
            System.out.println("Evaluador experto");
        else
            System.out.println("Evaluador general");
    }

}
