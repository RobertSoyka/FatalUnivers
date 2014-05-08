package FUPackage;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JLabel;
import javax.swing.JPanel;

class ResearchProjectConnectionLine extends JPanel implements IGeneralData {
	private static int halfWide = 5; 
	
	private Technology technology1;
	private Technology technology2;
	
	ResearchProjectConnectionLine(Technology technology1_, Technology technology2_) {
	this.technology1 = technology1_;
	this.technology2 = technology2_;

	
	this.setBounds(0, 0, technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX), (1 + Math.max(technology2.positionX, technology2.positionY)) * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX));
	this.setOpaque(false);
	System.out.print("Line : ");
	
	}
	
public void paintComponent( Graphics g ){
	Graphics2D g2 = (Graphics2D) g;
	g.setColor(GUIColor);

	int halfDistanceX = (int)(ResearchScreen.researchProjectDistanceX/2);
	
	int x1 = technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth - 2;
	int y1 = technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2);
	int x2 = technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX);
	int y2 = technology2.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2);
	
	g2.setStroke(new BasicStroke(6.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
	g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
	GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
	if (technology2.positionX - technology1.positionX > 1 &&  technology2.positionY == technology1.positionY){
		path.moveTo(x1, y1);		
		path.curveTo(x1 + halfDistanceX, y1, (x1 + x2)/2, y2 + ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY, x2, y2);
		g2.draw(path);
		}
	else if (technology2.positionX - technology1.positionX == 1){	
		path.moveTo(x1, y1);
		path.curveTo(x1 + halfDistanceX, y1, x2 - halfDistanceX, y2, x2, y2);
	   	g2.draw(path);
		}
	else {	
		path.moveTo(x1, y1);
		path.curveTo(x1 + halfDistanceX, y1, x1 + 2 * halfDistanceX, y2, x2, y2);
	   	g2.draw(path);
		}
	}
}