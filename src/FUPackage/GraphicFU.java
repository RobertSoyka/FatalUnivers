package FUPackage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphicFU implements IGeneralData{
	public static ImageIcon bgImage;
	static JLabel bgLabel;
	public static JPanel bgPanel = new JPanel();
	public static ImageIcon bgGalaxyImage;
	static JLabel bgGalaxyLabel;
	public static JPanel bgGalaxyPanel = new JPanel();
	
	public static Icon aoIcon[][] = new ImageIcon[24][IGeneralData.planetSizeClasses];
	public static Icon primaryStarIcon[] = new ImageIcon[13];
	public static Icon galaxyStarIcon[] = new ImageIcon[13];
	public static Icon belligerenceIcon[] = new ImageIcon[5];
	public static Icon nutritionIcon[] = new ImageIcon[3];
	public static Icon biotopeIcon[] = new ImageIcon[3];
	public static Icon intellectIcon[] = new ImageIcon[5];
	public static Icon toughnessIcon[] = new ImageIcon[5];
	
	public static Icon markerIcon;
	public static JLabel markerLabel;
	public static Icon markerBigIcon;
	public static JLabel markerBigLabel;
	public static Icon tempIcon;
	public static Icon gravIcon;
	public static Icon diameterIcon;
	public static Icon abundanceIcon;
	public static Icon addIcon;
	public static Icon reduceIcon;
	
	public static Icon arrowUp2 = new ImageIcon(GraphicFU.class.getResource("GUI/arrowUp2.png"));
	public static Icon arrowUp = new ImageIcon(GraphicFU.class.getResource("GUI/arrowUp.png"));
	public static Icon arrowNeutral = new ImageIcon(GraphicFU.class.getResource("GUI/arrowNeutral.png"));
	public static Icon arrowDown = new ImageIcon(GraphicFU.class.getResource("GUI/arrowDown.png"));
	public static Icon arrowDown2 = new ImageIcon(GraphicFU.class.getResource("GUI/arrowDown2.png"));
	
	public static Icon farmLandIcon;
	public static Icon farmWaterIcon;
	public static Icon miningIcon;
	public static Icon industryIcon;
	public static Icon servicesIcon;
	public static Icon publicServicesIcon;
	public static Icon researchIcon;
	public static Icon innovationIcon;
	public static Icon energyIcon;
	
	
	public static Icon foodIcon;
	public static Icon resourcesIcon;
	public static Icon goodsIcon;
	
	public static Icon hydrocarbonsIcon;
	public static Icon rareElementsIcon;
	public static Icon preciousMetalsIcon;
	public static Icon isotopesIcon;
	public static Icon elementGIcon;
	
	public static Icon artifactsIcon;
	
	public static Icon moneyIcon;
	
	
	public static Icon atmosphereIcon;
	public static Icon waterIcon;
	public static Icon qMarkIcon;
	public static Icon luminosityIcon;
	public static Icon massIcon;
	public static Icon starDistanceIcon;
	public static Icon moonDistanceIcon;
	public static Icon turnIcon;
	public static Icon empireIcon;
	public static Icon biotopesIcon;
	public static Icon skeletonIcon;
	public static Icon reproductionIcon;
	public static Icon desertDwellersIcon;
	public static Icon coldBloodedIcon;
	public static Icon subterraneanIcon;
	public static Icon spatialMovementIcon;
	public static Icon shapeshifterIcon;
	public static Icon combatEfficiencyIcon;
	public static Icon bodyArmorIcon;
	public static Icon bodyCamouflageIcon;
	public static Icon evasionIcon;
	public static Icon riotingIcon;
	public static Icon foodDemandIcon;
	public static Icon tempSensitivityIcon;
	public static Icon moodSensitivityIcon;
	public static Icon cyberneticIcon;
	
	public static Icon[] flagIcon = new Icon[flagSymbols+1];
	public static Icon[] flagBig = new Icon[flagSymbols+1];
	
	public static void initializeGraphics() {
	initializePlanetIcons();
	initializeBG();
	initializeGalaxyStarIcons();
	initializeGalaxyBG();
	initializeMarker();
	initializeGUIIcons();
	initializeSymbols();
	
}	
	
	
public static void initializePlanetIcons() {
	
	for (int planetType = 8; planetType < 13; planetType++ ){
	aoIcon[planetType][0] = new ImageIcon(GraphicFU.class.getResource("Planets/"+ planetType + ".png"));
	for (int planetSize = 1; planetSize < IGeneralData.planetSizeClasses; planetSize ++ ){
			aoIcon[planetType][planetSize] = aoIcon[planetType][0];
	}
	}
	for (int planetType = 13; planetType < 24; planetType++ ){
		for (int planetSize = 0; planetSize < IGeneralData.planetSizeClasses; planetSize ++ ){
			aoIcon[planetType][planetSize] = new ImageIcon(GraphicFU.class.getResource("Planets/"+ planetType + "-"+ planetSize + ".png"));
		}
	}
	aoIcon[0][1] = new ImageIcon(GraphicFU.class.getResource("Planets/0-1.png"));
	
	for (int starType = 1; starType < 13; starType++ ){
		primaryStarIcon[starType] = new ImageIcon(GraphicFU.class.getResource("PrimaryStars/" + starType + ".png"));
		}	
	}

public static void initializeBG() {
	bgImage = new ImageIcon(GraphicFU.class.getResource("Background/Stars.png"));
	bgLabel = new JLabel(bgImage);
	bgPanel.setLayout(null); 
	bgPanel.setBounds(0, 0, resolutionX, resolutionY);
	bgLabel.setBounds(0, 0, resolutionX, resolutionY);
	bgPanel.add(bgLabel);
	}

public static void initializeGalaxyStarIcons() {
	for (int starType = 1; starType < 13; starType++ ){
			galaxyStarIcon[starType] = new ImageIcon(GraphicFU.class.getResource("GalaxyStars/galaxyStar"+ starType + ".png"));
		}
	}

public static void initializeGalaxyBG() {
	bgGalaxyImage = new ImageIcon(GraphicFU.class.getResource("Background/GalaxyExtraLarge.jpg"));
	bgGalaxyLabel = new JLabel(bgGalaxyImage);
	bgGalaxyPanel.setLayout(null); 
	bgGalaxyPanel.setBounds(0, 0, resolutionX, resolutionY);
	bgGalaxyLabel.setBounds(0, 0, resolutionX, resolutionY);
	bgGalaxyPanel.add(bgGalaxyLabel);
	}


public static void initializeMarker() {
	markerIcon = new ImageIcon(GraphicFU.class.getResource("GUI/marker.png"));
	markerLabel = new JLabel(markerIcon);
	markerBigIcon = new ImageIcon(GraphicFU.class.getResource("GUI/markerBig.png"));
	markerBigLabel = new JLabel(markerBigIcon);
	}
public static void initializeGUIIcons() {
	// Commodities
	foodIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/food.png"));
	abundanceIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/resources.png"));
	resourcesIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/resources.png"));
	goodsIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/goods.png"));
	
	
	hydrocarbonsIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/hydrocarbons.png"));
	preciousMetalsIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/preciousMetals.png"));
	rareElementsIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/rareElements.png"));
	isotopesIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/isotopes.png"));
	elementGIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/elementG.png"));
	
	artifactsIcon = new ImageIcon(GraphicFU.class.getResource("GUI/commodities/artifacts.png"));
	
	
	// GUI
	gravIcon = new ImageIcon(GraphicFU.class.getResource("GUI/grav.png"));
	tempIcon = new ImageIcon(GraphicFU.class.getResource("GUI/temp.png"));
	diameterIcon = new ImageIcon(GraphicFU.class.getResource("GUI/diameter.png"));
	atmosphereIcon = new ImageIcon(GraphicFU.class.getResource("GUI/atmosphere.png"));
	farmLandIcon = new ImageIcon(GraphicFU.class.getResource("GUI/farmLand.png"));
	farmWaterIcon = new ImageIcon(GraphicFU.class.getResource("GUI/farmWater.png"));
	waterIcon = new ImageIcon(GraphicFU.class.getResource("GUI/water.png"));
	farmLandIcon = new ImageIcon(GraphicFU.class.getResource("GUI/farmLand.png"));
	qMarkIcon = new ImageIcon(GraphicFU.class.getResource("GUI/qMark.png"));
	publicServicesIcon = new ImageIcon(GraphicFU.class.getResource("GUI/publicServices.png"));
	energyIcon = new ImageIcon(GraphicFU.class.getResource("GUI/energy.png"));
	addIcon = new ImageIcon(GraphicFU.class.getResource("GUI/add.png"));
	reduceIcon = new ImageIcon(GraphicFU.class.getResource("GUI/reduce.png"));
	
	moneyIcon = new ImageIcon(GraphicFU.class.getResource("GUI/money.png"));
	luminosityIcon = new ImageIcon(GraphicFU.class.getResource("GUI/luminosity.png"));
	massIcon = new ImageIcon(GraphicFU.class.getResource("GUI/mass.png"));
	starDistanceIcon = new ImageIcon(GraphicFU.class.getResource("GUI/starDistance.png"));
	moonDistanceIcon = new ImageIcon(GraphicFU.class.getResource("GUI/moonDistance.png"));
	turnIcon = new ImageIcon(GraphicFU.class.getResource("GUI/turn.png"));
	empireIcon = new ImageIcon(GraphicFU.class.getResource("GUI/empire.png"));
	biotopesIcon = new ImageIcon(GraphicFU.class.getResource("GUI/biotope.png"));
	skeletonIcon = new ImageIcon(GraphicFU.class.getResource("GUI/skeleton.png"));
	reproductionIcon = new ImageIcon(GraphicFU.class.getResource("GUI/reproduction.png"));
	desertDwellersIcon = new ImageIcon(GraphicFU.class.getResource("GUI/desertDwellers.png"));
	coldBloodedIcon = new ImageIcon(GraphicFU.class.getResource("GUI/coldBlooded.png"));
	subterraneanIcon = new ImageIcon(GraphicFU.class.getResource("GUI/subterranean.png"));
	spatialMovementIcon = new ImageIcon(GraphicFU.class.getResource("GUI/spatialMovement.png"));
	shapeshifterIcon = new ImageIcon(GraphicFU.class.getResource("GUI/shapeshifter.png"));
	miningIcon = new ImageIcon(GraphicFU.class.getResource("GUI/mining.png"));
	industryIcon = new ImageIcon(GraphicFU.class.getResource("GUI/industry.png"));
	servicesIcon = new ImageIcon(GraphicFU.class.getResource("GUI/services.png"));
	researchIcon = new ImageIcon(GraphicFU.class.getResource("GUI/research.png"));
	innovationIcon = new ImageIcon(GraphicFU.class.getResource("GUI/innovation.png"));
	combatEfficiencyIcon = new ImageIcon(GraphicFU.class.getResource("GUI/combatEfficiency.png"));
	bodyArmorIcon = new ImageIcon(GraphicFU.class.getResource("GUI/bodyArmor.png"));
	bodyCamouflageIcon = new ImageIcon(GraphicFU.class.getResource("GUI/bodyCamouflage.png"));
	evasionIcon = new ImageIcon(GraphicFU.class.getResource("GUI/evasion.png"));
	riotingIcon = new ImageIcon(GraphicFU.class.getResource("GUI/rioting.png"));
	foodDemandIcon = new ImageIcon(GraphicFU.class.getResource("GUI/foodDemand.png"));
	tempSensitivityIcon = new ImageIcon(GraphicFU.class.getResource("GUI/tempSensitivity.png"));
	moodSensitivityIcon = new ImageIcon(GraphicFU.class.getResource("GUI/moodSensitivity.png"));
	cyberneticIcon = new ImageIcon(GraphicFU.class.getResource("GUI/cybernetic.png"));
	
	
}	

	public static void initializeSymbols(){
	for (int i= 0; i < flagSymbols; i++){
		flagIcon[i] = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/000" + i + ".png"));
		}	
	
	for (int i= 0; i < flagSymbols; i++){
		flagBig[i] = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/big00" + i + ".png"));
		}
	}
	
	
	
	public static JPanel getFlagPanel(Empire speces){
		JPanel flagPanel = new JPanel();
		flagPanel.setBackground (new Color (0, 0, 0, 255));
		
		
		return flagPanel;
	}
	
}
