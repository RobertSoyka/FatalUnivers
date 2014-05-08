package FUPackage;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements IGeneralData {

	
public MainFrame() {
	}

public void openStarSystemScreen(Empire empire, StarSystem starSystem_){
	FUMain.mainFrame.getContentPane().removeAll();
	add(new StarSystemScreen(empire, starSystem_));
	FUMain.mainFrame.validate();
	}

public void openColonyScreen(Empire empire, Colony colony, int category, Building building){ 
	FUMain.mainFrame.getContentPane().removeAll();
	add(new ColonyScreen(empire, colony, category, building));
	FUMain.mainFrame.validate();
	}

public void openGalaxyScreen(Empire empire){ 
	FUMain.mainFrame.getContentPane().removeAll();
	add(new GalaxyScreen(empire));
	FUMain.mainFrame.validate();
	}

public void openSpeciesSelectionScreen(Empire empire){ 
	FUMain.mainFrame.getContentPane().removeAll();
	add(new SpeciesSelectionScreen(empire));
	FUMain.mainFrame.validate();
	}

public void openResearchScreen(Empire empire, ResearchProject rP){ 
	FUMain.mainFrame.getContentPane().removeAll();
	add(new ResearchScreen(empire, rP));
	FUMain.mainFrame.validate();
	}

public void openEmpireScreen(Empire empire){ 
	FUMain.mainFrame.getContentPane().removeAll();
	add(new EmpireScreen(empire));
	FUMain.mainFrame.validate();
	}


}