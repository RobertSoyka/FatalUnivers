package FUPackage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Species extends SpeciesTrait implements IGeneralData{
static Species[] species = new Species[maxSpecies];

public String string = "default";
public String name = "I need a name";
public String adjective = "I need an adjective"; 
public StarSystem homeSystem;
public AstronomicObject homeworld;
public Empire empire;
public String empireName;
public int techLevel = 10;
public Icon speciesBig = GraphicFU.qMarkIcon;   // Small pic # of the species
public Icon speciesIcon = GraphicFU.qMarkIcon;
public Icon flagBig = GraphicFU.qMarkIcon;
public Icon flagIcon = GraphicFU.qMarkIcon;
public Color color;
public Color secondaryColor = new Color(255,200,0, 255);

//base properties

public double gravOptimum = 1; // in g
public double tempOptimum = 293; // in Kelvin
public AtmoType atmoType; // What does this species breath
Set<AtmoType> atmoConponents = new HashSet<AtmoType>(); // What does this species accept as atmospheric components
public float pressure = 1;
public String characterNames[];
public SpeciesTrait biotope = SpeciesTrait.terrestrial;  // Land, air, water
public SpeciesTrait skeleton  = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
public SpeciesTrait nutrition = SpeciesTrait.omnivore; // herbivore, omnivore, carnivore
public SpeciesTrait reproduction = SpeciesTrait.singleBirth;  //single birth, multiple birth, mass birth, cloning, 
public SpeciesTrait belligerence  = SpeciesTrait.resolute; // pacifist, peaceful, resolute, militaristic, warmongers
public SpeciesTrait intellect = SpeciesTrait.reasonable; //  retarded, uncreative, adaptive, creative, ingenious
public SpeciesTrait lifeSpan = SpeciesTrait.omnivore;
public SpeciesTrait society  = SpeciesTrait.authoritarian; // democratic, authoritarian, feudalistic, eusocial


Set<SpeciesTrait> specialTraits =  new HashSet<SpeciesTrait>();

// aggregated properties 

//public double farmerPotential; // Bonus in %


//public String[] oceanColony;
Set<String> oceanColonies = new HashSet<String>();
Set<String> terranColonies = new HashSet<String>();
Set<String> steppeColonies = new HashSet<String>();
Set<String> desertColonies = new HashSet<String>();
Set<String> iceColonies = new HashSet<String>();
Set<String> rockColonies = new HashSet<String>();
Set<String> lavaColonies = new HashSet<String>();
Set<String> toxicColonies = new HashSet<String>();
Set<String> gasColonies = new HashSet<String>();
Set<String> asteroidColonies = new HashSet<String>();
Set<String> ammoniaColonies = new HashSet<String>();

static Species humans = new Species();
static Species turians = new Species();
static Species asari = new Species();
static Species salarians = new Species();
static Species volus = new Species();
static Species drell = new Species();
static Species hanar = new Species();
static Species elcor = new Species();
static Species vorcha = new Species();
static Species krogan = new Species();
static Species batarians = new Species();
static Species quarians = new Species();
static Species protheans = new Species();
static Species oravores = new Species();
static Species leviathans = new Species();
static Species rachni = new Species();
static Species geth = new Species();
static Species raloi = new Species();
static Species yahg = new Species();


String getName(){
	return this.name;
}

void setName(String name_){
	this.name = name_;	
}

String getEmpireName(){
	return this.empireName;
}

void setEmpireName(String empireName_){
	this.empireName = empireName_;	
}

public Icon getSpeciesBig(){
	return this.speciesBig;
}

void setSpeciesBig(Icon icon_){
	this.speciesBig = icon_;	
}

public Icon getSpeciesIcon(){
	return this.speciesIcon;
}

void setSpeciesIcon(Icon icon_){
	this.speciesIcon = icon_;	
}

public Icon getFlagBig(){
	return this.flagBig;
}

void setFlagBig(Icon icon_){
	this.flagBig = icon_;	
}

public Icon getFlagIcon(){
	return this.flagIcon;
}

void setFlagIcon(Icon icon_){
	this.flagIcon = icon_;	
}

public float getPressure(){
	return this.pressure;
}

void setPressure(float x_){
	this.pressure = x_;	
}


public SpeciesTrait getSkeleton(){
	return this.skeleton;
}

void setSkeleton(SpeciesTrait skeleton_){
	this.skeleton = skeleton_;	
}

public SpeciesTrait getNutrition(){
	return this.nutrition;
}

void setNutrition(SpeciesTrait nutrition_){
	this.nutrition = nutrition_;	
}

public SpeciesTrait getSociety(){
	return this.society;
}

void setSociety(SpeciesTrait society_){
	this.society = society_;	
}

public SpeciesTrait getBelligerence(){
	return this.belligerence;
}

void setBelligerence(SpeciesTrait belligerence_){
	this.belligerence = belligerence_;	
}

public SpeciesTrait getIntellect(){
	return this.intellect;
}

void setIntellect(SpeciesTrait intellect_){
	this.intellect = intellect_;	
}

public SpeciesTrait getBiotope(){
	return this.biotope;
}

double getTempOptimum(){
	return this.tempOptimum;
}

void setTempOptimum(int tempOptimum_){
	this.tempOptimum = tempOptimum_;	
}

double getGravOptimum(){
	return this.gravOptimum;
}

void setGravOptimum(int gravOptimum_){
	this.gravOptimum = gravOptimum_;	
}

SpeciesTrait getReproduction(){
	return this.reproduction;
	}

void setReproduction(SpeciesTrait reproduction_){
	this.reproduction = reproduction_;	
}

SpeciesTrait getLifeSpan(){
	return this.lifeSpan;
	}

void setLifeSpan(SpeciesTrait lifeSpan_){
	this.lifeSpan = lifeSpan_;	
}


Color getColor(){
	return this.color;
	}

void setColor(Color color_){
	this.color = color_;	
}


void init(){

	Set<SpeciesTrait> speciesTraits = new HashSet<SpeciesTrait>();
	speciesTraits.add(this.biotope);
	speciesTraits.add(this.skeleton);
	speciesTraits.add(this.nutrition);
	speciesTraits.add(this.reproduction);
	speciesTraits.add(this.society);
	speciesTraits.add(this.belligerence);
	speciesTraits.add(this.intellect);
	speciesTraits.add(this.lifeSpan);
	speciesTraits.addAll(this.specialTraits);
	
	for (SpeciesTrait speciesTrait : speciesTraits) {
		this.addTrait(speciesTrait);
		}
	
	this.points.modifier = 1;
	this.empire = new Empire(this);
	Galaxy.availableSpecies.add(this);
	this.empire.initialize(this);
}





public Species(){
	this.atmoType = AtmoType.N2_O2; // What does this species breath

	
}
public static void initialize(){

	// HUMANS XXX
	humans.string = "humans";
	humans.name = "Humans";
	humans.adjective = "Human";
	humans.empireName = "Systems Alliance";
	
	
	
	humans.characterNames = new String[]{"Shepard","Alenko","Picard","Riker","Kirk","Scott","Franklin","Sheridan","Cole","Ivanova","Alan","Garibaldi","Sinclair","Keffer","Lochley","Alexander","Winters","Corwin","Hampton","Edgars","Sakai","Drake","Hiroshi","Jiang","Putin","Ghandi","Mandela","Bush","Merkel",
							
							
							"Smith","Jones","Taylor","Brown","Williams","Wilson","Johnson","Davies","Robinson","Wright","Thompson","Evans","Walker","White","Roberts","Green","Hall","Wood","Jackson","Clarke", // english Names
							"Murphy","O'Kelly","O'Sullivan","Walsh","O'Brien","Ryan","O'Connor","Doyle","McCarthy","Kennedy","Lynch","Murray","Quinn","Moore", // Irish names
							"Virtanen","Korhonen", // Finish names
							"Tamm","Saar","Sepp", // Estonian names
							"Jansons","Petersons", // Latvian names
							"Kazlauskas","Petrauskas","Jankauskas", // Lithuvian names 
							"Müller","Meyer","Schulz","Schmidt","Schneider","Fischer","Weber","Wagner","Becker","Hoffmann", // German names
							"Gruber","Huber","Bauer","Pichler","Steiner","Moser","Hofer","Leitner","Berger","Fuchs","Eder", // Austrian Names
							"Nagy","Kovács","Tóth","Szabó","Varga", //Hungarian Names
							"Rossi","Russo","Ferrari","Esposito","Bianchi","Romano","Colombo","Ricci","Marino", // Italian Names
							"De Jong","Jansen","De Vries","Van den Berg","Van Dijk", // Dutch Names
							"Hansen","Johansen","Olsen","Larsen","Andersen","Petersen","Eriksen","Berg", // Norwegian / Swedish Danish names
							"Andersson","Karlsson","Eriksson","Lindberg", 
							"Nowak","Kowalski","Wisniewski","Wójcik","Kamiński","Lewandowski","Zieliński","Szymański","Woźniak", // Polish names
							"Novotny","Svoboda","Dvořák",
							"Melnyk","Shevchenko","Boyko","Kovalenko","Bondarenko", // ukrainian names
							"Smirnov","Ivanov","Kuznetsov","Popov","Sokolov","Lebedev","Kozlov","Novikov","Morozov","Petrov","Volkov","Vasilyev","Pavlov","Semyonov","Bogdanov","","","","","","","","","","","","","","", // russian Names
							"García","Fernández","González","Rodríguez","López","Martínez","Sánchez","Pérez","Martín","Gomez","Ruiz","Hernández","Jiménez","Díaz","Álvarez","Moreno","Muñoz","Alonso","Romero","Navarro", // Spanish Names
							"Silva","Santos","Ferreira","Pereira","Oliveira","Costa","Rodrigues", // Portugese names
							"Papadopoulos","Nikolaidis","Georgiou","Papadakis","","","", // greek names
							"Öztürk","Yılmaz","Kaya","Demir","Şahin","Çelik","Yıldırım","Erdoğan","Yazıcı","Karadağ",	// turkish Names
							"Cohen","Levi","Friedman","David","Katz","Moshe","Klein", // israeli names
							"Mamadov","Aliyev", // central Asian
							"Samadi","Abdul",	// afghan names
							"Abbasi","Ahmadi","Akbari","Hashemi","Jafari","Parsa","","", // iran names
							"Al-Baghdadi","Kara Ali","Al-Tikriti","Al-Asadi","Al-Alousi","Al-Basri","Al-Karbalai", // iraq names
							"Ahmed","Ali","Dey","Hasan","Hussain","Khan","Mahmud","Rahman","Sheikh",				// bangkadesh
							"Bose","Chand","Chandra","Chopra","Dravid","Dang","Desai","Gupta","Jein","Kumar","Lal","Naidu","Rana","Ray","Sharma","Singh","Singhal","Soni","Thakur","Tomar", // Indian names
							"Duong","Seng","Tang","Tep", // Cambodian names
							"Wáng","Lǐ","Zhāng","Liú","Chén","Yáng","Huáng","Zhào","Wú","Zhōu","Xú","Sūn","Mǎ","Hú","Guō","Hé","Gāo","Lín","Luó",// Chinese names
							"Kim","Lee","Park","Choi","Jeong", // Korean names
							"Satō","Suzuki","Takahashi","Tanaka","Watanabe","Itō","Nakamura","Kobayashi","Yamamoto","Katō","Yoshida","Yamada","Sasaki","Yamaguchi","Matsumoto", //Japanese names
							"Nguyen","Tran","Le","Phan","Hoang",// Vietnam
							"Mensah","Yeboah","Ndiaye","Turay","Sylla","Sesay","Congo","Diallo","Ndiaye","Keita","","","","","",// africa
							};
	
	
	humans.color =  new Color(40,40,180); //Color.blue;
	humans.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/humans.png"));
	humans.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/humans.png"));
	
	
	
	

	
	
	
	
	
	
	
	
	humans.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/humans.png"));

	
	
	
	humans.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/humansBig.png"));	
	humans.gravOptimum = 1;
	humans.tempOptimum = 289;
	humans.pressure = 1.0F;
	humans.reproduction = SpeciesTrait.singleBirth;	
	humans.biotope = SpeciesTrait.terrestrial;  // Land, Air, Water 
	humans.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	humans.intellect = SpeciesTrait.clever;
	humans.society = SpeciesTrait.democratic; 
	humans.belligerence = SpeciesTrait.resolute;
	humans.nutrition = SpeciesTrait.omnivore;
	humans.lifeSpan = SpeciesTrait.normalLifespan;
	humans.init();
//	humans.empire = new Empire(humans);
	humans.empire.getAvailableResearchProjects();
	humans.homeSystem = new StarSystem();
	humans.homeSystem.setNativeName("Sol");
	humans.homeSystem.setName("Sol");
	
	humans.homeSystem.coordinateX			= (int)(Galaxy.galaxySizeX * 0.5);
	humans.homeSystem.coordinateY			= (int)(Galaxy.galaxySizeY * 0.75);
	
	Star sol = new Star(humans.homeSystem, AOType.classG);
	sol.aoType = AOType.classG;
	sol.sizer = 0.8;
	sol.diameter = 1392684;
	sol.mass = 1;
	sol.atmoType = AtmoType.plasma;
	sol.temperature = 5778;
	sol.luminosity = 1;
	sol.orbitalPeriod = 0;
	sol.name = language.sol;
	sol.starDistance = 0;
	sol.moonDistance = 0;
	humans.homeSystem.astronomicObject[0][0] = sol;
		
	Planet mercury	= new Planet (humans.homeSystem,1,0, AOType.rock);
	mercury.aoType						= AOType.rock;
	mercury.starDistance				= 57960000;
	mercury.moonDistance 				= 0;
	mercury.name						= language.mercury;
	mercury.sizer 						= 0.155;
	mercury.mass						= 0.00000016519393768284;					
	mercury.diameter					= 4879;				
	mercury.temperature					= 440;
	mercury.atmoType					= AtmoType.none;
	mercury.orbitalPeriod				= 7600521;
	mercury.gravitation 				= 0.37F;
	mercury.resources 					= 1.5;
	mercury.oceans 						= 0;
	mercury.ecosystem 					= 0;
	mercury.dayLength 					= 5067360;
	mercury.pressure 					= 0;
	mercury.specials.add(AOSpecial.endlessNights);
	mercury.specials.add(AOSpecial.intenseInsolation);
	mercury.specials.add(AOSpecial.heavyMetalDeposits);
	mercury.specials.add(AOSpecial.isotopeDeposits);
	humans.homeSystem.astronomicObject[1][0] = mercury;

	Planet venus	= new Planet (humans.homeSystem,2,0, AOType.toxic);
	venus.aoType						= AOType.toxic;
	venus.starDistance					= 108160000;
	venus.moonDistance 					= 0;
	venus.name							= language.venus;
	venus.sizer 						= 0.444;
	venus.mass							= 0.000003;					
	venus.diameter						= 12103;				
	venus.temperature					= 690;
	venus.atmoType						= AtmoType.CO2;
	venus.orbitalPeriod					= 19409760;
	venus.gravitation 					= 0.9F;
	venus.resources 					= 1.2;
	venus.oceans 						= 0;
	venus.ecosystem 					= 0;
	venus.dayLength 					= 10087200;
	venus.pressure 						= 92;
	venus.specials.add(AOSpecial.endlessNights);
	venus.specials.add(AOSpecial.rareElementsDeposits);
	venus.specials.add(AOSpecial.volcanism);
	humans.homeSystem.astronomicObject[2][0] = venus;

	Planet earth	= new Planet (humans.homeSystem,3,0, AOType.terran);
	earth.aoType						= AOType.terran;
	earth.starDistance					= 149600000;
	earth.moonDistance 					= 0;
	earth.name							= language.earth;
	earth.sizer 						= 0.47;
	earth.mass							= 0.0000031;					
	earth.diameter						= 12756;				
	earth.temperature					= 290;
	earth.atmoType						= AtmoType.N2_O2;
	earth.orbitalPeriod					= 31557600;
	earth.gravitation 					= 1;
	earth.resources 					= 1;
	earth.oceans 						= 0.71;
	earth.ecosystem 					= 0.7;
	earth.dayLength 					= 86400;
	earth.pressure 						= 1;
	earth.specials.add(AOSpecial.homeworld);
	earth.specials.add(AOSpecial.hydrocarbonDeposits);
	humans.homeSystem.astronomicObject[3][0] = earth;
	
	humans.homeSystem.astronomicObject[3][0].colony = new Colony (humans.homeSystem.astronomicObject[3][0], humans.empire, humans, 11433.434, 0.7, 0.81); // XXX
	humans.homeSystem.astronomicObject[3][0].colony.allocation[0] = 0.05;
	humans.homeSystem.astronomicObject[3][0].colony.allocation[1] = 0.15;
	humans.homeSystem.astronomicObject[3][0].colony.allocation[2] = 0.45;
	humans.homeSystem.astronomicObject[3][0].colony.allocation[3] = 0.03;
	humans.homeSystem.astronomicObject[3][0].colony.allocation[4] = 0.254;
	humans.homeSystem.astronomicObject[3][0].colony.allocation[5] = 0.1;
	humans.homeSystem.astronomicObject[3][0].colony.allocation[6] = 0.1;
	humans.homeSystem.astronomicObject[3][0].colony.food.stock = 1143;
	humans.homeSystem.astronomicObject[3][0].colony.resources.stock = 1873;
	humans.homeSystem.astronomicObject[3][0].colony.hydrocarbons.stock = 1000;
	humans.homeSystem.astronomicObject[3][0].colony.goods.stock = 1000;
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.roboticFarms, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.fertilizerFactories, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.roboticMines, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.heavyIndustries, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.roboticFactories, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.researchAcademies, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.superCollider, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.gravityTransport, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.schools, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.universities, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.centralGovernment, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.localGovernment, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.policeDepartments, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.environmentalAgency, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.revenueService, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.broadcastingStations, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.geneticHospitals, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.natureReserves, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.recyclingCenters, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.fusionDTPowerPlants, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.orbitalShipyards, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.orbitalHabitats, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.dataNetworks, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.spacePorts, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.armyBases, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.missileBases, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.fighterBases, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.defenseSatellites, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.armyAcademy, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.fleetAcademy, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.opticSupercomputers, 1 , 1.0);
	// new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.orbitalResearchStation, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.secretService, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.banks, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.stockExchanges, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.shoppingCenters, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.vacationResorts, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.agrogeneticLaboratories, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.foodIndustries, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.insuranceCompanies, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.lightIndustries, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[3][0].colony, BuildingType.arcologies, 1, 1.0);
	humans.homeSystem.astronomicObject[3][0].colony.recalculateAllocation(0);
	humans.homeSystem.astronomicObject[3][0].colony.recalculateAllocation(0);
	
//	System.out.print("Name : " + humans.homeSystem.astronomicObject[3][0].colony.location.getName() + humans.homeSystem.astronomicObject[3][0].colony.goods.stock); // XXX
//	System.out.print("Name : " + humans.homeSystem.astronomicObject[3][0].colony.location.getName() + humans.homeSystem.astronomicObject[3][0].colony.asset[5].stock); // XXX

	Planet luna	= new Planet (humans.homeSystem,3,1, AOType.rock);
	luna.aoType							= AOType.rock;
	luna.starDistance					= 149600000;
	luna.moonDistance 					= 384400;
	luna.name							= language.luna;
	luna.sizer 							= 0.099;
	luna.mass							= 0.00000003694337151816;					
	luna.diameter						= 3476;				
	luna.temperature					= 220;
	luna.atmoType						= AtmoType.none;
	luna.orbitalPeriod					= 31557600;
	luna.gravitation 					= 0.162F;
	luna.resources 						= 1.14;
	luna.oceans 						= 0;
	luna.ecosystem 						= 0;
	luna.dayLength 						= 2360534;
	luna.pressure 						= 0;
	luna.specials.add(AOSpecial.endlessNights);
	luna.specials.add(AOSpecial.isotopeDeposits);
	humans.homeSystem.astronomicObject[3][1] = luna;
	humans.homeSystem.astronomicObject[3][1].colony = new Colony (humans.homeSystem.astronomicObject[3][1], humans.empire, humans, 444.11111, 1, 1.1); // XXX
	humans.homeSystem.astronomicObject[3][1].colony.allocation[0] = 0.0;
	humans.homeSystem.astronomicObject[3][1].colony.allocation[1] = 0.30;
	humans.homeSystem.astronomicObject[3][1].colony.allocation[2] = 0.50;
	humans.homeSystem.astronomicObject[3][1].colony.allocation[3] = 0.0;
	humans.homeSystem.astronomicObject[3][1].colony.allocation[4] = 0.2;
	humans.homeSystem.astronomicObject[3][1].colony.allocation[5] = 0.0;
	humans.homeSystem.astronomicObject[3][1].colony.allocation[6] = 0.0;
	new Building(humans.homeSystem.astronomicObject[3][1].colony, BuildingType.spacePorts, 1, 1.0);
	humans.homeSystem.astronomicObject[3][1].colony.recalculateAllocation(0);
	humans.homeSystem.astronomicObject[3][1].colony.recalculateAllocation(0);

	Planet mars	= new Planet (humans.homeSystem,4,0, AOType.rock);
	mars.aoType							= AOType.rock;
	mars.starDistance					= 227939100;
	mars.moonDistance 					= 0;
	mars.name							= language.mars;
	mars.sizer 							= 0.2316;
	mars.mass							= 0.00000032;					
	mars.diameter						= 6792;				
	mars.temperature					= 210;
	mars.atmoType						= AtmoType.CO2;
	mars.orbitalPeriod					= 59355072;
	mars.gravitation 					= 0.376F;
	mars.resources 						= 1.45;
	mars.oceans 						= 0.28;
	mars.ecosystem 						= 0;
	mars.dayLength 						= 88596;
	mars.pressure 						= 0.006;
	mars.specials.add(AOSpecial.preciousMetalDeposits);
	mars.specials.add(AOSpecial.subsurfaceEcosystem);
	mars.specials.add(AOSpecial.alienLibrary);
	humans.homeSystem.astronomicObject[4][0] = mars;
	humans.homeSystem.astronomicObject[4][0].colony = new Colony (humans.homeSystem.astronomicObject[4][0], humans.empire, humans, 333.4789, 1, 1.6); // XXX
	humans.homeSystem.astronomicObject[4][0].colony.allocation[0] = 0.0;
	humans.homeSystem.astronomicObject[4][0].colony.allocation[1] = 0.695;
	humans.homeSystem.astronomicObject[4][0].colony.allocation[2] = 0.1;
	humans.homeSystem.astronomicObject[4][0].colony.allocation[3] = 0.0;
	humans.homeSystem.astronomicObject[4][0].colony.allocation[4] = 0.205;
	humans.homeSystem.astronomicObject[4][0].colony.allocation[5] = 0.0;
	humans.homeSystem.astronomicObject[4][0].colony.allocation[6] = 0.0;
	humans.homeSystem.astronomicObject[4][0].colony.food.stock = 3.0;
	humans.homeSystem.astronomicObject[4][0].colony.resources.stock = 20.0;
	humans.homeSystem.astronomicObject[4][0].colony.goods.stock = 20.0;
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.roboticMines, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.heavyIndustries, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.roboticFactories, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.gravityTransport, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.broadcastingStations, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.recyclingCenters, 1 , 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.fusionDTPowerPlants, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.dataNetworks, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.spacePorts, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.banks, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.stockExchanges, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.shoppingCenters, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.insuranceCompanies, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.lightIndustries, 1, 1.0);
	new Building(humans.homeSystem.astronomicObject[4][0].colony, BuildingType.arcologies, 1, 1.0);
	humans.homeSystem.astronomicObject[4][0].colony.recalculateAllocation(0);
	humans.homeSystem.astronomicObject[4][0].colony.recalculateAllocation(0);

	Planet mainBelt = new Planet (humans.homeSystem,5,0, AOType.asteroid);
	mainBelt.aoType						= AOType.asteroid;
	mainBelt.starDistance				= 413910000;
	mainBelt.moonDistance 				= 0;
	mainBelt.name						= language.mainBelt;
	mainBelt.sizer 						= 0.35;
	mainBelt.mass						= 0.00000000045052892095;					
	mainBelt.diameter					= 975;				
	mainBelt.temperature				= 167;
	mainBelt.atmoType					= AtmoType.none;
	mainBelt.orbitalPeriod				= 145228075;
	mainBelt.gravitation 				= 0.028F;
	mainBelt.resources 					= 1;
	mainBelt.oceans 					= 0;
	mainBelt.ecosystem 					= 0;
	mainBelt.dayLength 					= 32667;
	mainBelt.pressure 					= 0;
	mainBelt.specials.add(AOSpecial.preciousMetalDeposits);
	mainBelt.specials.add(AOSpecial.preciousMetalDeposits);
	humans.homeSystem.astronomicObject[5][0] = mainBelt;

	Star jupiter = new Star (humans.homeSystem,6,0, AOType.gasGiant);
	jupiter.aoType = AOType.gasGiant;
	jupiter.sizer = 0.75;
	jupiter.diameter = 142984;
	jupiter.mass = 0.00095452060719284400;
	jupiter.atmoType = AtmoType.H2_He;
	jupiter.temperature = 165;
	jupiter.luminosity = 0;
	jupiter.orbitalPeriod = 374329940;
	jupiter.name = language.jupiter;
	jupiter.starDistance = 778547200;
	jupiter.moonDistance = 0;
	jupiter.specials.add(AOSpecial.magneticField);
	humans.homeSystem.astronomicObject[6][0] = jupiter;

	Planet io = new Planet (humans.homeSystem,6,1, AOType.toxic);
	io.aoType							= AOType.toxic;
	io.starDistance						= 778547200;
	io.moonDistance 					= 421700;
	io.name								= "Io";
	io.sizer 							= 0.05;
	io.mass								= 0.00000004505289209532;					
	io.diameter							= 3637;				
	io.temperature						= 110;
	io.atmoType							= AtmoType.none;
	io.orbitalPeriod					= 374329940;
	io.gravitation 						= 0.183F;
	io.resources 						= 1.3;
	io.oceans 							= 0;
	io.ecosystem 						= 0;
	io.dayLength 						= 152853;
	io.pressure 						= 0;
	io.specials.add(AOSpecial.magneticField);
	io.specials.add(AOSpecial.tidalHeating);
	io.specials.add(AOSpecial.volcanism);
	humans.homeSystem.astronomicObject[6][1] = io;
	
	Planet europa = new Planet (humans.homeSystem,6,2, AOType.ice);
	europa.aoType						= AOType.ice;
	europa.starDistance					= 778547200;
	europa.moonDistance 				= 671034;
	europa.name							= language.europa;
	europa.sizer 						= 0.05;
	europa.mass							= 0.00000002402820911750;					
	europa.diameter						= 3046;				
	europa.temperature					= 102;
	europa.atmoType						= AtmoType.none;
	europa.orbitalPeriod				= 374329940;
	europa.dayLength 					= 306822;
	europa.gravitation 					= 0.134F;
	europa.resources 					= 0.21;
	europa.oceans 						= 1;
	europa.ecosystem 					= 0;
	europa.pressure 					= 0.006;
	europa.specials.add(AOSpecial.longNights);
	europa.specials.add(AOSpecial.tidalHeating);
	europa.specials.add(AOSpecial.subsurfaceEcosystem);
	humans.homeSystem.astronomicObject[6][2] = europa;
	
	Planet ganymede = new Planet (humans.homeSystem,6,3, AOType.ice);
	ganymede.aoType						= AOType.ice;
	ganymede.starDistance				= 778547200;
	ganymede.moonDistance 				= 1070412;
	ganymede.name						= language.ganymede;
	ganymede.sizer 						= 0.21;
	ganymede.mass						= 0.00000007508815349220;					
	ganymede.diameter					= 5268;				
	ganymede.temperature				= 110;
	ganymede.atmoType					= AtmoType.none;
	ganymede.orbitalPeriod				= 374329940;
	ganymede.gravitation 				= 0.146F;
	ganymede.resources 					= 0.19;
	ganymede.oceans 					= 1;
	ganymede.ecosystem 					= 0;
	ganymede.dayLength 					= 618153;
	ganymede.pressure 					= 0;
	ganymede.specials.add(AOSpecial.bottomless);
	ganymede.specials.add(AOSpecial.longNights);	
	humans.homeSystem.astronomicObject[6][3] = ganymede;
	
	Planet callisto = new Planet (humans.homeSystem,6,4, AOType.ice);
	callisto.aoType						= AOType.ice;
	callisto.starDistance				= 778547200;
	callisto.moonDistance 				= 1882709;
	callisto.name						= language.callisto;
	callisto.sizer 						= 0.05;
	callisto.mass						= 0.00000005406347051438;					
	callisto.diameter					= 3792;				
	callisto.temperature				= 134;
	callisto.atmoType					= AtmoType.none;
	callisto.orbitalPeriod				= 374329940;
	callisto.gravitation 				= 0.126F;
	callisto.resources 					= 0.14;
	callisto.oceans 					= 1;
	callisto.ecosystem 					= 0;
	callisto.dayLength 					= 1441931;
	callisto.pressure 					= 0;
	callisto.specials.add(AOSpecial.bottomless);
	callisto.specials.add(AOSpecial.endlessNights);
	humans.homeSystem.astronomicObject[6][4] = callisto;

	Star saturn = new Star (humans.homeSystem,7,0, AOType.gasGiant);
	saturn.aoType = AOType.gasGiant;
	saturn.sizer = 0.5;
	saturn.diameter = 120536;
	saturn.mass = 0.00028579151924359200;
	saturn.atmoType = AtmoType.H2;
	saturn.temperature = 134;
	saturn.luminosity = 0;
	saturn.orbitalPeriod = 929595379;
	saturn.name = language.saturn;
	saturn.starDistance = 1433449370;
	saturn.moonDistance = 0;
	saturn.specials.add(AOSpecial.magneticField);
	humans.homeSystem.astronomicObject[7][0] = saturn;
	
	Planet tethys = new Planet (humans.homeSystem,7,1, AOType.ice);
	tethys.aoType						= AOType.ice;
	tethys.starDistance					= 1433449370;
	tethys.moonDistance 				= 294619;
	tethys.name							= language.tethys;
	tethys.sizer 						= 0.05;
	tethys.mass							= 0.0000000003093631924;					
	tethys.diameter						= 1066;				
	tethys.temperature					= 82;
	tethys.atmoType						= AtmoType.none;
	tethys.orbitalPeriod				= 929595379;
	tethys.gravitation 					= 0.0148F;
	tethys.resources 					= 0.14;
	tethys.oceans 						= 1;
	tethys.ecosystem 					= 0;
	tethys.dayLength 					= 163106;
	tethys.pressure 					= 0;
	tethys.specials.add(AOSpecial.bottomless);
	tethys.specials.add(AOSpecial.tidalHeating);
	humans.homeSystem.astronomicObject[7][1] = tethys;
	
	Planet dione = new Planet (humans.homeSystem,7,2, AOType.ice);
	dione.aoType						= AOType.ice;
	dione.starDistance					= 1433449370;
	dione.moonDistance 					= 377396;
	dione.name							= language.dione;
	dione.sizer 						= 0.05;
	dione.mass							= 0.00000000098515657382;					
	dione.diameter						= 1123;				
	dione.temperature					= 87;
	dione.atmoType						= AtmoType.none;
	dione.orbitalPeriod					= 929595379;
	dione.gravitation 					= 0.0233F;
	dione.resources 					= 0.07;
	dione.oceans 						= 1;
	dione.ecosystem 					= 0;
	dione.dayLength 					= 236469;
	dione.pressure 						= 0;
	dione.specials.add(AOSpecial.bottomless);
	humans.homeSystem.astronomicObject[7][2] = dione;
	
	Planet rhea = new Planet (humans.homeSystem,7,3, AOType.ice);
	rhea.aoType							= AOType.ice;
	rhea.starDistance					= 1433449370;
	rhea.moonDistance 					= 527108;
	rhea.name							= language.rhea;
	rhea.sizer 							= 0.05;
	rhea.mass							= 0.000000001160;					
	rhea.diameter						= 1527;				
	rhea.temperature					= 73;
	rhea.atmoType						= AtmoType.none;
	rhea.orbitalPeriod					= 929595379;
	rhea.gravitation 					= 0.0265F;
	rhea.resources 						= 1;
	rhea.oceans 						= 0.28;
	rhea.ecosystem 						= 0;
	rhea.dayLength 						= 88596;
	rhea.pressure 						= 0;
	rhea.specials.add(AOSpecial.bottomless);
	humans.homeSystem.astronomicObject[7][3] = rhea;
	
	Planet titan = new Planet (humans.homeSystem,7,4, AOType.ice);
	titan.aoType						= AOType.ice;
	titan.starDistance					= 1433449370;
	titan.moonDistance 					= 1257060;
	titan.name							= language.titan;
	titan.sizer 						= 0.21;
	titan.mass							= 0.00000006757933814298;					
	titan.diameter						= 5152;				
	titan.temperature					= 94;
	titan.atmoType						= AtmoType.N2;
	titan.orbitalPeriod					= 929595379;
	titan.gravitation 					= 0.14F;
	titan.resources 					= 1.62;
	titan.oceans 						= 1;
	titan.ecosystem 					= 0;
	titan.dayLength 					= 1377648;
	titan.pressure 						= 1.467;
	titan.specials.add(AOSpecial.endlessNights);
	titan.specials.add(AOSpecial.bottomless);
	titan.specials.add(AOSpecial.hydrocarbonLakes);
	humans.homeSystem.astronomicObject[7][4] = titan;
	humans.homeSystem.astronomicObject[7][4].colony = new Colony (humans.homeSystem.astronomicObject[7][4], humans.empire, humans, 0.173952, 1, 1); // XXX
	humans.homeSystem.astronomicObject[7][4].colony.allocation[0] = 0.0;
	humans.homeSystem.astronomicObject[7][4].colony.allocation[1] = 0.30;
	humans.homeSystem.astronomicObject[7][4].colony.allocation[2] = 0.50;
	humans.homeSystem.astronomicObject[7][4].colony.allocation[3] = 0.0;
	humans.homeSystem.astronomicObject[7][4].colony.allocation[4] = 0.2;
	humans.homeSystem.astronomicObject[7][4].colony.allocation[5] = 0.0;
	humans.homeSystem.astronomicObject[7][4].colony.allocation[6] = 0.0;
	// new Building(humans.homeSystem.astronomicObject[7][4].colony, BuildingType.spacePort, 1, 1.0);
	humans.homeSystem.astronomicObject[7][4].colony.recalculateAllocation(0);
	humans.homeSystem.astronomicObject[7][4].colony.recalculateAllocation(0);

	Planet iapetus = new Planet (humans.homeSystem,7,5, AOType.ice);
	iapetus.aoType						= AOType.ice;
	iapetus.starDistance				= 1433449370;
	iapetus.moonDistance 				= 3560820;
	iapetus.name						= language.iapetus;
	iapetus.sizer 						= 0.05;
	iapetus.mass						= 0.000000000908;					
	iapetus.diameter					= 1469;				
	iapetus.temperature					= 110;
	iapetus.atmoType					= AtmoType.none;
	iapetus.orbitalPeriod				= 929595379;
	iapetus.gravitation 				= 0.0224F;
	iapetus.resources 					= 0.22;
	iapetus.oceans 						= 1;
	iapetus.ecosystem 					= 0;
	iapetus.dayLength 					= 6853378;
	iapetus.pressure 					= 0;
	iapetus.specials.add(AOSpecial.bottomless);
	iapetus.specials.add(AOSpecial.endlessNights);
	humans.homeSystem.astronomicObject[7][5] = iapetus;
	
	Star uranus = new Star (humans.homeSystem,8,0, AOType.gasGiant);
	uranus.aoType = AOType.gasGiant;
	uranus.sizer = 0.15;
	uranus.diameter = 51118;
	uranus.mass = 0.00004365925596650470;
	uranus.atmoType = AtmoType.H2_He;
	uranus.temperature = 76;
	uranus.luminosity = 0;
	uranus.orbitalPeriod = 2661041793L;
	uranus.name = language.uranus;
	uranus.starDistance = 2876679082L;
	uranus.moonDistance = 0;
	uranus.specials.add(AOSpecial.magneticField);
	humans.homeSystem.astronomicObject[8][0] = uranus;
	humans.homeSystem.astronomicObject[8][0].colony = new Colony (humans.homeSystem.astronomicObject[8][0], humans.empire, humans, 0.371123, 1, 1.5); // XXX
	humans.homeSystem.astronomicObject[8][0].colony.allocation[0] = 0.0;
	humans.homeSystem.astronomicObject[8][0].colony.allocation[1] = 0.0;
	humans.homeSystem.astronomicObject[8][0].colony.allocation[2] = 1.0;
	humans.homeSystem.astronomicObject[8][0].colony.allocation[3] = 0.03;
	humans.homeSystem.astronomicObject[8][0].colony.allocation[4] = 0.0;
	humans.homeSystem.astronomicObject[8][0].colony.allocation[5] = 0.0;
	humans.homeSystem.astronomicObject[8][0].colony.allocation[6] = 0.0;
	humans.homeSystem.astronomicObject[8][0].colony.recalculateAllocation(0);
	humans.homeSystem.astronomicObject[8][0].colony.recalculateAllocation(0);

	Planet ariel = new Planet (humans.homeSystem,8,1, AOType.ice);
	ariel.aoType						= AOType.ice;
	ariel.starDistance					= 2876679082L;
	ariel.moonDistance 					= 191020;
	ariel.name							= language.ariel;
	ariel.sizer 						= 0.02;
	ariel.mass							= 0.00000000067879690757;					
	ariel.diameter						= 1156;				
	ariel.temperature					= 60;
	ariel.atmoType						= AtmoType.none;
	ariel.orbitalPeriod					= 2661041793L;
	ariel.gravitation 					= 0.027F;
	ariel.resources 					= 0.1;
	ariel.oceans 						= 1;
	ariel.ecosystem 					= 0;
	ariel.dayLength 					= 217761;
	ariel.pressure 						= 0;
	ariel.specials.add(AOSpecial.bottomless);
	humans.homeSystem.astronomicObject[8][1] = ariel;
	
	Planet umbriel = new Planet (humans.homeSystem,8,2, AOType.ice);
	umbriel.aoType						= AOType.ice;
	umbriel.starDistance				= 2876679082L;
	umbriel.moonDistance 				= 266300;
	umbriel.name						= language.umbriel;
	umbriel.sizer 						= 0.05;
	umbriel.mass						= 0.00000000060070522794;					
	umbriel.diameter					= 1169;				
	umbriel.temperature					= 75;
	umbriel.atmoType					= AtmoType.none;
	umbriel.orbitalPeriod				= 2661041793L;
	umbriel.gravitation 				= 0.023F;
	umbriel.resources 					= 0.12;
	umbriel.oceans 						= 1;
	umbriel.ecosystem 					= 0;
	umbriel.dayLength 					= 358057;
	umbriel.pressure 					= 0;
	umbriel.specials.add(AOSpecial.bottomless);
	umbriel.specials.add(AOSpecial.longNights);
	humans.homeSystem.astronomicObject[8][2] = umbriel;
	
	Planet titania = new Planet (humans.homeSystem,8,3, AOType.ice);
	titania.aoType						= AOType.ice;
	titania.starDistance				= 2876679082L;
	titania.moonDistance 				= 435910;
	titania.name						= language.titania;
	titania.sizer 						= 0.05;
	titania.mass						= 0.00000000177448324333;					
	titania.diameter					= 1577;				
	titania.temperature					= 70;
	titania.atmoType					= AtmoType.none;
	titania.orbitalPeriod				= 2661041793L;
	titania.gravitation 				= 0.039F;
	titania.resources 					= 0.17;
	titania.oceans 						= 1;
	titania.ecosystem 					= 0;
	titania.dayLength 					= 752187;
	titania.pressure 					= 0;
	titania.specials.add(AOSpecial.bottomless);
	titania.specials.add(AOSpecial.longNights);
	humans.homeSystem.astronomicObject[8][3] = titania;
	
	Planet oberon = new Planet (humans.homeSystem,8,4, AOType.ice);
	oberon.aoType						= AOType.ice;
	oberon.starDistance					= 2876679082L;
	oberon.moonDistance 				= 583520;
	oberon.name							= language.oberon;
	oberon.sizer 						= 0.05;
	oberon.mass							= 0.00000000151557929009;					
	oberon.diameter						= 1523;				
	oberon.temperature					= 70;
	oberon.atmoType						= AtmoType.none;
	oberon.orbitalPeriod				= 2661041793L;
	oberon.gravitation 					= 0.035F;
	oberon.resources 					= 1;
	oberon.oceans 						= 1;
	oberon.ecosystem 					= 0;
	oberon.dayLength 					= 1163224;
	oberon.pressure 					= 0;
	oberon.specials.add(AOSpecial.bottomless);
	oberon.specials.add(AOSpecial.endlessNights);
	humans.homeSystem.astronomicObject[8][4] = oberon;

	Star neptune = new Star (humans.homeSystem,9,0, AOType.gasGiant);
	neptune.aoType = AOType.gasGiant;
	neptune.sizer = 0.15;
	neptune.diameter = 49528;
	neptune.mass = 0.0000515;
	neptune.atmoType = AtmoType.H2_He;
	neptune.temperature = 72;
	neptune.luminosity = 0;
	neptune.orbitalPeriod = 5200376904L;
	neptune.name = language.neptune;
	neptune.starDistance = 4503443661L;
	neptune.moonDistance = 0;
	neptune.specials.add(AOSpecial.magneticField);
	humans.homeSystem.astronomicObject[9][0] = neptune;

	Planet triton = new Planet (humans.homeSystem,9,1, AOType.ice);
	triton.aoType						= AOType.ice;
	triton.starDistance					= 4503443661L;
	triton.moonDistance 				= 354759;
	triton.name							= language.triton;
	triton.sizer 						= 0.05;
	triton.mass							= 0.00000001078265884148;					
	triton.diameter						= 2707;				
	triton.temperature					= 38;
	triton.atmoType						= AtmoType.none;
	triton.orbitalPeriod				= 5200376904L;
	triton.gravitation 					= 0.0794F;
	triton.resources 					= 1;
	triton.oceans 						= 1;
	triton.ecosystem 					= 0;
	triton.dayLength 					= 507760;
	triton.pressure 					= 0;
	triton.specials.add(AOSpecial.bottomless);
	triton.specials.add(AOSpecial.longNights);
	humans.homeSystem.astronomicObject[9][1] = triton;

	Planet kuiperBelt = new Planet (humans.homeSystem,10,0, AOType.asteroid);
	kuiperBelt.aoType					= AOType.asteroid;
	kuiperBelt.starDistance				= 5874000000L;
	kuiperBelt.moonDistance 			= 0;
	kuiperBelt.name						= language.kuiperBelt;
	kuiperBelt.sizer 					= 0.95;
	kuiperBelt.mass						= 0.00000000654768698452;					
	kuiperBelt.diameter					= 2306;				
	kuiperBelt.temperature				= 44;
	kuiperBelt.atmoType					= AtmoType.none;
	kuiperBelt.orbitalPeriod			= 7810836480L;
	kuiperBelt.gravitation 				= 0.067F;
	kuiperBelt.resources 				= 1;
	kuiperBelt.oceans 					= 1;
	kuiperBelt.ecosystem 				= 0;
	kuiperBelt.dayLength 				= 551857;
	kuiperBelt.pressure 				= 0;
	kuiperBelt.specials.add(AOSpecial.bottomless);
	humans.homeSystem.astronomicObject[10][0] = kuiperBelt;
		
	humans.homeworld = humans.homeSystem.astronomicObject[3][0];
	humans.empire.starSystemsKnown.add(humans.homeSystem);
	humans.empire.aoExplored.add(humans.homeSystem.astronomicObject[3][0]);
	humans.homeSystem.owner = humans.empire;
			
	// TURIANS XXX
	turians.name = "Turians";
	turians.name = "Turian";
	turians.empireName = "Turian Hegemony";
	turians.characterNames = new String[]{"Abrudas","Actus","Arterius","Chellick","Corinthus","Fedorian","Jacobus","Kandros","Kryik","Kuril","Lilihierax","Mehrkuri","Nazario","Oraka","Orinia","Pallin","Quentius","Qui'in","Sidonis","Sparatus","Talid","Valkarian","Victus","Vyrnnus"};
	turians.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/turians.png"));
	turians.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/turians.png"));
	turians.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/turians.png"));
	turians.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/turiansBig.png"));
	//turians.color =  new Color(90,134,255); // Color;
	turians.color =  new Color(79,148,205); // Color;
	turians.gravOptimum = 1.14;
	turians.tempOptimum = 304;
	turians.pressure = 1.1F;
	turians.reproduction = SpeciesTrait.singleBirth;	
	turians.biotope = SpeciesTrait.terrestrial;  // Land, Air, Water 
	turians.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	turians.intellect = SpeciesTrait.reasonable;
	turians.society = SpeciesTrait.militaristic; 
	turians.belligerence = SpeciesTrait.aggressive;
	turians.nutrition = SpeciesTrait.carnivore;
	turians.lifeSpan = SpeciesTrait.normalLifespan;
	
	humans.oceanColonies.addAll(Arrays.asList("Trident", "Yamm", "Proteus","Bekenstein","Arvuna","Joab","Pacifica", "Atlantis", "Waterworld", "Kaspian", "Tantalus","Aegean","Adria","Poseidon","Aquatica","Nautilus"));
	humans.terranColonies.addAll(Arrays.asList("Terra Nova", "Chasca", "Eden Prime", "Ontarom", "Horizon", "Franklin", "Zorya", "Tiptree", "Yandoa", "Paradise", "Elysium",  "Arcadia", "Harmony", "Avalon", "Esperance", "Felicity", "Haven", "Botany", "Destiny", "Arcadia", "New Providence", "Demeter", "Xanadu", "Olympus"));
	humans.steppeColonies.addAll(Arrays.asList("Benning","Fehl Prime","Mindoir","Feros","Shanxi","Pannonia","New Colorado","Puszta","Monegros","Pampa","Kansas","Musgrave","Oklahoma","Larzac","Outback","Mesa","Nebraska","Bushveld"));
	humans.desertColonies.addAll(Arrays.asList("Intai'sei", "Dune", "Gobi", "Mojave", "Sahara", "Ordos", "Negev", "Socotra", "Atacama", "Sinai", "Arabia", "Namib", "Kalahari", "Taklamakan", "Sonora", "Karakum", "Thar","Kyzyl Kum","Omaheke"));
	humans.iceColonies.addAll(Arrays.asList("Tyr", "Sanctum","Freedom's Progress","Noveria", "Arctica", "Siberia", "Alaska", "Yukon", "Iceland", "Kamchatka", "Tunguska", "Svalbard", "Ellesmere", "Berkner", "Thurston", "Wrangel", "Laptev", "Kara", "Kishka", "Kodiak"));
	humans.rockColonies.addAll(Arrays.asList("Therum","Dobrovolski","Franklin","Gei Hinnom","Moros","Sinmara"));
	humans.lavaColonies.addAll(Arrays.asList("Santorini","Cotopaxi","Etna","Fuji","Teide","Molokai","Taranaki","Erebus","Hekla","Kanaga","Eldfell","Teon","Osorno","Sangay","Naruko","Colima","Silali","Nisyros","Karthala","Manuk","Ketoy","Lokon","Akutan","Ubinas","Alamakan","Reclus","Bulusan"));
	humans.toxicColonies.addAll(Arrays.asList("Hades", "Inferno", "Hell", "Armageddon", "Lucifer"));
	humans.gasColonies.addAll(Arrays.asList("Veltman","Dranen","Hito","Naxell","Silva","Zion"));
	humans.asteroidColonies.addAll(Arrays.asList("Gilead","Israfil","Mahavid","Rosh","Volkov","Chazov Belt","Nahata Belt","Klein Belt"));
	
	turians.oceanColonies.addAll(Arrays.asList("Aephus?"));
	turians.terranColonies.addAll(Arrays.asList("Oma Ker","Invictus"));
	turians.steppeColonies.addAll(Arrays.asList("Digeris","Taetrus?"));
	turians.desertColonies.addAll(Arrays.asList("Triginta Petra","Juxhi?"));
	turians.iceColonies.addAll(Arrays.asList("Altakiril"));
