public class SortAlbetico extends Sort {
    

    public int ordernar(Planta planta1, Planta planta2){
        return planta1.getNombreCientifico().compareTo(planta2.getNombreCientifico());
    }
}
