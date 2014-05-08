package FUPackage;

import java.awt.Color;
import java.awt.Label;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JLabel;

class AOButton extends JLabel implements IGeneralData {
	public AstronomicObject ao;
		
	AOButton(AstronomicObject ao_) {
	this.ao = ao_;
	this.setIcon(ao_.getIcon());
	this.setHorizontalAlignment(JLabel.CENTER);
	this.setVerticalAlignment(JLabel.CENTER);
	if (ao_.name != null && ao_.name.length() > 0){
		this.setText(ao_.name);
		}
	else {
		this.setText(ao_.getDesignation());
		};
	
	this.setHorizontalTextPosition(JLabel.CENTER);
	this.setVerticalTextPosition(JLabel.BOTTOM);
	this.setFont(smallFont);
	this.setForeground(new Color(255,200,0));
	this.setIconTextGap(-15);
	this.setOpaque(false);
	this.setVisible(true);
	
	}	
	
	AOButton(AstronomicObject ao_, String string) {
		this.ao = ao_;
		this.setIcon(ao_.aoType.primaryStarIcon);
		this.setHorizontalAlignment(JLabel.LEFT);
		this.setVerticalAlignment(JLabel.BOTTOM);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.CENTER);
		this.setFont(smallFont);
		this.setForeground(new Color(255,200,0));
		this.setIconTextGap(-15);
		this.setOpaque(false);
		this.setVisible(true);
		
		}
	
	
	
	

}