//	turians.lavaColonies.addAll(Arrays.asList());
//	turians.toxicColonies.addAll(Arrays.asList());
	turians.gasColonies.addAll(Arrays.asList("Iritum","Nutus"));
	 
	
	asari.oceanColonies.addAll(Arrays.asList("Esan","Lessus"));
	asari.terranColonies.addAll(Arrays.asList("Hyetiana","Nevos","Niacal","Sanves"));
	asari.steppeColonies.addAll(Arrays.asList("Chalkhos","Cyone","Illium","Lusia"));
	asari.desertColonies.addAll(Arrays.asList("Asteria","Odasst"));
	asari.iceColonies.addAll(Arrays.asList("Trategos"));
	asari.rockColonies.addAll(Arrays.asList("Agessia","Caleston","Lymetis","Piares","Selvos","Viantel"));
//	asari.lavaColonies.addAll(Arrays.asList());
//	asari.toxicColonies.addAll(Arrays.asList());
	asari.gasColonies.addAll(Arrays.asList("Phoros","Tefnut","Terapso"));
//	asari.asteroidColonies.addAll(Arrays.asList());
	asari.ammoniaColonies.addAll(Arrays.asList("Zesmeni"));
	
	
	
	batarians.oceanColonies.addAll(Arrays.asList("Lorek"));
	batarians.terranColonies.addAll(Arrays.asList("Adek","Aratoht"));
	batarians.steppeColonies.addAll(Arrays.asList("Anhur"));
	batarians.desertColonies.addAll(Arrays.asList("Camala"));
