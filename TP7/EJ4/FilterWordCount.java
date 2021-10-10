public class FilterWordCount  extends Filter{

    private int wordCounter;

    public FilterWordCount(int count){
        this.wordCounter=count;
    }

    public boolean valid(Documento d){
        String content = d.getContenido();
        String[] palabras = content.split(" ");
        if(palabras.length>=wordCounter) return true;

        return false;

    }
    
}
