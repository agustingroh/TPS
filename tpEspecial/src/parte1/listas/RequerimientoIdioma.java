package parte1.listas;

import java.util.ArrayList;

import parte1.Participante;

public class RequerimientoIdioma extends ListaSegunRequerimiento{

    @Override
	public  ArrayList<String> getLista(Participante p){
    
        return p.getIdiomas();
    }

    @Override
    public ArrayList<String> ordenarLista(){
        return super.getListaElementos();
    }
}