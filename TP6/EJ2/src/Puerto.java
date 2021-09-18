


public class Puerto {

   private PuertoDeCarga puertoDeCarga; 

   public Puerto(){
       this.puertoDeCarga = new PuertoDeCarga();
   }

    public void agregarCamion(Transporte t){
      
        puertoDeCarga.agregarCamion(t);
    }

    public void agregarBarco(Transporte t){
      
        puertoDeCarga.agregarBarco(t);
    }

    public void setPrioridadSegunTransporte(PrioridadCarga p){
        this.puertoDeCarga.setPrioridadDeCarga(p);
    }

    public void imprimirListaDeCamiones(){
        puertoDeCarga.imprimirListaDeCamiones();
    }

    public void imprimirListaDeBarcos(){
        puertoDeCarga.imprimirListaDeBarcos();
    }

    public void cargarBarcos(){

        int cantidadDeCamiones = puertoDeCarga.cantidadDeCamiones();
        int cantidadDeBarcos = puertoDeCarga.cantidadDeBarcos();
        while( cantidadDeBarcos > 0 || cantidadDeCamiones>0){
        
        
           // puertoDeCarga.cargarBarco();    
            puertoDeCarga.descargarCamion(); 
            puertoDeCarga.cargarBarco();

            cantidadDeBarcos--;
           cantidadDeCamiones--; 
           if(cantidadDeBarcos==0 || cantidadDeCamiones==0){
            break;
           } 
          
        }
      
    }
   
}
