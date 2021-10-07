package parte1;

import java.util.ArrayList;
import java.util.List;

public class Reality {
	private List<Participante> participantes;
	private List<Coach> coaches;
	private List<TemaMusical> listaDeTemasMusicales;
	
	public Reality() {
		this.participantes = new ArrayList<>();
		this.coaches = new ArrayList<>();
		this.listaDeTemasMusicales = new ArrayList<TemaMusical>();
	}
	
	
	public void agregarParticipante(Participante p) {
		this.participantes.add(p);
	}
	
	public void agregarCoach(Coach c) {
		this.coaches.add(c);
	}
	
	public void agregarCoach(TemaMusical temaMusical) {
		this.listaDeTemasMusicales.add(temaMusical);
	}
		

	public static void main(String[] args) {
	

	}

}
