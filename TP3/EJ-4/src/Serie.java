package src;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Temporada{

    List<Temporada> temporadas = new ArrayList<Temporada>();

    Serie() {      
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

    public Temporada obtenerTemporada(int temp){
        for (Temporada temporada : temporadas) {
            if(temporada.getTemporada()==temp)
            return temporada;
        }
        return null;
    }

    public double promedioCalificaciones(){           

        double totalCalificaciones = 0;
        for (Temporada temporada : this.temporadas) {
            totalCalificaciones+=temporada.promedioDeCalificaciones();
        }
        return (totalCalificaciones / temporadas.size());

    }
    


    public static void main(String[] args) {
        Serie serie1= new Serie();
        serie1.agregarTemporada(new Temporada(1));
        serie1.agregarTemporada(new Temporada(2));
        // Le agrego 3 episodios a la temp 1
        serie1.obtenerTemporada(1).agregarEpisodios(new Episodio("Episodio 1","Descripcion",2,true));
        serie1.obtenerTemporada(1).agregarEpisodios(new Episodio("Episodio 2","Descripcion",2,true));
        serie1.obtenerTemporada(1).agregarEpisodios(new Episodio("Episodio 3","Descripcion",2,true));
        // Le agrego 1 episodio a la temp 2
        serie1.obtenerTemporada(2).agregarEpisodios(new Episodio("Episodio 1","Descripcion",5,true));


        System.out.println("Los episodios vistos de la serie son: " + serie1.episodiosVistos());
        System.out.println("Los episodios vistos de la temporada 1 son " + serie1.obtenerTemporada(1).episodiosVistos());
        System.out.println("Los episodios vistos de la temporada 2 son " + serie1.obtenerTemporada(2).episodiosVistos());
        

        serie1.obtenerTemporada(1).getEpisodios("Episodio 1").setCalificacion(4);

        System.out.println("El promedio de calificaciones para la temporada 1 es: " + serie1.obtenerTemporada(1).promedioDeCalificaciones());
        System.out.println("El promedio de calificaciones para la serie es: " + serie1.promedioCalificaciones());
         
         
    }

}
