package FUPackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JLabel;

class StarSystemButton extends JLabel implements IGeneralData {
	public StarSystem starSystem;
		
	StarSystemButton(StarSystem starSystem_, Empire empire_) {
	this.starSystem = starSystem_;
	
	this.setBounds(starSystem_.getCoordinateX()-64,starSystem_.getCoordinateY()-10, 128, 30);
	this.setOpaque(false);
	
	JLabel starSystemLabel = new JLabel();
	starSystemLabel.setBounds(0, 0, 128, 30);
	starSystemLabel.setIcon(starSystem_.primaryStar.aoType.galaxyStarIcon);
	starSystemLabel.setHorizontalAlignment(JLabel.CENTER);
	starSystemLabel.setVerticalAlignment(JLabel.CENTER);
	starSystemLabel.setHorizontalTextPosition(JLabel.CENTER);
	starSystemLabel.setVerticalTextPosition(JLabel.BOTTOM);
	starSystemLabel.setFont(smallFont);
	starSystemLabel.setIconTextGap(-3);
	starSystemLabel.setOpaque(false);
	starSystemLabel.setVisible(true);
	
	
	
	if (empire_.starSystemsKnown.contains(starSystem_)){
		if (starSystem_.nativeName == null | starSystem_.nativeName == ""){
			starSystemLabel.setText(starSystem_.name);
			}
		else {
			starSystemLabel.setText(starSystem_.nativeName);
			}
		// this.setForeground(empire_.color);
		starSystemLabel.setForeground(new Color(255,200,0));
		}	
	else {
		starSystemLabel.setText(starSystem_.name);
//		starSystemLabel.setForeground(new Color(150,150,150));
		starSystemLabel.setForeground(new Color(255,200,0));
		starSystemLabel.setFont(smallFontItalic);
		}	
	this.add(starSystemLabel);	
	}
	
	
	


// public void paintComponent( Graphics g ){

//	 Graphics2D g2d = (Graphics2D) g.create(); 
//     Point2D center = new Point2D.Float(64, 64); 
//     float radius = 60; 
//     float[] dist = { 0.0f, 1.0f }; 
//     Point2D focus = new Point2D.Float(64, 64); 
//     Color[] colors = { new Color(empire.color.getRed(),empire.color.getGreen(),empire.color.getBlue(),200), new Color(empire.color.getRed(),empire.color.getGreen(),empire.color.getBlue(),0)}; 
//     RadialGradientPaint rgp = new RadialGradientPaint(center, radius, 
//             focus, dist, colors, CycleMethod.NO_CYCLE); 
//    g2d.setPaint(rgp); 
//    g2d.fillRect(0, 0, 128, 128);	
//	}
}