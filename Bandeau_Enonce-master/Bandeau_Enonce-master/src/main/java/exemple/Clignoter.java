package exemple;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Clignoter extends Effet{

	private int temps_clignotement;
	
	public Clignoter(int temps_transition, int temps_clignotement) {
		super(temps_transition);
		this.temps_clignotement = temps_clignotement;
	}
	
	public void jouer (Bandeau bandeau) {
		Color fore = bandeau.getForeground();
	    Color back = bandeau.getBackground();
	    
	    for(int i=0;i<100;i++) {
	    	bandeau.sleep(this.temps_clignotement);
	    	bandeau.setForeground(back);
	  	    bandeau.sleep(this.temps_clignotement);
	  	    bandeau.setForeground(fore);
	    }	  
	}
}
