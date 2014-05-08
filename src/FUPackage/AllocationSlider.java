package FUPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.geom.Rectangle2D;


import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.ToolTipManager;

public class AllocationSlider extends JPanel  implements IGeneralData{  //extends MainFrame
	boolean fixed;
	double allocation;
	Color color;
	Icon icon;
	
	
	
public AllocationSlider(Color color_){
	this.color = color_;
	this.setOpaque(false);
	this.setVisible(true);
	
	
//	this.layout()
//	this.add(Labels.string(allocation * 1000/10.0 + "%")) 
	
	;
}


		public void paintComponent( Graphics g ){
			g.setColor(new Color(255,200,0,155));
			g.drawRect(0, 0, this.getSize().width-1, this.getSize().height-1);
			
		//	int red = 255;
		//	int green = 200; 
			
//			if (this.buildingStatus < 500){
//				green = (int)Math.max((200 - 0.4 * (500 - this.buildingStatus)),0);
//				}
//			else {
//				red = (int)Math.max((255 - 0.5 * (this.buildingStatus - 500)),0);
//				}
			g.setColor(color);
			g.fillRect(1,1,(int)(this.getSize().width * allocation)-2, this.getSize().height-2);
		}
}

