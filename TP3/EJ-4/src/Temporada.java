package src;

import java.util.ArrayList;
import java.util.List;

public class Temporada extends Episodio {

    List<Episodio> episodios = new ArrayList<Episodio>();
    private int temp;

    Temporada() {

    }

    Temporada(int temp) {
        this.temp = temp;
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

   
    public double promedioDeCalificaciones() {
        int totalCalificaciones = 0;
        for (Episodio episodio : this.episodios) {
            totalCalificaciones += episodio.getCalificacion();
        }
        return (totalCalificaciones / episodios.size());

    }

}
