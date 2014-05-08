package FUPackage;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JLabel;
import javax.swing.JPanel;

class ResearchProjectConnectionLineV2 extends JPanel implements IGeneralData {
	private static int halfWide = 5; 
	
	private Technology technology1;
	private Technology technology2;
		
	
	ResearchProjectConnectionLineV2(Technology technology1_, Technology technology2_) {
	this.technology1 = technology1_;
	this.technology2 = technology2_;

	
	this.setBounds(0, 0, technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX), (1 + Math.max(technology2.positionX, technology2.positionY)) * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX));
	this.setOpaque(false);
	System.out.print("Line : ");
	
	}
	
public void paintComponent( Graphics g ){


//	g.drawRect(0, 0, technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX), (1 + Math.max(technology2.positionX, technology2.positionY)) * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX));  
    
 
	g.setColor(GUIColor);
	g.drawOval(0, 0, 32, 32);

	
//	Stub 1
	int stub1X[] = {technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth,
				technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth + (int)(ResearchScreen.researchProjectDistanceX/2) + halfWide,
				technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth + (int)(ResearchScreen.researchProjectDistanceX/2) + halfWide,
				technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth};
	
	int stub1Y[] = {technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) - halfWide,
				technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) - halfWide,
				technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) + halfWide,
				technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) + halfWide};
	g.fillPolygon(stub1X,stub1Y,stub1X.length);	

	
//	Stub 2	
	
	int stub2X[] = {technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) - (int)(ResearchScreen.researchProjectDistanceX/2) - halfWide,
			technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX),
			technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX),
			technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) - (int)(ResearchScreen.researchProjectDistanceX/2) - halfWide};

	int stub2Y[] = {technology2.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) - halfWide,
			technology2.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) - halfWide,
			technology2.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) + halfWide,
			technology2.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) + halfWide};
	
	g.fillPolygon(stub2X,stub2Y,stub2X.length);
	
	
// 	Connector
	
	if (technology2.positionY != technology1.positionY){
		int connectorX[] = {technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) - (int)(ResearchScreen.researchProjectDistanceX/2) - halfWide,
							technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) - (int)(ResearchScreen.researchProjectDistanceX/2) + halfWide,
							technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) - (int)(ResearchScreen.researchProjectDistanceX/2) + halfWide,
							technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) - (int)(ResearchScreen.researchProjectDistanceX/2) - halfWide};

		int connectorY[] = {Math.min(technology1.positionY,technology2.positionY) * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) - halfWide,
							Math.min(technology1.positionY,technology2.positionY) * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) - halfWide,
							Math.max(technology1.positionY,technology2.positionY) * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) + halfWide,
							Math.max(technology1.positionY,technology2.positionY) * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) + halfWide};
		
		g.fillPolygon(connectorX,connectorY,connectorX.length);

		}
	
	if (technology2.positionX - technology1.positionX > 1){
		g.setColor(new Color(255,200,0,155));		
		int connectorX[] = {technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth + (int)(ResearchScreen.researchProjectDistanceX/2) - halfWide,
							technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) - (int)(ResearchScreen.researchProjectDistanceX/2) - halfWide,
							technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) - (int)(ResearchScreen.researchProjectDistanceX/2) - halfWide,
							technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth + (int)(ResearchScreen.researchProjectDistanceX/2) - halfWide};

		int connectorY[] = {technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) - halfWide,
							technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) - halfWide,
							technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) + halfWide,
							technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY) + (ResearchScreen.researchProjectHeight/2) + halfWide};
		
		g.fillPolygon(connectorX,connectorY,connectorX.length);

		}
	
	
	
		
//	int arx1[] = {technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth,
//					technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX),
//					technology2.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX),
//					technology1.positionX * (ResearchScreen.researchProjectWidth + ResearchScreen.researchProjectDistanceX) + ResearchScreen.researchProjectWidth};
//	int ary1[] = {technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY)+15,
//					technology2.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY)+15,
//					technology2.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY)+25,
//					technology1.positionY * (ResearchScreen.researchProjectHeight + ResearchScreen.researchProjectDistanceY)+25};
//	g.fillPolygon(arx1,ary1,arx1.length);	
	
}


    
    
	
}