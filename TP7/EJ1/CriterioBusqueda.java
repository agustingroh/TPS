import java.util.ArrayList;

public abstract class CriterioBusqueda {
    
    private String palabra;


    public CriterioBusqueda(String palabra){
        this.palabra=palabra;
       
    }

    public abstract ArrayList<String> obtenerLista (Palabra p);

    

    public ArrayList<String> obtener(Diccionario c){
        for (Palabra palabra : c.listaDePalabras()) { // hasta aca recorro la lista de palabras del diccionario
            if(this.palabra.equals(palabra.getPalabra())){
                ArrayList<String> elementos =  this.obtenerLista(palabra);
                return elementos;
            }
        }
        return null;          
    }
}
