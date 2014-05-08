package FUPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColonyScreen extends JLayeredPane implements IGeneralData {

private TopNavi topNavi;	
	
static Color[] allocationBarColor = {colorFood, colorResources, colorGoods, colorResearch, colorServices, colorPublicServices, colorGoods};

AllocationSlider[]  allocationSlider = new AllocationSlider[7];
JPanel[] allocationPanel = new JPanel[7];
JPanel[] buildingsPanel = new JPanel[7];
JScrollPane[] buildingsScroll = new JScrollPane[7];

JPanel labelPanel = new JPanel();
JScrollPane buildingDScroll;

ColonyScreen(final Empire empire, final Colony colony, final int category, final Building building){

//Screen XXX
	this.setBounds(0, 0, resolutionX, resolutionY);		
	this.add(GraphicFU.bgPanel, 0, 0);
	this.addMouseListener(getBack(empire, colony, category, building));	
	this.topNavi = new TopNavi(empire);
	this.add(this.topNavi, 1, 0);
	

	JPanel colonyPanel = new JPanel();
	colonyPanel.setBounds(0, TopNavi.height, resolutionX, resolutionY - TopNavi.height - bottomPanelHeight);
	colonyPanel.setBorder(GUIBorder);
	colonyPanel.setLayout(new GridLayout(0,3));
	colonyPanel.setOpaque(false);
		
	JPanel sliderPanel = new JPanel();
	sliderPanel.setOpaque(false);
	sliderPanel.setVisible(true);
	sliderPanel.setLayout(new GridLayout(0,1));

	double maxAllocation = 0;
	
	for (int i = 0; i <7 ; i++){
		allocationSlider[i] = new AllocationSlider (allocationBarColor[i]);
		allocationSlider[i].setOpaque(false);
		allocationSlider[i].setVisible(true);
		allocationSlider[i].setLayout(new GridLayout());
	//	allocationSlider[i].setLayout(null);
		allocationSlider[i].addMouseListener(getSliderListener(empire, colony, category, building));
		allocationSlider[i].allocation = colony.allocation[i];
		allocationSlider[i].add(Labels.string((int)(allocationSlider[i].allocation * 1000 ) / 10.0 + "%")); 
		sliderPanel.add(allocationSlider[i]);
		
	//	maxAllocation = Math.max(maxAllocation, allocationSlider[i].allocation);
		
		}
		
		allocationSlider[0].add(Labels.labourForceFood(colony));
		allocationSlider[1].add(Labels.labourForceResources(colony));
		allocationSlider[2].add(Labels.labourForceGoods(colony));
		allocationSlider[3].add(Labels.labourForceResearch(colony));
		allocationSlider[4].add(Labels.labourForceServices(colony));
		allocationSlider[5].add(Labels.labourForcePublicServices(colony));
		allocationSlider[6].add(Labels.label((int)(colony.goods.stock * 10) / 10.0 + " " + language.abbrMegatons, GraphicFU.goodsIcon));


//int distance = (int)((resolutionX -32) / 3 / (maxAllocation * 40.0 + 0.2));
//System.out.print("Distance : " + distance);

//for (int i = 0; i <7 ; i++){
//		int pops = (int) (allocationSlider[i].allocation * 40.0 + 0.2);
//		for (int j = 0; j < pops; j++ ){
		//	JLabel popIcon = Labels.icon(Species.rachni.speciesIcon);
//			JLabel popIcon = Labels.icon(Species.humans.speciesIcon);
//			popIcon.setToolTipText("Nr." + j);
			
		//	if (distance < 16){
		//		if ((j & 1) == 0){
		//			popIcon.setBounds(j * distance, 25, 40, 40);
		//			}
		//		else{
		//			popIcon.setBounds(j * distance, 0, 40, 40);
		//			}
		//		}
		//	else {
//				popIcon.setBounds(j * distance, 10, 40, 40);
		//		}
			
			
	//		allocationSlider[i].add(popIcon);
	//		}
	//	}
		
		
		
		colonyPanel.add(sliderPanel);
		
// LABELS XXX	
	if (category >= 0 && category <= 7 && colony.getAvailableBuildings(category).size() >0){
	JScrollPane sp = ScrollPanes.buildingsAvailable(empire, colony, category, null);
	sp.addMouseListener(getBack(empire, colony, category, building));	
	colonyPanel.add(sp);	
	}
		
		
	else if (building != null) {
	JScrollPane sp = ScrollPanes.buildingDescription(empire, building);
	sp.addMouseListener(getBack(empire, colony, category, building));		
	colonyPanel.add(sp);
} 			

	else {
	JPanel dataPanel = new JPanel();
	dataPanel.setOpaque(false);
	dataPanel.setVisible(true);
	dataPanel.setLayout(new GridLayout(0,1));
	
	
	for (int i = 0; i <7 ; i++){
		allocationPanel[i] = new JPanel();
		allocationPanel[i].setOpaque(false);
		allocationPanel[i].setLayout(new GridLayout());
		allocationPanel[i].addMouseListener(getBack(empire, colony, category, building));
		dataPanel.add(allocationPanel[i]);
		}
	
//	allocationPanel[0].add(Labels.labourForceFood(colony),c);
//	allocationPanel[1].add(Labels.labourForceResources(colony),c);
//	allocationPanel[2].add(Labels.labourForceGoods(colony),c);
//	allocationPanel[3].add(Labels.labourForceResearch(colony),c);
//	allocationPanel[4].add(Labels.labourForceServices(colony),c);
//	allocationPanel[5].add(Labels.labourForcePublicServices(colony),c);
//	allocationPanel[6].add(Labels.labourForce(colony),c);
	
//	allocationPanel[0].add(Labels.string((int)(colony.bProductivityFood * 1000) / 10.0 + " %"),c);
//	allocationPanel[1].add(Labels.string((int)(colony.bProductivityResources * 1000) / 10.0 + " %"),c);
//	allocationPanel[2].add(Labels.string((int)(colony.bProductivityGoods * 1000) / 10.0 + " %"),c);
//	allocationPanel[3].add(Labels.string((int)(colony.bProductivityResearch * 1000) / 10.0 + " %"),c);
//	allocationPanel[4].add(Labels.string((int)(colony.bWorkersServices	 * 1000) / 10.0 + " %"),c);
//	allocationPanel[5].add(Labels.string((int)(colony.bWorkersPublic * 1000) / 10.0 + " %"),c);
	
	allocationPanel[0].add(Labels.commodity(colony.commodity[0]));
	allocationPanel[1].add(Labels.commodity(colony.resources));
	allocationPanel[2].add(Labels.commodity(colony.goods));
	allocationPanel[3].add(Labels.label((int)(colony.research.output * 10) / 10.0 + " " + language.abbrResearchUnits, GraphicFU.researchIcon));
	allocationPanel[4].add(Labels.label((int)(colony.services.output * 10) / 10.0 + " " + language.abbrBillionCredits, GraphicFU.servicesIcon));
	allocationPanel[5].add(Labels.commodity(colony.money));
	allocationPanel[6].add(Labels.string((int)(colony.getGDP() * 10) / 10.0 + " " + language.abbrBillionCredits));
	
	if (colony.getBalanceFood() > 0) {
		allocationPanel[0].add(Labels.label("+"+(int)(colony.getBalanceFood() * 10)/10.0  + " " + language.abbrMegatons, GraphicFU.arrowUp2 ));
		}
	else if (colony.getBalanceFood() < 0) {
		allocationPanel[0].add(Labels.label((int)(colony.getBalanceFood() * 10)/10.0  + " " + language.abbrMegatons, GraphicFU.arrowDown2 ));	
		}
	else {
		allocationPanel[0].add(Labels.label((int)(colony.getBalanceFood() * 10)/10.0  + " " + language.abbrMegatons, GraphicFU.arrowNeutral ));	
		}
	
	if (colony.getBalanceResources() > 0) {
		allocationPanel[1].add(Labels.label("+" + (int)(colony.getBalanceResources() * 10) / 10.0 + " " + language.abbrMegatons, GraphicFU.arrowUp2));
		}
	else if (colony.getBalanceResources() < 0) {
		allocationPanel[1].add(Labels.label((int)(colony.getBalanceResources() * 10) / 10.0 + " " + language.abbrMegatons, GraphicFU.arrowDown2));
		}
	else {
		allocationPanel[1].add(Labels.label((int)(colony.getBalanceResources() * 10) / 10.0 + " " + language.abbrMegatons, GraphicFU.arrowNeutral));	
		}
	
	if (colony.getBalanceGoods() > 0) {
		allocationPanel[2].add(Labels.label("+"+(int)(colony.getBalanceGoods() * 10)/10.0  + " " + language.abbrMegatons, GraphicFU.arrowUp2 ));
		}
	else if (colony.getBalanceGoods() < 0) {
		allocationPanel[2].add(Labels.label((int)(colony.getBalanceGoods() * 10)/10.0  + " " + language.abbrMegatons, GraphicFU.arrowDown2 ));	
		}
	else {
		allocationPanel[2].add(Labels.label((int)(colony.getBalanceGoods() * 10)/10.0  + " " + language.abbrMegatons, GraphicFU.arrowNeutral ));	
		}
	
	allocationPanel[3].add(Labels.label((int)(colony.innovation.output * 10) / 10.0 + " " + language.abbrResearchUnits, GraphicFU.innovationIcon));
	allocationPanel[4].add(Labels.label((int)(colony.incomeAverage * 10000) / 10.0 + " " + "Cr./p", GraphicFU.moneyIcon));
	
	if (colony.getTax() - colony.getPublicExpenses() > 0) {
		allocationPanel[5].add(Labels.label("+"+(int)((colony.getTax() - colony.getPublicExpenses()) * 10) / 10.0 + " " + language.abbrBillionCredits, GraphicFU.arrowUp2  ));
		}
	else if (colony.getTax() - colony.getPublicExpenses() < 0) {
		allocationPanel[5].add(Labels.label((int)((colony.getTax() - colony.getPublicExpenses()) * 10) / 10.0 + " " + language.abbrBillionCredits, GraphicFU.arrowDown2  ));	
		}
	else {
		allocationPanel[5].add(Labels.label((int)((colony.getTax() - colony.getPublicExpenses()) * 10) / 10.0 + " " + language.abbrBillionCredits, GraphicFU.arrowUp2  ));	
		}
		
	
	allocationPanel[6].add(Labels.string((int)(colony.administration * 1000) / 10.0 + " %"));
	
	
	
//	allocationPanel[0].add(Labels.string((int)(colony.getIncomeFood() * 10) / 10.0 + " " + language.abbrBillionCredits),c);
//	allocationPanel[1].add(Labels.string((int)(colony.getIncomeResources() * 10) / 10.0 + " " + language.abbrBillionCredits),c);
//	allocationPanel[2].add(Labels.string((int)(colony.getIncomeGoods() * 10) / 10.0 + " " + language.abbrBillionCredits),c);
//	allocationPanel[3].add(Labels.string((int)(colony.getIncomeResearch() * 10) / 10.0 + " " + language.abbrBillionCredits),c);
//	allocationPanel[4].add(Labels.string((int)(colony.getIncomeServices() * 10) / 10.0 + " " + language.abbrBillionCredits),c);
//	allocationPanel[5].add(Labels.string((int)(colony.getIncomePublicServices() * 10) / 10.0 + " "  + language.abbrBillionCredits),c);
//	allocationPanel[6].add(Labels.string((int)(colony.getGDP() * 10) / 10.0 + " " + language.abbrBillionCredits),c);
	
	colonyPanel.add(dataPanel);	
}	
	
	
	
// BUILDINGS XXX	

JPanel buildingPanel = new JPanel();
buildingPanel.setOpaque(false);
buildingPanel.setVisible(true);
buildingPanel.setLayout(new GridLayout(0,1));

JLabel buildOption[] = new JLabel[7];



for (int i = 0; i <7 ; i++){	
	buildingsPanel[i] = new JPanel();
	buildingsPanel[i].setOpaque(false);
	buildingsPanel[i].setLayout(new FlowLayout());
	buildingsPanel[i].addMouseListener(getBack(empire, colony, category, building));
		
	buildingsScroll[i] = new JScrollPane(buildingsPanel[i], ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	buildingsScroll[i].setOpaque(false);
	buildingsScroll[i].getViewport().setOpaque(false);
	buildingsScroll[i].setWheelScrollingEnabled(true);
	buildingsScroll[i].getHorizontalScrollBar().setPreferredSize(new Dimension(0, 5));
	
	if (colony.getAvailableBuildings(i).size()> 0){
		buildOption[i] = Labels.icon(GraphicFU.addIcon);
		buildOption[i].setBorder(new EmptyBorder(0, 0, 10, 0));
		buildOption[i].addMouseListener(getBuildOptionsML(empire, colony, i));
		buildingsPanel[i].add(buildOption[i]);
		}
	
	buildingPanel.add(buildingsScroll[i]);
	}

for (int i = 0; i <7 ; i++){
	for(Building buildingX : colony.buildings){
		if (buildingX.buildingType.classification == i){
			BuildingButton bb = new BuildingButton(empire, buildingX);
			bb.setBorder(new EmptyBorder(0, 0, 15, 0));
			buildingsPanel[i].add(bb);
			}
		}
	}

	colonyPanel.add(buildingPanel);
	
	
	this.add(colonyPanel, 1 ,0);
	
	// LABEL PANEL XXX
	
	this.add(new AODescriptionPanel(empire), 1, 0);
	
	this.topNavi.turnButton.addMouseListener(new MouseListener()	{
		
        public void mouseClicked(MouseEvent e) {        				
        }
        public void mousePressed(MouseEvent e) {
       		FUMain.mainFrame.openColonyScreen(empire, colony, category, building);

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

// MOUSELISTENERS XXX
public MouseListener getBack(final Empire empire, final Colony colony, final int category, final Building building) {
	MouseListener back = new MouseListener()	{		
    public void mouseClicked(MouseEvent e) {        				
    }
    public void mousePressed(MouseEvent e) {
    	if (e.getButton() == 3) {
    		if (category >= 0 | !(building == null)){
    			FUMain.mainFrame.openColonyScreen(empire, colony, -1, null);
    			} 		
    		else {
    			FUMain.mainFrame.openStarSystemScreen(empire, colony.location.starSystem);
    		}
    	}
    }  
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
	};
	return back;
}


// XXX
public MouseListener getSliderListener(final Empire empire, final Colony colony, final int category, final Building building) {
		MouseListener sliderListener = new MouseListener(){
    	public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {
        	AllocationSlider source = (AllocationSlider)e.getSource();
        	if (e.getButton() == 1) {
        		for (int i = 0; i <4 ; i++){
        			if(source == allocationSlider[i]){
        				colony.allocation[i] = (double)(e.getX()) /(double)(source.getSize().width);
        				
        				colony.recalculateAllocation(i);
        				FUMain.mainFrame.openColonyScreen(empire, colony, category, building);
        				}
        			}
        	//	if (source == allocationSlider[6]){
        	//		colony.allocation[6] = (double)(e.getX()) /(double)(source.getSize().width);
        	//		FUMain.mainFrame.openColonyScreen(empire, colony, -1, null);
        	//		}
        		}
        	if (e.getButton() == 3) {
        		for (int i = 0; i < 4 ; i++){
        		if (e.getComponent() == allocationSlider[i]){
           			colony.allocationFixed[i] = !colony.allocationFixed[i];
        			}
        		}
        	}
        }
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		};
	return sliderListener;
    }

// XXX

public MouseListener getBuildOptionsML (final Empire empire, final Colony colony, final int category){ 
	MouseListener buildOptionsML = new MouseListener()	{
	public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {
    	if (e.getButton() == 1) {
    		FUMain.mainFrame.openColonyScreen(empire, colony, category, null);
    		}
    	if (e.getButton() == 3) {
    		FUMain.mainFrame.openColonyScreen(empire, colony, -1, null);
    	}
    }  
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
	};
	return buildOptionsML;
	}

}