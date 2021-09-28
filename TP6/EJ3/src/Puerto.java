


public class Puerto {


   PrioridadCarga camiones;
   PrioridadCarga barcos;


   public Puerto(){
  
       this.barcos = new PrioridadCarga();
       this.camiones = new PrioridadCarga();
   }

    public void agregarCamion(Transporte camion){
      
        camiones.agregar(camion);
    }

    public void agregarBarco(Transporte barco){
      
       barcos.agregar(barco);
    }

  
    public void imprimirListaDeCamiones(){
        camiones.imprimirLista();
    }

    public void imprimirListaDeBarcos(){
        barcos.imprimirLista();
    }

    // public void cargarBarcos(){

    //     int cantidadDeCamiones = puertoDeCarga.cantidadDeCamiones();
    //     int cantidadDeBarcos = puertoDeCarga.cantidadDeBarcos();
    //     while( cantidadDeBarcos > 0 || cantidadDeCamiones>0){
        
        
    //        // puertoDeCarga.cargarBarco();    
    //         puertoDeCarga.descargarCamion(); 
    //         puertoDeCarga.cargarBarco();

    //         cantidadDeBarcos--;
    //        cantidadDeCamiones--; 
    //        if(cantidadDeBarcos==0 || cantidadDeCamiones==0){
    //         break;
    //        } 
          
    //     }
      
   // }
   
}
