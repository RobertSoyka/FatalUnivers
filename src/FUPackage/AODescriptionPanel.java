package FUPackage;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;

public class AODescriptionPanel  extends JPanel implements IGeneralData {  //extends MainFrame

JTextField aoName = new JTextField();;
	
public AODescriptionPanel(final Empire empire){

	GridLayout gl = new GridLayout(0,4);
	this.setLayout(gl);
	this.setBounds(0, resolutionY-bottomPanelHeight, resolutionX, bottomPanelHeight);
	this.setOpaque(false);
	this.setBackground (new Color (0, 0, 0, 0));
	
	
//	JLabel name = Labels.name(empire.selectedAO);
//	name.addMouseListener(nameChange);
//	this.add(name);
	
//    aoName = new JTextField();
    aoName.setFont(bigFont);
    aoName.setOpaque(false);
    aoName.setForeground(GUIColor);
    aoName.setBorder(eBorder);
    aoName.setText(empire.selectedAO.getName());
    aoName.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent e) {
    		   if (empire.selectedAO.planetID == 0) {
    			   	empire.selectedAO.starSystem.setNativeName(aoName.getText());
    			   	empire.selectedAO.setName(aoName.getText());
    		   		} 
    		   else {
    			    empire.selectedAO.setName(aoName.getText());
    		   		}
    	   }
    	});
    
    this.add(aoName);
    
    
if (empire.selectedAO.aoType.isPlanet | empire.selectedAO.colony != null){
	if (empire.selectedAO.colony != null){
		this.add(Labels.colonyType(empire.selectedAO.colony));
		this.add(Labels.colonyPopulation(empire.selectedAO.colony));
		this.add(Labels.colonyMood(empire.selectedAO.colony));
	}
	else {
		this.add(Labels.type(empire.selectedAO));
		this.add(Labels.diameter(empire.selectedAO));
		this.add(Labels.mass(empire.selectedAO));		
	}
		
	this.add(Labels.atmosphere(empire.selectedAO));
	this.add(Labels.temperature(empire.selectedAO));
	this.add(Labels.water(empire.selectedAO));
	this.add(Labels.ecoSystem(empire.selectedAO));
	
	if (empire.selectedAO.colony != null && empire.selectedAO.colony.getTotalPopulation() > 0){
		this.add(Labels.potentialFarmers(empire, empire.selectedAO.colony));
		}
	else{
		this.add(Labels.potentialFarmers(empire, empire.selectedAO));
		}
	this.add(Labels.gravitation(empire.selectedAO));
	this.add(Labels.abundance(empire.selectedAO));

	this.add(Labels.starDistance(empire.selectedAO));
	this.add(Labels.orbitalPeriod(empire.selectedAO));
	
	if (empire.selectedAO.getMoonID()== 0){
		this.add(Labels.moons(empire.selectedAO));
		}
	else{
		this.add(Labels.moonDistance(empire.selectedAO));
		}
	
	this.add(Labels.rotationPeriod(empire.selectedAO));
	this.add(Labels.tidalForce(empire.selectedAO));
	
	for(AOSpecial special : empire.selectedAO.specials){
			this.add(Labels.special(special));
			}
		
		
		
	}	

else {
		this.add(Labels.type(empire.selectedAO));	
		this.add(Labels.diameter(empire.selectedAO));
		this.add(Labels.mass(empire.selectedAO));
		this.add(Labels.starDistance(empire.selectedAO));
		this.add(Labels.orbitalPeriod(empire.selectedAO));
		if (empire.selectedAO.getMoonID()== 0){
			this.add(Labels.moons(empire.selectedAO));
			}
		else{
			this.add(Labels.moonDistance(empire.selectedAO));
			}
		this.add(Labels.rotationPeriod(empire.selectedAO));
		this.add(Labels.temperature(empire.selectedAO));
		this.add(Labels.luminosity(empire.selectedAO));
		this.add(Labels.string("X: " + empire.selectedAO.starSystem.coordinateX));
		this.add(Labels.string("Y: " + empire.selectedAO.starSystem.coordinateY));
		
//		this.add(Labels.tidalForce(empire.selectedAO));
		for(AOSpecial special : empire.selectedAO.specials){
			this.add(Labels.special(special));
		}
	}
}

public static class aoNameListener implements ActionListener {
public aoNameListener() {
}
	@Override
public void actionPerformed(ActionEvent e) {			
		
//	FUMain.mainFrame.getContentPane().removeAll();
//	FUMain.mainFrame.openSpeciesSelectionScreen();
//	FUMain.mainFrame.revalidate();
	}
}

}	

