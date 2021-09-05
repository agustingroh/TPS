public class Timbre {
    private boolean sonar;
  
    public void hacerSonar() {
        this.sonar = true;
    }

    public void silenciar(){
        this.sonar = false;
    }

    public boolean getSonar() {
        return this.sonar;
    }


    
}
