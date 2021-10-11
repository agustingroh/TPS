public class SortNivelAgua extends Sort{
    

    public int ordernar(Planta planta1, Planta planta2){
        return planta1.getRiego()-planta2.getRiego();
    }
}
