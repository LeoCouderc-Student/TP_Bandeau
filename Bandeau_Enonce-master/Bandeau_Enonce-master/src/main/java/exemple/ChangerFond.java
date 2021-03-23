package exemple;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class ChangerFond extends Effet{
	private Color couleurFond;
	private Color couleurPolice;
	
	public ChangerFond (int temps_transition, Color couleurFond, Color couleurPolice) {
		super(temps_transition);
		this.couleurFond = couleurFond;
		this.couleurPolice = couleurPolice;
	}
	
	public void jouer (Bandeau bandeau) {
		Font font = bandeau.getFont();
	    Color back = bandeau.getBackground();
	    Color fore = bandeau.getForeground();
	    
	    bandeau.sleep(this.temps_transition);
	    bandeau.setBackground(this.couleurFond);
	    bandeau.sleep(this.temps_transition);
	    bandeau.setForeground(this.couleurPolice);
	    bandeau.sleep(this.temps_transition);
	    bandeau.setFont(font);
	    bandeau.setForeground(fore);
	    bandeau.setBackground(back);
	}
}
