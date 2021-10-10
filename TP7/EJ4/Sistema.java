import java.util.ArrayList;

public class Sistema {

    ArrayList<Documento> documentos;

    public Sistema(){
        this.documentos =  new ArrayList<>();
    }



    public ArrayList<Documento> obtenerDocumentos(Filter f){
        ArrayList<Documento> docs = new ArrayList<>();
        for (Documento documento : this.documentos) {
            if(f.valid(documento))
                docs.add(documento);
        }
        return docs;
    }

    public void agregarDocumento(Documento d){
        this.documentos.add(d);
    }


    public static void main(String[] args) {
        Sistema s = new Sistema();
        Documento d1= new Documento("Test 1");
        d1.setContenido("Esto es el contenido del Test 1");

        Documento d2= new Documento("Test 2");
        d2.setContenido("Esto es el contenido del test 2 , prueba de cantidad de palabras");

        s.agregarDocumento(d1);
        s.agregarDocumento(d2);


        // Obtener los documentos cuyos titulos al menos tengan una palabra
       System.out.println(s.obtenerDocumentos(new FilterGetTitle("Test")));
        
        // Filtrado por titulo
       System.out.println(s.obtenerDocumentos(new FilterTitle("Test 1")));

        // Documentos cuyo contenido al menos tengo una palabra clave
       System.out.println(s.obtenerDocumentos(new FilterGetContent("contenido")));


       // Documentos cuyo contenido tengan una minima cantidad de palabras
       System.out.println("MINIMO DE PALABRAS");
       System.out.println(s.obtenerDocumentos(new FilterWordCount(8)));
    }
    
}
