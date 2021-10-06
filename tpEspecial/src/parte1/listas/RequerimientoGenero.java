package parte1;

public class RequerimientoGenero extends ListaSegunRequerimiento{

      @Override
	public  ArrayList<String> getLista(Participante p){
    
        return p.getIdiomas();
    }


}