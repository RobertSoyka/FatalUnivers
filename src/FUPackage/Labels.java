package FUPackage;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.ToolTipManager;

public abstract class Labels  implements IGeneralData{  //extends MainFrame

public static Color moodColor = new Color(255,200,0);	
	
public static void setLabel(JLabel label){	
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		}
	
	
public static JLabel name(AstronomicObject ao){
		JLabel label = new JLabel(ao.getName()); //.toUpperCase()
		setLabel(label);
		label.setFont(bigFont);
		return label;
		}
		
public static JLabel type(AstronomicObject ao){	
		String sizeString = language.sizeAdjective[(int) (ao.getSizer() * (planetSizeClasses))] + " ";
		String orbitType = "";
		if (ao.aoType.asteroidBelt | ao.aoType.isStar){ 
			sizeString = "";
			}		
		if (ao.aoType.asteroidBelt | ao.aoType.isStar){ 
			orbitType = "";
			}
		else if (ao.parent.aoType.isStar){
			orbitType = " " + language.planet;
			}
		else{
			orbitType = " " + language.moon;
			}
				
		String typeAO = sizeString + ao.aoType.getName() + orbitType; //
		JLabel typeLabel = new JLabel(typeAO, JLabel.CENTER);
		typeLabel.setOpaque(false);
		typeLabel.setVisible(true);
		typeLabel.setBackground (new Color (0, 0, 0, 0));
		typeLabel.setHorizontalAlignment(JLabel.LEFT);
		typeLabel.setVerticalAlignment(JLabel.CENTER);
		typeLabel.setForeground(GUIColor);
		typeLabel.setFont(mediumFont);
		
		return typeLabel;
		}


public static JLabel diameter(AstronomicObject ao){
		long diameter = ao.getDiameter();
		String diameterAO = "";
		if (diameter < 1000000){
			diameterAO = (long)(diameter) + " km";
			}
		else if (diameter < 1000000000){
			diameterAO = (double)((long)(diameter/10000))/100 + " Mio. km";
			}
		else {
			diameterAO = (float)((long)(diameter*100/GalaxyParameter.dAU))*100 + " AU";
			}
		JLabel diameterLabel = new JLabel(diameterAO, GraphicFU.diameterIcon, JLabel.CENTER);
		diameterLabel.setOpaque(false);
		diameterLabel.setVisible(true);
		diameterLabel.setBackground (new Color (0, 0, 0, 0));
		diameterLabel.setHorizontalAlignment(JLabel.LEFT);
		diameterLabel.setVerticalAlignment(JLabel.CENTER);
		diameterLabel.setForeground(GUIColor);
		diameterLabel.setFont(mediumFont);
		return diameterLabel;
		}

public static JLabel temperature(AstronomicObject ao){
		String temperatureAO = new String((int)(ao.getTemperature()- 273) + " °C");
		JLabel temperatureLabel = new JLabel(temperatureAO, GraphicFU.tempIcon, JLabel.CENTER);
		temperatureLabel.setOpaque(false);
		temperatureLabel.setVisible(true);
		temperatureLabel.setBackground (new Color (0, 0, 0, 0));
		temperatureLabel.setHorizontalAlignment(JLabel.LEFT);
		temperatureLabel.setVerticalAlignment(JLabel.CENTER);
		temperatureLabel.setForeground(GUIColor);
		temperatureLabel.setFont(mediumFont);
		return temperatureLabel;
		}

public static JLabel orbitalPeriod(AstronomicObject ao){
	String orbitalPeriodAO; 
	if (ao.getOrbitalPeriod() < 60 ){
		orbitalPeriodAO = ao.getOrbitalPeriod()+ " sec";
		}
	else if (ao.getOrbitalPeriod() < 3600 ){
		orbitalPeriodAO = (int) (ao.getOrbitalPeriod()/6) /10.0 + " min";
		}
	else if (ao.getOrbitalPeriod() < 250000 ){
		orbitalPeriodAO = (int) (ao.getOrbitalPeriod()/360) / 10.0 + " h";
		}
	else if (ao.getOrbitalPeriod() < 80000000 ){
		orbitalPeriodAO = (int) (ao.getOrbitalPeriod()/8640) / 10.0 + " d";
		}
	else {
		orbitalPeriodAO = (int) (ao.getOrbitalPeriod()/3155811.8) / 10.0 + " years";
	}
	
	JLabel orbitalPeriodLabel = new JLabel(orbitalPeriodAO, JLabel.CENTER);
	orbitalPeriodLabel.setOpaque(false);
	orbitalPeriodLabel.setVisible(true);
	orbitalPeriodLabel.setBackground (new Color (0, 0, 0, 0));
	orbitalPeriodLabel.setHorizontalAlignment(JLabel.LEFT);
	orbitalPeriodLabel.setVerticalAlignment(JLabel.CENTER);
	orbitalPeriodLabel.setForeground(GUIColor);
	orbitalPeriodLabel.setFont(mediumFont);
	return orbitalPeriodLabel;
	}

public static JLabel rotationPeriod(AstronomicObject ao){
	String rotationPeriodAO; 
	if (ao.getDayLength() < 60 ){
		rotationPeriodAO = ao.getDayLength()+ " sec";
		}
	else if (ao.getDayLength() < 3600 ){
		rotationPeriodAO = (int) (ao.getDayLength()/6) / 10.0 + " min";
		}
	else if (ao.getDayLength() < 250000 ){
		rotationPeriodAO = (int) (ao.getDayLength()/360) / 10.0 + " h";
		}
	else if (ao.getDayLength() < 80000000 ){
		rotationPeriodAO = (int) (ao.getDayLength()/8640) / 10.0 + " d";
		}
	else {
		rotationPeriodAO = (int) (ao.getDayLength()/3155811.8) / 10.0 + " years";
	}
	
	JLabel rotationPeriodLabel = new JLabel(rotationPeriodAO, JLabel.CENTER);
	rotationPeriodLabel.setOpaque(false);
	rotationPeriodLabel.setVisible(true);
	rotationPeriodLabel.setBackground (new Color (0, 0, 0, 0));
	rotationPeriodLabel.setHorizontalAlignment(JLabel.LEFT);
	rotationPeriodLabel.setVerticalAlignment(JLabel.CENTER);
	rotationPeriodLabel.setForeground(GUIColor);
	rotationPeriodLabel.setFont(mediumFont);
	return rotationPeriodLabel;
	}



public static JLabel luminosity(AstronomicObject ao){		
		String luminosityAO = "";
		if (ao.getLuminosity()< 0.0001){
			luminosityAO = "0% L sol";
			}
		else if (ao.getLuminosity()< 0.1){
			luminosityAO = (int)(ao.getLuminosity()*10000.0)/100.0 + "% L sol";
			}
		else if (ao.getLuminosity() < 1){
			luminosityAO = (int)(ao.getLuminosity()*1000.0)/1000.0 + " x L sol";
			}	
		else if (ao.getLuminosity() < 10){
			luminosityAO = (int)(ao.getLuminosity()*100.0)/100.0 + " x L sol";
			}	
		else if (ao.getLuminosity() < 100){
			luminosityAO = (int)(ao.getLuminosity()*10.0)/10.0 + " x L sol";
			}
		else {
			luminosityAO = (int)(ao.getLuminosity()) + " x L sol";
			}
		JLabel luminosityLabel = new JLabel(luminosityAO, GraphicFU.luminosityIcon, JLabel.CENTER);
		setLabel(luminosityLabel);		
		return luminosityLabel;
		}

public static JLabel specials(AstronomicObject ao){
	String string = "";
	for(AOSpecial special : ao.specials){
		string = string + special.getName() +" ";
		}
	JLabel label = new JLabel(string, JLabel.CENTER);
	setLabel(label);		
	return label;
	}

public static JLabel special(AOSpecial special){
	JLabel label = new JLabel(special.name, JLabel.CENTER);
	setLabel(label);		
	return label;
	}


public static JLabel gravitation(AstronomicObject ao){		
	String gravitationAO = (int)(ao.getGravitation()*100)/100.0 + " g";
	JLabel gravitationLabel = new JLabel(gravitationAO, GraphicFU.gravIcon, JLabel.CENTER);
	gravitationLabel.setOpaque(false);
	gravitationLabel.setVisible(true);
	gravitationLabel.setBackground (new Color (0, 0, 0, 0));
	gravitationLabel.setHorizontalAlignment(JLabel.LEFT);
	gravitationLabel.setVerticalAlignment(JLabel.CENTER);
	gravitationLabel.setForeground(GUIColor);
	gravitationLabel.setFont(mediumFont);
	
	return gravitationLabel;
	}


public static JLabel moons(AstronomicObject ao){		
	
	String string;
	
//	if (ao.orbiters.size() == 0)
//		string = "-";
	if	(ao.orbiters.size() == 1)
		string = ao.orbiters.size() + " " + language.orbiter;
	else 
		string = ao.orbiters.size() + " " + language.orbiters;
	
	JLabel label = new JLabel(string, GraphicFU.moonDistanceIcon, JLabel.CENTER);
	setLabel(label);
	
	return label;
	}

public static JLabel coordinates (AstronomicObject ao){		
	
	String string = "X = " + ao.starSystem.coordinateX + " / Y = " + ao.starSystem.coordinateY;
	JLabel label = new JLabel(string, GraphicFU.luminosityIcon, JLabel.CENTER);
	setLabel(label);
	
	return label;
	}


public static JLabel abundance(AstronomicObject ao){		
	String resourcesAO = (int)(ao.getResources()*100.0) + "%";
	JLabel resourcesLabel = new JLabel(resourcesAO, GraphicFU.abundanceIcon, JLabel.CENTER);
	resourcesLabel.setOpaque(false);
	resourcesLabel.setVisible(true);
	resourcesLabel.setBackground (new Color (0, 0, 0, 0));
	resourcesLabel.setHorizontalAlignment(JLabel.LEFT);
	resourcesLabel.setVerticalAlignment(JLabel.CENTER);
	resourcesLabel.setForeground(GUIColor);
	resourcesLabel.setFont(mediumFont);
	
	return resourcesLabel;
	}

public static JLabel tidalForce(AstronomicObject ao){
double tidalForce;
if (ao.moonID == 0 ){
	tidalForce = 2 * ao.diameter * 1000 * GalaxyParameter.gravConstant * ao.parent.mass * GalaxyParameter.mSun * GalaxyParameter.mEarth / Math.pow(ao.starDistance * 1000, 3);
	}
else {
	tidalForce = 2 * ao.diameter * 1000 * GalaxyParameter.gravConstant * ao.parent.mass * GalaxyParameter.mSun * GalaxyParameter.mEarth / Math.pow(ao.moonDistance * 1000, 3);
	}
JLabel label = new JLabel((int) (tidalForce * 1000000) +" micro g", GraphicFU.gravIcon, JLabel.CENTER);
setLabel(label);	
return label;
}

public static JLabel atmosphere(AstronomicObject ao){
	String pressure; 
	if (ao.getPressure() < 0.1){
		pressure = (int) (ao.getPressure()* 1000) / 1000.0 + " atm";
		}
	else if (ao.getPressure() < 1){
		pressure = (int) (ao.getPressure()* 100) / 100.0 + " atm";
		}
	else {
		pressure = (int) (ao.getPressure()* 10) / 10.0 + " atm";
		}
	
	JLabel label = new JLabel(ao.atmoType.getName() + " - " + pressure, GraphicFU.atmosphereIcon, JLabel.CENTER);
	setLabel(label);	
	return label;
	}

public static JLabel water(AstronomicObject ao){		
	String waterAO = (int)(ao.getWater() * 100.0) + " %";
	JLabel waterLabel = new JLabel(waterAO, GraphicFU.waterIcon, JLabel.CENTER);
	waterLabel.setOpaque(false);
	waterLabel.setVisible(true);
	waterLabel.setBackground (new Color (0, 0, 0, 0));
	waterLabel.setHorizontalAlignment(JLabel.LEFT);
	waterLabel.setVerticalAlignment(JLabel.CENTER);
	waterLabel.setForeground(GUIColor);
	waterLabel.setFont(mediumFont);
	
	return waterLabel;
	}

public static JLabel potentialFarmers(Empire empire, AstronomicObject ao){
	JLabel label = new JLabel(GraphicFU.foodIcon, JLabel.CENTER);
	Species bestFarmers = ao.getBestFarmerSpecies(empire.members);
	if (bestFarmers != null){
		label.setText(ao.getFarmerPotential(bestFarmers) + language.abbrMillion + " (" + bestFarmers.name + ")" );
		}
	else{
		label.setText(language.impossible);
		}
	setLabel(label);
	return label;
	}

public static JLabel potentialFarmers(Empire empire, Colony colony){		
	JLabel label = new JLabel(GraphicFU.foodIcon, JLabel.CENTER);
	if (colony.bestFarmers != null){
		label.setText(colony.location.getFarmerPotential(colony.bestFarmers) + language.abbrMillion + " (" + colony.bestFarmers.name + ")" );
		}
	else{
		label.setText(language.impossible);
		}
	setLabel(label);
	return label;
	}


public static JLabel ecoSystem(AstronomicObject ao){	
	String farmWaterAO = ao.getEcosystem()*100 + " %";		
	JLabel ecoSystemLabel = new JLabel(farmWaterAO, GraphicFU.farmWaterIcon, JLabel.CENTER);
	ecoSystemLabel.setOpaque(false);
	ecoSystemLabel.setVisible(true);
	ecoSystemLabel.setBackground (new Color (0, 0, 0, 0));
	ecoSystemLabel.setHorizontalAlignment(JLabel.LEFT);
	ecoSystemLabel.setVerticalAlignment(JLabel.CENTER);
	ecoSystemLabel.setForeground(GUIColor);
	ecoSystemLabel.setFont(mediumFont);
	
	return ecoSystemLabel;
	}
public static JLabel mass(AstronomicObject ao){	
	String massAO;
	if (ao.getMass()< 0.000001)
		massAO = (int)(ao.getMass()*GalaxyParameter.mSun*10000)/100.0 + " % " + language.earthMass;
	else if (ao.getMass()< 0.01)
		massAO = (int)(ao.getMass()*GalaxyParameter.mSun*10)/10.0 + " x " + language.earthMass;
	else if (ao.getMass()< 1)
		massAO = (int)(ao.getMass()*1000)/10.0 + " % " + language.solarMass;
	else if (ao.getMass()< 10)
		massAO = (int)(ao.getMass()*100)/100.0 + " x " + language.solarMass;
	else if (ao.getMass()< 100)
		massAO = (int)(ao.getMass()*10)/10.0 + " x " + language.solarMass;
	else {
		massAO = (int)(ao.getMass()) + " x " + language.solarMass;
		}
	
	JLabel massLabel = new JLabel(massAO, GraphicFU.massIcon, JLabel.CENTER);
	massLabel.setOpaque(false);
	massLabel.setVisible(true);
	massLabel.setBackground (new Color (0, 0, 0, 0));
	massLabel.setHorizontalAlignment(JLabel.LEFT);
	massLabel.setVerticalAlignment(JLabel.CENTER);
	massLabel.setForeground(GUIColor);
	massLabel.setFont(mediumFont);
	
	return massLabel;
	}
	public static JLabel starDistance(AstronomicObject ao){		
	long starDistance = ao.getStarDistance();
	String starDistanceAO = "";
	if (starDistance < 1000000){
		starDistanceAO = (long)(starDistance) + " km";
		}
	else if (starDistance < 100000000){
		starDistanceAO = (double)((long)(starDistance/10000))/100 + " Mio. km";
		}
	else {
		starDistanceAO = (double)((long)(starDistance*100/GalaxyParameter.dAU))/100 + " AU";
		}
	JLabel starDistanceLabel = new JLabel(starDistanceAO, GraphicFU.starDistanceIcon, JLabel.CENTER);
	starDistanceLabel.setOpaque(false);
	starDistanceLabel.setVisible(true);
	starDistanceLabel.setBackground (new Color (0, 0, 0, 0));
	starDistanceLabel.setHorizontalAlignment(JLabel.LEFT);
	starDistanceLabel.setVerticalAlignment(JLabel.CENTER);
	starDistanceLabel.setForeground(GUIColor);
	starDistanceLabel.setFont(mediumFont);
	
	return starDistanceLabel;
	}

