package exemple;

import bandeau.Bandeau;

abstract class Effet {

	protected int temps_transition;
	
	public Effet(int temps_transition) {
		this.temps_transition = temps_transition;
	}
	
	public abstract void jouer (Bandeau bandeau);
}