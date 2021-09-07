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

*/

public class Alarma {

    private boolean seRompioVidrio;
    private boolean seAbrioPuerta;
    private boolean seAbrioVentana;
    private boolean seDetectoMovimiento;
    private Timbre timbre;
    private boolean activada;
    private String nombre;

    public Alarma() {
        this.seRompioVidrio = false;
        this.seAbrioPuerta = false;
        this.seAbrioVentana = false;
        this.seDetectoMovimiento = false;
        this.activada = false;
        this.timbre = new Timbre();
        this.nombre = "X-28";
    }

    public String  getNombre(){
        return this.nombre;
    }

    private void setearSensores() {
        this.setSeAbrioPuerta(false);
        this.setSeAbrioVentana(false);
        this.setSeDetectoMovimiento(false);
        this.setSeRompioVidrio(false);
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
        if(this.activada){
            if (this.getSeAbrioPuerta() || this.getSeAbrioVentana() || this.getSeDetectoMovimiento()
                || this.getSeRompioVidrio()){
                    return true;
                }
        }    
        return false;           
    }

    public void comprobar() {
        if (this.estado()) {
            timbre.hacerSonar();
        } else {
            timbre.silenciar();
        }
    }

    public boolean estaSonando() {
        return this.timbre.getSonar();
    }

    public boolean isSeRompioVindrio() {
        return this.seRompioVidrio;
    }

    public boolean getSeRompioVidrio() {
        return this.seRompioVidrio;
    }

    public void setSeRompioVidrio(boolean seRompioVidrio) {
        this.seRompioVidrio = seRompioVidrio;
    }

    public boolean isSeAbrioPuerta() {
        return this.seAbrioPuerta;
    }

    public boolean getSeAbrioPuerta() {
        return this.seAbrioPuerta;
    }

    public void setSeAbrioPuerta(boolean seAbrioPuerta) {
        this.seAbrioPuerta = seAbrioPuerta;
    }

    public boolean isSeAbrioVentana() {
        return this.seAbrioVentana;
    }

    public boolean getSeAbrioVentana() {
        return this.seAbrioVentana;
    }

    public void setSeAbrioVentana(boolean seAbrioVentana) {
        this.seAbrioVentana = seAbrioVentana;
    }

    public boolean isSeDetectoMovimiento() {
        return this.seDetectoMovimiento;
    }

    public boolean getSeDetectoMovimiento() {
        return this.seDetectoMovimiento;
    }

    public void setSeDetectoMovimiento(boolean seDetectoMovimiento) {
        this.seDetectoMovimiento = seDetectoMovimiento;
    }

    public static void obtenerEstadoGeneral(Alarma alarma) {

        // Ejemplo de binding dinamico
        alarma.comprobar();

        if (alarma.activada())
            System.out.println("Estado de la alarma: activada");
        else
            System.out.println("Estado de la alarma: desactivada");

        System.out.println("La alarma esta sonando: " + alarma.estaSonando());

    }


    public String toString() {
        return "El nombre de la alarma es: " + this.getNombre();
    }

    public static void main(String[] args) {
        Alarma alarma1 = new Alarma();
        Alarma alarma2 = new Alarma();

        System.out.println(alarma1);
        System.out.println(alarma2);

        alarma1.activar();
        Alarma.obtenerEstadoGeneral(alarma1);
        alarma1.desactivar();
        alarma1.setSeAbrioPuerta(true);

        Alarma.obtenerEstadoGeneral(alarma1);

        // alarma1.desactivar();
        // Alarma.obtenerEstadoGeneral(alarma1);

        System.out.println("***********************Alarma luminosa**********************");

        AlarmaLuminosa alarmaLuminosa1 = new AlarmaLuminosa();

        Alarma.obtenerEstadoGeneral(alarmaLuminosa1);
        alarmaLuminosa1.activar();

        alarmaLuminosa1.setSeAbrioVentana(true);

        AlarmaLuminosa.obtenerEstadoGeneral(alarmaLuminosa1);

        // Desactivo la alarma pero rompieron una ventana
        alarmaLuminosa1.desactivar();        

        alarmaLuminosa1.setSeAbrioVentana(true);

        AlarmaLuminosa.obtenerEstadoGeneral(alarmaLuminosa1);
    }
}
