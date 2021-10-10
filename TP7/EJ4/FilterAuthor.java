
import java.util.ArrayList;


public class FilterAuthor extends Filter{

    private String author;


    public FilterAuthor(String author){
        this.author=author;        
    }


    public boolean valid(Documento c){
        ArrayList<String> authors  = c.getAutores();

        for (String author : authors) {
            if(author.equals(this.author)) return true;
        }
        return false;
    }
    
}
