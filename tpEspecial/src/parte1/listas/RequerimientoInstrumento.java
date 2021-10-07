package parte1.listas;

import java.util.ArrayList;
import java.util.List;

import parte1.Participante;

public class RequerimientoInstrumento extends ListaSegunRequerimiento{


	@Override
	public ArrayList<String> getLista(Participante p) {
		return p.getInstrumentos();
	}

	@Override
	public ArrayList<String> ordenarLista(){
        return super.getListaElementos();
    }


}