public class FilterTitle extends Filter{

    private String title;

    public FilterTitle(String title){
        this.title=title;
    }
    
    public boolean valid(Documento c){

        return c.getTitulo().equals(this.title);
    }
}
