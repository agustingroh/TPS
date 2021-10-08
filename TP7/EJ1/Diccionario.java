
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Ordenamiento.*;

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
              palabras.add(p);
              Collections.sort(palabras);
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

    public ArrayList<Palabra> listaDePalabras(){
        return new ArrayList<Palabra>(this.palabras);
    }

    //Dada una palabra, obtener la lista de sinónimos, ordenada ascendentemente
    // Dada una palabra, obtener la lista de antónimos, ordenada ascendentemente

    public ArrayList<String> obtenerLista(CriterioBusqueda c, Ordenamiento o){
        ArrayList<String> l = c.obtener(this);  
        o.ordenar(l);
      
        return l;
    }

    public void imprimirPalabras(){
        for (Palabra palabra : palabras) {
            System.out.println(palabra);
        }
    }




    public static void main(String[] args) {
        
        Diccionario diccionario = new Diccionario();
        Palabra pp1 = new Palabra("abundante"); 
        Palabra pp2 = new Palabra("test");
        pp1.AddSinonimo("mucho");
        pp1.AddSinonimo("excesivo");

        diccionario.agregarPalabra(pp1);
        diccionario.agregarPalabra(pp2);

        System.out.println(diccionario.obtenerLista(new Sinonimo("abundante"),new Descendente()));

        diccionario.imprimirPalabras();

        diccionario.eliminarPalabra(new EliminarPalabraNombre("abundante"));

        System.out.println("Elimino palabra por nombre");
        diccionario.imprimirPalabras();
            
        
    }
    

}

