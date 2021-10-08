package analizer.Criteria;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
Se desean llevar las estadísticas del vocabulario de un texto. El constructor de esta clase
recibe como parámetro un String y crea los objetos necesarios para saber qué palabras
aparecen en el mismo y cuántas veces. Se debe permitir:
1. [lista] Conocer la cantidad de palabras diferentes que contiene el texto.
4. [double] Obtener la frecuencia de ocurrencia de una palabra.

Nota: para separar las palabras del string recibido como parámetro del constructor, se puede
utilizar el método “split” de la clase String, que recibe como parámetro una expresión regular
por la que dividir el string y retorna un arreglo con las paradas separadas por dicha expresión
String[] arreloDeStrings = texto.split(" ");

DEFINICION: Una lista de frecuencia de palabras consiste básicamente en una lista
ordenada de acuerdo con la frecuencia de ocurrencia de las palabras, 
o sobre la base de cualquier otro principio.
*/

/*
COMPARTEN EL FILTRO PERO CAMBIA SU FORMA DE ORDENARSE.

ACA SOLAMENTE ORDENO
5. [lista] Obtener un listado de palabras ordenadas ascendentemente.
6. [lista] Obtener un listado de palabras ordenadas por frecuencia.

// DE LAS PALABRAS QUE TENGO SIN REPETIR , DEVUELVO LA CANTIDAD QUE ME PIDEN
2. [lista] Retornar las N palabras más frecuentes.
3. [lista] Retornar las N palabras menos frecuentes.
*/

this.palabras = [ "p": 2, "hola":6, "chau":3];
5 -> [chau, hola, p]
6 -> [hola, chau, p]  Las mas frecuentes
     [p, chau, hola]  Las menos frecuentes


public class Analizer {
    
    private String txt;
    private ArrayList<Palabra> palabras;
    private int totalWords;

    public Analizer(String txt) {
        this.txt = txt;
        this.palabras = new ArrayList<>();
        String[] txtSplitted = txt.split(" ");
        // this.totalWords = txtSplitted.size();
        ArrayList<String> listaWords = new ArrayList<String>(Arrays.asList(txtSplitted));

        
        System.out.println(txtSplitted);
        System.out.println(listaWords);
        
        for(String word : listaWords)
            this.palabras.add(new Palabra(word));

        this.totalWords = this.palabras.size();        
    }


    public Analizer(String txt, Criteria c){
       this(txt);
       c.get(new ArrayList<Palabra>(this.palabras));

    }

    public ArrayList<Palabra> get(Criteria c) {
        return c.get(new ArrayList<Palabra>(this.palabras));
    }

    public ArrayList<Palabra> get(Criteria c, Sort s) {
        ArrayList<Palabra> l = this.get(c);
        Collections.sort(l,s);
        return l;
    }



    public static void main(String[] args) {
        
        Analizer analizer = new Analizer("My text text probando 1");
    

        ArrayList<Palabra> listaDeFrecuencia = analizer.get(new Frecuency(10),new SortAlphAsc());
        System.out.println(listaDeFrecuencia);
        // Collections.sort(listaDeFrecuencia,new SortAlphAsc());
        // System.out.println(listaDeFrecuencia);

        // System.out.println( analizer.get(new DifferentWords()).size());
        // System.out.println( analizer.get(new MostFrecuenly(10)));
        // System.out.println( analizer.get(new LessFrecuenly(10)));
        
        // System.out.println( analizer.get(new AllWords(), new Ascendent()));
        // System.out.println( analizer.get(new AllWords(), new Descendent()));

    }
}
