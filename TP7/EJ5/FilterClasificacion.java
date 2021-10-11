public class FilterClasificacion {
    

    private String clasificacion;

    public FilterClasificacion(String clasificacion){
        this.clasificacion=clasificacion;
    }

    public boolean cumple(Planta p){    
        return p.getClasificacionSuperior().equals(this.clasificacion);
        
    }

}
