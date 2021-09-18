
import java.util.ArrayList;

public abstract class PuertoDeCarga {


    private ArrayList<Transporte> barcos;
    private ArrayList<Transporte> camiones;

    public PuertoDeCarga() {
        this.barcos = new ArrayList<Transporte>();
        this.camiones = new ArrayList<Transporte>();
        
    }

  

    public abstract boolean prioridadTransporte(Transporte t1, Transporte t2);




    public void agregarCamion(Transporte c) {
        boolean encontro = false;
        
     
        for(int i=0; i<this.camiones.size(); i++){       
            if(this.prioridadTransporte(c, camiones.get(i))){
                this.camiones.add(i,c);
                encontro=true;
             }           
          }

        if(!encontro)
        this.camiones.add(c);

}


public void agregarBarco(Transporte b) {
    boolean encontro = false;
    
 
    for(int i=0; i<this.barcos.size(); i++){       
        if(this.prioridadTransporte(b, barcos.get(i))){
            this.barcos.add(i,b);
            encontro=true;
         }           
      }

    if(!encontro)
    this.barcos.add(b);

}


    public void imprimirListaDeCamiones() {
        for (Transporte camion : camiones) {
            System.out.println(camion);
        }
    }

    public void imprimirListaDeBarcos() {
        for (Transporte barco : barcos) {
            System.out.println(barco);
        }
    }

}
