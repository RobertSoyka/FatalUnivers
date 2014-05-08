package FUPackage;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class SpeciesTrait  implements IGeneralData{

public String name = "I need a name";	
public Icon icon = GraphicFU.qMarkIcon;
public String classification = "special";
	
public Set<SpeciesTrait> excludedTraits = new HashSet<SpeciesTrait>();
public Set<Policy> excludedPolicies = new HashSet<Policy>();
public Set<Policy> favouredPolicies = new HashSet<Policy>();

public Set<AtmoType> acceptedAtmospheres = new HashSet<AtmoType>();

public boolean robotic = false;
public boolean ignoresAOSpecialMortality = false;


public Modifier potentialFarmers		=	new Modifier (0, ModifierType.potentialFarmers);
public Modifier foodOutput				=	new Modifier (0, ModifierType.foodOutput);
public Modifier resourcesOutput			=	new Modifier (0, ModifierType.resourcesOutput);
public Modifier preciousMetalsOutput	=	new Modifier (0, ModifierType.preciousMetalsOutput);
public Modifier rareElementsOutput		=	new Modifier (0, ModifierType.rareElementsOutput);
public Modifier hydrocarbonsOutput		=	new Modifier (0, ModifierType.hydrocarbonsOutput);
public Modifier elementGOutput			=	new Modifier (0, ModifierType.elementGOutput);
public Modifier isotopesOutput			=	new Modifier (0, ModifierType.isotopesOutput);

public Modifier goodsOutput				=	new Modifier (0, ModifierType.goodsOutput);
public Modifier serviceSector			=	new Modifier (0, ModifierType.serviceSector);

public Modifier researchOutput			=	new Modifier (0, ModifierType.researchOutput);
public Modifier innovationOutput		=	new Modifier (0, ModifierType.innovationOutput);
public Modifier artifactsOutput			=	new Modifier (0, ModifierType.artifactsOutput);
public Modifier bioSamplesOutput		=	new Modifier (0, ModifierType.bioSamplesOutput);		
public Modifier researcherSalary		=	new Modifier (0, ModifierType.researcherSalary );

public Modifier investmentRatio			=	new Modifier (0, ModifierType.ecoDamageMiner);

public Modifier shipyardCapacity		=	new Modifier (0, ModifierType.shipyardCapacity );
public Modifier constructionCosts		=	new Modifier (0, ModifierType.constructionCosts );
public Modifier recycling				=	new Modifier (0, ModifierType.recycling );

// Population
public Modifier qualification 			=	new Modifier (0, ModifierType.qualification );
public Modifier riot					=	new Modifier (0, ModifierType.riot );
public Modifier mood					=	new Modifier (0, ModifierType.mood );
public Modifier mortalityRate			=	new Modifier (0, ModifierType.mortalityRate );
public Modifier birthRate				=	new Modifier (0, ModifierType.birthRate );

// bAdministration
public Modifier administration			=	new Modifier (0, ModifierType.administration );
public Modifier counterintelligence		=	new Modifier (0, ModifierType.counterintelligence );
public Modifier workersPublic			=	new Modifier (0, ModifierType.workersPublic ); 

// Military
public Modifier armySupport				=	new Modifier (0, ModifierType.armySupport ); 
public Modifier militaryPersonnel		=	new Modifier (0, ModifierType.militaryPersonnel );
public Modifier armyExperience			=	new Modifier (0, ModifierType.armyExperience );
public Modifier fleetExperience			=	new Modifier (0, ModifierType.fleetExperience );
public Modifier groundDefense			=	new Modifier (0, ModifierType.groundDefense );
public Modifier bombardmentResistance	=	new Modifier (0, ModifierType.bombardmentResistance );

public Modifier waterOptimum			=	new Modifier (0, ModifierType.waterOptimum );
public Modifier tempSensitivity			=	new Modifier (0, ModifierType.tempSensitivity );
public Modifier foodDemand				=	new Modifier (0, ModifierType.foodDemand );
public Modifier moodSensitivity			=	new Modifier (0, ModifierType.moodSensitivity );

public Modifier lifeExpectancy			=	new Modifier (0, ModifierType.lifeExpectancy );
public Modifier espionage				=	new Modifier (0, ModifierType.espionage );
public Modifier diplomacy				=	new Modifier (0, ModifierType.diplomacy );
public Modifier workforce				=	new Modifier (0, ModifierType.workforce );

public Modifier combatEfficiency		=	new Modifier (0, ModifierType.combatEfficiency );

public Modifier bodyArmor				=	new Modifier (0, ModifierType.bodyArmor );
public Modifier bodyCamouflage			=	new Modifier (0, ModifierType.bodyCamouflage );
public Modifier evasion					=	new Modifier (0, ModifierType.evasion );

public Modifier points					=	new Modifier (0, ModifierType.points );

/// XXX
Modifier[] modifier = {
potentialFarmers,
foodOutput,
resourcesOutput,
preciousMetalsOutput,
rareElementsOutput,
hydrocarbonsOutput,
elementGOutput,
isotopesOutput,
goodsOutput,
serviceSector,
researchOutput,
innovationOutput,
artifactsOutput,
bioSamplesOutput,
researcherSalary,
investmentRatio,
shipyardCapacity,
constructionCosts,
recycling,
qualification,
riot,
mood,
mortalityRate,
birthRate,
administration,
counterintelligence,
workersPublic,
armySupport,
militaryPersonnel,
armyExperience,
fleetExperience,
groundDefense,
bombardmentResistance,
waterOptimum,
tempSensitivity,
foodDemand,
moodSensitivity,
lifeExpectancy,
espionage,
diplomacy,
workforce,
combatEfficiency,
bodyArmor,
bodyCamouflage,
evasion,
points };

// XXX


public static SpeciesTrait waterBased = new SpeciesTrait ();
public static SpeciesTrait ammoniaBased = new SpeciesTrait ();
public static SpeciesTrait synthetic = new SpeciesTrait ();

public static SpeciesTrait desertDwellers = new SpeciesTrait ();
public static SpeciesTrait terrestrial = new SpeciesTrait();
public static SpeciesTrait amphibean = new SpeciesTrait();
public static SpeciesTrait aquatic = new SpeciesTrait();

public static SpeciesTrait carnivore = new SpeciesTrait();
public static SpeciesTrait omnivore = new SpeciesTrait();
public static SpeciesTrait herbivore = new SpeciesTrait();

public static SpeciesTrait retarded = new SpeciesTrait();
public static SpeciesTrait unimaginative = new SpeciesTrait();
public static SpeciesTrait reasonable = new SpeciesTrait();
public static SpeciesTrait clever = new SpeciesTrait();
public static SpeciesTrait ingenious = new SpeciesTrait();

public static SpeciesTrait anarchic = new SpeciesTrait();
public static SpeciesTrait democratic = new SpeciesTrait();
public static SpeciesTrait materialistic = new SpeciesTrait();
public static SpeciesTrait feudalistic = new SpeciesTrait();
public static SpeciesTrait militaristic = new SpeciesTrait();
public static SpeciesTrait authoritarian = new SpeciesTrait();
public static SpeciesTrait eusocial = new SpeciesTrait();


public static SpeciesTrait warmongering = new SpeciesTrait();
public static SpeciesTrait aggressive = new SpeciesTrait();
public static SpeciesTrait resolute = new SpeciesTrait();
public static SpeciesTrait peaceful = new SpeciesTrait();
public static SpeciesTrait pacifistic = new SpeciesTrait();

public static SpeciesTrait exoskeleton = new SpeciesTrait();
public static SpeciesTrait endoskeleton = new SpeciesTrait();
public static SpeciesTrait mollusc = new SpeciesTrait();

public static SpeciesTrait construction = new SpeciesTrait();
public static SpeciesTrait singleBirth = new SpeciesTrait();
public static SpeciesTrait multipleBirth = new SpeciesTrait();
public static SpeciesTrait massBirth = new SpeciesTrait();

public static SpeciesTrait infiniteLifespan = new SpeciesTrait();
public static SpeciesTrait longLived = new SpeciesTrait();
public static SpeciesTrait normalLifespan = new SpeciesTrait();
public static SpeciesTrait shortLived = new SpeciesTrait();

public static SpeciesTrait subterranean = new SpeciesTrait ();
public static SpeciesTrait largeSpecies = new SpeciesTrait ();
public static SpeciesTrait resistant = new SpeciesTrait ();
public static SpeciesTrait photographicMemory = new SpeciesTrait ();
public static SpeciesTrait coldBlooded = new SpeciesTrait ();
public static SpeciesTrait mindMeld = new SpeciesTrait ();
public static SpeciesTrait telekinetic = new SpeciesTrait ();
public static SpeciesTrait airborne = new SpeciesTrait();
public static SpeciesTrait arrogant = new SpeciesTrait ();
public static SpeciesTrait religious = new SpeciesTrait ();

public void addTrait(SpeciesTrait addTrait) {

this.excludedTraits.addAll(addTrait.excludedTraits);
this.favouredPolicies.addAll(addTrait.favouredPolicies);
this.excludedPolicies.addAll(addTrait.excludedPolicies);
this.acceptedAtmospheres.addAll(addTrait.acceptedAtmospheres);

if (addTrait.robotic) {
this.robotic = true;
}
if (ignoresAOSpecialMortality) {
this.ignoresAOSpecialMortality = true;	
}

for (int i = 0; i < this.modifier.length; i++){
	this.modifier[i].modifier += addTrait.modifier[i].modifier;
	}
}





void setName (String x) {
	this.name = x;
}

String getName () {
	return this.name;
}

void setIcon(Icon icon) {
	this.icon = icon;	
}

Icon getIcon() {
	return this.icon;	
}

public SpeciesTrait(){
}

public static void initialize(){
	
	// Metabolism XXX
	
	waterBased.name = language.waterBased;
	waterBased.classification = "metabolism";
	waterBased.acceptedAtmospheres.add(AtmoType.N2_O2);
	waterBased.excludedTraits.add(construction);
	waterBased.excludedTraits.add(infiniteLifespan);
	
	ammoniaBased.name = language.ammoniaBased;
	ammoniaBased.classification = "metabolism";
	ammoniaBased.acceptedAtmospheres.add(AtmoType.N2_NH3);
	ammoniaBased.excludedTraits.add(construction);
	ammoniaBased.excludedTraits.add(infiniteLifespan);
		
	synthetic.name = language.ammoniaBased;
	synthetic.classification = "metabolism";
	synthetic.robotic = true;
	synthetic.ignoresAOSpecialMortality = true;
	synthetic.acceptedAtmospheres.add(AtmoType.none);
	synthetic.acceptedAtmospheres.add(AtmoType.H2);
	synthetic.acceptedAtmospheres.add(AtmoType.H2_He);
	synthetic.acceptedAtmospheres.add(AtmoType.N2);
	synthetic.acceptedAtmospheres.add(AtmoType.N2_O2);
	synthetic.acceptedAtmospheres.add(AtmoType.N2_O2_CO2);
	synthetic.acceptedAtmospheres.add(AtmoType.N2_CO2);
	synthetic.acceptedAtmospheres.add(AtmoType.N2_NH3);
	synthetic.acceptedAtmospheres.add(AtmoType.CO2);
	synthetic.acceptedAtmospheres.add(AtmoType.CO2_SO2);
	
	synthetic.excludedTraits.add(mollusc);
	synthetic.excludedTraits.add(singleBirth);
	synthetic.excludedTraits.add(multipleBirth);
	synthetic.excludedTraits.add(massBirth);
	synthetic.excludedTraits.add(longLived);
	synthetic.excludedTraits.add(normalLifespan);
	synthetic.excludedTraits.add(shortLived);
	
	// Biotopes XXX
	
	desertDwellers.name = language.desertDwellers;
	desertDwellers.foodOutput.modifier = 0.25;
	desertDwellers.waterOptimum.modifier = 0.45;
	desertDwellers.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/desertDwellers.png"));
	
	terrestrial.name = language.terrestrial;
	terrestrial.classification = "biotope";
	terrestrial.waterOptimum.modifier = 0.65;
	terrestrial.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/terrestrial.png"));
		
	amphibean.name = language.amphibian;
	amphibean.classification = "biotope";
	amphibean.waterOptimum.modifier = 0.8;
	
	aquatic.name = language.aquatic;
	aquatic.classification = "biotope";
	aquatic.waterOptimum.modifier = 0.95;
	aquatic.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/aquatic.png"));
	
	// Nutrition XXX
	
	carnivore.name = language.carnivore;
	carnivore.classification = "nutrition";
	carnivore.foodDemand.modifier = 0.5;
	carnivore.combatEfficiency.modifier =0.5;
	carnivore.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/carnivore.png"));
	
	omnivore.name = language.omnivore;
	omnivore.classification = "nutrition";
	omnivore.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/omnivore.png"));
	
	herbivore.name = language.herbivore;
	herbivore.classification = "nutrition";
	herbivore.foodDemand.modifier = -0.5;
	herbivore.combatEfficiency.modifier =-0.5;
	herbivore.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/herbivore.png"));
	
	// Intellect XXX

	retarded.name = language.retarded;
	retarded.classification = "intellect";
	retarded.researchOutput.modifier = -0.5;
	retarded.researcherSalary.modifier = 0.35;
	retarded.innovationOutput.modifier = -0.50;
	retarded.espionage.modifier = -50;
	retarded.points.modifier = 20;
	retarded.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/retarded.png"));
	
	unimaginative.name = language.unimaginative;
	unimaginative.classification = "intellect";
	unimaginative.researchOutput.modifier = -0.25;
	unimaginative.researcherSalary.modifier = 0.20;
	unimaginative.innovationOutput.modifier = -0.25;
	unimaginative.espionage.modifier = -0.25;
	unimaginative.points.modifier = 10;
	unimaginative.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/unimaginative.png"));
	
	reasonable.name = language.reasonable;
	reasonable.classification = "intellect";
	reasonable.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/reasonable.png"));

	clever.name = language.clever;
	clever.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/clever.png"));
	clever.classification = "intellect";
	clever.researchOutput.modifier = 0.25;
	clever.researcherSalary.modifier = -0.20;
	clever.innovationOutput.modifier = 0.25;
	clever.espionage.modifier = 0.25;
	clever.points.modifier = -10;
	
	ingenious.name = language.ingenious;
	ingenious.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/ingenious.png"));
	ingenious.classification = "intellect";	
	ingenious.researchOutput.modifier = 0.5;
	ingenious.researcherSalary.modifier = -0.35;
	ingenious.innovationOutput.modifier = -0.25;
	ingenious.espionage.modifier = 0.5;
	ingenious.points.modifier = -20;
	
	// Society XXX

	anarchic.name = language.anarchic;
	anarchic.classification = "social";
	anarchic.favouredPolicies.add(Policy.anarchy);
	
	democratic.name = language.democratic;
	democratic.classification = "social";
	democratic.moodSensitivity.modifier = 0.2;
	democratic.innovationOutput.modifier = 0.2;
	democratic.favouredPolicies.add(Policy.democracy);
	
	materialistic.name = language.materialistic;
	materialistic.classification = "social";
	materialistic.favouredPolicies.add(Policy.plutocracy);
		
	feudalistic.name = language.feudalistic;
	feudalistic.classification = "social";
	feudalistic.favouredPolicies.add(Policy.aristocracy);

	militaristic.name = language.militaristic;
	militaristic.classification = "social";
	militaristic.excludedTraits.add(pacifistic);
	militaristic.excludedTraits.add(peaceful);
	militaristic.favouredPolicies.add(Policy.stratocracy);

	authoritarian.name = language.authoritarian;
	authoritarian.classification = "social";
	authoritarian.excludedTraits.add(pacifistic);
	authoritarian.favouredPolicies.add(Policy.autocracy);
	
	eusocial.name = language.eusocial;
	eusocial.classification = "social";
	eusocial.moodSensitivity.modifier = -0.2;
	eusocial.riot.modifier =-0.2;
	eusocial.foodOutput.modifier = 0.2;
	eusocial.resourcesOutput.modifier = 0.2;
	eusocial.goodsOutput.modifier = 0.2;
	eusocial.innovationOutput.modifier = -0.2;
	eusocial.diplomacy.modifier = -0.1;
	eusocial.favouredPolicies.add(Policy.eusociality);
	
	// Belligerence XXX
	
	warmongering.name = language.warmongering;
	warmongering.classification = "belligerence";
	warmongering.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/warmongering.png"));
	warmongering.riot.modifier =0.2;
	warmongering.combatEfficiency.modifier =0.5;
	warmongering.moodSensitivity.modifier = -0.2;
	warmongering.diplomacy.modifier = -0.1;
	
	aggressive.name = language.aggressive;
	aggressive.classification = "belligerence";
	aggressive.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/aggressive.png"));
	aggressive.riot.modifier =0.1;
	aggressive.combatEfficiency.modifier =0.25;
	aggressive.moodSensitivity.modifier = -0.1;
	aggressive.diplomacy.modifier = -0.05;
		
	resolute.name = language.resolute;
	resolute.classification = "belligerence";
	resolute.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/resolute.png"));
	
	peaceful.name = language.peaceful;
	peaceful.classification = "belligerence";
	peaceful.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/peaceful.png"));
	peaceful.riot.modifier =-0.1;
	peaceful.combatEfficiency.modifier =-0.25;
	peaceful.moodSensitivity.modifier = 0.1;
	peaceful.diplomacy.modifier = 0.05;
	
	pacifistic.name = language.pacifistic;
	pacifistic.classification = "belligerence";
	pacifistic.icon = new ImageIcon(GraphicFU.class.getResource("SpeciesTraits/pacifistic.png"));
	pacifistic.riot.modifier =-0.1;
	pacifistic.combatEfficiency.modifier =-0.25;
	pacifistic.moodSensitivity.modifier = 0.2;
	pacifistic.diplomacy.modifier = 0.1;
	
	// Skeleton XXX

	exoskeleton.name = language.exoskeleton;
	exoskeleton.classification = "skeleton";
	exoskeleton.points.modifier = -10;
	exoskeleton.bodyArmor.modifier = 1;
	
	endoskeleton.name = language.endoskeleton;
	endoskeleton.classification = "skeleton";
	
	mollusc.name = language.mollusc;
	mollusc.classification = "skeleton";
	mollusc.points.modifier = 10;
	mollusc.bodyArmor.modifier = -0.50;
	mollusc.goodsOutput.modifier = -0.2;
	mollusc.resourcesOutput.modifier = -0.2;
	
	// Reproduction XXX
	
	construction.name = language.singleBirth;
	construction.workforce.modifier = 1;
	construction.points.modifier = 30;
	
	singleBirth.name = language.singleBirth;
	singleBirth.classification = "skeleton";
	singleBirth.birthRate.modifier = 0.003;
	singleBirth.workforce.modifier = 0.6;
	singleBirth.points.modifier = 20;
	
	multipleBirth.name = language.multipleBirth;
	multipleBirth.classification = "skeleton";
	multipleBirth.birthRate.modifier = 0.01;
	multipleBirth.mortalityRate.modifier = 0.003;
	multipleBirth.workforce.modifier = 0.45;
	
	massBirth.name = language.massBirth;
	massBirth.classification = "skeleton";	
	massBirth.birthRate.modifier = 0.03;
	massBirth.mortalityRate.modifier = 0.01;
	massBirth.workforce.modifier = 0.30;
	massBirth.points.modifier = -20;
	
	// Livespan XXX
	
	infiniteLifespan.name = language.infiniteLifespan;	
	
	longLived.name = language.longLived;
	longLived.classification = "lifespan";
	longLived.birthRate.modifier = -0.002;
	longLived.mortalityRate.modifier = 0.0003;
	longLived.lifeExpectancy.modifier = 120;
	longLived.workforce.modifier = 0.2;
	longLived.points.modifier = -1;
	
	normalLifespan.name = language.normalLifespan;
	normalLifespan.classification = "lifespan";
	normalLifespan.mortalityRate.modifier = 0.0015;
	normalLifespan.lifeExpectancy.modifier = 60; 
	
	shortLived.name = language.shortLived;
	shortLived.classification = "lifespan";
	shortLived.birthRate.modifier = 0.003;
	shortLived.mortalityRate.modifier = 0.003;
	shortLived.lifeExpectancy.modifier = 30;
	shortLived.workforce.modifier = -0.1;
	shortLived.points.modifier = 1;
	
	
	// Special XXX

	subterranean.name = language.subterranean;
	subterranean.classification = "special";
	subterranean.groundDefense.modifier = 1;
	subterranean.resourcesOutput.modifier = 1;
	subterranean.points.modifier = -10;
	

	largeSpecies.classification = "special";
	largeSpecies.name = language.largeSpecies;
	largeSpecies.foodDemand.modifier = 0.5;
	largeSpecies.foodOutput.modifier = 0.2;
	largeSpecies.resourcesOutput.modifier = 0.2;
	largeSpecies.goodsOutput.modifier = 0.2;
	largeSpecies.bodyArmor.modifier = 0.5;
	largeSpecies.points.modifier = -10;
	
	resistant.classification = "special";
	resistant.name = language.resistant;
	resistant.ignoresAOSpecialMortality = true;
	resistant.tempSensitivity.modifier = -2;
	resistant.foodOutput.modifier = 0.2;
	resistant.points.modifier = -10;
	
	photographicMemory.classification = "special";
	photographicMemory.name = language.photographicMemory;
	photographicMemory.researchOutput.modifier = 0.1;
	photographicMemory.espionage.modifier = 0.35;
	photographicMemory.points.modifier = -5;	

	coldBlooded.classification = "special";
	coldBlooded.name = language.coldBlooded;
	coldBlooded.tempSensitivity.modifier = 0.02;
	coldBlooded.foodDemand.modifier = -0.35;
	
	mindMeld.classification = "special";
	mindMeld.name = language.mindMeld;
	mindMeld.espionage.modifier = 0.2;
	mindMeld.diplomacy.modifier = 0.2;
	mindMeld.points.modifier = -10;

	telekinetic.classification = "special";
	telekinetic.name = language.telekinetic;
	telekinetic.foodDemand.modifier = 0.2;
	telekinetic.espionage.modifier = 0.05;
	telekinetic.combatEfficiency.modifier = 0.1;
	telekinetic.points.modifier = -10;
	
	arrogant.classification = "special";
	arrogant.name = language.arrogant;
	arrogant.goodsOutput.modifier = 0.05;
	arrogant.resourcesOutput.modifier = 0.05;
	arrogant.diplomacy.modifier = -0.1;
		
	religious.classification = "special";
	religious.name = language.religious;
	religious.researchOutput.modifier = -0.1;
	religious.riot.modifier = -0.1;
	
	airborne.classification = "special";
	airborne.name = language.airborne;
	airborne.evasion.modifier = 0.3;
	airborne.points.modifier = -10;


	}
}




