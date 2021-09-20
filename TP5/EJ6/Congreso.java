
import java.util.ArrayList;

public class Congreso {

    private ArrayList<String> temasEspecificos;
    private ArrayList<Trabajo> trabajos;
    private ArrayList<Evaluador> evaluadores;

    public Congreso(){
        this.temasEspecificos = new ArrayList<String>();
        this.trabajos = new ArrayList<Trabajo>();
        this.evaluadores = new ArrayList<Evaluador>();
    }
    
    public void agregarTrabajo(Trabajo t){   
        this.trabajos.add(t);
    }

    public void agregarEvaluador(Evaluador e){   
        this.evaluadores.add(e);
    }
    
    public void agregarTemaEspecifico(String nuevoTema){
        if(!this.temasEspecificos.contains(nuevoTema))
        this.temasEspecificos.add(nuevoTema);
    }


    public boolean tipoDeEvaluador(Evaluador e){
       for (String tema : this.temasEspecificos) {
           if(e.poseeConocimiento(tema)) return true;
       }
       return false;
    }


    //  qué evaluador puede asignarse a un determinado trabajo,
    public ArrayList <Evaluador> listaDeEvaluadoresAptosPorTrabajo(Trabajo t){
        ArrayList<Evaluador> evaluadoresAptos = new ArrayList<Evaluador>();
        for (Evaluador  evaluador : this.evaluadores) {
           if(t.esUnEvaluadorApto(evaluador)) evaluadoresAptos.add(evaluador);
        }
        return evaluadoresAptos;
    }

// qué trabajos pueden asignarse un evaluador particular
    public ArrayList <Trabajo> listaDeTrabajosAptosPorEvaluador(Evaluador e){
        ArrayList<Trabajo> trabajosAptosEvaluador = new ArrayList<Trabajo>();
        for (Trabajo  trabajo : this.trabajos) {
           if(trabajo.esUnEvaluadorApto(e)) trabajosAptosEvaluador.add(trabajo);
        }
        return trabajosAptosEvaluador;
    }

    // qué trabajos pueden asignarse un evaluador particular
    public int cantidadDeTrabajosPorEvaluador(Evaluador e){
       int trabajosAptos =0;
        for (Trabajo  trabajo : this.trabajos) {
           if(trabajo.esUnEvaluadorApto(e)) trabajosAptos++;
        }
        return trabajosAptos;
    }


 
    

} 
