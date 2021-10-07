package parte1.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import parte1.Participante;


public class RequerimientoGenero extends ListaSegunRequerimiento{

      @Override
	public  ArrayList<String> getLista(Participante p){
    
        return p.getGeneros();
    }

    public ArrayList<String> ordenarLista(){     
      ArrayList <String> aux =  super.getListaElementos();
        Collections.sort(aux);
        return aux;
      
    }


}