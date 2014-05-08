package FUPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;

public abstract class ScrollPanes extends JScrollPane implements IGeneralData {



public static JScrollPane buildingDescription (Empire empire, Building building) {
	double status = building.colony.getStatus(building) / 1000.0;
	JPanel buildingPanel = new JPanel(); 
	buildingPanel.setOpaque(false);
	buildingPanel.setLayout(new GridBagLayout());

	JScrollPane buildingsScroll = new JScrollPane(buildingPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	buildingsScroll.setOpaque(false);
	buildingsScroll.getViewport().setOpaque(false);
	buildingsScroll.setWheelScrollingEnabled(true);
	buildingsScroll.setBounds(0, 0, 100, 100);
	buildingsScroll.getViewport().setViewPosition(new java.awt.Point(0, 0));
	
	
	GridBagConstraints c = new GridBagConstraints();
	c.fill = GridBagConstraints.BOTH;  
	c.weightx = 1;                     
	c.weighty = 1;                    
	c.insets = new Insets(0,0,0,0);   
	c.gridwidth = 1;
   	c.gridheight = 1;
   	
   	if (building.level > 0 && empire == building.colony.controller) {
   	c.gridx = 1;
   	c.gridy = 1;
   	c.weightx = 0;
   	c.gridwidth = 1;
   	JLabel reduceLevel = Labels.icon(GraphicFU.reduceIcon);
   	reduceLevel.setHorizontalAlignment(JLabel.LEFT);
   	reduceLevel.addMouseListener(changeLevel(empire, building, -1));
   	buildingPanel.add(reduceLevel,c);   	
   	}
   	
   	c.gridx = 1;
   	c.gridy = 1; 
   	c.weightx = 1;
   	c.gridwidth = 3;
   	JLabel name = Labels.string(building.buildingType.name);
    // + " x " + building.level
   	name.setHorizontalAlignment(JLabel.CENTER);
   	buildingPanel.add(name,c);
   	
   	if (building.level < building.buildingType.levels && building.level < building.colony.getTotalPopulation() / building.buildingType.minPopPerLevel && empire == building.colony.controller){
   	c.gridx = 3;
   	c.gridy = 1;
   	c.gridwidth = 1;
   	c.weightx = 0;
   	JLabel addLevel = Labels.icon(GraphicFU.addIcon);
   	addLevel.setHorizontalAlignment(JLabel.RIGHT);
   	addLevel.addMouseListener(changeLevel(empire, building, +1));
   	buildingPanel.add(addLevel,c);
   	}
   	
   	c.gridy ++;
	 
   	c.gridx = 1;
	c.gridwidth = 3;
   	c.gridheight = 1;
   	c.weightx = 1;
	
// STATUS
	buildingPanel.add(Labels.string(language.condition + " " + (int)(1000.0 * status)/10.0 + " % (" + (int)(building.investedGoods * 10.0) / 10.0 + " / " + (int) (building.getConstructionCosts() * 10.0) / 10.0 + " )" ),c);
	c.gridy ++;

	
for (int i = 0; i < building.buildingType.effect.length; i++ ) {
	if (building.buildingType.effect[i].modifier != 0) {
		buildingPanel.add(Labels.string(building.buildingType.effect[i].type.name + " " + (building.buildingType.effect[i].modifier > 0? "+":"") + (int)(building.buildingType.effect[i].modifier * building.buildingType.effect[i].type.factor * building.level * status)+ " " + building.buildingType.effect[i].type.unit ),c);
		c.gridy ++;
		}
		}
	
 	c.gridx = 1;
	c.gridwidth = 3;
   	c.gridwidth = 3;
	JLabel image =  Labels.icon(building.buildingType.image);
   	image.setVerticalAlignment(JLabel.CENTER);
   	buildingPanel.add(image,c);
	
	c.gridy ++;
	
		
	JTextArea buildingDescription = new JTextArea(building.buildingType.description);
	buildingDescription.setLineWrap(true);
	buildingDescription.setWrapStyleWord(true);
	buildingDescription.setOpaque(false);
	buildingDescription.setFont(mediumFont);
	buildingDescription.setForeground(GUIColor);
	buildingDescription.setMargin(new Insets(30,10,0,30));

	DefaultCaret caret = (DefaultCaret) buildingDescription.getCaret();
	caret.deinstall(buildingDescription);
	
	buildingPanel.add(buildingDescription,c);
	return buildingsScroll;
		
}	
// XXX
public static JScrollPane buildingsAvailable (Empire empire, Colony colony, int category, BuildingType buildingType) {
	
	JPanel availableBuildingsPanel = new JPanel();
	availableBuildingsPanel.setOpaque(false);
	availableBuildingsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
	availableBuildingsPanel.setLayout(new GridBagLayout());

	JScrollPane buildingsAvailableScroll = new JScrollPane(availableBuildingsPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	buildingsAvailableScroll.setOpaque(false);
	buildingsAvailableScroll.getViewport().setOpaque(false);
	buildingsAvailableScroll.setWheelScrollingEnabled(true);
	buildingsAvailableScroll.getHorizontalScrollBar().setPreferredSize(new Dimension(8, 0));
	
	GridBagConstraints c = new GridBagConstraints();
	c.fill = GridBagConstraints.BOTH;  
	   
	c.gridy = 1;
				
	for(BuildingType availableBuildingType : colony.getAvailableBuildings(category)){
		c.gridwidth = 1;
		c.weighty = 0;
		c.weightx = 0;
		c.gridx = 1;
//		availableBuildingsPanel.add(new BuildingButton(empire, colony, category, availableBuildingType, 0),c);
		c.weightx = 1;
		c.gridx = 1;
		availableBuildingsPanel.add(new BuildingButton(empire, colony, category, availableBuildingType, 1),c);
		c.gridy ++;
		
		c.gridx = 1;
		c.gridwidth = 2;
		
			availableBuildingsPanel.add(Labels.string(language.costs + " " + (int) (colony.getLocalConstructionCost(availableBuildingType) * 10.0) / 10.0  + " " + language.abbrMegatons),c);
			c.gridy ++;
		
			for (int i = 0; i < availableBuildingType.effect.length; i++ ) {
				if (availableBuildingType.effect[i].modifier != 0) {
					availableBuildingsPanel.add(Labels.string(availableBuildingType.effect[i].type.name + " " + (availableBuildingType.effect[i].modifier > 0? "+":"") + (int)(availableBuildingType.effect[i].modifier * availableBuildingType.effect[i].type.factor ) + " " + availableBuildingType.effect[i].type.unit ),c);
					c.gridy ++;
					}
				}
			availableBuildingsPanel.add(Labels.string(""),c);
			c.gridy ++;
			availableBuildingsPanel.add(Labels.string(""),c);
			c.gridy ++;
		
		}
	return buildingsAvailableScroll;
	}

public static MouseListener changeLevel (final Empire empire, final Building building, final int levelChange){ 
	MouseListener ml = new MouseListener()	{
	public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
    	if (e.getButton() == 1) {
    		building.level += levelChange;
    		FUMain.mainFrame.openColonyScreen(empire, building.colony, -1, building);
    		}
    	if (e.getButton() == 3) {
    		FUMain.mainFrame.openColonyScreen(empire, building.colony, -1, null);
    	}
    }  
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
	};
	return ml;
	}



}