package FUPackage;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;


public class SpeciesSelectionScreen extends JLayeredPane implements IGeneralData {
static final int speciesSelectionWidth = (int)(resolutionX * 0.15)+ 1 ; 	
public static Species selectedSpecies = Species.humans;

private TopNavi topNavi;	

static MouseListener speciesSelector = new MouseListener()	{

	
	
    public void mouseClicked(MouseEvent e) {        				
    }
    public void mousePressed(MouseEvent e) {
    	SpeciesButton speciesButton = (SpeciesButton) e.getComponent();
    	Species species = speciesButton.species; 
    	if (e.getButton() == 1) {
    			selectedSpecies = species; 		
    			FUMain.mainFrame.openSpeciesSelectionScreen(Species.humans.empire);  // Quick Fix XXX 
    			}
    	else if (e.getButton() == 3) {
		FUMain.mainFrame.openGalaxyScreen(Species.humans.empire); // Quick Fix XXX
    	}
    }
    
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    
};

public SpeciesSelectionScreen(Empire empire){
	
	this.setBounds(0, 0, resolutionX, resolutionY);		
	this.add(GraphicFU.bgPanel, 1, 0);
	
	this.topNavi = new TopNavi(empire);
	this.add(this.topNavi, 3, 0);
		
	JPanel speciesSelection = new JPanel();
	speciesSelection.setBackground (new Color (0, 0, 0, 0));
	speciesSelection.setBounds(0, TopNavi.height, (int)(resolutionX * 0.15), resolutionY - TopNavi.height - 34);
	//speciesSelection.setBorder(GUIBorder);
	speciesSelection.setOpaque(false);
	speciesSelection.setLayout(new GridLayout(0,1));
	
	for(Species species : Galaxy.availableSpecies) { 
		SpeciesButton speciesButton = new SpeciesButton(species);
		speciesButton.addMouseListener(speciesSelector);
		if (speciesButton.species == selectedSpecies){
			speciesButton.setBorder(GUIBorder); 
		}
		
		speciesSelection.add(speciesButton);
	}		
		
	JScrollPane speciesScroll = new JScrollPane(speciesSelection, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	speciesScroll.setOpaque(false);
	speciesScroll.getViewport().setOpaque(false);
	speciesScroll.setWheelScrollingEnabled(true);
	//speciesScroll.getViewport().setBounds(100, 100, 100, 100);
	speciesScroll.setBounds(0, TopNavi.height, speciesSelectionWidth, resolutionY - TopNavi.height);
	
	

		this.add(speciesSelection, 2, 0);
	
	
		JLabel speciesPic = new JLabel(selectedSpecies.getSpeciesBig(), JLabel.CENTER); 
		speciesPic.setOpaque(true);
		speciesPic.setVisible(true);		
		speciesPic.setBackground (new Color (0, 0, 0, 0));
		speciesPic.setBounds(speciesSelectionWidth, TopNavi.height, 256, 256);	
		
		this.add(speciesPic, 3, 0);
	
	
		JLabel speciesFlag = new JLabel(selectedSpecies.getFlagBig(), JLabel.CENTER); 
		speciesFlag.setOpaque(true);
		speciesFlag.setVisible(true);	
		speciesFlag.setBackground(selectedSpecies.getColor());
		speciesFlag.setBounds(resolutionX - 384 - 5, TopNavi.height, 384, 256);
	
		this.add(speciesFlag, 2, 0);
		
		
		JPanel panelTraits = new JPanel();
		panelTraits.setLayout(new GridLayout(0,4));
		panelTraits.setBounds(speciesSelectionWidth, TopNavi.height + 266, resolutionX - speciesSelectionWidth - 5, 120);
		panelTraits.setOpaque(false);
		panelTraits.setBackground (new Color (0, 0, 0, 0));
	//	panelTraits.setBorder(GUIBorder);
		
		panelTraits.add(Labels.speciesName(selectedSpecies));
		panelTraits.add(Labels.speciesNameEmpire(selectedSpecies));
		panelTraits.add(Labels.speciesSociety(selectedSpecies));
		panelTraits.add(Labels.speciesBelligerence(selectedSpecies));
		panelTraits.add(Labels.speciesBiotope(selectedSpecies));
		panelTraits.add(Labels.speciesGravOptimum(selectedSpecies));
		panelTraits.add(Labels.speciesTempOptimum(selectedSpecies));
		panelTraits.add(Labels.speciesNutrition(selectedSpecies));
		panelTraits.add(Labels.speciesReproductionMode(selectedSpecies));
		panelTraits.add(Labels.speciesLifeSpan(selectedSpecies));
		panelTraits.add(Labels.speciesIntellect(selectedSpecies));
		panelTraits.add(Labels.speciesSkeleton(selectedSpecies));
		

		this.add(panelTraits, 2, 0);
	

		JPanel panelSpecial = new JPanel();
		this.add(panelSpecial, 2, 0);
		
		panelSpecial.setLayout(new GridLayout(0,4));
		panelSpecial.setBounds(speciesSelectionWidth, TopNavi.height + 266 + 130, resolutionX - speciesSelectionWidth-5, 60);
		panelSpecial.setOpaque(false);
	//	panelSpecial.setBorder(GUIBorder);
		panelSpecial.setBackground (new Color (0, 0, 0, 0));
		
		Set<SpeciesTrait> traits = selectedSpecies.specialTraits;
		for(SpeciesTrait t : traits)
			panelSpecial.add(Labels.specialSpeciesTrait(t));
		
		this.add(panelSpecial, 2, 0);
		
		JPanel panelAggregated = new JPanel();
		panelAggregated.setLayout(new GridLayout(0,4));
		panelAggregated.setBounds(speciesSelectionWidth, TopNavi.height + 266 + 200, resolutionX - speciesSelectionWidth-5, resolutionY - (TopNavi.height + 266 + 200) -5 );
		panelAggregated.setOpaque(true);
	//	panelAggregated.setBorder(GUIBorder);
		panelAggregated.setBackground (new Color (0, 0, 0, 0));	
	
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.waterOptimum));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.tempSensitivity));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.foodOutput));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.foodDemand));
		
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.resourcesOutput));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.goodsOutput));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.researchOutput));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.innovationOutput));
		
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.moodSensitivity));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.riot));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.birthRate));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.mortalityRate));
				
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.combatEfficiency));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.bodyArmor));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.bodyCamouflage));
		panelAggregated.add(Labels.modifierLabel(selectedSpecies.evasion));
				
		this.add(panelAggregated, 2, 0);
	}	
}

