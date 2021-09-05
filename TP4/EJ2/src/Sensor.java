public class Sensor {
    static int sensor;
    private int id;
    private String nombre;
    private boolean activado;

    public Sensor(String nombre){
        this.nombre=nombre;
        this.id=Sensor.sensor;   
        Sensor.sensor=Sensor.sensor+1; 
    }

    public String getNombre() {                
        return this.nombre;
    }

    public boolean isActivado() {
        return this.activado;
    }

    public void desactivar() {
        this.activado = false;
    }

    public void activar() {
        this.activado = true;
    }

    public int obtenerId(){
        return this.id;
    }

    
}