//	batarians.iceColonies.addAll(Arrays.asList());
	batarians.rockColonies.addAll(Arrays.asList("Korar","Logasiri","Ramlat","Vana"));
//	batarians.lavaColonies.addAll(Arrays.asList());
	batarians.toxicColonies.addAll(Arrays.asList("Cholis"));
	
	
//	salarians.oceanColonies.addAll(Arrays.asList());
//	salarians.terranColonies.addAll(Arrays.asList());
//	salarians.steppeColonies.addAll(Arrays.asList());
//	salarians.desertColonies.addAll(Arrays.asList());
//	salarians.iceColonies.addAll(Arrays.asList());
//	salarians.lavaColonies.addAll(Arrays.asList());
//	salarians.toxicColonies.addAll(Arrays.asList());
	salarians.gasColonies.addAll(Arrays.asList("Halegeuse"));
//	salarians.asteroidColonies.addAll(Arrays.asList());
	
	krogan.oceanColonies.addAll(Arrays.asList("Gellix"));
//	krogan.terranColonies.addAll(Arrays.asList());
	krogan.steppeColonies.addAll(Arrays.asList("Garvug"));
	krogan.desertColonies.addAll(Arrays.asList("Korlus"));
//	krogan.iceColonies.addAll(Arrays.asList());
//	krogan.lavaColonies.addAll(Arrays.asList());
//	krogan.toxicColonies.addAll(Arrays.asList());
	krogan.gasColonies.addAll(Arrays.asList("Dor","Ruam","Vard"));
