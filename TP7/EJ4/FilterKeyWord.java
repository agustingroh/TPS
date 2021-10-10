
import java.util.ArrayList;

public class FilterKeyWord extends Filter {

    private String keyWord;

    public FilterKeyWord(String keyWord){
        this.keyWord = keyWord;
    }
    

    public  boolean valid(Documento c){
        ArrayList<String> palabrasClave = c.getPalabrasClaves();

        for (String palabra: palabrasClave) {
            if(palabra.equals(palabra)) return true;
            
        }
        return false;
    }
    

}
