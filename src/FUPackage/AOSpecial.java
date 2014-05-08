package FUPackage;

import java.util.HashSet;
import java.util.Set;

public class AOSpecial extends EconomicEffects implements IGeneralData{
	String name;
	
	double minTidalForce = 0; //  done
	double minPressure = 0; //  done
	double maxPressure = 1000; // done
	double resourceModifier = 0; // Modifies resource content done
	double densityModifier = 0; // Modifies mass and Gravitation done
	long minDayLenght =	1;
	
	boolean planetOnly = false; // done
	boolean inheritedByOrbiter = false; // done
	
	boolean innerMoonGasGiant = false; // XXX
	
	boolean ecologic = false; //Will be destroyed when ecosphere goes below 0% done
	  
	boolean multipleStar = false; // Will appear in multiple star systems done
	
	double probability = 0.1;
		
	
	Set<AOSpecial> excludes = new HashSet<AOSpecial>();
	Set<AOSpecial> favours = new HashSet<AOSpecial>();
	Set<AOSpecial> surpressedByBuilding = new HashSet<AOSpecial>();
	
//	EconomicEffects aoSpecialEffects = new EconomicEffects();
		
	// END CONDITIONS - START EFFECTS XXX
	// double sconstructionCosts = 0;
	// double spotentialFarmers = 0;
	// double sResearchEfficiency = 0;
	// double sArtifactsProduction = 0; 
	// double sBioMedicineProduction = 0;
	// double sProductivityGoods = 0;
	// double sExportCapacity = 0;
	
	// double sResourcesProduction = 0;
	// double sResourcesDepletion = 0;
	// double sHydrocarbonsProduction = 0;
	// double sRareElementsProduction = 0;
	// double sPreciousMetalsProduction = 0;
	// double sIsotopesProduction = 0; 
	// double sMortalityRate = 0;
			
	// double sGroundDefense = 0;
	// double sBombardmentResistance = 0;
	
