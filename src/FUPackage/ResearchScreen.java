package FUPackage;

import java.awt.Color;
import java.awt.Dimension;
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


public class ResearchScreen extends JLayeredPane implements IGeneralData {
	
public static int researchProjectWidth = 240;
public static int researchProjectHeight = 44;
public static int researchProjectDistanceX = 60;
public static int researchProjectDistanceY = 16;

public static int bottomPanelHeight = 80;

private TopNavi topNavi;

private JScrollPane details;
private JPanel detailsPanel = new JPanel();

private JScrollPane techTree;
private JPanel techTreePanel = new JPanel();

private JScrollPane runningProjects;
private JPanel runningProjectsPanel = new JPanel();


public ResearchScreen(final Empire empire, final ResearchProject researchProject){
	
	this.setBounds(0, 0, resolutionX, resolutionY);		
	this.add(GraphicFU.bgPanel, 1, 0);
	
	this.topNavi = new TopNavi(empire);
	this.add(this.topNavi, 3, 0);
	
	this.detailsPanel.setOpaque(false);
	this.detailsPanel.setLayout(new GridLayout(0,1));
	
	if (researchProject != null){
		detailsPanel.add(Labels.label(researchProject.technology.name, researchProject.technology.icon));
		detailsPanel.add(Labels.string((int)(researchProject.researchInvested * 10.0)/10.0 + "/" + researchProject.technology.costs + " " + language.abbrResearchUnits));
		if (!researchProject.technology.requiredTechnology.isEmpty()){
			detailsPanel.add(Labels.string(language.requiredTechnology + ":"));
			for (final Technology technology : researchProject.technology.requiredTechnology){
				JLabel label = Labels.label(technology.name, technology.icon);
				label.addMouseListener(new MouseListener()	{
					
			        public void mouseClicked(MouseEvent e) {        				
			        }
			        public void mousePressed(MouseEvent e) {
			        	if (e.getButton() == 1 ) {
			        		empire.techTreeX = Math.max(0,technology.positionX * (researchProjectWidth + researchProjectDistanceX) - (int)(resolutionX * 0.25));
			        		empire.techTreeY = Math.max(0, technology.positionY * (researchProjectHeight + researchProjectDistanceY) - (int)((resolutionY - TopNavi.height- bottomPanelHeight) * 0.5));
			        		for (ResearchProject resProj : empire.researchProjects){
			        			if (resProj.technology == technology){
			        				FUMain.mainFrame.openResearchScreen(empire, resProj);
			        				break;
			        				}
			        			}
			           		}
			        	if (e.getButton() == 3 ) {
			        		empire.techTreeX = techTree.getHorizontalScrollBar().getValue();
			        		empire.techTreeY = techTree.getVerticalScrollBar().getValue();
			        		FUMain.mainFrame.openResearchScreen(empire, null);
			           		}
			        }
					@Override
					public void mouseEntered(MouseEvent e) {}
					@Override
					public void mouseExited(MouseEvent e) {}
					@Override
					public void mouseReleased(MouseEvent e) {}
				});
				detailsPanel.add(label);
				}
			}
		
		if (!researchProject.technology.allowsBuilding.isEmpty()){
			detailsPanel.add(Labels.string(language.allowsBuilding + ":"));
			for (BuildingType buildingType : researchProject.technology.allowsBuilding){
				detailsPanel.add(Labels.label(buildingType.name, buildingType.icon));
				}
			}
		if (!researchProject.technology.allowsTechnology.isEmpty()){
			detailsPanel.add(Labels.string(language.allowsTechnology + ":"));
			for (final Technology technology : researchProject.technology.allowsTechnology){
				JLabel label = Labels.label(technology.name, technology.icon);
				label.addMouseListener(new MouseListener()	{
					
			        public void mouseClicked(MouseEvent e) {        				
			        }
			        public void mousePressed(MouseEvent e) {
			        	if (e.getButton() == 1 ) {
			        		empire.techTreeX = Math.max(0,technology.positionX * (researchProjectWidth + researchProjectDistanceX) - (int)(resolutionX * 0.25));
			        		empire.techTreeY = Math.max(0, technology.positionY * (researchProjectHeight + researchProjectDistanceY) - (int)((resolutionY - TopNavi.height- bottomPanelHeight) * 0.5));
			        		for (ResearchProject resProj : empire.researchProjects){
			        			if (resProj.technology == technology){
			        				FUMain.mainFrame.openResearchScreen(empire, resProj);
			        				break;
			        				}
			        			}
			           		}
			        	if (e.getButton() == 3 ) {
			        		empire.techTreeX = techTree.getHorizontalScrollBar().getValue();
			        		empire.techTreeY = techTree.getVerticalScrollBar().getValue();
			        		FUMain.mainFrame.openResearchScreen(empire, null);
			           		}
			        }
					@Override
					public void mouseEntered(MouseEvent e) {}
					@Override
					public void mouseExited(MouseEvent e) {}
					@Override
					public void mouseReleased(MouseEvent e) {}
				});
				detailsPanel.add(label);
				}
			}
		
		detailsPanel.add(Labels.string(researchProject.technology.description));
		}
	else{
		detailsPanel.add(Labels.assetFull(empire.research));
		detailsPanel.add(Labels.assetFull(empire.innovation));
		detailsPanel.add(Labels.assetFull(empire.artifacts));
		detailsPanel.add(Labels.assetFull(empire.bioSamples));		
		}

	this.details = new JScrollPane(this.detailsPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	this.details.setBounds(0, TopNavi.height, (int)(resolutionX / 4),resolutionY - TopNavi.height- bottomPanelHeight);
	this.details.setOpaque(false);
	this.details.getViewport().setOpaque(false);
	this.details.setWheelScrollingEnabled(true);
	this.add(details, 1, 0);	
	
	this.techTreePanel.setOpaque(false);
//	this.techTreePanel.setLayout(new GridLayout(8,0));
	this.techTreePanel.setLayout(null);

	int techTreeHeight = (int)(resolutionY - TopNavi.height- bottomPanelHeight); // 
	int height = (int)( (techTreeHeight -20 )/ 10);
	
	int techTreeX = 0;
	int techTreeY= 0;
	
	for (final ResearchProject researchP : empire.researchProjects){
		if (researchP.technology.category < 9){
			JLabel resLabel = Labels.researchProject(empire, researchP);
			resLabel.addMouseListener(new MouseListener()	{
				
		        public void mouseClicked(MouseEvent e) {        				
		        }
		        public void mousePressed(MouseEvent e) {
		        	if (e.getButton() == 1 ) {
		        		empire.techTreeX = techTree.getHorizontalScrollBar().getValue();
		        		empire.techTreeY = techTree.getVerticalScrollBar().getValue();
		        		if (empire.researchProjectsAvailable.contains(researchP)&& researchP == researchProject && !empire.researchProjectsRunning.contains(researchP) && !empire.technologyKnown.contains(researchP.technology)){
		        			empire.researchProjectsRunning.add(researchP);
		        			}
		        		FUMain.mainFrame.openResearchScreen(empire, researchP);
		           		}
		        	if (e.getButton() == 3 ) {
		        		empire.techTreeX = techTree.getHorizontalScrollBar().getValue();
		        		empire.techTreeY = techTree.getVerticalScrollBar().getValue();
		        		FUMain.mainFrame.openResearchScreen(empire, null);
		           		}
		        }
				@Override
				public void mouseEntered(MouseEvent e) {}
				@Override
				public void mouseExited(MouseEvent e) {}
				@Override
				public void mouseReleased(MouseEvent e) {}
			});		
			
			
			
			resLabel.setToolTipText(researchP.technology.name);
			resLabel.setBounds(researchP.technology.positionX * (researchProjectWidth + researchProjectDistanceX) ,researchP.technology.positionY * (researchProjectHeight + researchProjectDistanceY) ,researchProjectWidth,researchProjectHeight);
			techTreeX = Math.max(techTreeX, researchP.technology.positionX);
			techTreeY = Math.max(techTreeY, researchP.technology.positionY);
			this.techTreePanel.add(resLabel);
			}
		}
	
	this.runningProjectsPanel.setOpaque(false);
	this.runningProjectsPanel.setLayout(new GridLayout(1,0));	
	this.techTreePanel.setBounds(0, 0, (techTreeX + 1 )*(researchProjectWidth + researchProjectDistanceX), (techTreeY + 1 )*(researchProjectHeight+ researchProjectDistanceY));
	this.techTreePanel.setPreferredSize(new Dimension((techTreeX + 1)*(researchProjectWidth + researchProjectDistanceX) ,(techTreeY + 1 )*(researchProjectHeight+ researchProjectDistanceY)));

	this.techTree = new JScrollPane(this.techTreePanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	this.techTree.setBounds((int)(resolutionX / 4), TopNavi.height, resolutionX - (int)(resolutionX / 4)-8,resolutionY - TopNavi.height - bottomPanelHeight); //
	this.techTree.setOpaque(false);
	this.techTree.getViewport().setOpaque(false);
	this.techTree.setWheelScrollingEnabled(true);
	this.add(techTree, 1, 0);
	
	if (researchProject != null){
		for (Technology reqTech : researchProject.technology.requiredTechnology){
			techTreePanel.add(new ResearchProjectConnectionLine(reqTech, researchProject.technology));
			}
		for (Technology allowedTech : researchProject.technology.allowsTechnology){
			techTreePanel.add(new ResearchProjectConnectionLine(researchProject.technology, allowedTech));
			}
		}
	
	this.techTree.getHorizontalScrollBar().setValue(empire.techTreeX);
	this.techTree.getVerticalScrollBar().setValue(empire.techTreeY);
	this.techTree.getViewport().setViewPosition(new java.awt.Point(empire.techTreeX, empire.techTreeY));
	
	for (final ResearchProject runningP : empire.researchProjectsRunning){
		JPanel researchProjectPanel = researchProjectPanel(empire, runningP);
		researchProjectPanel.addMouseListener(new MouseListener()	{
			
	        public void mouseClicked(MouseEvent e) {        				
	        }
	        public void mousePressed(MouseEvent e) {
	        	if (e.getButton() == 1 ) {
	        		empire.techTreeX = techTree.getHorizontalScrollBar().getValue();
	        		empire.techTreeY = techTree.getVerticalScrollBar().getValue();
	        		FUMain.mainFrame.openResearchScreen(empire, runningP);
	           		}
	        	if (e.getButton() == 3 ) {
	        		empire.techTreeX = techTree.getHorizontalScrollBar().getValue();
	        		empire.techTreeY = techTree.getVerticalScrollBar().getValue();
	        		empire.researchProjectsRunning.remove(runningP);
	        		FUMain.mainFrame.openResearchScreen(empire, null);
	           		}
	        }
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
		});
		this.runningProjectsPanel.add(researchProjectPanel);
		}
	this.runningProjects = new JScrollPane(this.runningProjectsPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	this.runningProjects.setBounds(0, resolutionY - bottomPanelHeight, resolutionX, bottomPanelHeight); 
	this.runningProjects.setOpaque(false);
	this.runningProjects.getViewport().setOpaque(false);
	this.runningProjects.setWheelScrollingEnabled(true);

	this.add(runningProjects, 1, 0);
	}

public static JPanel researchProjectPanel(Empire empire, ResearchProject researchProject){
	
	JPanel researchProjectPanel = new JPanel();
	researchProjectPanel.setBorder(GUIBorder);
	researchProjectPanel.setLayout(new GridLayout(0,1));

	researchProjectPanel.setFont(mediumFontItalic);
		if (researchProject.technology.category == 0){
			researchProjectPanel.setBackground(colorFood);
			}
		else if (researchProject.technology.category == 1){
			researchProjectPanel.setBackground(colorResources);
			}
		else if (researchProject.technology.category == 3){
			researchProjectPanel.setBackground(colorGoods);
			}
		else if (researchProject.technology.category == 2){
			researchProjectPanel.setBackground(colorServices);
			}
		else if (researchProject.technology.category == 4){
			researchProjectPanel.setBackground(colorResearch);
			}
		else if (researchProject.technology.category == 5){
			researchProjectPanel.setBackground(colorPublicServices);
			}
		
	
	JLabel label = new JLabel(researchProject.technology.name,  researchProject.technology.icon, JLabel.CENTER);
	label.setVisible(true);
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setVerticalAlignment(JLabel.CENTER);
	label.setOpaque(false);
	label.setForeground(GUIColor);
	label.setFont(mediumFontItalic);
	researchProjectPanel.add(label);
	
	
			
	int turnsLeft = 1 + (int)((researchProject.technology.costs - researchProject.researchInvested) / (empire.getResearchInvestments()+ empire.getInnovationInvestments()));
	JLabel turns = new JLabel( turnsLeft + " " + (turnsLeft > 1? language.turns : language.turn), JLabel.CENTER);
	turns.setVisible(true);
	turns.setHorizontalAlignment(JLabel.CENTER);
	turns.setVerticalAlignment(JLabel.CENTER);
	turns.setOpaque(false);
	turns.setForeground(GUIColor);
	turns.setFont(mediumFontItalic);
	researchProjectPanel.add(turns);
	
	return researchProjectPanel;
	}	
}	


