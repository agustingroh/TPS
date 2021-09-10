public class Ejemplo {

    private String nombre;

    public Ejemplo(String nombre){
        this.nombre=nombre;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return nombre;
    }

    @Override
    public boolean equals(Object p){

        try{
            Ejemplo aux = (Ejemplo)p;
               return this.nombre.equals(aux.getNombre());
            // return this.nombre.equals(((Ejemplo)p).getNombre());
        }catch(Exception e){
            return false;
        }

       
    }
    
    public static void main(String[] args) {


        Ejemplo e1 = new Ejemplo("Ejemplo");
        Ejemplo e2 = new Ejemplo("Ejemplo");

        System.out.println(e1.equals(e2));
       
        System.out.println(e1);
    }
}