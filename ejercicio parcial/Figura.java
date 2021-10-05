

public abstract class Figura {
    private String nombre;
    
    public Figura(String nombre){
        this.nombre=nombre;
    }

    public abstract double getArea();

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString(){
        return this.getNombre() + " Area :" + this.getArea(); 

    }

}
