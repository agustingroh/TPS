package src;

import java.util.ArrayList;
import java.util.List;

import jdk.internal.module.SystemModuleFinders;

public class Serie {
    private String nombre;

    private List<Temporada> temporadas = new ArrayList<Temporada>();

    Serie(String nombre) {
        this.nombre = nombre;
    }

    public int episodiosVistos() {
        int vistos = 0;
        for (Temporada temporada : temporadas) {
            vistos += temporada.episodiosVistos();
        }
        return vistos;
    }

    public void agregarTemporada(Temporada nuevaTemporada) {
        this.temporadas.add(nuevaTemporada);
    }

    public Temporada obtenerTemporada(int temp) {
        for (Temporada temporada : temporadas) {
            if (temporada.getTemporada() == temp)
                return temporada;
        }
        return null;
    }

    public int obtenerCantidadDeEpisodios() {
        int cantidadEpisodios = 0;
        for (Temporada temp : this.temporadas) {
            cantidadEpisodios += temp.cantidadDeEpisodios();
        }
        return cantidadEpisodios;
    }

    public double promedioCalificaciones() {

        double totalCalificaciones = 0;
        for (Temporada temporada : this.temporadas) {
            totalCalificaciones += temporada.sumaCalificaciones();
        }
        return (totalCalificaciones / this.obtenerCantidadDeEpisodios());

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // COSAS QUE NO HAY QUE HACER, NO RETORNAR LA LISTA DEL OBJETO
    // public List<Temporada> getTemporadas() {
    //     return new ArrayList(this.temporadas);
    // }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public String toString(){
        return "Nombre de la serie" +  this.nombre;
    }

    public static void main(String[] args) {

        Serie serie1 = new Serie("nueva serie");
        serie1.agregarTemporada(new Temporada(1));
        serie1.agregarTemporada(new Temporada(2));
        
        System.out.println(serie1.toString());
        //

    
        
       

        // Le agrego 3 episodios a la temp 1
        serie1.obtenerTemporada(1).agregarEpisodios(new Episodio("Episodio 1", "Descripcion", 2, true));
        serie1.obtenerTemporada(1).agregarEpisodios(new Episodio("Episodio 2", "Descripcion", 2, true));
        serie1.obtenerTemporada(1).agregarEpisodios(new Episodio("Episodio 3", "Descripcion", 2, true));
        // Le agrego 1 episodio a la temp 2
        serie1.obtenerTemporada(2).agregarEpisodios(new Episodio("Episodio 1", "Descripcion", 5, true));

        // COSAS QUE NO HAY QUE HACER
       // serie1.getTemporadas().clear();

        System.out.println("Los episodios vistos de la serie son: " + serie1.episodiosVistos());
        System.out
                .println("Los episodios vistos de la temporada 1 son " + serie1.obtenerTemporada(1).episodiosVistos());
        System.out
                .println("Los episodios vistos de la temporada 2 son " + serie1.obtenerTemporada(2).episodiosVistos());

        serie1.obtenerTemporada(1).getEpisodios("Episodio 1").setCalificacion(4);

        System.out.println("El promedio de calificaciones para la temporada 1 es: "
                + serie1.obtenerTemporada(1).promedioDeCalificaciones());
        System.out.println("El promedio de calificaciones para la serie es: " + serie1.promedioCalificaciones());

    }

}
