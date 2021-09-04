package src;

public class Episodio {
    private String titulo;
    private String descripcion;
    private int calificacion;
    private boolean visto;

   
    Episodio(String titulo,String descripcion, int calif,boolean visto){
        this.titulo= titulo;
        this.descripcion = descripcion;
        this.calificacion = calif;
        this.visto = visto;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {        
        return this.calificacion;
    }

    public void setCalificacion(int calificacion) {
        if(calificacion<1 || calificacion>5) {
            System.out.println("La calificacion ingresada es incorrecta");
            return;
        }
        this.calificacion = calificacion;
    }

    public boolean visto() {
        return this.visto;
    }   

    public void setVista(boolean visto) {
        this.visto = visto;
    }

    public static void main(String[] args) {
        Episodio episodio1 = new Episodio("Episodio piloto", "Descripcion episodio piloto", 4, false);
        System.out.println(episodio1.getTitulo());
        episodio1.setTitulo("nuevo titulo");
        System.out.println(episodio1.getTitulo());
    }

}
