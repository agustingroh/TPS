import java.util.ArrayList;

public class FilterNombreVulgar {
    private String nombreVulgar;

    public FilterNombreVulgar(String nombreVulgar){
        this.nombreVulgar=nombreVulgar;
    }

    public boolean cumple(Planta p){        
       return p.contieneNombreVulgar(this.nombreVulgar);
    }

}
