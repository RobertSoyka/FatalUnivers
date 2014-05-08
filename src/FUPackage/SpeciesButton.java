package FUPackage;

import java.awt.Color;
import java.awt.Label;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JLabel;

class SpeciesButton extends JLabel implements IGeneralData {
	public Species species;
		
	SpeciesButton(Species species_) {
	this.species = species_;
	this.setIcon(species_.speciesIcon);
	this.setHorizontalAlignment(JLabel.LEFT);
	this.setVerticalAlignment(JLabel.CENTER);
	this.setText(species_.name);
	this.setHorizontalTextPosition(JLabel.RIGHT);
	this.setVerticalTextPosition(JLabel.CENTER);
	this.setFont(mediumFont);
	this.setForeground(new Color(255,200,0));
	this.setOpaque(false);
	this.setVisible(true);
	}	
	

	
	

}