	// double secoDamageRecovery = 0;
	// double sterraformingSpeed = 0;

// STATIC aoSPECIALS XXX	
	
		
	static AOSpecial homeworld = new AOSpecial(language.homeworld);
	static AOSpecial alienTech = new AOSpecial(language.alienTech);
	static AOSpecial alienLibrary = new AOSpecial(language.alienLibrary);
	static AOSpecial ancientRuins = new AOSpecial(language.ancientRuins);
	static AOSpecial tidalLocked = new AOSpecial(language.tidalLocked);
	static AOSpecial strongTide = new AOSpecial(language.strongTide);
	static AOSpecial axialTilt = new AOSpecial(language.axialTilt);
	static AOSpecial endlessNights =  new AOSpecial(language.endlessNights);
	static AOSpecial longNights = new AOSpecial(language.longNights);
	static AOSpecial eccentricOrbit = new AOSpecial(language.eccentricOrbit);
	static AOSpecial shiftingOrbit = new AOSpecial(language.shiftingOrbit);
	static AOSpecial asteroidField = new AOSpecial(language.asteroidField);
	static AOSpecial meteoriteShowers = new AOSpecial(language.meteoriteShowers);
	static AOSpecial magneticField = new AOSpecial(language.magneticField);
	static AOSpecial intenseInsolation = new AOSpecial(language.intenseInsolation);
	static AOSpecial isotopeDeposits = new AOSpecial(language.isotopeDeposits);
	static AOSpecial radioactive = new AOSpecial(language.isotopeDeposits);
	static AOSpecial preciousMetalDeposits = new AOSpecial(language.preciousMetalDeposits);
	static AOSpecial rareElementsDeposits = new AOSpecial(language.rareElementsDeposits);
	static AOSpecial hydrocarbonDeposits = new AOSpecial(language.hydrocarbonDeposits);
	static AOSpecial hydrocarbonLakes = new AOSpecial(language.hydrocarbonLakes);
	static AOSpecial lightMetalDeposits = new AOSpecial(language.lightMetalDeposits);
	static AOSpecial heavyMetalDeposits = new AOSpecial(language.heavyMetalDeposits);
	static AOSpecial cavernous = new AOSpecial(language.cavernous);
	static AOSpecial tidalHeating = new AOSpecial(language.tidalHeating);
	static AOSpecial volcanism = new AOSpecial(language.volcanism);
	static AOSpecial ruggedTerrain = new AOSpecial(language.ruggedTerrain);
	static AOSpecial plains = new AOSpecial(language.plains);
	static AOSpecial bottomless = new AOSpecial(language.bottomless);
	static AOSpecial strongOceanCurrents = new AOSpecial(language.strongOceanCurrents);
	static AOSpecial oversalted = new AOSpecial(language.oversalted);
	static AOSpecial poisonousSoil = new AOSpecial(language.poisonousSoil);
	static AOSpecial stormyClimate = new AOSpecial(language.stormyClimate);
	static AOSpecial rainyClimate = new AOSpecial(language.rainyClimate);
	static AOSpecial favorableClimate = new AOSpecial(language.favorableClimate);
	static AOSpecial erraticClimate = new AOSpecial(language.erraticClimate);
	static AOSpecial infertileSoil = new AOSpecial(language.infertileSoil);
	static AOSpecial fertileSoil = new AOSpecial(language.fertileSoil);
	static AOSpecial subsurfaceEcosystem = new AOSpecial(language.subsurfaceEcosystem);
	static AOSpecial biodiversity = new AOSpecial(language.biodiversity);
	static AOSpecial gardenPest = new AOSpecial(language.gardenPest);
	static AOSpecial subterraneanAnimals = new AOSpecial(language.subterraneanAnimals);
	static AOSpecial alienPredator = new AOSpecial(language.alienPredators);
	static AOSpecial robustEcosystem = new AOSpecial(language.robustEcosystem);
	static AOSpecial woodlands = new AOSpecial(language.woodlands);
	static AOSpecial swamps = new AOSpecial(language.swamps);
	static AOSpecial kelp = new AOSpecial(language.kelp);
	static AOSpecial medicinalPlants = new AOSpecial(language.medicinalPlants);
	static AOSpecial hallucinogens = new AOSpecial(language.hallucinogens);
	static AOSpecial pathogens = new AOSpecial(language.pathogens);
	static AOSpecial pulsar = new AOSpecial(language.pulsar);
	
	
	public String getName(){
		return this.name;
	}
	


	
	void setEcologic(boolean ecologic_){
		this.ecologic = ecologic_;	
	}

	public boolean getEcologic(){
		return this.ecologic;
	}

	
	
