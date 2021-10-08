import java.util.ArrayList;
import java.util.List;

public class Palabra implements Comparable<Palabra>{

    private String palabra;
    private List<String>sinonimos;
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

    public ArrayList<String> getSinonimos() {
        return new ArrayList<String>(this.sinonimos);
    }

    public void AddSinonimo(String sinonimo) {
        this.sinonimos.add(sinonimo);
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


    @Override
    public int compareTo(Palabra p){
        return this.palabra.compareTo(p.getPalabra());
    }
}
