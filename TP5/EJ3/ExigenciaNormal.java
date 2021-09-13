public class ExigenciaNormal extends Exigencia {

    public boolean exigencia(Lote l, Cereal c) {
        // la lista de minerales en cereal esta como protected , eso esta bien?
        for (Mineral m : l.minerales) {
            if (!c.contieneMinerales(m))
                return false;
        }
        return true;
    }

}
