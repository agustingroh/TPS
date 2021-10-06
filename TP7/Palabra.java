import java.util.ArrayList;
import java.util.List;

public class Palabra {

    private String palabra;
    List<String>sinonimos;
    private String funcionGramatical;
    private List<String> definiciones;   
    private List<String> antonimos;

    public Palabra(String palabra){
        this.palabra=palabra;
        this.sinonimos = new ArrayList<>();
        this.definiciones = new ArrayList<>();
        this.antonimos = new ArrayList<>();


    }


    public String getPalabra() {
        return this.palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public List<String> getSinonimos() {
        return this.sinonimos;
    }

    public void setSinonimos(List<String> sinonimos) {
        this.sinonimos = sinonimos;
    }

    public String getFuncionGramatical() {
        return this.funcionGramatical;
    }

    public void setFuncionGramatical(String funcionGramatical) {
        this.funcionGramatical = funcionGramatical;
    }

    public List<String> getDefiniciones() {
        return this.definiciones;
    }

    public void setDefiniciones(List<String> definiciones) {
        this.definiciones = definiciones;
    }

    public List<String> getAntonimos() {
        return this.antonimos;
    }

    public void setAntonimos(List<String> antonimos) {
        this.antonimos = antonimos;
    }


    public String toString(){
        return this.getPalabra();
    }
}
