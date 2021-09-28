public class Proceso extends Sorter {
    private int memoria;
    private int prioridad;

    public Proceso(int memoria){
        this.memoria=memoria;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String toString(){
        return "memoria: " + this.getMemoria();
    }

    public boolean sort (Object o){
        
    }
}
