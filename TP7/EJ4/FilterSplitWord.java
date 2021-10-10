public abstract class FilterSplitWord extends Filter{

    private String word;

    public FilterSplitWord(String word){
        this.word= word;
    }
        
    public boolean valid(Documento c){
        String element = this.getList(c);      
        String[] palabras = element.split(" ");   
        for(int i=0; i< palabras.length; i++){
            if(palabras[i].equals(word)) return true;
        }

        return false;      
    }

    public abstract String getList(Documento c);

}
