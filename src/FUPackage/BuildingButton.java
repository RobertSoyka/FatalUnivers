package FUPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;


import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ToolTipManager;

public class BuildingButton extends JPanel  implements IGeneralData{  //extends MainFrame
	int buildingStatus = 0;
	int buildingLevel = 0;
	
public BuildingButton(final Empire empire, final Building building){
	this.setBounds(0,0,40,45);
	this.setMinimumSize(new Dimension(40,45));
	this.setMaximumSize(new Dimension(40,45));
	JLabel buildingLabel = new JLabel (building.buildingType.icon,JLabel.CENTER);
	
	if (building.level == 0){
		buildingLabel.setText("X");
		buildingLabel.setIconTextGap(-32);
		buildingLabel.setForeground(colorRed);
		buildingLabel.setFont(hugeFont);
		}
	
	else if (building.level > 1){
		buildingLabel.setText("x" + building.level);
		buildingLabel.setForeground(GUIColor);
		buildingLabel.setFont(mediumFont);
		}
	buildingLabel.setVerticalAlignment(JLabel.TOP);
	buildingLabel.setHorizontalAlignment(JLabel.LEFT);
	
	//buildingLabel.setBounds(0,0,40,80);
	//buildingLabel.setMinimumSize(new Dimension(40,80));
	//buildingLabel.setMaximumSize(new Dimension(40,80));
	
	this.setOpaque(false);
	//this.setBackground(colorResources);
	this.setLayout(new GridLayout());
	this.add(buildingLabel);
	this.setToolTipText(building.buildingType.name + " Level " + building.level + "Costs: " + (int)(building.investedGoods));
	

	
	
	this.buildingStatus = building.colony.getStatus(building);
	this.buildingLevel = building.level;
	
	this.addMouseListener(new MouseListener() {
	    @Override	
	    	public void mouseClicked(MouseEvent e) {        				
	    	}
	        public void mousePressed(MouseEvent e) {
	        	FUMain.mainFrame.openColonyScreen(empire, building.colony, -1, building);	
	        }
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	    });
	
	

}
		

		public void paintComponent( Graphics g ){
//			if (buildingLevel > 0){
			g.setColor(new Color(255,200,0,155));
			g.drawRect(0, 41, 39, 4);
			
			int red = 255;
			int green = 200; 
			
			if (this.buildingStatus < 500){
				green = (int)Math.max((200 - 0.4 * (500 - this.buildingStatus)),0);
				}
			else {
				red = (int)Math.max((255 - 0.5 * (this.buildingStatus - 500)),0);
				}
			g.setColor(new Color(red,green,0,155));
			g.fillRect(0, 42,(this.buildingStatus+10)/25, 3);
			}
			
//			else { 
//				g.setColor(new Color(155,0,0,255));
//				g.drawOval(0, 0, 32, 32);
//				int arx1[] = {0,34,40,6};
//				int ary1[] = {34,0,6,40};
				
//				g.fillPolygon(arx1,ary1,arx1.length);
				
//				int arx2[] = {0,34,40,6};
//				int ary2[] = {6,40,34,0};
				
//				g.fillPolygon(arx2,ary2,arx2.length);
				
//			}
			
//		}
		
		
	// BUILDING BUILD XXX
		
		public BuildingButton(final Empire empire, final Colony colony, final int category, final BuildingType buildingType, final int level ){
			this.buildingLevel = level;
			this.buildingStatus = level > 0 ? 1000 : 0;
			
			this.setBounds(0,0,40,40);
			this.setMinimumSize(new Dimension(40,40));
			this.setMaximumSize(new Dimension(40,40));
			JLabel buildingLabel = new JLabel (buildingType.icon,JLabel.CENTER);
			if (level > 0) { 
				buildingLabel.setText(buildingType.name);
				buildingLabel.setForeground(GUIColor);
				buildingLabel.setFont(mediumFont);
				}	
			buildingLabel.setVerticalAlignment(JLabel.TOP);
			buildingLabel.setHorizontalAlignment(JLabel.LEFT);
			this.setOpaque(false);
			this.setLayout(new GridLayout());
			this.add(buildingLabel);
			this.setToolTipText(buildingType.name);
			
			
			
			this.addMouseListener(new MouseListener() {
			    @Override	
			    	public void mouseClicked(MouseEvent e) {        				
			    	}
			        public void mousePressed(MouseEvent e) {
			        	if (e.getButton() == 1) {
			        		new Building(colony, buildingType, level);
				        	FUMain.mainFrame.openColonyScreen(empire, colony, category, null);
				        	}
			        	
			        	if (e.getButton() == 3) {
			        	FUMain.mainFrame.openColonyScreen(empire, colony, -1, null);
			        	}
			        }
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
			    });
		
		}		
}

