package parte1;

public abstract class ListaSegunRequerimiento {

    public  ArrayList<String> obtenerLista(Coach c){

        ArrayList <String> lista = new ArrayList<String>();
            for (Participante participante: c.participantes ){
                ArrayList<String> listaParticipante = this.getLista(participante);

                for (int i =0; i<listaParticipante.size(); i++){
                    if (!lista.contains(listaParticipante.get(i))){
                        lista.add(listaParticipante.get(i));
                    }
                }
            }

        Collections.sort(lista);   //ordena todas las listas, aunque en instrumento e idioma no lo pide. //podria ser con comparator

        return lista;
    
    }

    public abstract ArrayList<String> getLista(Participante p);



}