	public AOSpecial(String name_) {
		this.name = name_;
	}

public static final void initialize(){
	

	
		
	//Orbit
	
	pulsar.probability					= 0.5;
	pulsar.inheritedByOrbiter			= true;
	
	axialTilt.probability				= 0.1;
	axialTilt.potentialFarmers.modifier				= -0.35;
	axialTilt.potentialFarmers.modifier				= -0.35;
	axialTilt.terraformingSpeed.modifier      	= 1;
	axialTilt.planetOnly 				= true;
	axialTilt.inheritedByOrbiter 		= true;
	axialTilt.excludes.add(tidalLocked);
	
	tidalLocked.probability				= 1;
	tidalLocked.potentialFarmers.modifier		= -0.50;
	tidalLocked.terraformingSpeed.modifier		= 2;
	tidalLocked.minTidalForce			= 0.000003;
	tidalLocked.planetOnly 				= true; //  done
	tidalLocked.favours.add(intenseInsolation);
	tidalLocked.excludes.add(axialTilt);
	tidalLocked.excludes.add(eccentricOrbit);
	
//	tidalHeating.probability			= 1;
//	tidalHeating.minTidalForce			= 0.002;
//	tidalHeating.favours.add(volcanism);
//	tidalHeating.favours.add(subsurfaceEcosystem);
//	tidalHeating.favours.add(volcanism);
	
	strongTide.probability				= 1;
	strongTide.potentialFarmers.modifier			= 0.1;
	strongTide.minTidalForce			= 0.00002;	
	strongTide.favours.add(robustEcosystem);
	strongTide.favours.add(swamps);
	strongTide.excludes.add(strongOceanCurrents);
	
	endlessNights.probability			= 1;   // Will be put there always
	endlessNights.potentialFarmers.modifier			= -0.7;
	endlessNights.terraformingSpeed.modifier 	= 2;
	endlessNights.minDayLenght 			= 1000000;
	endlessNights.excludes.add(longNights);
	endlessNights.excludes.add(favorableClimate);
	endlessNights.favours.add(erraticClimate);
	endlessNights.favours.add(subterraneanAnimals);
	
	longNights.probability				= 1;   // Will be put there always
	longNights.potentialFarmers.modifier			= -0.35;
	longNights.terraformingSpeed.modifier 		= 1;
	longNights.minDayLenght 			= 300000;
	longNights.excludes.add(endlessNights);
	longNights.excludes.add(favorableClimate);
	longNights.favours.add(erraticClimate);
	longNights.favours.add(subterraneanAnimals);
	
	eccentricOrbit.potentialFarmers.modifier	= -0.50;
	eccentricOrbit.terraformingSpeed.modifier	= 1;
	eccentricOrbit.planetOnly 			= true;
	eccentricOrbit.inheritedByOrbiter 	= true;
	eccentricOrbit.excludes.add(tidalLocked);
	eccentricOrbit.excludes.add(favorableClimate);
	
	shiftingOrbit.probability			= 0.35;
	shiftingOrbit.potentialFarmers.modifier			= -0.50;
	shiftingOrbit.terraformingSpeed.modifier		= 1;
	shiftingOrbit.multipleStar			= true;
	shiftingOrbit.planetOnly			= true;
	
	magneticField.probability			= 1;
	magneticField.innerMoonGasGiant		= true;
	magneticField.potentialFarmers.modifier			= -0.50;
	magneticField.minTidalForce			= 0.002;
	
	asteroidField.exportCosts.modifier		= 0.5;
	asteroidField.fleetExperience.modifier = 0.5;
	asteroidField.inheritedByOrbiter	= true;
	asteroidField.favours.add(meteoriteShowers);
	
	meteoriteShowers.probability		= 0.35;
	meteoriteShowers.constructionCosts.modifier	= 0.2;
	meteoriteShowers.maxPressure 		= 0.1;
	meteoriteShowers.favours.add(asteroidField);
	
	intenseInsolation.maxPressure 		= 0.1;
	intenseInsolation.favours.add(tidalLocked);
	intenseInsolation.excludes.add(rainyClimate);
	
	//Geology
	
	isotopeDeposits.isotopesOutput.modifier	= 1;
	isotopeDeposits.maxPressure 		= 0;
	isotopeDeposits.resourceModifier	= 0.2;
	isotopeDeposits.excludes.add(bottomless);
	
	radioactive.isotopesOutput.modifier	= 0.5;
	radioactive.resourceModifier	= 0.2;
	radioactive.excludes.add(bottomless);
	
		
	preciousMetalDeposits.preciousMetalsOutput.modifier = 1;
	preciousMetalDeposits.resourceModifier	= 0.2;
	preciousMetalDeposits.densityModifier	= 0.2;
	preciousMetalDeposits.favours.add(rareElementsDeposits);
	preciousMetalDeposits.favours.add(heavyMetalDeposits);
	preciousMetalDeposits.excludes.add(bottomless);
	
	rareElementsDeposits.rareElementsOutput.modifier = 1;
	rareElementsDeposits.resourceModifier	= 0.2;
	rareElementsDeposits.densityModifier	= 0.1;
	rareElementsDeposits.favours.add(preciousMetalDeposits);
	rareElementsDeposits.favours.add(heavyMetalDeposits);
	rareElementsDeposits.excludes.add(bottomless);
	
	hydrocarbonDeposits.hydrocarbonsOutput.modifier = 1;
	hydrocarbonDeposits.resourceModifier	= 0.4;
	hydrocarbonDeposits.excludes.add(bottomless);
	
	hydrocarbonLakes.hydrocarbonsOutput.modifier = 2;
	hydrocarbonLakes.resourceModifier	= 0.5;
	hydrocarbonLakes.minPressure = 0.5;
	
	lightMetalDeposits.resourceModifier	= 0.5;
	lightMetalDeposits.excludes.add(bottomless);
	
	heavyMetalDeposits.potentialFarmers.modifier = -0.2;
	heavyMetalDeposits.preciousMetalsOutput.modifier = 0.2;
	heavyMetalDeposits.rareElementsOutput.modifier = 0.2;
	heavyMetalDeposits.ecoDamageMiner.modifier	= 0.5;
	heavyMetalDeposits.resourceModifier	= 0.5;
	heavyMetalDeposits.densityModifier	= 0.2;
	heavyMetalDeposits.favours.add(preciousMetalDeposits);
	heavyMetalDeposits.favours.add(rareElementsDeposits);
	heavyMetalDeposits.excludes.add(bottomless);
	
	cavernous.groundDefense.modifier = 1;
	cavernous.bombardmentResistance.modifier = 1;
	cavernous.constructionCosts.modifier = -0.1;
	cavernous.resourcesOutput.modifier = 0.1;
	cavernous.excludes.add(plains);
	cavernous.excludes.add(bottomless);
	
	volcanism.constructionCosts.modifier = 0.5;
	volcanism.resourceModifier	= 0.2;
	volcanism.favours.add(ruggedTerrain);
	volcanism.excludes.add(plains);
	volcanism.excludes.add(bottomless);
		
	ruggedTerrain.constructionCosts.modifier = 0.1;
	ruggedTerrain.potentialFarmers.modifier = -0.35;
	ruggedTerrain.groundDefense.modifier = 100;
	ruggedTerrain.resourceModifier	= 0.1;
	ruggedTerrain.favours.add(volcanism);
	ruggedTerrain.excludes.add(plains);
	ruggedTerrain.excludes.add(swamps);
	ruggedTerrain.excludes.add(bottomless);
	
	plains.potentialFarmers.modifier = 0.35;
	plains.resourceModifier	= -0.2;
	plains.favours.add(swamps);
	plains.excludes.add(bottomless);
	plains.excludes.add(cavernous);
	plains.excludes.add(volcanism);
	plains.excludes.add(ruggedTerrain);
	
	swamps.potentialFarmers.modifier = -0.35;
	swamps.bioSamplesOutput.modifier = 0.35;
	swamps.favours.add(plains);
	swamps.favours.add(biodiversity);
	swamps.favours.add(pathogens);
	swamps.favours.add(rainyClimate);
	swamps.excludes.add(bottomless);
	swamps.excludes.add(ruggedTerrain);
	
	bottomless.potentialFarmers.modifier = -0.65;
	bottomless.resourceModifier	= -0.8;
	bottomless.densityModifier	= -0.65;
	bottomless.excludes.add(isotopeDeposits);
	bottomless.excludes.add(preciousMetalDeposits);
	bottomless.excludes.add(rareElementsDeposits);
	bottomless.excludes.add(lightMetalDeposits);
	bottomless.excludes.add(heavyMetalDeposits);
	bottomless.excludes.add(oversalted);
	bottomless.excludes.add(cavernous);
	bottomless.excludes.add(plains);
	bottomless.excludes.add(volcanism);
	bottomless.excludes.add(ruggedTerrain);
	bottomless.excludes.add(biodiversity);
	bottomless.excludes.add(kelp);
	bottomless.excludes.add(swamps);
	bottomless.excludes.add(woodlands);
	bottomless.excludes.add(fertileSoil);
	bottomless.excludes.add(infertileSoil);
	bottomless.excludes.add(subterraneanAnimals);
	
	strongOceanCurrents.potentialFarmers.modifier = 0.2;
	strongOceanCurrents.favours.add(stormyClimate);
	strongOceanCurrents.excludes.add(strongTide);
	
	oversalted.potentialFarmers.modifier = -0.5;
	oversalted.resourceModifier	= 0.1;
	oversalted.excludes.add(bottomless);
	oversalted.excludes.add(fertileSoil);
	oversalted.excludes.add(infertileSoil);
	oversalted.excludes.add(kelp);
	
	poisonousSoil.potentialFarmers.modifier = -0.8;
	poisonousSoil.excludes.add(fertileSoil);
	poisonousSoil.excludes.add(infertileSoil);
		
	fertileSoil.potentialFarmers.modifier = 1;
	fertileSoil.excludes.add(poisonousSoil);
	fertileSoil.excludes.add(oversalted);
	fertileSoil.excludes.add(bottomless);
	fertileSoil.excludes.add(infertileSoil);
	
	infertileSoil.potentialFarmers.modifier = -0.50;
	infertileSoil.excludes.add(poisonousSoil);
	infertileSoil.excludes.add(oversalted);
	infertileSoil.excludes.add(bottomless);
	infertileSoil.excludes.add(fertileSoil);
	
	subsurfaceEcosystem.bioSamplesOutput.modifier = 0.25;
	subsurfaceEcosystem.favours.add(alienLibrary);
	
	// Climate 
	
	stormyClimate.potentialFarmers.modifier = -0.25;
	stormyClimate.constructionCosts.modifier = 0.1;
	stormyClimate.minPressure = 0.5; 
	stormyClimate.favours.add(strongOceanCurrents);
	stormyClimate.excludes.add(favorableClimate);
	stormyClimate.excludes.add(erraticClimate);
	
	rainyClimate.potentialFarmers.modifier = 0.25;
	rainyClimate.minPressure = 0.5; 
	rainyClimate.excludes.add(favorableClimate);
	rainyClimate.excludes.add(erraticClimate);
		
	favorableClimate.potentialFarmers.modifier = 0.5;
	favorableClimate.minPressure = 0.5;
	favorableClimate.excludes.add(stormyClimate);
	favorableClimate.excludes.add(erraticClimate);
	favorableClimate.excludes.add(eccentricOrbit);
	
	erraticClimate.potentialFarmers.modifier = -0.35;
	erraticClimate.constructionCosts.modifier = 0.25;
	erraticClimate.minPressure = 0.25;
	erraticClimate.favours.add(eccentricOrbit);
	erraticClimate.excludes.add(favorableClimate);
	erraticClimate.excludes.add(rainyClimate);
	erraticClimate.excludes.add(stormyClimate);
	
	
	// Biology
	
	biodiversity.potentialFarmers.modifier = 0.35;
	biodiversity.researchOutput.modifier = 0.1;
	biodiversity.bioSamplesOutput.modifier = 1;
	biodiversity.minPressure = 0.2;
	biodiversity.ecologic = true;
	biodiversity.excludes.add(bottomless);
	biodiversity.favours.add(alienLibrary);
	
	gardenPest.potentialFarmers.modifier = -0.65;
	gardenPest.bioSamplesOutput.modifier = 0.1;
	gardenPest.minPressure = 0.2;
	gardenPest.ecologic = true;
	gardenPest.favours.add(alienLibrary);
	
	alienPredator.groundDefense.modifier = 0.10;
	alienPredator.mortalityRate.modifier = 0.001;
	alienPredator.mood.modifier = -0.05;
	alienPredator.armyExperience.modifier = 0.5; 
	alienPredator.minPressure = 0.2;
	alienPredator.ecologic = true;
	alienPredator.favours.add(alienLibrary);
	
	subterraneanAnimals.constructionCosts.modifier = 0.1;
	subterraneanAnimals.groundDefense.modifier = 0.2;
	subterraneanAnimals.minPressure = 0.20;
	subterraneanAnimals.ecologic = true;
	subterraneanAnimals.favours.add(cavernous);
	subterraneanAnimals.excludes.add(bottomless);
	
	robustEcosystem.ecoDamageRecovery.modifier = 1;
	robustEcosystem.bioSamplesOutput.modifier = 0.2;
	robustEcosystem.minPressure = 0.20;
	robustEcosystem.ecologic = true;
	robustEcosystem.favours.add(heavyMetalDeposits);
	robustEcosystem.favours.add(poisonousSoil);
	robustEcosystem.favours.add(oversalted);
	robustEcosystem.favours.add(alienLibrary);
	
	woodlands.ecoDamageRecovery.modifier = 0.5;
	woodlands.groundDefense.modifier = 0.5;
	woodlands.potentialFarmers.modifier = -0.35;
	woodlands.constructionCosts.modifier = -0.05;
	woodlands.bioSamplesOutput.modifier = 0.1;
	woodlands.minPressure = 0.25;
	woodlands.ecologic = true;
	woodlands.favours.add(plains);
	woodlands.favours.add(fertileSoil);
	woodlands.excludes.add(bottomless);
	woodlands.favours.add(alienLibrary);	
	
	kelp.potentialFarmers.modifier = 0.35;
	kelp.bioSamplesOutput.modifier = 0.25;
	kelp.minPressure = 0.25;
	kelp.ecologic = true;
	kelp.favours.add(plains);
	kelp.excludes.add(oversalted);
	kelp.excludes.add(bottomless);
	kelp.favours.add(alienLibrary);
	
	medicinalPlants.bioSamplesOutput.modifier = 1;
	medicinalPlants.mortalityRate.modifier = -0.001;
	medicinalPlants.mood.modifier = 0.02;
	medicinalPlants.minPressure = 0.25;
	medicinalPlants.ecologic = true;
	medicinalPlants.favours.add(biodiversity);
	medicinalPlants.favours.add(alienLibrary);
	
	hallucinogens.bioSamplesOutput.modifier = 0.5;
	hallucinogens.resourcesOutput.modifier = -0.2;
	hallucinogens.goodsOutput.modifier = -0.2;
	hallucinogens.researchOutput.modifier = -0.2;
	hallucinogens.mortalityRate.modifier = 0.001;
	hallucinogens.administration.modifier = -0.2;
	hallucinogens.minPressure = 0.25;
	hallucinogens.ecologic = true;
	hallucinogens.favours.add(biodiversity);
	hallucinogens.favours.add(alienLibrary);
	
	pathogens.resourcesOutput.modifier = -0.1;
	pathogens.goodsOutput.modifier = -0.1;
	pathogens.researchOutput.modifier = -0.1;
	pathogens.bioSamplesOutput.modifier = 0.25;
	pathogens.mortalityRate.modifier = 0.005;
	pathogens.mood.modifier = -0.1;
	pathogens.minPressure = 0.2;
	pathogens.favours.add(swamps);
	pathogens.favours.add(alienLibrary);
	
	// Alien
	
	homeworld.probability				= 0;
	homeworld.potentialFarmers.modifier	= 0.5;
	homeworld.groundDefense.modifier = 1; 
	homeworld.ecoDamageRecovery.modifier = 1; 
	homeworld.terraformingSpeed.modifier = -0.5;
		
	ancientRuins.researchOutput.modifier	= 0.1;
	ancientRuins.artifactsOutput.modifier 		= 0.05;
	ancientRuins.constructionCosts.modifier = -0.05;
		
	alienTech.researchOutput.modifier		= 0.25;
	alienTech.artifactsOutput.modifier		= 1; 
	alienTech.favours.add(alienLibrary);
		
	alienLibrary.researchOutput.modifier     = 1;
	alienLibrary.artifactsOutput.modifier 	= 0.25; 
	alienLibrary.favours.add(alienTech);
	}
}