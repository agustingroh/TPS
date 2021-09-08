public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa() {
        luz = new Luz();
    }

    public boolean comprobar() {       
        if (super.comprobar()) {
            luz.encender();
            return true;
        } else {
            luz.apagar();
        }
        return false;
    }

    public boolean estadoDeLaLuz(){
        return luz.estado();
    }

    public static void main(String[] args) {
        
    }
}