//	krogan.asteroidColonies.addAll(Arrays.asList());
	
	leviathans.oceanColonies.addAll(Arrays.asList("Despoina"));
//	leviathans.terranColonies.addAll(Arrays.asList());
//	leviathans.steppeColonies.addAll(Arrays.asList());
//	leviathans.desertColonies.addAll(Arrays.asList());
//	leviathans.iceColonies.addAll(Arrays.asList());
//	leviathans.lavaColonies.addAll(Arrays.asList());
//	leviathans.toxicColonies.addAll(Arrays.asList());
	
//	quarians.oceanColonies.addAll(Arrays.asList());
//	quarians.terranColonies.addAll(Arrays.asList());
//	quarians.steppeColonies.addAll(Arrays.asList());
//	quarians.desertColonies.addAll(Arrays.asList("Haestrom"));
//	quarians.iceColonies.addAll(Arrays.asList());
//	quarians.lavaColonies.addAll(Arrays.asList());
//	quarians.toxicColonies.addAll(Arrays.asList());
//	quarians.gasColonies.addAll(Arrays.asList());
//	quarians.asteroidColonies.addAll(Arrays.asList());
	
//	geth.oceanColonies.addAll(Arrays.asList());
//	geth.terranColonies.addAll(Arrays.asList());
//	geth.steppeColonies.addAll(Arrays.asList());
//	geth.desertColonies.addAll(Arrays.asList());
//	geth.iceColonies.addAll(Arrays.asList());
//	geth.lavaColonies.addAll(Arrays.asList());
//	geth.toxicColonies.addAll(Arrays.asList());
	geth.gasColonies.addAll(Arrays.asList("Ammut","Charoum"));
