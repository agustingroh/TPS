public class Luz {
    private boolean encender;


    public void encender(){
        this.encender=true;
    }

    public void apagar(){
        this.encender=false;
    }
    

    public boolean estado(){
        return this.encender;
    }
}
