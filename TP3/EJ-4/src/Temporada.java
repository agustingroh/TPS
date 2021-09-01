package src;

import java.util.ArrayList;
import java.util.List;

public class Temporada  {

    private List<Episodio> episodios = new ArrayList<Episodio>();
    private int numeroDeTemporada;



    Temporada(int numeroDeTemporada) {
        this.numeroDeTemporada = numeroDeTemporada;
    }

    public Episodio getEpisodios(String titulo) {
        for (Episodio episodio : episodios) {
            if (episodio.getTitulo() == titulo)
                return episodio;
        }
        return null;
    }

    public void agregarEpisodios(Episodio NuevoEpisodio) {
        this.episodios.add(NuevoEpisodio);
    }

    public int episodiosVistos() {
        int vistos = 0;
        for (Episodio episodio : this.episodios) {
            if (episodio.visto()) {
                vistos++;
            }
        }
        return vistos;
    }

    public int getTemporada() {
        return this.temp;
    }
 
    public double sumaCalificaciones(){
        int sumaCalificaciones = 0;
        for (Episodio episodio : this.episodios) {
            sumaCalificaciones += episodio.getCalificacion();
        }
        return sumaCalificaciones;
    }

    public int cantidadDeEpisodios(){
        return episodios.size();
    }
   
    public double promedioDeCalificaciones() {       
        return (this.sumaCalificaciones() / this.cantidadDeEpisodios());

    }

}