//	geth.asteroidColonies.addAll(Arrays.asList());
	
	
//	hanar.oceanColonies.addAll(Arrays.asList());
	hanar.terranColonies.addAll(Arrays.asList("Belan"));
//	hanar.steppeColonies.addAll(Arrays.asList());
//	hanar.desertColonies.addAll(Arrays.asList());
//	hanar.iceColonies.addAll(Arrays.asList());
//	hanar.lavaColonies.addAll(Arrays.asList());
//	hanar.toxicColonies.addAll(Arrays.asList());
	hanar.gasColonies.addAll(Arrays.asList("First Land"));
//	hanar.asteroidColonies.addAll(Arrays.asList());
	
	volus.ammoniaColonies.addAll(Arrays.asList("Daleon","Maskawa","Boro","Talis Fia"));
	volus.rockColonies.addAll(Arrays.asList("Zada Ban"));
	
	vorcha.desertColonies.addAll(Arrays.asList("Parasc"));
	
	elcor.terranColonies.addAll(Arrays.asList("Thunawanuro"));
	
	
	turians.init();	

	// ASARI XXX
	asari.name = "Asari";
	asari.adjective = "Asari";
	asari.empireName = "Asari Republic";
	asari.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/asari.png"));
	asari.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/asari.png"));
	asari.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/asari.png"));
	asari.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/asariBig.png"));
	asari.color =  new Color(150,32,255); //Color.magenta;
	asari.gravOptimum = 1.1;
	asari.tempOptimum = 298;
	asari.pressure = 0.96F;
	asari.reproduction = SpeciesTrait.singleBirth;	
	asari.biotope = SpeciesTrait.terrestrial;  // Land, Air, Water 
	asari.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	asari.intellect = SpeciesTrait.clever;
	asari.society = SpeciesTrait.democratic; 
	asari.belligerence = SpeciesTrait.peaceful;
	asari.nutrition = SpeciesTrait.omnivore;
	asari.lifeSpan = SpeciesTrait.longLived;
	asari.specialTraits.add(SpeciesTrait.mindMeld);
	asari.specialTraits.add(SpeciesTrait.telekinetic);
	asari.init();
	
	
	// SALARIANS XXX
	salarians.name = "Salarians";
	salarians.adjective = "Salarian";
	salarians.empireName = "Salarian Union";
	salarians.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/salarians.png"));
	salarians.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/salarians.png"));
	salarians.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/salarians.png"));
	salarians.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/salariansBig.png"));
	salarians.color =  new Color(102,205,170); //Color.aquamarin;
	salarians.gravOptimum = 0.94;
	salarians.tempOptimum = 298;
	salarians.pressure = 1.42F;
	salarians.reproduction = SpeciesTrait.massBirth;	
	salarians.biotope = SpeciesTrait.amphibean;  // Land, Air, Water 
	salarians.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	salarians.intellect = SpeciesTrait.ingenious;
	salarians.society = SpeciesTrait.feudalistic; 
	salarians.belligerence = SpeciesTrait.resolute;
	salarians.nutrition = SpeciesTrait.omnivore;
	salarians.lifeSpan = SpeciesTrait.shortLived;
	salarians.specialTraits.add(SpeciesTrait.photographicMemory);
	salarians.init();
	
	
	// KROGANS XXX
	krogan.name = "Krogan";
	krogan.adjective	= "Krogan"; 
	krogan.empireName = "Krogan Empire";
	krogan.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/krogan.png"));
	krogan.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/krogan.png"));
	krogan.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/krogan.png"));
	krogan.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/kroganBig.png"));
	krogan.color =  new Color(155,0,0); //Color.red;
	krogan.gravOptimum = 1.14;
	krogan.tempOptimum = 309;
	krogan.pressure = 1.1F;
	krogan.reproduction = SpeciesTrait.massBirth;	
	krogan.biotope = SpeciesTrait.desertDwellers;  // Land, Air, Water 
	krogan.skeleton = SpeciesTrait.exoskeleton; // mollusc, endoskeleton, exoskeleton
	krogan.intellect = SpeciesTrait.unimaginative;
	krogan.society = SpeciesTrait.militaristic; 
	krogan.belligerence = SpeciesTrait.warmongering;
	krogan.nutrition = SpeciesTrait.carnivore;
	krogan.lifeSpan = SpeciesTrait.longLived;
	krogan.specialTraits.add(SpeciesTrait.largeSpecies);
	krogan.specialTraits.add(SpeciesTrait.resistant);	
	krogan.init();
	
	
	//	VOLUS XXX
	volus.name = "Volus";
	volus.adjective = "Volus";
	volus.empireName = "Vol Clan";
	volus.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/volus.png"));
	volus.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/volus.png"));
	volus.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/volus.png"));
	volus.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/volusBig.png"));
	volus.color = new Color(205,155,29);
	volus.gravOptimum = 1.5;
	volus.tempOptimum = 282;
	volus.pressure = 60.56F;
	volus.reproduction = SpeciesTrait.singleBirth;	
	volus.biotope = SpeciesTrait.terrestrial;  // Land, Air, Water 
	volus.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	volus.intellect = SpeciesTrait.clever;
	volus.society = SpeciesTrait.materialistic; 
	volus.belligerence = SpeciesTrait.pacifistic;
	volus.nutrition = SpeciesTrait.herbivore;
	volus.lifeSpan = SpeciesTrait.normalLifespan;
	volus.specialTraits.add(SpeciesTrait.ammoniaBased);
	volus.init();

	
	// BATARIANS XXX
	batarians.name = "Batarians";
	batarians.adjective = "Batarian";
	batarians.empireName = "Batarian Hegemony";
	batarians.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/batarians.png"));
	batarians.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/batarians.png"));
	batarians.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/batarians.png"));
	batarians.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/batariansBig.png"));
