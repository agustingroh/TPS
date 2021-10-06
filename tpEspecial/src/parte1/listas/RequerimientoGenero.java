package parte1.listas;

import java.util.ArrayList;

import parte1.Participante;


public class RequerimientoGenero extends ListaSegunRequerimiento{

      @Override
	public  ArrayList<String> getLista(Participante p){
    
        return p.getIdiomas();
    }


}