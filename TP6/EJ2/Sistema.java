public class Sistema {

    private CentroDeComputo centroDeComputo;

    public Sistema(){
        this.centroDeComputo = new CentroDeComputo();
    }


    public void agregarProceso(Proceso p){
        this.centroDeComputo.agregarProceso(p, new RequerimientoProceso());
    }

    public void agregarComputadora(Computadora c){
        this.centroDeComputo.agregarComputadora(c,new RequerimientoComputadora());
    }

    public void getListaDeProcesos(){
        centroDeComputo.getListaDeProcesos();
    }

    public void getListaDeComputadoras(){
        centroDeComputo.getListaDeComputadoras();
    }

    public static void main(String[] args) {
        Sistema s1 = new Sistema();
        Proceso pp1 = new Proceso(3);
        Proceso pp2 = new Proceso(5);

        Computadora cc1 = new Computadora(3);
        Computadora cc2 = new Computadora(10);
        Computadora cc3 = new Computadora(26);

        s1.agregarComputadora(cc1);
        s1.agregarComputadora(cc2);
        s1.agregarComputadora(cc3);

        s1.agregarProceso(pp1);
        s1.agregarProceso(pp2);

        s1.getListaDeComputadoras();
        s1.getListaDeProcesos();
        
    }
}
