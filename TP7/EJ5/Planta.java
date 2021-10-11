
import java.util.ArrayList;

public class Planta {
    
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private int riego;
    private int sol;

    public Planta(String nombreCientifico, int riego, int sol){
        this.nombreCientifico=nombreCientifico;
        this.riego=riego;
        this.sol=sol;
        this.nombresVulgares= new ArrayList<>();
    }

    @Override
    public boolean equals(Object o){
        Planta aux = (Planta)o;
        return this.nombreCientifico.equals(aux.getNombreCientifico());
    }


    public String getNombreCientifico() {
        return this.nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public ArrayList<String> getNombresVulgares() {
        return this.nombresVulgares;
    }

    public void setNombresVulgares(ArrayList<String> nombresVulgares) {
        this.nombresVulgares = nombresVulgares;
    }

    public String getClasificacionSuperior() {
        return this.clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return this.familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return this.clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getRiego() {
        return this.riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public int getSol() {
        return this.sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }



    public boolean contieneNombreVulgar(String nombre){
        return this.nombresVulgares.contains(nombre);
    }


    public String toString(){
        return "Nombre: " + this.getNombreCientifico() + " nivel de sol: " + this.getSol() + " nivel de agua " + this.getRiego();
    }

    
    
}








