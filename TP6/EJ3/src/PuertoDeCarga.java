
import java.util.ArrayList;

public class PuertoDeCarga {

    PrioridadCarga prioridadCamion;
    PrioridadCarga prioridadBarco;

    private ArrayList<Transporte> barcos;
    private ArrayList<Transporte> camiones;

    public PuertoDeCarga() {
        this.barcos = new ArrayList<Transporte>();
        this.camiones = new ArrayList<Transporte>();
    }


// como hago para tener un solo metodo de carga? es posible?

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

    public Transporte getBarco() {
        Transporte barco = null;
        System.out.println(barcos.size());
        if (barcos.size() > 0) {
            barco = barcos.get(0);
        }
        return barco;
    }

    public Transporte getCamion() {
        Transporte camion = null;
        if (camiones.size() > 0) {
            camion = camiones.get(0);
        }
        return camion;
    }

    public void cargarBarco() {
        if (barcos.size() > 0)
            barcos.remove(0);
    }

    public void descargarCamion() { 
       if (this.cantidadDeCamiones()>0)      
            this.camiones.remove(0);
    }

    public int cantidadDeCamiones(){
        System.out.println(this.camiones.size());
        return this.camiones.size();
    }

    public int cantidadDeBarcos(){ 
        return this.barcos.size();
    }

}
