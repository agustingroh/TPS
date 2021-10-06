package parte1;

public class RequerimientoIdioma extends ListaSegunRequerimiento{

    @Override
	public  ArrayList<String> getLista(Participante p){
    
        return p.getIdiomas();
    }

}