package parte1;

import java.util.ArrayList;
import java.util.List;

public class TemaMusical {
	
	private String titulo;
	private String idioma;
	private List<String> generosMusicales;
	private List<String> listaDeInstrumentos;
	
	public TemaMusical() {			
		this.titulo=titulo;
		this.idioma=idioma;
		this.listaDeInstrumentos= new ArrayList<>();
		this.generosMusicales= new ArrayList<>();	
		
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setGenerosMusicales(String generoMusical) {
		this.generosMusicales.add(generoMusical);
	}


	public void setListaDeInstrumentos(String instrumento) {
		this.listaDeInstrumentos.add(instrumento);
	}
	

}
