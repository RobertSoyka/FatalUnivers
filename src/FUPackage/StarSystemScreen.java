package FUPackage;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class StarSystemScreen extends JLayeredPane implements IGeneralData {

	
private TopNavi topNavi;

StarSystemScreen(final Empire empire, final StarSystem starSystem){
	MouseListener backToGalaxyScreen = new MouseListener()	{
		
        public void mouseClicked(MouseEvent e) {        				
        }
        public void mousePressed(MouseEvent e) {
        	if (e.getButton() == 3) {
    		FUMain.mainFrame.openGalaxyScreen(empire);
        	}
        }  
        public void mouseReleased(MouseEvent e) {
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
    };	
    
	MouseListener aoSelect = new MouseListener()	{
        public void mouseClicked(MouseEvent e) {        				
        }
        public void mousePressed(MouseEvent e) {
        	AOButton aoButton = (AOButton) e.getComponent();
        	AstronomicObject ao_ = aoButton.ao; 
        	if (e.getButton() == 1) {
        		if (ao_.colony != null && ao_ == empire.selectedAO){
        			FUMain.mainFrame.openColonyScreen(empire, ao_.colony, -1, null);
 //       			System.out.print("Name : " + ao_.getName()); // XXX
					}
        		else {
        			empire.selectedAO = aoButton.ao;
        			FUMain.mainFrame.openStarSystemScreen(empire, empire.selectedStarSystem);
        			}
        		}
        else if (e.getButton() == 3) {
    		FUMain.mainFrame.openGalaxyScreen(empire);
        	}
        }
        public void mouseReleased(MouseEvent e) {
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
    };	
    
    
	this.setBounds(0, 0, resolutionX, resolutionY);
	this.add(GraphicFU.bgPanel, 0, 0);
	this.addMouseListener(backToGalaxyScreen);
	
	this.topNavi = new TopNavi(empire);
	this.add(this.topNavi, 3, 0);
		
// Primary star button XXX
	
	JPanel primaryStarPanel = new JPanel();
	primaryStarPanel.setLayout(new GridLayout());
	primaryStarPanel.setBounds(0, TopNavi.height, 128, resolutionY - TopNavi.height - bottomPanelHeight);
	primaryStarPanel.setOpaque(false);
	this.add(primaryStarPanel, 1, 0);	
	
	
	AOButton primaryStarButton = new AOButton(starSystem.primaryStar, "Primary");
	primaryStarButton.addMouseListener(aoSelect);		
	primaryStarPanel.add(primaryStarButton, 1, 0);
	

	//Planets Secondary stars, Moons	XXX		
	
	GridBagLayout gbl = new GridBagLayout();
	JPanel systemPanel = new JPanel();
	systemPanel.setLayout(gbl);
	systemPanel.setBounds(128, TopNavi.height, resolutionX-128, resolutionY - TopNavi.height - bottomPanelHeight );
	systemPanel.setOpaque(false);
	this.add(systemPanel, new Integer(1), 0);
	  
	GridBagConstraints c = new GridBagConstraints();
	c.fill = GridBagConstraints.BOTH;   // wie Komponente Bereich füllen soll
	c.weightx = 1;                     // Breite
	c.weighty = 1;                    // Höhe
	c.insets = new Insets(0,0,0,0);   // Abstände definieren
   	c.gridwidth = 1;
   	c.gridheight = 1;
    
    	Set<AstronomicObject> astronomicObjects = new HashSet<AstronomicObject>();
    	astronomicObjects.addAll(starSystem.stars);
    	astronomicObjects.addAll(starSystem.planets);
    	astronomicObjects.addAll(starSystem.moons);
    	    	
    	astronomicObjects.remove(starSystem.primaryStar);
    	
    	for(AstronomicObject ao : astronomicObjects){
    			AOButton aoButton = new AOButton(ao);
				aoButton.addMouseListener(aoSelect);
				c.gridx = ao.planetID;
				c.gridy = 5-ao.moonID;				
				systemPanel.add(aoButton,c);
				
				if (ao.colony != null){
					systemPanel.add(Labels.empireFlag(ao.colony.controller),c);
					}
				if (ao == empire.selectedAO){
					if (empire.selectedAO == empire.selectedStarSystem.primaryStar){
						GraphicFU.markerBigLabel.setVisible(false);
						GraphicFU.markerLabel.setVisible(false);
						}
					else if	(empire.selectedAO.getClass().getName() == "FUPackage.Star"  ){
						GraphicFU.markerBigLabel.setVisible(true);
						GraphicFU.markerLabel.setVisible(false);
						gbl.setConstraints(GraphicFU.markerBigLabel,c);
						systemPanel.add(GraphicFU.markerBigLabel);
						}
					else if (empire.selectedAO.getClass().getName() == "FUPackage.Planet" ){
						GraphicFU.markerLabel.setVisible(true);
						GraphicFU.markerBigLabel.setVisible(false);
						gbl.setConstraints(GraphicFU.markerLabel,c);
						systemPanel.add(GraphicFU.markerLabel);
						}	
					}
    			}
    	// Label Panel - AO Description
    	this.add(new AODescriptionPanel(empire), 1, 0);
    	this.topNavi.turnButton.addMouseListener(new MouseListener()	{
    		
            public void mouseClicked(MouseEvent e) {        				
            }
            public void mousePressed(MouseEvent e) {
           		FUMain.mainFrame.openStarSystemScreen(empire, starSystem);

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
	}
}