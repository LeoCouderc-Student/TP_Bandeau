package exemple;

import bandeau.Bandeau;

public class FaireUnTour extends Effet{
	private int temps_transition_rotation;
	
	public FaireUnTour(int temps_transition, int temps_transition_rotation) {
		super(temps_transition);
		this.temps_transition_rotation = temps_transition_rotation;
	}
	
	public void jouer (Bandeau bandeau) {
		bandeau.sleep(this.temps_transition);
	        for (int i = 0; i <= 100; i++) {
	        	bandeau.setRotation(2 * Math.PI * i / 100);
	        	bandeau.sleep(this.temps_transition_rotation);
	        }
	}
}
