public class Cliente {
    private String nombre;

    public Cliente (String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }


    public boolean equals(Object o){
        Cliente aux = (Cliente)o;
        return aux.getNombre().equals(this.getNombre());
    }
}