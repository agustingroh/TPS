import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

/*Diccionario
Un diccionario almacena una lista de palabras, ordenadas alfabéticamente. Cada palabra del
diccionario posee la función gramatical que cumple la palabra (sustantivo, adverbio, adjetivo,
etc), una o más definiciones, una lista de sinónimos y una lista de antónimos.
Implementar en Java una solución que permita:
● Agregar, modificar y eliminar palabras del diccionario.
● Dada una palabra, obtener la lista de sinónimos, ordenada ascendentemente
● Dada una palabra, obtener la lista de antónimos, ordenada ascendentemente
● Dada una palabra, obtener la lista de definiciones
● Dadas dos palabras, obtener la lista de palabras comprendidas entre ellas, en orden
alfabético.
*/

public class Diccionario {

    private List<Palabra>palabras;

    public Diccionario(){
        this.palabras=new ArrayList<Palabra>();
    }

    public void agregarPalabra(Palabra p){
        if(!palabras.contains(p))
            palabras.add(p);
    }

    public int cantidadDePalabras(){
        return this.palabras.size();
    }

    public void eliminarPalabra(CriterioEliminar c){
        for(int i=0; i<cantidadDePalabras();i++){
            if (c.eliminar(this.palabras.get(i))==0){
                palabras.remove(i);
            }
        }
    }

    public void imprimirPalabras(){
        for (Palabra palabra : palabras) {
            System.out.println(palabra);
        }
    }

publ


    public static void main(String[] args) {
        
        Diccionario d = new Diccionario();
        Palabra hola = new Palabra("hola"); 
        Palabra chau = new Palabra("chau");

        d.agregarPalabra(hola);
        d.agregarPalabra(chau);

        d.imprimirPalabras();

        d.eliminarPalabra(new EliminarPalabraNombre("hola"));

        System.out.println("Elimino palabra por nombre");
        d.imprimirPalabras();
            
        
    }
    
}
