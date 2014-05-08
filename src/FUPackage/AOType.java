package FUPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class AOType implements IGeneralData{

	String name = "Name required";
	String abbr = "P";
	boolean isStar = false;
	boolean isPlanet = false;
	boolean canBeMoon = true;
	boolean sizedImages = true;
	boolean asteroidBelt = false;
	int iconID = 0;
	int iconSizeVariants = 1;
	float minSizer = 0;
	float probability = 0;
	int minTemp = 0;
	int maxTemp = 100000000;
	float tempOffset = 0;
	float minMass = 0;
	float maxMass = 0;
	float minOceans = 0;
	float maxOceans = 0;
	long minDiameter = 1000;
	long maxDiameter = 26000;
	float minDensity = 1;
	float maxDensity = 10;
	float minResources = 0;
	float maxResources = 0;
	float minPressure = 0;
	float maxPressure = 0;
	float ecosystem  = 0;
	int quantity = 0;
	
	Icon galaxyStarIcon = GraphicFU.qMarkIcon;
	Icon primaryStarIcon = GraphicFU.qMarkIcon;
	Icon aoIcon[];
	
	
	String[] systemName; // = language.starName;  // Test
	Set<AtmoType> possibleAtmospheres = new HashSet<AtmoType>();
	Set<AOSpecial> possibleSpecials = new LinkedHashSet<AOSpecial>();
	
	Set<AOType> possiblePrimaryStar = new HashSet<AOType>();
	
	static Set<AOType> planets = new HashSet<AOType>();
	static Set<AOType> stars = new HashSet<AOType>();
	static Set<AOType> primaryStars = new HashSet<AOType>();
	
	
	static AOType asteroid = new AOType();
	static AOType ice = new AOType();
	static AOType ocean = new AOType();
	static AOType terran = new AOType();
	static AOType steppe = new AOType();
	static AOType desert = new AOType();
	static AOType ammonia = new AOType();
	static AOType rock = new AOType();
	static AOType toxic = new AOType();
	static AOType lava = new AOType();
	
	
	static AOType gasGiant = new AOType();
	static AOType brownDwarf = new AOType();
	static AOType classM = new AOType();
	static AOType classK = new AOType();
	static AOType classG = new AOType();
	static AOType classF = new AOType();
	static AOType classA = new AOType();
	static AOType classB = new AOType();
	static AOType classO = new AOType();
	static AOType redGiant = new AOType();
	static AOType whiteDwarf = new AOType();
	static AOType neutronStar = new AOType();
	static AOType blackHole = new AOType();

	
public AOType(){
	}
	
	void setName(String name_){
	this.name = name_;	
	}

	public String getName(){
	return this.name;
	}

	void setMinTemp (int x) {
		this.minTemp = x;
	}
	
	int getMinTemp () {
		return this.minTemp;
	}
	
	void setMaxTemp (int x) {
		this.maxTemp = x;
	}
	
	int getMaxTemp () {
		return this.maxTemp;
	}
	
	void setMinOceans (float x) {
		this.minOceans = x;
	}
	
	float getMinOceans () {
		return this.minOceans;
	}
	
	void setMinDiameter (int x) {
		this.minDiameter = x;
	}
	
	long getMinDiameter () {
		return this.minDiameter;
	}

	void setMaxDiameter (int x) {
		this.maxDiameter = x;
	}
	
	float getMaxDiameter () {
		return this.maxDiameter;
	}
	
	void setMinResources (float x) {
		this.minResources = x;
	}
	
	float getMinResources () {
		return this.minResources;
	}
	
	void setMaxResources (float x) {
		this.maxResources = x;
	}
	
	float getMaxResources () {
		return this.maxResources;
	}
	
	void setMinPressure (float x) {
		this.minPressure = x;
	}
	
	float getMinPressure () {
		return this.minPressure;
	}
	
	void setMaxPressure (float x) {
		this.maxPressure = x;
	}
	
	float getMaxPressure () {
		return this.maxPressure;
	}
	
	void setMinSizer (float x) {
		this.minSizer = x;
	}
	
	float getMinSizer () {
		return this.minSizer;
	}
	
	void setMinDensity (float x) {
		this.minDensity = x;
	}
	
	float getMinDensity () {
		return this.minDensity;
	}

	void setMaxDensity (float x) {
		this.maxDensity = x;
	}
	
	float getMaxDensity () {
		return this.maxDensity;
	}
	
	void setMinMass (float x) {
		this.minMass = x;
	}
	
	float getMinMass () {
		return this.minMass;
	}
	
	void setMaxMass (float x) {
		this.maxMass = x;
	}
	
	float getMaxMass () {
		return this.maxMass;
	}
	
	
	void setPobability (float x) {
		this.probability = x;
	}
	
	float getProbability () {
		return this.probability;
	}

	
	static void initialize(){

		
		planets.add(ocean);
		planets.add(terran);
		planets.add(steppe);
		planets.add(desert);
		planets.add(ammonia);
		planets.add(ice);
		planets.add(rock);
		planets.add(toxic);
		planets.add(lava);
		planets.add(asteroid);
		
		stars.add(blackHole);
		stars.add(neutronStar);
		stars.add(whiteDwarf);
		stars.add(classO);
		stars.add(classB);
		stars.add(classA);
		stars.add(classF);
		stars.add(classG);
		stars.add(classK);
		stars.add(classM);
		stars.add(brownDwarf);
		stars.add(gasGiant);

		primaryStars.add(blackHole);
		primaryStars.add(redGiant);
		primaryStars.add(neutronStar);
		primaryStars.add(whiteDwarf);
		primaryStars.add(classO);
		primaryStars.add(classB);
		primaryStars.add(classA);
		primaryStars.add(classF);
		primaryStars.add(classG);
		primaryStars.add(classK);
		primaryStars.add(classM);
		
		
		ice.name 				= language.ice;
		ice.isPlanet 			= true;
		ice.iconID				= 14;
		ice.iconSizeVariants 	= 5;
		ice.probability 		= 0.35F;  
		ice.minSizer 			= 0;
		ice.minTemp				= 0;
		ice.maxTemp				= 273;
		ice.minOceans 			= 0.5F;
		ice.maxOceans 			= 1;
		ice.minDiameter 		= 1000;
		ice.maxDiameter 		= 26000;
		ice.minDensity 			= 3;
		ice.maxDensity 			= 5;
		ice.minResources 		= 0;
		ice.maxResources		= 3;
		ice.minPressure 		= 0;
		ice.maxPressure			= 20;
		ice.tempOffset			= 0.7F;
		ice.possibleAtmospheres.add(AtmoType.N2);
		ice.possibleAtmospheres.add(AtmoType.N2_CO2);
		ice.possibleAtmospheres.add(AtmoType.CO2);
		
		ice.possibleSpecials.add(AOSpecial.magneticField);
		ice.possibleSpecials.add(AOSpecial.tidalLocked);
		ice.possibleSpecials.add(AOSpecial.tidalHeating);
		ice.possibleSpecials.add(AOSpecial.strongTide);
		ice.possibleSpecials.add(AOSpecial.axialTilt);
		ice.possibleSpecials.add(AOSpecial.endlessNights);
		ice.possibleSpecials.add(AOSpecial.longNights);
		ice.possibleSpecials.add(AOSpecial.eccentricOrbit);
		ice.possibleSpecials.add(AOSpecial.shiftingOrbit);
		ice.possibleSpecials.add(AOSpecial.asteroidField);
		ice.possibleSpecials.add(AOSpecial.meteoriteShowers);
		ice.possibleSpecials.add(AOSpecial.isotopeDeposits);
		ice.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		ice.possibleSpecials.add(AOSpecial.hydrocarbonLakes);
		ice.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		ice.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		ice.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		ice.possibleSpecials.add(AOSpecial.bottomless);
		ice.possibleSpecials.add(AOSpecial.cavernous);
		ice.possibleSpecials.add(AOSpecial.oversalted);
		ice.possibleSpecials.add(AOSpecial.poisonousSoil);
		ice.possibleSpecials.add(AOSpecial.stormyClimate);
		ice.possibleSpecials.add(AOSpecial.erraticClimate);
		ice.possibleSpecials.add(AOSpecial.subsurfaceEcosystem);
		
		
		ice.possiblePrimaryStar.add(classM);
		ice.possiblePrimaryStar.add(classK);
		ice.possiblePrimaryStar.add(classG);
		ice.possiblePrimaryStar.add(classF);
		ice.possiblePrimaryStar.add(classA);
		ice.possiblePrimaryStar.add(classB);
		ice.possiblePrimaryStar.add(classO);
		ice.possiblePrimaryStar.add(redGiant);
		ice.possiblePrimaryStar.add(whiteDwarf);
		ice.possiblePrimaryStar.add(neutronStar);
		ice.possiblePrimaryStar.add(blackHole);
		
		
		ocean.name 				= language.ocean;
		ocean.isPlanet 			= true;
		ocean.iconID			= 15;
		ocean.iconSizeVariants 	= 5;
		ocean.probability 		= 0.25F;
		ocean.minSizer 			= 0.3F;
		ocean.minTemp			= 255;
		ocean.maxTemp			= 285;
		ocean.minOceans 		= 0.75F;
		ocean.maxOceans 		= 1;
		ocean.minDiameter 		= 1000;
		ocean.maxDiameter 		= 26000;
		ocean.minDensity 		= 3;
		ocean.maxDensity 		= 5;
		ocean.minResources 		= 0.5F;
		ocean.maxResources		= 3;
		ocean.minPressure 		= 0.25F;
		ocean.maxPressure		= 5;
		ocean.tempOffset		= 0.95F;
		ocean.ecosystem			= 1;
		ocean.possibleAtmospheres.add(AtmoType.N2_O2);
		ocean.possibleAtmospheres.add(AtmoType.N2_O2_CO2);
		
		
		ocean.possibleSpecials.add(AOSpecial.tidalLocked);
		ocean.possibleSpecials.add(AOSpecial.tidalHeating);
		ocean.possibleSpecials.add(AOSpecial.strongTide);
		ocean.possibleSpecials.add(AOSpecial.endlessNights);
		ocean.possibleSpecials.add(AOSpecial.longNights);
		ocean.possibleSpecials.add(AOSpecial.eccentricOrbit);
		ocean.possibleSpecials.add(AOSpecial.asteroidField);
		ocean.possibleSpecials.add(AOSpecial.isotopeDeposits);
		ocean.possibleSpecials.add(AOSpecial.bottomless);
		ocean.possibleSpecials.add(AOSpecial.cavernous);
		ocean.possibleSpecials.add(AOSpecial.volcanism);
		ocean.possibleSpecials.add(AOSpecial.swamps);
		ocean.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		ocean.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		ocean.possibleSpecials.add(AOSpecial.hydrocarbonDeposits);
		ocean.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		ocean.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		ocean.possibleSpecials.add(AOSpecial.oversalted);
		ocean.possibleSpecials.add(AOSpecial.strongOceanCurrents);
		ocean.possibleSpecials.add(AOSpecial.stormyClimate);
		ocean.possibleSpecials.add(AOSpecial.rainyClimate);
		ocean.possibleSpecials.add(AOSpecial.favorableClimate);
		ocean.possibleSpecials.add(AOSpecial.erraticClimate);
		ocean.possibleSpecials.add(AOSpecial.fertileSoil);
		ocean.possibleSpecials.add(AOSpecial.biodiversity);
		ocean.possibleSpecials.add(AOSpecial.alienPredator);
		ocean.possibleSpecials.add(AOSpecial.gardenPest);
		ocean.possibleSpecials.add(AOSpecial.robustEcosystem);
		ocean.possibleSpecials.add(AOSpecial.kelp);
		ocean.possibleSpecials.add(AOSpecial.medicinalPlants);
		ocean.possibleSpecials.add(AOSpecial.hallucinogens);
		ocean.possibleSpecials.add(AOSpecial.pathogens);
		ocean.possibleSpecials.add(AOSpecial.alienTech);
		ocean.possibleSpecials.add(AOSpecial.alienLibrary);
		ocean.possibleSpecials.add(AOSpecial.ancientRuins);

		ocean.possiblePrimaryStar.add(classM);
		ocean.possiblePrimaryStar.add(classK);
		ocean.possiblePrimaryStar.add(classG);
		ocean.possiblePrimaryStar.add(classF);
		
		terran.name 			= language.terran;
		terran.isPlanet 		= true;
		terran.iconID			= 16;
		terran.iconSizeVariants = 5;
		terran.probability 		= 0.25F;
		terran.minSizer 		= 0.3F;
		terran.minTemp			= 270;
		terran.maxTemp			= 300;
		terran.minOceans 		= 0.5F;
		terran.maxOceans 		= 0.75F;
		terran.minDiameter 		= 1000;
		terran.maxDiameter 		= 26000;
		terran.minDensity 		= 4;
		terran.maxDensity 		= 8;
		terran.minResources 	= 0.75F;
		terran.maxResources		= 5;
		terran.minPressure 		= 0.25F;
		terran.maxPressure		= 5;
		terran.tempOffset		= 0.9F;
		terran.ecosystem		= 1;
		terran.possibleAtmospheres.add(AtmoType.N2_O2);
		terran.possibleAtmospheres.add(AtmoType.N2_O2_CO2);
		
		
		terran.possibleSpecials.add(AOSpecial.tidalLocked);
		terran.possibleSpecials.add(AOSpecial.tidalHeating);
		terran.possibleSpecials.add(AOSpecial.strongTide);
		terran.possibleSpecials.add(AOSpecial.endlessNights);
		terran.possibleSpecials.add(AOSpecial.longNights);
		terran.possibleSpecials.add(AOSpecial.eccentricOrbit);
		terran.possibleSpecials.add(AOSpecial.asteroidField);
		terran.possibleSpecials.add(AOSpecial.isotopeDeposits);
		terran.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		terran.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		terran.possibleSpecials.add(AOSpecial.hydrocarbonDeposits);
		terran.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		terran.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		terran.possibleSpecials.add(AOSpecial.oversalted);
		terran.possibleSpecials.add(AOSpecial.cavernous);
		terran.possibleSpecials.add(AOSpecial.volcanism);
		terran.possibleSpecials.add(AOSpecial.ruggedTerrain);
		terran.possibleSpecials.add(AOSpecial.plains);
		terran.possibleSpecials.add(AOSpecial.swamps);
		terran.possibleSpecials.add(AOSpecial.strongOceanCurrents);
		terran.possibleSpecials.add(AOSpecial.stormyClimate);
		terran.possibleSpecials.add(AOSpecial.rainyClimate);
		terran.possibleSpecials.add(AOSpecial.favorableClimate);
		terran.possibleSpecials.add(AOSpecial.erraticClimate);
		terran.possibleSpecials.add(AOSpecial.fertileSoil);
		terran.possibleSpecials.add(AOSpecial.biodiversity);
		terran.possibleSpecials.add(AOSpecial.alienPredator);
		terran.possibleSpecials.add(AOSpecial.gardenPest);
		terran.possibleSpecials.add(AOSpecial.subterraneanAnimals);
		terran.possibleSpecials.add(AOSpecial.robustEcosystem);
		terran.possibleSpecials.add(AOSpecial.woodlands);
		terran.possibleSpecials.add(AOSpecial.kelp);
		terran.possibleSpecials.add(AOSpecial.medicinalPlants);
		terran.possibleSpecials.add(AOSpecial.hallucinogens);
		terran.possibleSpecials.add(AOSpecial.pathogens);
		terran.possibleSpecials.add(AOSpecial.alienTech);
		terran.possibleSpecials.add(AOSpecial.alienLibrary);
		terran.possibleSpecials.add(AOSpecial.ancientRuins);
		
		terran.possiblePrimaryStar.add(classM);
		terran.possiblePrimaryStar.add(classK);
		terran.possiblePrimaryStar.add(classG);
		terran.possiblePrimaryStar.add(classF);

		steppe.name 			= language.steppe;
		steppe.isPlanet 		= true;
		steppe.iconID			= 17;
		steppe.iconSizeVariants 	= 5;
		steppe.probability 		= 0.25F;
		steppe.minSizer 		= 0.3F;
		steppe.minTemp			= 285;
		steppe.maxTemp			= 315;
		steppe.minOceans 		= 0.25F;
		steppe.maxOceans 		= 0.5F;
		steppe.minDiameter 		= 1000;
		steppe.maxDiameter 		= 26000;
		steppe.minDensity 		= 4;
		steppe.maxDensity 		= 8;
		steppe.minResources 	= 0.75F;
		steppe.maxResources		= 5;
		steppe.minPressure 		= 0.25F;
		steppe.maxPressure		= 5;
		steppe.tempOffset		= 0.85F;
		steppe.ecosystem		= 1;
		steppe.possibleAtmospheres.add(AtmoType.N2_O2);
		steppe.possibleAtmospheres.add(AtmoType.N2_O2_CO2);
			
		steppe.possibleSpecials.add(AOSpecial.tidalLocked);
		steppe.possibleSpecials.add(AOSpecial.tidalHeating);
		steppe.possibleSpecials.add(AOSpecial.endlessNights);
		steppe.possibleSpecials.add(AOSpecial.longNights);
		steppe.possibleSpecials.add(AOSpecial.eccentricOrbit);
		steppe.possibleSpecials.add(AOSpecial.asteroidField);
		steppe.possibleSpecials.add(AOSpecial.isotopeDeposits);
		steppe.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		steppe.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		steppe.possibleSpecials.add(AOSpecial.hydrocarbonDeposits);
		steppe.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		steppe.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		steppe.possibleSpecials.add(AOSpecial.oversalted);
		steppe.possibleSpecials.add(AOSpecial.cavernous);
		steppe.possibleSpecials.add(AOSpecial.volcanism);
		steppe.possibleSpecials.add(AOSpecial.ruggedTerrain);
		steppe.possibleSpecials.add(AOSpecial.plains);
		steppe.possibleSpecials.add(AOSpecial.stormyClimate);
		steppe.possibleSpecials.add(AOSpecial.rainyClimate);
		steppe.possibleSpecials.add(AOSpecial.favorableClimate);
		steppe.possibleSpecials.add(AOSpecial.erraticClimate);
		steppe.possibleSpecials.add(AOSpecial.fertileSoil);
		steppe.possibleSpecials.add(AOSpecial.biodiversity);
		steppe.possibleSpecials.add(AOSpecial.alienPredator);
		steppe.possibleSpecials.add(AOSpecial.gardenPest);
		steppe.possibleSpecials.add(AOSpecial.subterraneanAnimals);
		steppe.possibleSpecials.add(AOSpecial.robustEcosystem);
		steppe.possibleSpecials.add(AOSpecial.woodlands);
		steppe.possibleSpecials.add(AOSpecial.medicinalPlants);
		steppe.possibleSpecials.add(AOSpecial.hallucinogens);
		steppe.possibleSpecials.add(AOSpecial.pathogens);
		steppe.possibleSpecials.add(AOSpecial.alienTech);
		steppe.possibleSpecials.add(AOSpecial.alienLibrary);
		steppe.possibleSpecials.add(AOSpecial.ancientRuins);
		
		steppe.possiblePrimaryStar.add(classM);
		steppe.possiblePrimaryStar.add(classK);
		steppe.possiblePrimaryStar.add(classG);
		steppe.possiblePrimaryStar.add(classF);
		
		desert.name 			= language.desert;
		desert.isPlanet 		= true;
		desert.iconID			= 18;
		desert.iconSizeVariants = 5;
		desert.probability 		= 0.25F;
		desert.minSizer 		= 0.3F;
		desert.minTemp			= 300;
		desert.maxTemp			= 330;
		desert.minOceans 		= 0.05F;
		desert.maxOceans 		= 0.25F;
		desert.minDiameter 		= 1000;
		desert.maxDiameter 		= 26000;
		desert.minDensity 		= 4;
		desert.maxDensity 		= 8;
		desert.minResources 	= 0.75F;
		desert.maxResources		= 5;
		desert.minPressure 		= 0.25F;
		desert.maxPressure		= 5;
		desert.tempOffset		= 0.8F;
		desert.ecosystem		= 1;
		desert.possibleAtmospheres.add(AtmoType.N2_O2);
		desert.possibleAtmospheres.add(AtmoType.N2_O2_CO2);
	
		

		desert.possibleSpecials.add(AOSpecial.tidalLocked);
		desert.possibleSpecials.add(AOSpecial.tidalHeating);
		desert.possibleSpecials.add(AOSpecial.endlessNights);
		desert.possibleSpecials.add(AOSpecial.longNights);
		desert.possibleSpecials.add(AOSpecial.eccentricOrbit);
		desert.possibleSpecials.add(AOSpecial.asteroidField);
		desert.possibleSpecials.add(AOSpecial.isotopeDeposits);
		desert.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		desert.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		desert.possibleSpecials.add(AOSpecial.hydrocarbonDeposits);
		desert.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		desert.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		desert.possibleSpecials.add(AOSpecial.oversalted);
		desert.possibleSpecials.add(AOSpecial.cavernous);
		desert.possibleSpecials.add(AOSpecial.volcanism);
		desert.possibleSpecials.add(AOSpecial.ruggedTerrain);
		desert.possibleSpecials.add(AOSpecial.plains);
		desert.possibleSpecials.add(AOSpecial.poisonousSoil);
		desert.possibleSpecials.add(AOSpecial.stormyClimate);
		desert.possibleSpecials.add(AOSpecial.favorableClimate);
		desert.possibleSpecials.add(AOSpecial.erraticClimate);
		desert.possibleSpecials.add(AOSpecial.fertileSoil);
		desert.possibleSpecials.add(AOSpecial.biodiversity);
		desert.possibleSpecials.add(AOSpecial.alienPredator);
		desert.possibleSpecials.add(AOSpecial.gardenPest);
		desert.possibleSpecials.add(AOSpecial.subterraneanAnimals);
		desert.possibleSpecials.add(AOSpecial.robustEcosystem);
		desert.possibleSpecials.add(AOSpecial.medicinalPlants);
		desert.possibleSpecials.add(AOSpecial.hallucinogens);
		desert.possibleSpecials.add(AOSpecial.pathogens);
		desert.possibleSpecials.add(AOSpecial.alienTech);
		desert.possibleSpecials.add(AOSpecial.alienLibrary);
		desert.possibleSpecials.add(AOSpecial.ancientRuins);
		
		desert.possiblePrimaryStar.add(classM);
		desert.possiblePrimaryStar.add(classK);
		desert.possiblePrimaryStar.add(classG);
		desert.possiblePrimaryStar.add(classF);
		
		ammonia.name 			= language.ammonia;
		ammonia.isPlanet 		= true;
		ammonia.iconID			= 23;
		ammonia.iconSizeVariants 	= 5;
		ammonia.probability 	= 0.2F;
		ammonia.minSizer 		= 0.4F;
		ammonia.minTemp			= 175;
		ammonia.maxTemp			= 225;
		ammonia.minOceans 		= 0.1F;
		ammonia.maxOceans 		= 0.95F;
		ammonia.minDiameter 	= 1000;
		ammonia.maxDiameter 	= 26000;
		ammonia.minDensity 		= 5;
		ammonia.maxDensity 		= 8;
		ammonia.minResources 	= 2;
		ammonia.maxResources	= 8;
		ammonia.minPressure 	= 5;
		ammonia.maxPressure		= 90;
		ammonia.tempOffset		= 0.95F;
		ammonia.ecosystem		= 1;
		ammonia.possibleAtmospheres.add(AtmoType.N2_NH3);
		
		
		ammonia.possibleSpecials.add(AOSpecial.tidalLocked);
		ammonia.possibleSpecials.add(AOSpecial.tidalHeating);
		ammonia.possibleSpecials.add(AOSpecial.longNights);
		ammonia.possibleSpecials.add(AOSpecial.eccentricOrbit);
		ammonia.possibleSpecials.add(AOSpecial.asteroidField);
		ammonia.possibleSpecials.add(AOSpecial.isotopeDeposits);
		ammonia.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		ammonia.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		ammonia.possibleSpecials.add(AOSpecial.hydrocarbonDeposits);
		ammonia.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		ammonia.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		ammonia.possibleSpecials.add(AOSpecial.oversalted);
		ammonia.possibleSpecials.add(AOSpecial.cavernous);
		ammonia.possibleSpecials.add(AOSpecial.volcanism);
		ammonia.possibleSpecials.add(AOSpecial.ruggedTerrain);
		ammonia.possibleSpecials.add(AOSpecial.plains);
		ammonia.possibleSpecials.add(AOSpecial.swamps);
		ammonia.possibleSpecials.add(AOSpecial.strongOceanCurrents);
		ammonia.possibleSpecials.add(AOSpecial.favorableClimate);
		ammonia.possibleSpecials.add(AOSpecial.fertileSoil);
		ammonia.possibleSpecials.add(AOSpecial.biodiversity);
		ammonia.possibleSpecials.add(AOSpecial.alienPredator);
		ammonia.possibleSpecials.add(AOSpecial.gardenPest);
		ammonia.possibleSpecials.add(AOSpecial.subterraneanAnimals);
		ammonia.possibleSpecials.add(AOSpecial.robustEcosystem);
		ammonia.possibleSpecials.add(AOSpecial.medicinalPlants);
		ammonia.possibleSpecials.add(AOSpecial.hallucinogens);
		ammonia.possibleSpecials.add(AOSpecial.pathogens);
		ammonia.possibleSpecials.add(AOSpecial.alienTech);
		ammonia.possibleSpecials.add(AOSpecial.alienLibrary);
		ammonia.possibleSpecials.add(AOSpecial.ancientRuins);
		
		ammonia.possiblePrimaryStar.add(classM);
		ammonia.possiblePrimaryStar.add(classK);
		ammonia.possiblePrimaryStar.add(classG);
		ammonia.possiblePrimaryStar.add(classF);

		
		rock.name 				= language.rock;
		rock.isPlanet 			= true;
		rock.iconID				= 19;
		rock.iconSizeVariants 	= 5;
		rock.probability 		= 0.2F;
		rock.minSizer 			= 0;
		rock.minTemp			= 0;
		rock.maxTemp			= 800;
		rock.minOceans 			= 0;
		rock.maxOceans 			= 0.5F;
		rock.minDiameter 		= 1000;
		rock.maxDiameter 		= 26000;
		rock.minDensity 		= 3;
		rock.maxDensity 		= 8;
		rock.minResources 		= 0.75F;
		rock.maxResources		= 8;
		rock.minPressure 		= 0.01F;
		rock.maxPressure		= 10;
		rock.tempOffset			= 0.9F;
		rock.possibleAtmospheres.add(AtmoType.CO2);
		rock.possibleAtmospheres.add(AtmoType.N2_CO2);
		rock.possibleAtmospheres.add(AtmoType.N2);
		
		rock.possibleSpecials.add(AOSpecial.magneticField);
		rock.possibleSpecials.add(AOSpecial.tidalLocked);
		rock.possibleSpecials.add(AOSpecial.tidalHeating);
		rock.possibleSpecials.add(AOSpecial.axialTilt);
		rock.possibleSpecials.add(AOSpecial.endlessNights);
		rock.possibleSpecials.add(AOSpecial.longNights);
		rock.possibleSpecials.add(AOSpecial.eccentricOrbit);
		rock.possibleSpecials.add(AOSpecial.shiftingOrbit);
		rock.possibleSpecials.add(AOSpecial.asteroidField);
		rock.possibleSpecials.add(AOSpecial.meteoriteShowers);
		rock.possibleSpecials.add(AOSpecial.intenseInsolation);
		rock.possibleSpecials.add(AOSpecial.isotopeDeposits);
		rock.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		rock.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		rock.possibleSpecials.add(AOSpecial.hydrocarbonDeposits);
		rock.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		rock.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		rock.possibleSpecials.add(AOSpecial.cavernous);
		rock.possibleSpecials.add(AOSpecial.volcanism);
		rock.possibleSpecials.add(AOSpecial.ruggedTerrain);
		rock.possibleSpecials.add(AOSpecial.plains);
		rock.possibleSpecials.add(AOSpecial.oversalted);
		rock.possibleSpecials.add(AOSpecial.poisonousSoil);
		rock.possibleSpecials.add(AOSpecial.fertileSoil);
		rock.possibleSpecials.add(AOSpecial.stormyClimate);
		rock.possibleSpecials.add(AOSpecial.rainyClimate);
		rock.possibleSpecials.add(AOSpecial.favorableClimate);
		rock.possibleSpecials.add(AOSpecial.erraticClimate);
		rock.possibleSpecials.add(AOSpecial.subsurfaceEcosystem);
		rock.possibleSpecials.add(AOSpecial.alienTech);
		rock.possibleSpecials.add(AOSpecial.alienLibrary);

		rock.possiblePrimaryStar.add(classM);
		rock.possiblePrimaryStar.add(classK);
		rock.possiblePrimaryStar.add(classG);
		rock.possiblePrimaryStar.add(classF);
		rock.possiblePrimaryStar.add(classA);
		rock.possiblePrimaryStar.add(classB);
		rock.possiblePrimaryStar.add(classO);
		rock.possiblePrimaryStar.add(redGiant);
		rock.possiblePrimaryStar.add(whiteDwarf);
		rock.possiblePrimaryStar.add(neutronStar);
		rock.possiblePrimaryStar.add(blackHole);
		
		toxic.name 				= language.toxic;
		toxic.isPlanet 			= true;
		toxic.iconID			= 20;
		toxic.iconSizeVariants 	= 5;
		toxic.probability 		= 0.15F;
		toxic.minSizer 			= 0;
		toxic.minTemp			= 200;
		toxic.maxTemp			= 300;
		toxic.minOceans 		= 0F;
		toxic.maxOceans 		= 1;
		toxic.minDiameter 		= 1000;
		toxic.maxDiameter 		= 26000;
		toxic.minDensity 		= 3;
		toxic.maxDensity		= 8;
		toxic.minResources 		= 0.75F;
		toxic.maxResources		= 8;
		toxic.minPressure 		= 0.01F;
		toxic.maxPressure		= 100;
		toxic.tempOffset		= 0.8F;
		toxic.possibleAtmospheres.add(AtmoType.CO2_SO2);
		
		toxic.possibleSpecials.add(AOSpecial.magneticField);
		toxic.possibleSpecials.add(AOSpecial.tidalLocked);
		toxic.possibleSpecials.add(AOSpecial.tidalHeating);
		toxic.possibleSpecials.add(AOSpecial.axialTilt);
		toxic.possibleSpecials.add(AOSpecial.endlessNights);
		toxic.possibleSpecials.add(AOSpecial.longNights);
		toxic.possibleSpecials.add(AOSpecial.eccentricOrbit);
		toxic.possibleSpecials.add(AOSpecial.shiftingOrbit);
		toxic.possibleSpecials.add(AOSpecial.asteroidField);
		toxic.possibleSpecials.add(AOSpecial.meteoriteShowers);
		toxic.possibleSpecials.add(AOSpecial.intenseInsolation);
		toxic.possibleSpecials.add(AOSpecial.isotopeDeposits);
		toxic.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		toxic.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		toxic.possibleSpecials.add(AOSpecial.hydrocarbonDeposits);
		toxic.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		toxic.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		toxic.possibleSpecials.add(AOSpecial.cavernous);
		toxic.possibleSpecials.add(AOSpecial.volcanism);
		toxic.possibleSpecials.add(AOSpecial.ruggedTerrain);
		toxic.possibleSpecials.add(AOSpecial.plains);
		toxic.possibleSpecials.add(AOSpecial.oversalted);
		toxic.possibleSpecials.add(AOSpecial.poisonousSoil);
		toxic.possibleSpecials.add(AOSpecial.stormyClimate);
		toxic.possibleSpecials.add(AOSpecial.erraticClimate);
		
		toxic.possiblePrimaryStar.add(classM);
		toxic.possiblePrimaryStar.add(classK);
		toxic.possiblePrimaryStar.add(classG);
		toxic.possiblePrimaryStar.add(classF);
		toxic.possiblePrimaryStar.add(classA);
		toxic.possiblePrimaryStar.add(classB);
		toxic.possiblePrimaryStar.add(classO);
		toxic.possiblePrimaryStar.add(redGiant);
		toxic.possiblePrimaryStar.add(whiteDwarf);
		toxic.possiblePrimaryStar.add(neutronStar);
		toxic.possiblePrimaryStar.add(blackHole);
		
		lava.name 				= language.lava;
		lava.isPlanet 			= true;
		lava.iconID				= 21;
		lava.iconSizeVariants 	= 5;
		lava.probability 		= 0.35F;
		lava.minSizer 			= 0;
		lava.minTemp			= 800;
		lava.maxTemp			= 5000;
		lava.minOceans 			= 0;
		lava.maxOceans 			= 0;
		lava.minDiameter 		= 1000;
		lava.maxDiameter 		= 26000;
		lava.minDensity 		= 4F;
		lava.maxDensity 		= 8;
		lava.minResources 		= 1;
		lava.maxResources		= 9;
		lava.minPressure 		= 0.01F;
		lava.maxPressure		= 30;
		lava.tempOffset			= 0.95F;
		lava.possibleAtmospheres.add(AtmoType.CO2_SO2);
		lava.possibleAtmospheres.add(AtmoType.CO2);
		lava.possibleAtmospheres.add(AtmoType.N2_CO2);
		
		lava.possibleSpecials.add(AOSpecial.magneticField);
		lava.possibleSpecials.add(AOSpecial.tidalLocked);
		lava.possibleSpecials.add(AOSpecial.tidalHeating);
		lava.possibleSpecials.add(AOSpecial.axialTilt);
		lava.possibleSpecials.add(AOSpecial.endlessNights);
		lava.possibleSpecials.add(AOSpecial.longNights);
		lava.possibleSpecials.add(AOSpecial.eccentricOrbit);
		lava.possibleSpecials.add(AOSpecial.shiftingOrbit);
		lava.possibleSpecials.add(AOSpecial.asteroidField);
		lava.possibleSpecials.add(AOSpecial.meteoriteShowers);
		lava.possibleSpecials.add(AOSpecial.intenseInsolation);
		lava.possibleSpecials.add(AOSpecial.isotopeDeposits);
		lava.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		lava.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		lava.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		lava.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		lava.possibleSpecials.add(AOSpecial.oversalted);
		lava.possibleSpecials.add(AOSpecial.poisonousSoil);
		lava.possibleSpecials.add(AOSpecial.volcanism);
		lava.possibleSpecials.add(AOSpecial.ruggedTerrain);
		lava.possibleSpecials.add(AOSpecial.stormyClimate);
		lava.possibleSpecials.add(AOSpecial.erraticClimate);
		
		lava.possiblePrimaryStar.add(classM);
		lava.possiblePrimaryStar.add(classK);
		lava.possiblePrimaryStar.add(classG);
		lava.possiblePrimaryStar.add(classF);
		lava.possiblePrimaryStar.add(classA);
		lava.possiblePrimaryStar.add(classB);
		lava.possiblePrimaryStar.add(classO);
		lava.possiblePrimaryStar.add(redGiant);
		lava.possiblePrimaryStar.add(whiteDwarf);
		lava.possiblePrimaryStar.add(neutronStar);
		lava.possiblePrimaryStar.add(blackHole);
	
		
		asteroid.name 			= language.asteroid;
		asteroid.isPlanet 		= true;
		asteroid.iconID			= 22;
		asteroid.iconSizeVariants 	= 5;
		asteroid.probability 	= 0.2F;
		asteroid.minSizer 		= 0;
		asteroid.minTemp		= 0;
		asteroid.maxTemp		= 801;
		asteroid.minOceans 		= 0;
		asteroid.maxOceans 		= 1;
		asteroid.minDiameter 	= 100;
		asteroid.maxDiameter 	= 2500;
		asteroid.minDensity 	= 1.5F;
		asteroid.maxDensity 	= 8;
		asteroid.minResources 	= 0.75F;
		asteroid.maxResources	= 3;
		asteroid.minPressure 	= 0;
		asteroid.maxPressure	= 0;
		asteroid.tempOffset		= 0.8F;
		asteroid.canBeMoon 		= false;
		asteroid.asteroidBelt	= true;		
//		asteroid.possibleSpecials.add(AOSpecial.tidalLocked);
//		asteroid.possibleSpecials.add(AOSpecial.axialTilt);
//		asteroid.possibleSpecials.add(AOSpecial.endlessNights);
//		asteroid.possibleSpecials.add(AOSpecial.longNights);
//		asteroid.possibleSpecials.add(AOSpecial.eccentricOrbit);
		asteroid.possibleSpecials.add(AOSpecial.shiftingOrbit);
		asteroid.possibleSpecials.add(AOSpecial.asteroidField);
		asteroid.possibleSpecials.add(AOSpecial.meteoriteShowers);
		asteroid.possibleSpecials.add(AOSpecial.intenseInsolation);
		asteroid.possibleSpecials.add(AOSpecial.isotopeDeposits);
		asteroid.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
		asteroid.possibleSpecials.add(AOSpecial.rareElementsDeposits);
		asteroid.possibleSpecials.add(AOSpecial.lightMetalDeposits);
		asteroid.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
		asteroid.possibleSpecials.add(AOSpecial.cavernous);
		asteroid.possibleSpecials.add(AOSpecial.alienTech);
		asteroid.possibleSpecials.add(AOSpecial.alienLibrary);
		
		asteroid.possiblePrimaryStar.add(classM);
		asteroid.possiblePrimaryStar.add(classK);
		asteroid.possiblePrimaryStar.add(classG);
		asteroid.possiblePrimaryStar.add(classF);
		asteroid.possiblePrimaryStar.add(classA);
		asteroid.possiblePrimaryStar.add(classB);
		asteroid.possiblePrimaryStar.add(classO);
		asteroid.possiblePrimaryStar.add(redGiant);
		asteroid.possiblePrimaryStar.add(whiteDwarf);
		asteroid.possiblePrimaryStar.add(neutronStar);
		asteroid.possiblePrimaryStar.add(blackHole);
		
		
		
		gasGiant.name				= language.gasGiant;
		gasGiant.iconID 			= 13;
		gasGiant.iconSizeVariants 	= 5;
		gasGiant.probability 		= 2F; 
		gasGiant.minTemp 			= 3;
		gasGiant.maxTemp 			= 3;
		gasGiant.minDiameter 		= 30000;
		gasGiant.maxDiameter 		= 145000;
		gasGiant.minMass 			= 0.00004F;
		gasGiant.maxMass			= 0.001F;
		gasGiant.canBeMoon 			= false;
		gasGiant.possibleAtmospheres.add(AtmoType.H2);
		gasGiant.possibleAtmospheres.add(AtmoType.H2_He);
		
		gasGiant.possibleSpecials.add(AOSpecial.asteroidField);
		
		gasGiant.possiblePrimaryStar.add(classM);
		gasGiant.possiblePrimaryStar.add(classK);
		gasGiant.possiblePrimaryStar.add(classG);
		gasGiant.possiblePrimaryStar.add(classF);
		gasGiant.possiblePrimaryStar.add(classA);
		gasGiant.possiblePrimaryStar.add(classB);
		gasGiant.possiblePrimaryStar.add(classO);
		gasGiant.possiblePrimaryStar.add(redGiant);
		gasGiant.possiblePrimaryStar.add(whiteDwarf);
		gasGiant.possiblePrimaryStar.add(neutronStar);
		gasGiant.possiblePrimaryStar.add(blackHole);
		
		
		
		
		brownDwarf.name				= language.brownDwarf;
		brownDwarf.iconID 			= 12;
		brownDwarf.iconSizeVariants = 1;
		brownDwarf.probability 		= 0.30F; 
		brownDwarf.minTemp 			= 800;
		brownDwarf.maxTemp 			= 2000;
		brownDwarf.minDiameter 		= 145000;
		brownDwarf.maxDiameter 		= 200000;
		brownDwarf.minMass 			= 0.0125F;
		brownDwarf.maxMass			= 0.08F;
		brownDwarf.isStar			= true;
		brownDwarf.canBeMoon 		= false;
		brownDwarf.sizedImages 		= false;
		brownDwarf.possibleAtmospheres.add(AtmoType.plasma);
		brownDwarf.possiblePrimaryStar.add(classM);
		brownDwarf.possiblePrimaryStar.add(classK);
		brownDwarf.possiblePrimaryStar.add(classG);
		brownDwarf.possiblePrimaryStar.add(classF);
		brownDwarf.possiblePrimaryStar.add(classA);
		brownDwarf.possiblePrimaryStar.add(classB);
		brownDwarf.possiblePrimaryStar.add(classO);
		brownDwarf.possiblePrimaryStar.add(redGiant);
		brownDwarf.possiblePrimaryStar.add(whiteDwarf);
		brownDwarf.possiblePrimaryStar.add(neutronStar);
		brownDwarf.possiblePrimaryStar.add(blackHole);
		
		
		classM.name				= language.classM;
		classM.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/classM.png"));
		classM.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/classM.png"));
		classM.abbr				= "MD-";
		classM.iconID 			= 11;
		classM.iconSizeVariants = 1;
		classM.probability 		= 0.30F; 
		classM.minTemp 			= 2000;
		classM.maxTemp 			= 4250;
		classM.minDiameter 		= 200000;
		classM.maxDiameter 		= 973700;
		classM.minMass 			= 0.08F;
		classM.maxMass			= 0.45F;
		classM.isStar			= true;
		classM.canBeMoon 		= false;
		classM.sizedImages 		= false;
		classM.systemName		= language.namesClassM;
		classM.possibleAtmospheres.add(AtmoType.plasma);
		classM.possiblePrimaryStar.add(classK);
		classM.possiblePrimaryStar.add(classG);
		classM.possiblePrimaryStar.add(classF);
		classM.possiblePrimaryStar.add(classA);
		classM.possiblePrimaryStar.add(classB);
		classM.possiblePrimaryStar.add(classO);
		classM.possiblePrimaryStar.add(redGiant);
		classM.possiblePrimaryStar.add(neutronStar);
		classM.possiblePrimaryStar.add(blackHole);
			
		
		classK.name				= language.classK;
		classK.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/classK.png"));
		classK.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/classK.png"));
		classK.abbr				= "KD-";
		classK.iconID 			= 10;
		classK.iconSizeVariants = 1;
		classK.probability 		= 0.20F; 
		classK.minTemp 			= 4250;
		classK.maxTemp 			= 5300;
		classK.minDiameter 		= 973700;
		classK.maxDiameter 		= 1335360;
		classK.minMass 			= 0.45F;
		classK.maxMass			= 0.8F;
		classK.isStar			= true;
		classK.canBeMoon 		= false;
		classK.sizedImages 		= false;
		classK.systemName		= language.namesClassK;
		classK.possibleAtmospheres.add(AtmoType.plasma);
		classK.possiblePrimaryStar.add(classG);
		classK.possiblePrimaryStar.add(classF);
		classK.possiblePrimaryStar.add(classA);
		classK.possiblePrimaryStar.add(classB);
		classK.possiblePrimaryStar.add(classO);
		classK.possiblePrimaryStar.add(neutronStar);
		classK.possiblePrimaryStar.add(blackHole);
		
		
		classG.name				= language.classG;
		classG.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/classG.png"));
		classG.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/classG.png"));
		classG.abbr				= "GD-";
		classG.iconID 			= 9;
		classG.iconSizeVariants = 1;
		classG.probability 		= 0.15F; 
		classG.minTemp 			= 5300;
		classG.maxTemp 			= 5900;
		classG.minDiameter 		= 1335360;
		classG.maxDiameter 		= 1530000;
		classG.minMass 			= 0.8F;
		classG.maxMass			= 1.04F;
		classG.isStar			= true;
		classG.canBeMoon 		= false;
		classG.sizedImages 		= false;
		classG.systemName		= language.namesClassG;
		classG.possibleAtmospheres.add(AtmoType.plasma);
		classG.possiblePrimaryStar.add(classF);
		classG.possiblePrimaryStar.add(classA);
		classG.possiblePrimaryStar.add(classB);
		classG.possiblePrimaryStar.add(classO);
		classG.possiblePrimaryStar.add(neutronStar);
		classG.possiblePrimaryStar.add(blackHole);
		
		
		classF.name				= language.classF;
		classF.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/classF.png"));
		classF.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/classF.png"));
		classF.abbr				= "FS-";
		classF.iconID 			= 8;
		classF.iconSizeVariants = 1;
		classF.probability 		= 0.10F; 
		classF.minTemp 			= 5900;
		classF.maxTemp 			= 7500;
		classF.minDiameter 		= 1530000;
		classF.maxDiameter 		= 1947400;
		classF.minMass 			= 1.04F;
		classF.maxMass			= 1.4F;
		classF.isStar			= true;
		classF.canBeMoon 		= false;
		classF.sizedImages 		= false;
		classF.systemName		= language.namesClassF;
		classF.possibleAtmospheres.add(AtmoType.plasma);
		classF.possiblePrimaryStar.add(classA);
		classF.possiblePrimaryStar.add(classB);
		classF.possiblePrimaryStar.add(classO);
		classF.possiblePrimaryStar.add(neutronStar);
		classF.possiblePrimaryStar.add(blackHole);
		
		
		classA.name				= language.classA;
		classA.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/classA.png"));
		classA.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/classA.png"));
		classA.abbr				= "AS-";
		classA.iconID 			= 7;
		classA.iconSizeVariants = 1;
		classA.probability 		= 0.05F; 
		classA.minTemp 			= 7500;
		classA.maxTemp 			= 10000;
		classA.minDiameter 		= 1947400;
		classA.maxDiameter 		= 2503800;
		classA.minMass 			= 1.4F;
		classA.maxMass			= 2.1F;
		classA.isStar			= true;
		classA.canBeMoon 		= false;
		classA.sizedImages 		= false;
		classA.systemName		= language.namesClassA;
		classA.possibleAtmospheres.add(AtmoType.plasma);		
		
		
		classB.name				= language.classB;
		classB.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/classB.png"));
		classB.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/classB.png"));
		classB.abbr				= "BSG-";
		classB.iconID 			= 6;
		classB.iconSizeVariants = 1;
		classB.probability 		= 0.03F; 
		classB.minTemp 			= 10000;
		classB.maxTemp 			= 33000;
		classB.minDiameter 		= 2503800;
		classB.maxDiameter 		= 9180600;
		classB.minMass 			= 2.1F;
		classB.maxMass			= 16;
		classB.isStar			= true;
		classB.canBeMoon 		= false;
		classB.sizedImages 		= false;
		classB.systemName		= language.namesClassB;
		classB.possibleAtmospheres.add(AtmoType.plasma);	
		
		
		classO.name				= language.classO;
		classO.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/classO.png"));
		classO.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/classO.png"));
		classO.abbr				= "OG-";
		classO.iconID 			= 5;
		classO.iconSizeVariants = 1;
		classO.probability 		= 0.02F; 
		classO.minTemp 			= 33000;
		classO.maxTemp 			= 40000;
		classO.minDiameter 		= 9180600;
		classO.maxDiameter 		= 25038000;
		classO.minMass 			= 16;
		classO.maxMass			= 60;
		classO.isStar			= true;
		classO.canBeMoon 		= false;
		classO.sizedImages 		= false;
		classO.systemName		= language.namesClassO;
		classO.possibleAtmospheres.add(AtmoType.plasma);		
		
		
		redGiant.name			= language.redGiant;
		redGiant.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/redGiant.png"));
		redGiant.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/redGiant.png"));
		redGiant.abbr			= "GR-";
		redGiant.iconID 		= 3;
		redGiant.iconSizeVariants = 1;
		redGiant.probability 	= 0.05F; 
		redGiant.minTemp 		= 2500;
		redGiant.maxTemp 		= 5000;
		redGiant.minDiameter 	= 6955000;
		redGiant.maxDiameter 	= 600000000;
		redGiant.minMass 		= 0.45F;
		redGiant.maxMass		= 8F;
		redGiant.isStar			= true;
		redGiant.canBeMoon 		= false;
		redGiant.sizedImages 	= false;
		redGiant.systemName		= language.namesRedGiant;
		redGiant.possibleAtmospheres.add(AtmoType.plasma);	
		
		
		whiteDwarf.name			= language.whiteDwarf;
		whiteDwarf.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/whiteDwarf.png"));
		whiteDwarf.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/whiteDwarf.png"));
		whiteDwarf.abbr			= "WD ";
		whiteDwarf.iconID 		= 4;
		whiteDwarf.iconSizeVariants = 1;
		whiteDwarf.probability 	= 0.05F; 
		whiteDwarf.minTemp 		= 5000;
		whiteDwarf.maxTemp 		= 10000;
		whiteDwarf.minDiameter 	= 11000;
		whiteDwarf.maxDiameter 	= 40000;
		whiteDwarf.minMass 		= 0.35F;
		whiteDwarf.maxMass		= 1.35F;
		whiteDwarf.isStar		= true;
		whiteDwarf.canBeMoon 	= false;
		whiteDwarf.sizedImages 	= false;
		whiteDwarf.systemName	= language.namesWhiteDwarf;
		whiteDwarf.possibleAtmospheres.add(AtmoType.plasma);
	
		
		neutronStar.name		= language.neutronStar;
		neutronStar.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/neutronStar.png"));
		neutronStar.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/neutronStar.png"));
		neutronStar.abbr		= "RX-";
		neutronStar.iconID 		= 2;
		neutronStar.iconSizeVariants = 1;
		neutronStar.probability = 0.02F; 
		neutronStar.minTemp 	= 500000;
		neutronStar.maxTemp 	= 1000000;
		neutronStar.minDiameter = 9;
		neutronStar.maxDiameter = 19;
		neutronStar.minMass 	= 1.4F;
		neutronStar.maxMass		= 3.2F;
		neutronStar.canBeMoon 	= false;
		neutronStar.sizedImages = false;
		neutronStar.systemName	= language.namesNeutronStar;
		neutronStar.isStar		= true;
		
		neutronStar.possibleSpecials.add(AOSpecial.pulsar);
	
		
		blackHole.name			= language.blackHole;
		blackHole.galaxyStarIcon= new ImageIcon(GraphicFU.class.getResource("GalaxyStarIcons/blackHole.png"));
		blackHole.primaryStarIcon= new ImageIcon(GraphicFU.class.getResource("PrimaryStarIcons/blackHole.png"));
		blackHole.abbr			= "X-";
		blackHole.iconID 		= 1;
		blackHole.iconSizeVariants = 1;
		blackHole.probability 	= 0.01F; 
		blackHole.minTemp 		= 0;
		blackHole.maxTemp 		= 0;
		blackHole.minDiameter 	= 9;
		blackHole.maxDiameter 	= 295000;
		blackHole.minMass 		= 2.5F;
		blackHole.maxMass		= 1000F;
		blackHole.systemName	= language.namesBlackHole;
		blackHole.isStar		= true;
		blackHole.canBeMoon 	= false;
		blackHole.sizedImages = false;
		}
}
	
	
// ice.possibleSpecials.add(AOSpecial.homeworld);
// ice.possibleSpecials.add(AOSpecial.alienTech);
// ice.possibleSpecials.add(AOSpecial.alienLibrary);
// ice.possibleSpecials.add(AOSpecial.ancientRuins);
// ice.possibleSpecials.add(AOSpecial.tidalLocked);
// ice.possibleSpecials.add(AOSpecial.axialTilt);
// ice.possibleSpecials.add(AOSpecial.longNights);
// ice.possibleSpecials.add(AOSpecial.eccentricOrbit);
// ice.possibleSpecials.add(AOSpecial.shiftingOrbit);
// ice.possibleSpecials.add(AOSpecial.asteroidField);
// ice.possibleSpecials.add(AOSpecial.meteroriteShowers);
// ice.possibleSpecials.add(AOSpecial.intenseInsolation);
// ice.possibleSpecials.add(AOSpecial.isotopeDeposits);
// ice.possibleSpecials.add(AOSpecial.preciousMetalDeposits);
// ice.possibleSpecials.add(AOSpecial.rareElementsDeposits);
// ice.possibleSpecials.add(AOSpecial.hydrocarbonDeposits);
// ice.possibleSpecials.add(AOSpecial.lightMetalDeposits);
// ice.possibleSpecials.add(AOSpecial.heavyMetalDeposits);
// ice.possibleSpecials.add(AOSpecial.cavernous);
// ice.possibleSpecials.add(AOSpecial.volcanism);
// ice.possibleSpecials.add(AOSpecial.ruggedTerrain);
// ice.possibleSpecials.add(AOSpecial.plains);
// ice.possibleSpecials.add(AOSpecial.bottomless);
// ice.possibleSpecials.add(AOSpecial.strongOceanCurrents);
// ice.possibleSpecials.add(AOSpecial.oversalted);
// ice.possibleSpecials.add(AOSpecial.poisonousSoil);
// ice.possibleSpecials.add(AOSpecial.stormyClimate);
// ice.possibleSpecials.add(AOSpecial.rainyClimate);
// ice.possibleSpecials.add(AOSpecial.favorableClimate);
// ice.possibleSpecials.add(AOSpecial.erraticClimate);
// ice.possibleSpecials.add(AOSpecial.fertileSoil);
// ice.possibleSpecials.add(AOSpecial.biodiversity);
// ice.possibleSpecials.add(AOSpecial.gardenPest);
// ice.possibleSpecials.add(AOSpecial.subterraneanAnimals);
// ice.possibleSpecials.add(AOSpecial.robustEcosystem);
// ice.possibleSpecials.add(AOSpecial.woodlands);
// ice.possibleSpecials.add(AOSpecial.swamps);
// ice.possibleSpecials.add(AOSpecial.kelp);
// ice.possibleSpecials.add(AOSpecial.medicinalPlants);
// ice.possibleSpecials.add(AOSpecial.hallucinogens);
// ice.possibleSpecials.add(AOSpecial.pathogens);	
	
	
	
	
	
	
	
	
	
	