//	batarians.color = new Color(139,69,19);
	batarians.color = new Color(60,120,30);	
	batarians.gravOptimum = 0.96;
	batarians.tempOptimum = 306;
	batarians.pressure = 0.62F;
	batarians.reproduction = SpeciesTrait.singleBirth;	
	batarians.biotope = SpeciesTrait.terrestrial;  // Land, Air, Water 
	batarians.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	batarians.intellect = SpeciesTrait.reasonable;
	batarians.society = SpeciesTrait.authoritarian; 
	batarians.belligerence = SpeciesTrait.aggressive;
	batarians.nutrition = SpeciesTrait.omnivore;
	batarians.lifeSpan = SpeciesTrait.normalLifespan;
	batarians.specialTraits.add(SpeciesTrait.arrogant);
	batarians.init();
	
	
	// DRELL XXX
	drell.name = "Drell";
	drell.adjective = "Drell";
	drell.empireName = "Drell Community";
	drell.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/drell.png"));
	drell.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/drell.png"));
	drell.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/drell.png"));
	drell.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/drellBig.png"));
	drell.color = new Color(145,185,60); // light green
	drell.gravOptimum = 12;
	drell.tempOptimum = 285;
	drell.pressure = 1.0F;
	drell.reproduction = SpeciesTrait.singleBirth;	
	drell.biotope = SpeciesTrait.desertDwellers;  // Land, Air, Water 
	drell.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	drell.intellect = SpeciesTrait.clever;
	drell.society = SpeciesTrait.authoritarian; 
	drell.belligerence = SpeciesTrait.resolute;
	drell.nutrition = SpeciesTrait.omnivore;
	drell.lifeSpan = SpeciesTrait.normalLifespan;
	drell.specialTraits.add(SpeciesTrait.photographicMemory);
	drell.init();
	
		
	// HANAR XXX
	hanar.name = "Hanar";
	hanar.adjective = "Hanar";
	hanar.empireName = "Illuminated Primacy";
	hanar.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/hanar.png"));
	hanar.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/hanar.png"));
	hanar.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/hanar.png"));
	hanar.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/hanarBig.png"));
	hanar.color = new Color(255,130,170); // rose
	hanar.gravOptimum = 8;
	hanar.tempOptimum = 303;
	hanar.pressure = 1.0F;
	hanar.reproduction = SpeciesTrait.massBirth;	
	hanar.biotope = SpeciesTrait.aquatic;  // Land, Air, Water 
	hanar.skeleton = SpeciesTrait.mollusc; // mollusc, endoskeleton, exoskeleton
	hanar.intellect = SpeciesTrait.reasonable;
	hanar.society = SpeciesTrait.feudalistic; 
	hanar.belligerence = SpeciesTrait.pacifistic;
	hanar.nutrition = SpeciesTrait.omnivore;
	hanar.lifeSpan = SpeciesTrait.normalLifespan;
	hanar.specialTraits.add(SpeciesTrait.coldBlooded);
	hanar.specialTraits.add(SpeciesTrait.religious);
	hanar.init();
	
	//	VORACHA XXX
	vorcha.name = "Vorcha";
	vorcha.adjective = "Vorcha";
	vorcha.empireName = "Vorcha Realm";
	vorcha.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/vorcha.png"));
	vorcha.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/vorcha.png"));
	vorcha.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/vorcha.png"));
	vorcha.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/vorchaBig.png"));
	vorcha.color = new Color(188,143,143);
	vorcha.gravOptimum = 0.695;
	vorcha.tempOptimum = 305;
	vorcha.pressure = 0.27F;
	vorcha.reproduction = SpeciesTrait.multipleBirth;	
	vorcha.biotope = SpeciesTrait.desertDwellers;  // Land, Air, Water 
	vorcha.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	vorcha.intellect = SpeciesTrait.retarded;
	vorcha.society = SpeciesTrait.anarchic; 
	vorcha.belligerence = SpeciesTrait.warmongering;
	vorcha.nutrition = SpeciesTrait.omnivore;
	vorcha.lifeSpan = SpeciesTrait.shortLived;
	vorcha.specialTraits.add(SpeciesTrait.resistant);
	vorcha.init();
	
	
	// QUARIANS XXX
	quarians.name = "Quarians";
	quarians.adjective = "Quarian";
	quarians.empireName = "Quarian Conclave";
	quarians.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/quarians.png"));
	quarians.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/quarians.png"));
	quarians.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/quarians.png"));
	quarians.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/quariansBig.png"));
	quarians.color = new Color(139,0,139);
	quarians.gravOptimum = 0.89;
	quarians.tempOptimum = 321;
	quarians.pressure = 0.93F;
	quarians.reproduction = SpeciesTrait.singleBirth;	
	quarians.biotope = SpeciesTrait.desertDwellers;  // Land, Air, Water 
	quarians.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	quarians.intellect = SpeciesTrait.clever;
	quarians.society = SpeciesTrait.democratic; 
	quarians.belligerence = SpeciesTrait.resolute;
	quarians.nutrition = SpeciesTrait.herbivore;
	quarians.lifeSpan = SpeciesTrait.normalLifespan;
	quarians.init();
	
		
	// ELCOR XXX
	elcor.name = "Elcor";
	elcor.adjective = "Elcor";
	elcor.empireName = "Courts of Dekuuna";
	elcor.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/elcor.png"));
	elcor.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/elcor.png"));
	elcor.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/elcor.png"));
	elcor.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/elcorBig.png"));
	elcor.color = new Color(198,226,255);
	elcor.gravOptimum = 40;
	elcor.tempOptimum = 302;
	elcor.pressure = 1.02F;
	elcor.reproduction = SpeciesTrait.singleBirth;	
	elcor.biotope = SpeciesTrait.terrestrial;  // Land, Air, Water 
	elcor.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	elcor.intellect = SpeciesTrait.reasonable;
	elcor.society = SpeciesTrait.democratic; 
	elcor.belligerence = SpeciesTrait.peaceful;
	elcor.nutrition = SpeciesTrait.herbivore;
	elcor.lifeSpan = SpeciesTrait.normalLifespan;
	elcor.specialTraits.add(SpeciesTrait.largeSpecies);
	elcor.init();
	
		
	// PROTHEANS XXX
	protheans.name = "Protheans";
	protheans.adjective = "Prothean";
	protheans.empireName = "Prothean Empire";
	protheans.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/protheans.png"));
	protheans.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/protheans.png"));
	protheans.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/protheans.png"));
	protheans.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/protheansBig.png"));
	protheans.color = new Color(200,40,80);
	protheans.gravOptimum = 8;
	protheans.tempOptimum = 294;
	protheans.pressure = 1.0F;
	protheans.reproduction = SpeciesTrait.singleBirth;	
	protheans.biotope = SpeciesTrait.terrestrial;  // Land, Air, Water 
	protheans.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	protheans.intellect = SpeciesTrait.clever;
	protheans.society = SpeciesTrait.militaristic; 
	protheans.belligerence = SpeciesTrait.aggressive;
	protheans.nutrition = SpeciesTrait.carnivore;
	protheans.lifeSpan = SpeciesTrait.normalLifespan;
	protheans.specialTraits.add(SpeciesTrait.arrogant);
	protheans.specialTraits.add(SpeciesTrait.mindMeld);
	protheans.init();
	
		
	// LEVIATHANS XXX
	leviathans.name = "Leviathans";
	leviathans.adjective = "Leviathan";
	leviathans.empireName = "Leviathan Hegemony";
	leviathans.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/leviathans.png"));
	leviathans.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/leviathans.png"));
	leviathans.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/leviathans.png"));
	leviathans.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/leviathansBig.png"));
	leviathans.color = new Color(0,100,100);
	leviathans.gravOptimum = 10;
	leviathans.tempOptimum = 277;
	leviathans.pressure = 1.0F;
	leviathans.reproduction = SpeciesTrait.singleBirth;	
	leviathans.biotope = SpeciesTrait.aquatic;  // Land, Air, Water 
	leviathans.skeleton = SpeciesTrait.exoskeleton; // mollusc, endoskeleton, exoskeleton
	leviathans.intellect = SpeciesTrait.clever;
	leviathans.society = SpeciesTrait.authoritarian; 
	leviathans.belligerence = SpeciesTrait.resolute;
	leviathans.nutrition = SpeciesTrait.carnivore;
	leviathans.lifeSpan = SpeciesTrait.longLived;
	leviathans.specialTraits.add(SpeciesTrait.arrogant);
	leviathans.specialTraits.add(SpeciesTrait.largeSpecies);
	leviathans.specialTraits.add(SpeciesTrait.coldBlooded);
	leviathans.specialTraits.add(SpeciesTrait.mindMeld);
	leviathans.init();
	
	
	// ORAVORES XXX
	oravores.name = "Oravores";
	oravores.adjective = "Oravore";
	oravores.empireName = "Oravore Empire";
	oravores.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/oravores.png"));
	oravores.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/oravores.png"));
	oravores.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/oravores.png"));
	oravores.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/oravoresBig.png"));
	oravores.color = new Color(139,58,58);
	oravores.gravOptimum = 10;
	oravores.tempOptimum = 294;
	oravores.pressure = 1.0F;
	oravores.reproduction = SpeciesTrait.singleBirth;	
	oravores.biotope = SpeciesTrait.terrestrial;  // Land, Air, Water 
	oravores.skeleton = SpeciesTrait.endoskeleton; // mollusc, endoskeleton, exoskeleton
	oravores.intellect = SpeciesTrait.clever;
	oravores.society = SpeciesTrait.authoritarian; 
	oravores.belligerence = SpeciesTrait.warmongering;
	oravores.nutrition = SpeciesTrait.carnivore;
	oravores.lifeSpan = SpeciesTrait.normalLifespan;
	oravores.specialTraits.add(SpeciesTrait.arrogant);
	oravores.specialTraits.add(SpeciesTrait.coldBlooded);
	oravores.init();


	//	RACHNI XXX
	rachni.name = "Rachni";
	rachni.adjective = "Rachni";
	rachni.empireName = "Rachni Hive";
	rachni.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/rachni.png"));
	rachni.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/rachni.png"));
	rachni.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/rachni.png"));
	rachni.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/rachniBig.png"));
	rachni.color = new Color(139,58,98);
	rachni.gravOptimum = 0.71;
	rachni.tempOptimum = 313;
	rachni.pressure = 0.88F;
	rachni.reproduction = SpeciesTrait.massBirth;	
	rachni.biotope = SpeciesTrait.desertDwellers;  // Land, Air, Water 
	rachni.skeleton = SpeciesTrait.exoskeleton; // mollusc, endoskeleton, exoskeleton
	rachni.intellect = SpeciesTrait.reasonable;
	rachni.society = SpeciesTrait.eusocial; 
	rachni.belligerence = SpeciesTrait.warmongering;
	rachni.nutrition = SpeciesTrait.omnivore;
	rachni.lifeSpan = SpeciesTrait.longLived;
	rachni.specialTraits.add(SpeciesTrait.arrogant);
	rachni.specialTraits.add(SpeciesTrait.coldBlooded);
	rachni.specialTraits.add(SpeciesTrait.resistant);
	rachni.specialTraits.add(SpeciesTrait.subterranean);
	rachni.init();

	
	geth.name = "Geth";
	geth.adjective = "geth";
	geth.empireName = "Geth Hive";
	geth.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/rachni.png"));
	geth.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/rachni.png"));
	geth.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/rachni.png"));
	geth.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/rachniBig.png"));
	geth.color = new Color(139,58,98);
	geth.gravOptimum = 7;
	geth.tempOptimum = 313;
	geth.pressure = 0.88F;
	geth.reproduction = SpeciesTrait.massBirth;	
	geth.biotope = SpeciesTrait.desertDwellers;  // Land, Air, Water 
	geth.skeleton = SpeciesTrait.exoskeleton; // mollusc, endoskeleton, exoskeleton
	geth.intellect = SpeciesTrait.reasonable;
	geth.society = SpeciesTrait.eusocial; 
	geth.belligerence = SpeciesTrait.warmongering;
	geth.nutrition = SpeciesTrait.omnivore;
	geth.lifeSpan = SpeciesTrait.longLived;
	geth.specialTraits.add(SpeciesTrait.arrogant);
	geth.specialTraits.add(SpeciesTrait.coldBlooded);
	geth.specialTraits.add(SpeciesTrait.resistant);
	geth.specialTraits.add(SpeciesTrait.subterranean);
	geth.init();

	raloi.name = "raloi";
	raloi.adjective = "raloi";
	raloi.empireName = "raloi Hive";
	raloi.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/rachni.png"));
	raloi.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/rachni.png"));
	raloi.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/rachni.png"));
	raloi.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/rachniBig.png"));
	raloi.color = new Color(139,58,98);
	raloi.gravOptimum = 7;
	raloi.tempOptimum = 313;
	raloi.pressure = 0.88F;
	raloi.reproduction = SpeciesTrait.massBirth;	
	raloi.biotope = SpeciesTrait.desertDwellers;  // Land, Air, Water 
	raloi.skeleton = SpeciesTrait.exoskeleton; // mollusc, endoskeleton, exoskeleton
	raloi.intellect = SpeciesTrait.reasonable;
	raloi.society = SpeciesTrait.democratic; 
	raloi.belligerence = SpeciesTrait.warmongering;
	raloi.nutrition = SpeciesTrait.omnivore;
	raloi.lifeSpan = SpeciesTrait.longLived;
	raloi.specialTraits.add(SpeciesTrait.arrogant);
	raloi.specialTraits.add(SpeciesTrait.coldBlooded);
	raloi.specialTraits.add(SpeciesTrait.subterranean);
	raloi.specialTraits.add(SpeciesTrait.airborne);
	raloi.init();
	
	yahg.name = "yahg";
	yahg.adjective = "yahg";
	yahg.empireName = "yahg Hive";
	yahg.speciesIcon = new ImageIcon(GraphicFU.class.getResource("SpeciesIcons/rachni.png"));
	yahg.speciesBig = new ImageIcon(GraphicFU.class.getResource("SpeciesPics/rachni.png"));
	yahg.flagIcon = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/rachni.png"));
	yahg.flagBig = new ImageIcon(GraphicFU.class.getResource("FlagSymbols/rachniBig.png"));
	yahg.color = new Color(139,58,98);
	yahg.gravOptimum = 7;
	yahg.tempOptimum = 313;
	yahg.pressure = 0.88F;
	yahg.reproduction = SpeciesTrait.massBirth;	
	yahg.biotope = SpeciesTrait.desertDwellers;  // Land, Air, Water 
	yahg.skeleton = SpeciesTrait.exoskeleton; // mollusc, endoskeleton, exoskeleton
	yahg.intellect = SpeciesTrait.reasonable;
	yahg.society = SpeciesTrait.authoritarian; 
	yahg.belligerence = SpeciesTrait.warmongering;
	yahg.nutrition = SpeciesTrait.omnivore;
	yahg.lifeSpan = SpeciesTrait.longLived;
	yahg.specialTraits.add(SpeciesTrait.arrogant);
	yahg.specialTraits.add(SpeciesTrait.coldBlooded);
	yahg.specialTraits.add(SpeciesTrait.resistant);
	yahg.specialTraits.add(SpeciesTrait.subterranean);
	
	yahg.init();
	
	}
}
