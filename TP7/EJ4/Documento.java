import java.util.ArrayList;

/*
Un historiador desea digitalizar sus documentos y organizarlo de acuerdo a palabras clave.
Un documento tiene un título, una lista de autores, un contenido textual y una lista de
palabras clave. El historiador necesita poder encontrar fácilmente documentos en su
colección de acuerdo a diferentes criterios, por ejemplo:
a)
b)
c)
d)
e)
f)
g)
h)
Todos los documentos cuyo título sea exactamente igual a un título dado.
Todos los documentos cuyo título contenga una palabra o frase dada.
Todos los documentos que contengan una palabra clave dada.
Todos los documentos que no contengan ninguna palabra clave.
Todos los documentos de un autor determinado.
Todos los documentos cuyo contenido tenga una palabra o frase dada.
Todos los documentos cuyo contenido tenga al menos 20 palabras.
Cualquier combinación lógica de las formas anteriores.

*/
public class Documento {

    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> palabrasClaves;


    public Documento(String titulo){
        this.titulo= titulo;
        this.autores = new ArrayList<>();     
        this.palabrasClaves = new ArrayList<>();
    }

    

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutores() {
        return this.autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String> (this.palabrasClaves);
    }

    public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public String toString(){
        return "Titulo: " + this.getTitulo() + " Autor: " + this.getAutores() + " Contenido " + this.getContenido();
    }
    
}
