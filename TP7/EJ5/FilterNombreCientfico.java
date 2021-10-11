public class FilterNombreCientfico extends Filter {
    
    private String nombreCientifico;

    public FilterNombreCientfico(String nombreCientifico){
        this.nombreCientifico=nombreCientifico;
    }

    public boolean cumple(Planta p){    
        return p.getNombreCientifico().equals(this.nombreCientifico);
        
    }

}
