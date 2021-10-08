public class EliminarPalabraNombre extends CriterioEliminar {

    private String palabraEliminar;

    public EliminarPalabraNombre(String palabra){
        this.palabraEliminar=palabra;
    }
    
    public int eliminar(Palabra p){
        return p.getPalabra().compareTo(palabraEliminar);
    }


}
