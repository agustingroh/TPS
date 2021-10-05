package parte1;

public class CriterioInstrumento extends CriterioBusqueda{

    public  ArrayList<String> obtenerLista(Coach c){

        List<String> lista = new ArrayList<String>;

        for (Participante participante : c.participantes){
			int cantidad =	participante.obtenerCantidadInstrumentos();
            
			for (int i =0; i<cantidad ; i++){
				String elemento = participante.getInstrumento(i);
				if(!lista.contains(elemento))
				lista.add(elemento);
			}
		
		}
		return lista;
    }


}