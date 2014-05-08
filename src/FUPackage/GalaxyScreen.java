package FUPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;

public class GalaxyScreen extends JLayeredPane implements IGeneralData {

private TopNavi topNavi;	

public JLayeredPane galaxyMap = new JLayeredPane();
public JScrollPane scrollPane = new JScrollPane (galaxyMap, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);		





GalaxyScreen(final Empire empire){
		this.setLayout(null);
		this.setBounds(0, 0, resolutionX, resolutionY);		
	
		galaxyMap.setLayout(null);
		galaxyMap.setBounds(0, 0, 2600, 2600);
		galaxyMap.setPreferredSize(new Dimension(2600,2600));
	
		
		
		GraphicFU.bgGalaxyLabel.setBounds(0, 0, 2600, 2600);
		

		
		scrollPane.setOpaque(false);
		scrollPane.getHorizontalScrollBar().setValue(empire.galaxyMapX);
		scrollPane.getVerticalScrollBar().setValue(empire.galaxyMapY);
		scrollPane.getViewport().setViewPosition(new java.awt.Point(empire.galaxyMapX, empire.galaxyMapY));
		scrollPane.setBounds(0, 0, resolutionX - 8, resolutionY - 8);
		
		MouseListener starSystemSelect = new MouseListener()	{
			
	        public void mouseClicked(MouseEvent e) {        				
	        }
	        public void mousePressed(MouseEvent e) {
	        	StarSystemButton pressedStarSystemButton = (StarSystemButton) e.getComponent();
	        	StarSystem selectedStarSystem = pressedStarSystemButton.starSystem; 
	        	if (e.getButton() == 1 && empire.starSystemsKnown.contains(selectedStarSystem) ) {
	        		empire.selectedStarSystem = selectedStarSystem;
	        		empire.selectedAO = selectedStarSystem.primaryStar;
	        		empire.galaxyMapX = scrollPane.getHorizontalScrollBar().getValue();
	        		empire.galaxyMapY  = scrollPane.getVerticalScrollBar().getValue();
	        		FUMain.mainFrame.openStarSystemScreen(empire, selectedStarSystem);
	           		}
	        		
	       //else if (e.getButton() == 3) {
	    	//	FUMain.mainFrame.openGalaxyScreen();
	        //		}
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
		};
	    
		int i = 5;
		for	(StarSystem starSystem : Galaxy.starSystems){
			
			if (empire.starSystemsKnown.contains(starSystem) && starSystem.owner != null){  // To be switched to owner empire if ready.
				StarSystemSphere starSystemSphere = new StarSystemSphere(starSystem, starSystem.owner);
				galaxyMap.add(starSystemSphere, 4, 0);
				}
			
			StarSystemButton starSystemButton = new StarSystemButton(starSystem, empire);
			starSystemButton.addMouseListener(starSystemSelect);
			galaxyMap.add(starSystemButton, new Integer(i), 0);
			i ++;			
		galaxyMap.add(GraphicFU.bgGalaxyLabel, 0, 0);
		this.add(scrollPane, 3, 0);
		}
		this.topNavi = new TopNavi(empire);
		
		this.topNavi.turnButton.addMouseListener(new MouseListener()	{
			
	        public void mouseClicked(MouseEvent e) {        				
	        }
	        public void mousePressed(MouseEvent e) {
	        	empire.galaxyMapX = scrollPane.getHorizontalScrollBar().getValue();
	    		empire.galaxyMapY  = scrollPane.getVerticalScrollBar().getValue();
	    		FUMain.mainFrame.openGalaxyScreen(empire);

	        		}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});		
		
		this.add(this.topNavi, i+1, 0);
	}	
}