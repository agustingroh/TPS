import java.util.ArrayList;
import java.util.*;
/*
1 - Alarma
Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
sonora.

* Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
encienda una luz cuando alguno de los indicadores está activado.

* Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
método encender().


PARTE 2
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se cambien
por sensores que poseen un comportamiento y pueden sondear diferentes partes de la casa.
Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen nuevos
sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por pantalla
el nombre de la zona en conflicto (pueden ser más de una).

*/

public class Alarma {

    private List<Sensor> sensores;
    private Timbre timbre;
    private boolean activada;
    private String nombre;

    public Alarma() {
        this.activada = false;
        this.timbre = new Timbre();
        this.nombre = "X-28";
        this.sensores = new ArrayList<Sensor>();
    }

    

    public void activarSensor(int id){
        for (Sensor sensor : sensores) {
            if(sensor.obtenerId()==id)
            sensor.activar();;
        }
    }
   

    private void desactivarSensores(){
        for (Sensor sensor : sensores) {
            sensor.desactivar();
        }
    }

    public boolean sensorActivado() {
        for (Sensor sensor : sensores) {
            if (sensor.isActivado()) {
                return true;
            }
        }
        return false;
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setearSensores() {
        this.desactivarSensores();
        this.timbre.silenciar();
    }

    public void activar() {
        this.setearSensores();
        this.activada = true;
    }

    public void desactivar() {
        this.setearSensores();
        this.activada = false;
    }

    public boolean activada() {
        return this.activada;
    }

    protected boolean estado() {
        if (this.activada) {
            if (this.sensorActivado()) {           
                return true;
            }
        }
        return false;
    }

    // TO DO devolver una lista de sensores
    public void obtenerNombreDelSensorActivado(){
        for (Sensor sensor : sensores) {
            if (sensor.isActivado()) {
               System.out.println("Sensor activado: " + sensor.getNombre() + " ID:" + sensor.obtenerId());  
            }
        }   
    }

    public void comprobar() {
        if (this.estado()) {
            timbre.hacerSonar();
            this.obtenerNombreDelSensorActivado();
        } else {
            timbre.silenciar();
        }
    }

    public boolean estaSonando() {
        return this.timbre.getSonar();
    }



    public void listaDeSensores(){
        for (Sensor sensor : sensores) {
            System.out.println("Zona:" + sensor.getNombre() + " ID: " + sensor.obtenerId());
        }
        System.out.print("\n");
    }

    public void obtenerEstadoGeneral() {
        
        System.out.println("ESTADO DE LA GENERAL DE LA ALARMA");
        this.comprobar();       
        if (this.activada())
            System.out.println("Estado de la alarma: activada");
        else
            System.out.println("Estado de la alarma: desactivada");

        System.out.println("La alarma esta sonando: " + this.estaSonando());

    }




    public String toString() {
        return "El nombre de la alarma es: " + this.getNombre();
    }

    public static void main(String[] args) {
        Alarma alarma1 = new Alarma();
   

        alarma1.agregarSensor(new Sensor("Puerta de ingreso"));
        alarma1.agregarSensor(new Sensor("ventana pasillo"));   
        alarma1.agregarSensor(new Sensor("Quincho"));

        alarma1.listaDeSensores();
    

         alarma1.activar();

         // Abrieron la puerta de ingreso
         alarma1.activarSensor(0);
         alarma1.activarSensor(1);

         alarma1.obtenerEstadoGeneral();

          alarma1.desactivar();
          alarma1.activarSensor(0);
          alarma1.obtenerEstadoGeneral();



        System.out.println("***********************Alarma luminosa**********************");

        // AlarmaLuminosa alarmaLuminosa1 = new AlarmaLuminosa();

        // AlarmaLuminosa.obtenerEstadoGeneral(alarmaLuminosa1);
        // alarmaLuminosa1.activar();

      

        // AlarmaLuminosa.obtenerEstadoGeneral(alarmaLuminosa1);

        // // Desactivo la alarma pero rompieron una ventana
        // alarmaLuminosa1.desactivar();

       

        // AlarmaLuminosa.obtenerEstadoGeneral(alarmaLuminosa1);
    }
}
