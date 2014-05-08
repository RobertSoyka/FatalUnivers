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

class StarSystemSphere extends JLabel implements IGeneralData {
	public StarSystem starSystem;
	public Empire empire;
		
	StarSystemSphere(StarSystem starSystem_, Empire empire_) {
	this.starSystem = starSystem_;
	this.empire = empire_;
	
	this.setBounds(starSystem_.getCoordinateX()-128,starSystem_.getCoordinateY()-128, 256, 256);
	this.setOpaque(false);
	}
	
public void paintComponent( Graphics g ){

	 Graphics2D g2d = (Graphics2D) g.create(); 
     Point2D center = new Point2D.Float(128, 128); 
     float radius = 128; 
     float[] dist = { 0.0f, 0.30f, 1.0f }; 
     Point2D focus = new Point2D.Float(128, 128); 
     Color ownerColor = empire.color;  // To be adapted XXX
     Color[] colors = { new Color(ownerColor.getRed(),ownerColor.getGreen(),ownerColor.getBlue(),200), new Color(ownerColor.getRed(),ownerColor.getGreen(),ownerColor.getBlue(),100), new Color(ownerColor.getRed(),ownerColor.getGreen(),ownerColor.getBlue(),0)}; 
     RadialGradientPaint rgp = new RadialGradientPaint(center, radius, 
             focus, dist, colors, CycleMethod.NO_CYCLE); 
    g2d.setPaint(rgp); 
    g2d.fillRect(0, 0, 256, 256);	
	}
}