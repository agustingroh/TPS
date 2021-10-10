public class FilterGetContent extends FilterSplitWord {

    

        public FilterGetContent(String word){
            super(word);
        }
       
    
        public  String getList(Documento d){
            return d.getContenido();
        }
        
    }
    

