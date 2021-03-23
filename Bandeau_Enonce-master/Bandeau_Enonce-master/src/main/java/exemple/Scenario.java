package exemple;

import java.util.LinkedList;
import java.util.List;

import bandeau.Bandeau;

public class Scenario {
	
	private List<Effet> effets;
	
	public Scenario() {
		this.effets = new LinkedList<>();
	}
	
	public void jouer (Bandeau bandeau) {
		for(Effet effet : effets) {
			effet.jouer(bandeau);
		}
	}
	
	public void ajouterEffet (Effet effet, int repetition) {
		for(int i=0;i<repetition;i++) {
			this.effets.add(effet);
		}
	}
}
