


public class Puerto {

   private PuertoDeCarga puertoDeCarga; 

   

    public void agregarCamion(Transporte t){
      
        puertoDeCarga.agregarCamion(t);
    }

    public void agregarBarco(Transporte t){
      
        puertoDeCarga.agregarBarco(t);
    }

    public void setPrioridadSegunTransporte(PuertoDeCarga p){
        this.puertoDeCarga=p;
    }

    public void imprimirListaDeCamiones(){
        puertoDeCarga.imprimirListaDeCamiones();
    }

    public void imprimirListaDeBarcos(){
        puertoDeCarga.imprimirListaDeBarcos();
    }
   
}
