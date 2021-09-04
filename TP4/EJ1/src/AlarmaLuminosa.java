public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa() {
        luz = new Luz();
    }

    public void comprobar() {
        super.comprobar();
        if (super.estado()) {
            luz.encender();
        } else {
            luz.apagar();
        }
    }

    public boolean luzEncendida(){
        return luz.estado();
    }

    public static void obtenerEstadoGeneral(AlarmaLuminosa alarma){ 
        Alarma.obtenerEstadoGeneral(alarma);      
        System.out.println("La luz esta encendida: " + alarma.luzEncendida());      
    }

    public static void main(String[] args) {
        
    }
}
