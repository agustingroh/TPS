package parte1.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import parte1.*;

public abstract class ListaSegunRequerimiento {

    private ArrayList<String> listaElementos;

    public ListaSegunRequerimiento(){
        this.listaElementos = new ArrayList<>();
    }

    public abstract ArrayList<String> getLista(Participante p);

    public abstract ArrayList<String> ordenarLista();

    public ArrayList<String> obtenerLista(Coach c) {

        for (Participante participante : c.getParticipantes()) {
            List<String> listaParticipante = this.getLista(participante);
            for (int i = 0; i < listaParticipante.size(); i++) {
                if (!this.listaElementos.contains(listaParticipante.get(i))) {
                    this.listaElementos.add(listaParticipante.get(i));
                }
            }
        } 
        return this.ordenarLista();
    }

   

    public ArrayList<String> getListaElementos(){
        return new ArrayList<String>(this.listaElementos);
    }
  
}