	public static JLabel moonDistance(AstronomicObject ao){		
	long moonDistance = ao.getMoonDistance();
	String moonDistanceAO = "";
	if (moonDistance < 1000000){
		moonDistanceAO = (long)(moonDistance) + " km";
		}
	else if (moonDistance < 100000000){
		moonDistanceAO = (double)((long)(moonDistance/10000))/100 + " Mio. km";
		}
	else {
		moonDistanceAO = (double)((long)(moonDistance*100/GalaxyParameter.dAU))/100 + " AU";
		}
	JLabel moonDistanceLabel = new JLabel(moonDistanceAO, GraphicFU.moonDistanceIcon, JLabel.CENTER);
	moonDistanceLabel.setOpaque(false);
	moonDistanceLabel.setVisible(true);
	moonDistanceLabel.setBackground (new Color (0, 0, 0, 0));
	moonDistanceLabel.setHorizontalAlignment(JLabel.LEFT);
	moonDistanceLabel.setVerticalAlignment(JLabel.CENTER);
	moonDistanceLabel.setForeground(GUIColor);
	moonDistanceLabel.setFont(mediumFont);
	
	return moonDistanceLabel;
	}
		
	public static JLabel speciesName(Species species){		
		JLabel label = new JLabel(species.getName(), species.getSpeciesIcon(), JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		
		return label;
	}
	
	public static JLabel speciesNameEmpire(Species species){		
		JLabel label = new JLabel(species.getEmpireName(), species.getFlagIcon(), JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		
		
		return label;
	}
	
	public static JLabel speciesBiotope(Species species){		
		String string = species.getBiotope().getName();
		JLabel label = new JLabel(string, JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		
		return label;
	}
	
	public static JLabel speciesTempOptimum(Species species){		
		String string = (species.getTempOptimum()- GalaxyParameter.celsius) + "°C";
		JLabel label = new JLabel(string, GraphicFU.tempIcon, JLabel.CENTER );
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		
		return label;	
	
	}
	public static JLabel speciesGravOptimum(Species species){		
		String string = (species.getGravOptimum()/10.0) + "g" ;
		JLabel label = new JLabel(string, GraphicFU.gravIcon, JLabel.CENTER );
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		
		return label;	
	
	}
	
	
	public static JLabel speciesSociety(Species species){		
		String string = species.society.name;
		JLabel label = new JLabel(string, GraphicFU.empireIcon, JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		
		return label;	
	}
	
	public static JLabel speciesSkeleton(Species species){		
		String string = species.getSkeleton().getName();
		JLabel label = new JLabel(string, JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		//label.setToolTipText(language.skeletonDescription);
		
		return label;	
	}

	public static JLabel speciesReproductionMode(Species species){		
		String string = species.getReproduction().getName();
		JLabel label = new JLabel(string, GraphicFU.reproductionIcon, JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		//label.setToolTipText(language.reproductionModeDescription[species.getReproductionMode()]);
		
		return label;	
	}
	
	
	public static JLabel speciesBelligerence(Species species){		

		JLabel label = new JLabel(species.belligerence.getName(), species.getBelligerence().getIcon(), JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		ToolTipManager.sharedInstance().setDismissDelay(99000);
		ToolTipManager.sharedInstance().registerComponent(label);
		//label.setToolTipText(language.belligerenceDescription[belligerence]);
		
		return label;	
	}

	public static JLabel speciesNutrition(Species species){		
		JLabel label = new JLabel(species.getNutrition().getName(), JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		ToolTipManager.sharedInstance().setDismissDelay(99000);
		ToolTipManager.sharedInstance().registerComponent(label);
		//label.setToolTipText(language.nutritionDescription[nutrition]);
		
		return label;	
	}

	public static JLabel speciesIntellect(Species species){		
		JLabel label = new JLabel(species.getIntellect().getName(), JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		ToolTipManager.sharedInstance().setDismissDelay(99000);
		ToolTipManager.sharedInstance().registerComponent(label);
		//label.setToolTipText(language.intellectDescription[intellect]);
		
		return label;	
	}
	public static JLabel speciesLifeSpan(Species species){		
		JLabel label = new JLabel(species.getLifeSpan().getName(), JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		ToolTipManager.sharedInstance().setDismissDelay(99000);
		ToolTipManager.sharedInstance().registerComponent(label);
		//label.setToolTipText(language.toughnessDescription[toughness]);
		
		return label;	
	}
	
	public static JLabel modifierLabel(Modifier modifier){		
		JLabel label = new JLabel(modifier.type.name + ": " + (int)(modifier.modifier * modifier.type.factor) + " " + modifier.type.unit, JLabel.CENTER);
		setLabel(label);	
		return label;	
	}
	
	
	public static JLabel specialSpeciesTrait(SpeciesTrait t){		
		JLabel label = new JLabel(t.getName(), JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		label.setBorder(eBorder);
		
		return label;			
	}
	
	public static JLabel empireFlag(Empire empire){		
		JLabel label = new JLabel(empire.getFlagIcon(), JLabel.RIGHT); // empire.getFlagIcon()
		label.setOpaque(false);
		label.setVisible(true);
		// label.setBackground (empire.founder.color );		
		// label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(mediumFont);
		//label.setBorder(eBorder);
		
		return label;
	}
	
	public static JLabel empireFlagName(Empire empire){		
		JLabel label = new JLabel(empire.getName(), empire.getFlagIcon(), JLabel.RIGHT); // empire.getFlagIcon()
		setLabel(label);
		
		return label;
	}
	
	public static JLabel colonyPopulation(Colony colony){
		String population;
		if (colony.getTotalPopulation() < 1) {
			population = language.totalPopulation + ": " + (int) (colony.getTotalPopulation() * 1000000); 
			}
		else if (colony.getTotalPopulation() < 1000) {
			population = language.totalPopulation + ": " + (int) (colony.getTotalPopulation() * 100) / 100.0 + " " + language.abbrMillion;
			}
		else {
			population = language.totalPopulation + ": " + (int) (colony.getTotalPopulation() / 10) / 100.0 + " " + language.abbrBillion;
			}
		JLabel label = new JLabel(population,  JLabel.RIGHT); // empire.getFlagIcon()
		setLabel(label);
		
		return label;
	}
	
	
	public static JLabel colonyType(Colony colony){
		
		String colonyType = "";
		if (colony.getDominantSpecies() != null) {
			colonyType += colony.getDominantSpecies().adjective + " ";
			}
		
		if (colony.allocation[0] >= 0.5) {
			colonyType += language.agrarian + " ";
			}
		else if (colony.allocation[1] >= 0.5) {
			colonyType += language.mining + " "; 
			}
		else if (colony.allocation[2] >= 0.5) {
			colonyType += language.industrial + " ";
			}
		else if (colony.allocation[3] >= 0.5) {
			colonyType += language.scientific + " ";
			}
		
		if (colony.location.specials.contains(AOSpecial.homeworld)) {
			colonyType += language.homeworld;
			}
		else if (colony.getTotalPopulation() < 1) {
			colonyType += language.outpost; 
			}
		else if (colony.getTotalPopulation() < 1000) {
			colonyType += language.colony;
			}
		else {
			colonyType += language.coreWorld;
			}
		
		JLabel label = new JLabel(colonyType,  JLabel.RIGHT); // colony.species.getSpeciesIcon(),
		setLabel(label);
		
		return label;
	}
	
	
	public static JLabel colonyMood(Colony colony){	
		int red = 255;
		int green = 200;
		double mood = colony.getMood();
		if (colony.getMood() < 1){
			green = (int)Math.max((200 -400 * (1 - mood)),0);
			}
		else {
			red = (int)Math.max((255 - 510* (mood - 1)),0);
			}
		JLabel label = new JLabel( language.mood + ": " + (int)(mood * 1000) / 10.0  + " % (" + (int)(colony.getMoodBase()*1000)/10.0 + " %)", JLabel.RIGHT); // empire.getFlagIcon()
		setLabel(label);
		label.setForeground(new Color (red,green,0));	
		return label;
	}
	
	public static JLabel food(Colony colony){	
		JLabel label = new JLabel( language.food , GraphicFU.foodIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	

	
	public static JLabel resources(Colony colony){	
		JLabel label = new JLabel( language.resources , GraphicFU.resourcesIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel goods(Colony colony){	
		JLabel label = new JLabel( language.goods , GraphicFU.goodsIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel services(Colony colony){	
		JLabel label = new JLabel( language.services, GraphicFU.servicesIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel publicServices(Colony colony){	
		JLabel label = new JLabel( language.publicServices, GraphicFU.publicServicesIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel research(Colony colony){	
		JLabel label = new JLabel( language.research, GraphicFU.researchIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	// Economic allocation XXX
	
	public static JLabel allocation(){	
		JLabel label = new JLabel(language.allocation,  JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	
	
	public static JLabel allocationFood(Colony colony){	
		JLabel label = new JLabel( (int) (colony.allocation[0] * 1000) / 10.0 + " %", GraphicFU.foodIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel allocationResources(Colony colony){	
		JLabel label = new JLabel( (int) (colony.allocation[1] * 1000) / 10.0 + " %", GraphicFU.resourcesIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel allocationGoods(Colony colony){	
		JLabel label = new JLabel( (int) (colony.allocation[2] * 1000) / 10.0 + " %",GraphicFU.goodsIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel allocationServices(Colony colony){
		JLabel label = new JLabel( (int) (colony.allocation[3] * 1000) / 10.0 + " %", GraphicFU.servicesIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel allocationResearch(Colony colony){	
		JLabel label = new JLabel( (int) (colony.allocation[4] * 1000) / 10.0 + " %", GraphicFU.researchIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel allocationPublicServices(Colony colony){	
		JLabel label = new JLabel( (int) (colony.allocation[5] * 1000) / 10.0 + " %", GraphicFU.publicServicesIcon, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	

	
	
	
	// Labour Force XXX
	public static JLabel labourForce(){
		JLabel label = new JLabel(language.labourForce, JLabel.CENTER);
		setLabel(label);
		return label;
		}
	
	public static JLabel labourForce(Colony colony){
		String workforce;
		if (colony.getWorkforce() < 1){
			workforce = (int)(colony.getWorkforce() * 1000000) + "";	
			}
		else if (colony.getWorkforce() < 1000) {
			workforce = (int)(colony.getWorkforce() * 10) / 10.0 + " " + language.abbrMillion;
			}
		else {
			workforce = (int)(colony.getWorkforce() / 10) / 100.0 + " " + language.abbrBillion;
			}
		JLabel label = new JLabel(workforce, JLabel.CENTER);
		setLabel(label);
		return label;
		}
	
	
	
	
	public static JLabel labourForceFood(Colony colony){
	String workforce;
	if (colony.getWorkforceFood() < 1){
		workforce = (int)(colony.getWorkforceFood() * 1000000) + "";	
		}
	else if (colony.getWorkforceFood() < 1000) {
		workforce = (int)(colony.getWorkforceFood() * 10) / 10.0 + " " + language.abbrMillion;
		}
	else {
		workforce = (int)(colony.getWorkforceFood() / 10) / 100.0 + " " + language.abbrBillion;
		}
	JLabel label = new JLabel(workforce, JLabel.CENTER);
	setLabel(label);
	return label;
	}
	
	
	public static JLabel labourForceResources(Colony colony){
	String workforce;
	if (colony.getWorkforceResources() < 1){
		workforce = (int)(colony.getWorkforceResources() * 1000000) + "";	
		}
	else if (colony.getWorkforceResources() < 1000) {
		workforce = (int)(colony.getWorkforceResources() * 10) / 10.0 + " " + language.abbrMillion;
		}
	else {
		workforce = (int)(colony.getWorkforceResources() / 10) / 100.0 + " " + language.abbrBillion;
		}
	JLabel label = new JLabel(workforce, JLabel.CENTER);
	setLabel(label);
	return label;
	}
	
	
	
	public static JLabel labourForceGoods(Colony colony){
	String workforce;
	if (colony.getWorkforceGoods() < 1){
		workforce = (int)(colony.getWorkforceGoods() * 1000000) + "";	
		}
	else if (colony.getWorkforceGoods() < 1000) {
		workforce = (int)(colony.getWorkforceGoods() * 10) / 10.0 + " " + language.abbrMillion;
		}
	else {
		workforce = (int)(colony.getWorkforceGoods() / 10) / 100.0 + " " + language.abbrBillion;
		}
	JLabel label = new JLabel(workforce, JLabel.CENTER);
	setLabel(label);
	return label;
	}
	
	public static JLabel labourForceServices(Colony colony){
	String workforce;
	if (colony.getWorkforceServices() < 1){
		workforce = (int)(colony.getWorkforceServices() * 1000000) + "";	
		}
	else if (colony.getWorkforceServices() < 1000) {
		workforce = (int)(colony.getWorkforceServices() * 10) / 10.0 + " " + language.abbrMillion;
		}
	else {
		workforce = (int)(colony.getWorkforceServices() / 10) / 100.0 + " " + language.abbrBillion;
		}
	JLabel label = new JLabel(workforce, JLabel.CENTER);
	setLabel(label);
	return label;
	}
	
	
	public static JLabel labourForcePublicServices(Colony colony){
	String workforce;
	if (colony.getWorkforcePublicServices() < 1){
		workforce = (int)(colony.getWorkforcePublicServices() * 1000000) + "";	
		}
	else if (colony.getWorkforcePublicServices() < 1000) {
		workforce = (int)(colony.getWorkforcePublicServices() * 10) / 10.0 + " " + language.abbrMillion;
		}
	else {
		workforce = (int)(colony.getWorkforcePublicServices() / 10) / 100.0 + " " + language.abbrBillion;
		}
	JLabel label = new JLabel(workforce, JLabel.CENTER);
	setLabel(label);
	return label;
	}
	
	
	public static JLabel labourForceResearch(Colony colony){
		String workforce;
		if (colony.getWorkforceResearch() < 1){
			workforce = (int)(colony.getWorkforceResearch() * 1000000) + "";	
			}
		else if (colony.getWorkforceResearch() < 1000) {
			workforce = (int)(colony.getWorkforceResearch() * 10) / 10.0 + " " + language.abbrMillion;
			}
		else {
			workforce = (int)(colony.getWorkforceResearch() / 10) / 100.0 + " " + language.abbrBillion;
			}
		JLabel label = new JLabel(workforce, JLabel.CENTER);
		setLabel(label);
		return label;
		}
	
	public static JLabel commodity(Commodity commodity){
		JLabel label = new JLabel((int)(commodity.output * 10) / 10.0 + " " + commodity.type.unit, commodity.type.icon , JLabel.CENTER);
		label.setToolTipText((int) (commodity.stock) + " " + commodity.type.unit + "| Output" + (int) (commodity.output) + "|" + "Demand" + (int) (commodity.demand) + " " + commodity.type.unit + " |Exp" + (int) (commodity.exportPotential) + " " + commodity.type.unit + "|Imp" + (int) (commodity.importDemand) + " " + commodity.type.unit + "\n" );
		setLabel(label);
//		label.setHorizontalAlignment(JLabel.RIGHT);
		return label;
	}

	public static JLabel asset(Asset asset){
		JLabel label = new JLabel((int)(asset.output * 10) / 10.0 + " " + asset.type.unit, asset.type.icon , JLabel.CENTER);
//		label.setToolTipText((int) (asset.stock) + " " + asset.type.unit + "| Output" + (int) (asset.output) + "|" + "Demand" + (int) (asset.demand) + " " + asset.type.unit + " |Exp" + (int) (asset.exportPotential) + " " + asset.type.unit + "|Imp" + (int) (asset.importDemand) + " " + asset.type.unit + "\n" );
		setLabel(label);
//		label.setHorizontalAlignment(JLabel.RIGHT);
		return label;
	}
	
	public static JLabel assetFull(Asset asset){
		JLabel label = new JLabel((int)(asset.output * 10) / 10.0 + " " + asset.type.unit + " " + asset.type.name, asset.type.icon , JLabel.CENTER);
		setLabel(label);
//		label.setHorizontalAlignment(JLabel.RIGHT);
		return label;
	}
	
	
	public static JLabel researchProject(Empire empire, ResearchProject researchProject){
		JLabel label = new JLabel(researchProject.technology.name,  researchProject.technology.icon, JLabel.CENTER);
		label.setVisible(true);
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setOpaque(true);
		
		if (researchProject.technology.category == 0){
			label.setBackground(colorFood);
			}
		else if (researchProject.technology.category == 1){
			label.setBackground(colorResources);
			}
		else if (researchProject.technology.category == 3){
			label.setBackground(colorGoods);
			}
		else if (researchProject.technology.category == 2){
			label.setBackground(colorServices);
			}
		else if (researchProject.technology.category == 4){
			label.setBackground(colorResearch);
			}
		else if (researchProject.technology.category == 5){
			label.setBackground(colorPublicServices);
			}
		
		if (empire.technologyKnown.contains(researchProject.technology)){
			label.setForeground(GUIColor);
			label.setFont(mediumFont);
			}
		else if(empire.researchProjectsAvailable.contains(researchProject)){
			label.setForeground(GUIColor);
			label.setFont(mediumFontItalic);
			label.setBackground(new Color(label.getBackground().getRed(), label.getBackground().getGreen(), label.getBackground().getBlue(),(int)(label.getBackground().getAlpha()*0.6)));
			}
		else {
			label.setFont(mediumFontItalic);
			label.setForeground(colorPublicServices);
			label.setBackground(new Color(label.getBackground().getRed(), label.getBackground().getGreen(), label.getBackground().getBlue(),(int)(label.getBackground().getAlpha()*0.3)));
		}
		
		
		
		label.setBorder(GUIBorder);
		
		return label;
	}
	
	
	
	public static JLabel icon(Icon icon){
		JLabel label = new JLabel(icon, JLabel.CENTER);
		setLabel(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		return label;
	}
	
	public static JLabel string(String string){
		JLabel label = new JLabel(string, JLabel.CENTER);
		setLabel(label);
		return label;
	}
	
	public static JLabel label(String string, Icon icon ){
		JLabel label = new JLabel(string, icon, JLabel.CENTER);
		setLabel(label);
		label.setHorizontalTextPosition(JLabel.RIGHT);
		return label;
	}
	
		
	public static JLabel building(Building building){
		JLabel label = new JLabel( building.colony.getStatus(building)/10 + "%", building.buildingType.icon, JLabel.CENTER);
		label.setOpaque(false);
		label.setVisible(true);
		label.setBackground (new Color (0, 0, 0, 0));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setForeground(GUIColor);
		label.setFont(smallFont);
		label.setToolTipText(building.buildingType.name + " Level " + building.level + "Costs: " + (int)(building.investedGoods) + "Mrd. Status:" + building.colony.getStatus(building));
		label.setOpaque(false);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		return label;
		}
	
	public static JLabel empty(){
		JLabel label = new JLabel("", JLabel.CENTER);
		setLabel(label);
		return label;
		}

	
	
}

