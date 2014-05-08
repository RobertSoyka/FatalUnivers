package FUPackage;

import java.awt.Graphics;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class BuildingType extends EconomicEffects implements IGeneralData{

//public static LinkedHashSet<BuildingType> buildingsFood = new LinkedHashSet<BuildingType>();
//public static LinkedHashSet<BuildingType> buildingsResources = new LinkedHashSet<BuildingType>();
//public static LinkedHashSet<BuildingType> buildingsGoods = new LinkedHashSet<BuildingType>();
//public static LinkedHashSet<BuildingType> buildingsResearch = new LinkedHashSet<BuildingType>();
//public static LinkedHashSet<BuildingType> buildingsServices = new LinkedHashSet<BuildingType>();
//public static LinkedHashSet<BuildingType> buildingsPublicServices = new LinkedHashSet<BuildingType>();
//public static LinkedHashSet<BuildingType> buildingsMilitary = new LinkedHashSet<BuildingType>();

public static LinkedHashSet<BuildingType> buildingTypes = new LinkedHashSet();
	
public String name = "Needs Name";
public String description = "Needs Description";
public Icon icon = GraphicFU.qMarkIcon;
public Icon image =  new ImageIcon(GraphicFU.class.getResource("Buildings/arcologies.png"));
// public BuildingType upgradesTo;
public int levels		=	1;
public double minPopPerLevel	=	0;


public Technology technology = null; 

//Costs
public boolean orbitalFacility		=	false;
public double costsAbsolute 		=	0;
public double costsArea 			=	0;
public double costsPopulation 		=	0;
public double costsFarmer 			=	0;
public double costsMiner 			=	0;
public double costsWorker 			=	0;
public double costsResearcher		=	0;

public double investmentSpeed		= 	0.05;
public double deterioration			=	0.025/Parameter.turnsPerYear; // Percentage of

public double stability				=	1; /// How much damages does it take to destroy 1 Mt equipment of this building?

public int classification			=	0;
public boolean	privateSector		=	true; // Is part of private sector in market economies 

//public EconomicEffects buildingEffect = new EconomicEffects();


// Upgraded by
public Set<BuildingType> upgradedBy = new HashSet<BuildingType>();

// PlanetType
public boolean habitable	= false;
public boolean agriculture	= false;
public LinkedHashSet<AOType> AOTypeAllowed 	= new LinkedHashSet<AOType>();


public AOSpecial AOSpecialRestriction = null; 

/// BUILDINGS XXX

// Farming
static BuildingType primitiveFarms = new BuildingType(language.primitiveFarms, language.primitiveFarms_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/primitiveFarms.png")));
static BuildingType farms = new BuildingType(language.farms, language.farms_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/farms.png")));
static BuildingType mechanizedFarms = new BuildingType(language.mechanizedFarms, language.mechanizedFarms_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/mechanizedFarms.png")));
static BuildingType roboticFarms = new BuildingType(language.roboticFarms, language.roboticFarms_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/roboticFarms.png")));
static BuildingType naniteFarms = new BuildingType(language.naniteFarms,language.naniteFarms_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/naniteFarms.png")));

static BuildingType irrigationSystems = new BuildingType(language.irrigationSystems,language.irrigationSystems_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/irrigationSystems.png")));
static BuildingType fertilizerFactories = new BuildingType(language.fertilizerFactories, language.fertilizerFactories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fertilizerFactories.png")));
static BuildingType foodIndustries = new BuildingType(language.foodIndustries, language.foodIndustries_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/foodIndustries.png")));
static BuildingType agrogeneticLaboratories = new BuildingType(language.agrogeneticLaboratories,language.agrogeneticLaboratories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/agrogeneticLaboratories.png")));
static BuildingType weatherControlStations = new BuildingType(language.weatherControl,language.weatherControl_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/weatherControlStations.png")));
static BuildingType atmosphereConverters = new BuildingType(language.atmosphereConverters,language.atmosphereConverters_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/atmosphereConverters.png")));

// Mining
static BuildingType primitiveMines = new BuildingType(language.primitiveMines, language.primitiveMines_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/primitiveMines.png")));
static BuildingType mines = new BuildingType(language.mines, language.mines_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/mines.png")));
static BuildingType mechanizedMines = new BuildingType(language.mechanizedMines,language.mechanizedMines_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/mechanizedMines.png")));
static BuildingType roboticMines = new BuildingType(language.roboticMines,language.roboticMines_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/roboticMines.png")));
static BuildingType naniteMines = new BuildingType(language.naniteMines,language.naniteMines_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/naniteMines.png")));
static BuildingType teleporterMines = new BuildingType(language.teleporterMines,language.teleporterMines_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/teleporterMines.png")));

static BuildingType blastFurnances = new BuildingType(language.blastFurnances,language.blastFurnances_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/blastFurnances.png")));
static BuildingType heavyIndustries = new BuildingType(language.heavyIndustries,language.heavyIndustries_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/heavyIndustries.png")));
static BuildingType openPitMines = new BuildingType(language.openPitMines,language.openPitMines_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/openPitMines.png")));

// Industry
static BuildingType manufactories = new BuildingType(language.manufactories,language.manufactories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/manufactories.png")));
static BuildingType factories = new BuildingType(language.factories,language.factories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/factories.png")));
static BuildingType assemblyLineFactories = new BuildingType(language.assemblyLineFactories,language.assemblyLineFactories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/assemblyLineFactories.png")));
static BuildingType roboticFactories = new BuildingType(language.roboticFactories,language.roboticFactories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/roboticFactories.png")));
static BuildingType naniteFactories = new BuildingType(language.naniteFactories,language.naniteFactories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/naniteFactories.png")));
static BuildingType replicatorFactories = new BuildingType(language.replicatorFactories,language.replicatorFactories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/replicatorFactories.png")));

static BuildingType lightIndustries = new BuildingType(language.lightIndustries,language.lightIndustries_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/lightIndustries.png")));
//Education / Research
static BuildingType schools = new BuildingType(language.schools,language.schools_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/schools.png")));
static BuildingType universities = new BuildingType(language.universities,language.universities_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/universities.png")));

static BuildingType researchLaboratories = new BuildingType(language.researchLaboratories,language.researchLaboratories_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/researchLaboratories.png")));
static BuildingType researchInstitutes = new BuildingType(language.researchInstitutes,language.researchInstitutes_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/researchInstitutes.png")));
static BuildingType researchAcademies = new BuildingType(language.researchAcademies,language.researchAcademies_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/researchAcademies.png")));

static BuildingType thinkTanks = new BuildingType(language.thinkTanks,language.thinkTanks_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/thinkTanks.png")));

static BuildingType testSites = new BuildingType(language.testSites,language.testSites_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/testSites.png")));

static BuildingType superCollider = new BuildingType(language.superCollider,language.superCollider_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/superCollider.png")));
//static BuildingType orbitalResearchStation = new BuildingType(language.orbitalResearchStation,language.orbitalResearchStation_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalResearchStation.png")));

static BuildingType electronicSupercomputers = new BuildingType(language.electronicSupercomputers,language.electronicSupercomputers_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/electronicSupercomputers.png")));
static BuildingType opticSupercomputers = new BuildingType(language.opticSupercomputers,language.opticSupercomputers_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/opticSupercomputers.png")));
static BuildingType quantumSupercomputers = new BuildingType(language.quantumSupercomputers,language.quantumSupercomputers_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/quantumSupercomputers.png")));

//Public agencies
static BuildingType centralGovernment = new BuildingType(language.centralGovernment,language.centralGovernment_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/centralGovernment.png")));

static BuildingType localGovernment = new BuildingType(language.localGovernment,language.localGovernment_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/localGovernment.png")));

static BuildingType broadcastingStations = new BuildingType(language.broadcastingStations,language.broadcastingStations_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/broadcastingStations.png")));

static BuildingType policeDepartments = new BuildingType(language.policeDepartments,language.policeDepartments_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/policeDepartments.png")));
static BuildingType environmentalAgency = new BuildingType(language.environmentalAgency,language.environmentalAgency_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/environmentalAgency.png")));
static BuildingType revenueService = new BuildingType(language.revenueService,language.revenueService_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/revenueService.png")));
static BuildingType secretService = new BuildingType(language.secretService,language.secretService_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/secretService.png")));

static BuildingType hospitals = new BuildingType(language.hospitals,language.hospitals_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/hospitals.png")));
static BuildingType geneticHospitals = new BuildingType(language.geneticHospitals,language.geneticHospitals_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/geneticHospitals.png")));
static BuildingType naniteHospitals = new BuildingType(language.naniteHospitals,language.naniteHospitals_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/naniteHospitals.png")));

static BuildingType gravGenerators = new BuildingType(language.gravGenerators,language.gravGenerators_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/gravGenerators.png")));

static BuildingType ecosphereDomes = new BuildingType(language.ecosphereDomes,language.ecosphereDomes_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/ecosphereDomes.png")));

// Power Plant
static BuildingType hydroPowerPlants = new BuildingType(language.hydroPowerPlants,language.hydroPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/hydroPowerPlants.png")));
static BuildingType fossilFuelPowerPlants = new BuildingType(language.fossilFuelPowerPlants,language.fossilFuelPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fossilFuelPowerPlants.png")));
static BuildingType windPowerPlants = new BuildingType(language.windPowerPlants,language.windPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/windPowerPlants.png")));
static BuildingType seaflowPowerPlants = new BuildingType(language.seaflowPowerPlants,language.seaflowPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/seaflowPowerPlants.png")));
static BuildingType geothermalPowerPlants = new BuildingType(language.geothermalPowerPlants,language.geothermalPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/geothermalPowerPlants.png")));
static BuildingType solarPowerPlants = new BuildingType(language.solarPowerPlants,language.solarPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/solarPowerPlants.png")));

static BuildingType nuclearPowerPlants = new BuildingType(language.nuclearPowerPlants,language.nuclearPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/nuclearPowerPlants.png")));
static BuildingType fusionDTPowerPlants = new BuildingType(language.fusionDTPowerPlants,language.fusionDTPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fusionDTPowerPlants.png")));
static BuildingType fusionHe3PowerPlants = new BuildingType(language.fusionHe3PowerPlants,language.fusionHe3PowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fusionHe3PowerPlants.png")));
static BuildingType singularityPowerPlants = new BuildingType(language.singularityPowerPlants,language.singularityPowerPlants_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/singularityPowerPlants.png")));

// Transport / Services
static BuildingType primitiveTransport = new BuildingType(language.primitiveTransport,language.primitiveTransport_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/primitiveTransport.png")));
static BuildingType steamTransport = new BuildingType(language.steamTransport,language.steamTransport_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/steamTransport.png")));
static BuildingType combustionTransport = new BuildingType(language.combustionTransport,language.combustionTransport_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/combustionTransport.png")));
static BuildingType electrifiedTransport = new BuildingType(language.electrifiedTransport,language.electrifiedTransport_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/electrifiedTransport.png")));
static BuildingType gravityTransport = new BuildingType(language.gravityTransport,language.gravityTransport_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/gravityTransport.png")));
static BuildingType teleporterTransport = new BuildingType(language.teleporterTransport,language.teleporterTransport_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/teleporterTransport.png")));

static BuildingType communicationNetworks = new BuildingType(language.communicationNetworks,language.communicationNetworks_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/communicationNetworks.png")));
static BuildingType dataNetworks = new BuildingType(language.dataNetworks,language.dataNetworks_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/dataNetworks.png")));
static BuildingType quantumNetworks = new BuildingType(language.quantumNetworks,language.quantumNetworks_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/quantumNetworks.png")));

static BuildingType banks = new BuildingType(language.banks,language.banks_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/banks.png")));

static BuildingType stockExchanges = new BuildingType(language.stockExchanges,language.stockExchanges_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/stockExchanges.png")));

static BuildingType insuranceCompanies = new BuildingType(language.insuranceCompanies,language.insuranceCompanies_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/insuranceCompanies.png")));

static BuildingType vacationResorts = new BuildingType(language.vacationResorts,language.vacationResorts_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/vacationResorts.png")));

static BuildingType markets = new BuildingType(language.markets,language.markets_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/markets.png")));
static BuildingType shoppingCenters = new BuildingType(language.shoppingCenters,language.shoppingCenters_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/shoppingCenters.png")));

static BuildingType primitiveDwellings = new BuildingType(language.primitiveDwellings,language.primitiveDwellings_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/primitiveDwellings.png")));
static BuildingType modernDwellings = new BuildingType(language.modernDwellings,language.modernDwellings_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/modernDwellings.png")));
static BuildingType residentialTowers = new BuildingType(language.residentialTowers,language.residentialTowers_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/residentialTowers.png")));
static BuildingType arcologies = new BuildingType(language.arcologies,language.arcologies_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/arcologies.png")));

//Space Transport

static BuildingType spacePorts = new BuildingType(language.spacePorts,language.spacePorts_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/spacePorts.png")));
static BuildingType spaceElevators = new BuildingType(language.spaceElevators,language.spaceElevators_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/spaceElevators.png")));
static BuildingType gravElevators = new BuildingType(language.gravElevators,language.gravElevators_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/gravElevators.png")));
static BuildingType orbitalTeleporters = new BuildingType(language.orbitalTeleporters, language.orbitalTeleporters_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalTeleporters.png")));

// Military
static BuildingType militiaForces = new BuildingType(language.militiaForces,language.militiaForces_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/militiaForces.png")));
static BuildingType armyBases = new BuildingType(language.armyBases,language.armyBases_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/armyBases.png")));
static BuildingType missileBases = new BuildingType(language.missileBases,language.missileBases_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/missileBases.png")));
static BuildingType fighterBases = new BuildingType(language.fighterBases,language.fighterBases_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fighterBases.png")));
static BuildingType orbitalBattery = new BuildingType(language.orbitalBatteries,language.orbitalBatteries_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalBattery.png")));

static BuildingType armyAcademy = new BuildingType(language.armyAcademy,language.armyAcademy_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/armyAcademy.png")));

static BuildingType fleetAcademy = new BuildingType(language.fleetAcademy,language.fleetAcademy_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fleetAcademy.png")));
static BuildingType defenseSatellites = new BuildingType(language.defenseSatellites,language.defenseSatellites_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/defenseSatellites.png")));

// shipyard and orbital

static BuildingType orbitalShipyards = new BuildingType(language.orbitalShipyards,language.orbitalShipyards_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalShipyard.png")));
static BuildingType orbitalHabitats = new BuildingType(language.orbitalHabitats,language.orbitalHabitats_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalHabitats.png")));
static BuildingType orbitalCities = new BuildingType(language.orbitalCities,language.orbitalCities_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalCities.png")));
static BuildingType orbitalIsotopesExtractor = new BuildingType(language.orbitalIsotopesExtractor,language.orbitalIsotopesExtractor_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalIsotopesExtractor.png")));
static BuildingType orbitalResourceExtractor = new BuildingType(language.orbitalResourceExtractor,language.orbitalResourceExtractor_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalResourceExtractor.png")));


// Public services

static BuildingType solarMirror = new BuildingType(language.solarMirror,language.solarMirror_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/solarMirror.png")));
static BuildingType solarShade = new BuildingType(language.solarShade,language.solarShade_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/solarShade.png")));

// Environment
static BuildingType natureReserves = new BuildingType(language.natureReserves,language.natureReserves_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/natureReserves.png")));

static BuildingType wasteDisposalSites = new BuildingType(language.wasteDisposalSites,language.wasteDisposalSites_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/wasteDisposalSites.png")));
static BuildingType recyclingCenters = new BuildingType(language.recyclingCenters,language.recyclingCenters_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/recyclingCenters.png")));
static BuildingType nanoRecyclers = new BuildingType(language.nanoRecyclers,language.nanoRecyclers_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/nanoRecyclers.png")));

static BuildingType deepDisposalSites = new BuildingType(language.deepDisposalSites,language.deepDisposalSites_description, new ImageIcon(GraphicFU.class.getResource("BuildingIcons/deepDisposalSites.png")));

String getName(){
	return this.name;
}

void setName(String name_){
	this.name = name_;
	;
}


public BuildingType(String name_, String description_, Icon icon_){
	this.name  = name_;
	this.description = description_;
	this.icon = icon_;
	buildingTypes.add(this);
	}








public static void initialize(){


	
	// Farming XXX
	
	primitiveFarms.classification=0;
	primitiveFarms.costsFarmer 						= 0.3;
	primitiveFarms.foodOutput.modifier 				= 1;
	primitiveFarms.agriculture 						= true;
	primitiveFarms.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/primitiveFarms.png"));
	primitiveFarms.technology = Technology.agriculture;
	primitiveFarms.upgradedBy.add(farms);
	primitiveFarms.upgradedBy.add(mechanizedFarms);
	primitiveFarms.upgradedBy.add(roboticFarms);
	primitiveFarms.upgradedBy.add(naniteFarms);		
	
	farms.classification=0;
	farms.costsFarmer 								= 1;
	farms.foodOutput.modifier 							= 2;
	farms.ecoDamageFarmer.modifier 							= 0.5;
	farms.agriculture 								= true;
	farms.technology = Technology.breeding;
	farms.upgradedBy.add(mechanizedFarms);
	farms.upgradedBy.add(roboticFarms);
	farms.upgradedBy.add(naniteFarms);
	farms.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/farms.png"));
		  
	mechanizedFarms.classification=0;	
	mechanizedFarms.costsFarmer 					= 3;
	mechanizedFarms.foodOutput.modifier 				= 4;
	mechanizedFarms.ecoDamageFarmer.modifier 				= 1;
	mechanizedFarms.agriculture 					= true;
	mechanizedFarms.technology = Technology.mechanizedAgriculture;
	mechanizedFarms.upgradedBy.add(roboticFarms);
	mechanizedFarms.upgradedBy.add(naniteFarms);
	mechanizedFarms.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/mechanizedFarms.png"));
		
	roboticFarms.classification=0;
	roboticFarms.costsFarmer 						= 10;
	roboticFarms.foodOutput.modifier 					= 8;
	roboticFarms.ecoDamageFarmer.modifier 					= 0.5;
	roboticFarms.agriculture	 					= true;
	roboticFarms.technology = Technology.agriculturalRobots;
	roboticFarms.upgradedBy.add(naniteFarms);
	roboticFarms.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/roboticFarms.png"));
		
	naniteFarms.classification=0;
	naniteFarms.costsFarmer 						= 30;
	naniteFarms.foodOutput.modifier 					= 16;
	naniteFarms.agriculture	 						= true;
	naniteFarms.technology							= Technology.agriculturalNanites;
	naniteFarms.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/naniteFarms.png"));
		
	// Food Support
	irrigationSystems.classification=0;
	irrigationSystems.costsFarmer					= 0.5;
	irrigationSystems.potentialFarmers.modifier				= 0.25;	
	irrigationSystems.ecoDamageFarmer.modifier				= 0.25;
	irrigationSystems.agriculture					= true;
	irrigationSystems.technology					= Technology.irrigation;
	irrigationSystems.AOTypeAllowed.add(AOType.steppe);
	irrigationSystems.AOTypeAllowed.add(AOType.desert);
		
	fertilizerFactories.classification=0;
	fertilizerFactories.costsFarmer 				= 2;
	fertilizerFactories.foodOutput.modifier			= 2;
	fertilizerFactories.ecoDamageFarmer.modifier				= 1;
	fertilizerFactories.agriculture					= true;
	fertilizerFactories.supressedSpecials.add(AOSpecial.infertileSoil);
	fertilizerFactories.technology = Technology.artificialFertilizer;
	fertilizerFactories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fertilizerFactories.png"));
		
	foodIndustries.classification=0;
	foodIndustries.costsFarmer 						= 2;
	foodIndustries.foodOutput.modifier					= 2;
	foodIndustries.agriculture	 					= true;
	foodIndustries.technology						= Technology.foodProcessing;
	foodIndustries.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/foodIndustries.png"));
		
	agrogeneticLaboratories.classification=0;
	agrogeneticLaboratories.costsFarmer				= 3;
	agrogeneticLaboratories.foodOutput.modifier		= 2;
	agrogeneticLaboratories.ecoDamageFarmer.modifier			= 1;
	agrogeneticLaboratories.agriculture	 			= true;
	agrogeneticLaboratories.technology = Technology.agrogenetics;
	agrogeneticLaboratories.supressedSpecials.add(AOSpecial.gardenPest);
	agrogeneticLaboratories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/agrogeneticLaboratories.png"));
		
	weatherControlStations.classification=0;
	weatherControlStations.costsArea				= 10;
	weatherControlStations.foodOutput.modifier 		= 0.5;
	weatherControlStations.potentialFarmers.modifier 		= 0.25;
	weatherControlStations.technology				= Technology.weatherManipulation;
	weatherControlStations.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/weatherControlStations.png"));
	weatherControlStations.supressedSpecials.add(AOSpecial.erraticClimate);
	weatherControlStations.privateSector = false;
		
	atmosphereConverters.classification=0;
	atmosphereConverters.costsArea					= 10;
	atmosphereConverters.foodOutput.modifier			= 0.5;
	atmosphereConverters.terraformingSpeed.modifier		= 0.01;
	atmosphereConverters.ecoDamageFarmer.modifier			= -0.35;
	atmosphereConverters.ecoDamageMiner.modifier				= -0.35;
	atmosphereConverters.ecoDamageWorker.modifier			= -0.35;
	atmosphereConverters.ecoDamagePopulation.modifier 		= -0.35;
	atmosphereConverters.technology					= Technology.atmosphereConverters;
	atmosphereConverters.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/atmosphereConverters.png"));
	atmosphereConverters.privateSector = false;
		
	solarMirror.classification=0;
	solarMirror.costsArea							= 10;
	solarMirror.temperatureChange.modifier					= 1;
	solarMirror.levels								= 1000;
	solarMirror.orbitalFacility						= true;
	solarMirror.technology							= Technology.solarMirrors;
	solarMirror.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/solarMirror.png"));
	solarMirror.privateSector = false;
		
	solarShade.classification=0;
	solarShade.costsArea							= 10;
	solarShade.temperatureChange.modifier					= -1;
	solarShade.levels								= 1000;
	solarShade.orbitalFacility						= true;
	solarShade.technology							= Technology.solarMirrors;
	solarShade.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/solarShade.png"));
	solarShade.privateSector = false;
		
	// Mining XXX
	primitiveMines.classification=1;
	primitiveMines.costsMiner						= 0.5;
	primitiveMines.resourcesOutput.modifier			= 1;
	primitiveMines.ecoDamageMiner.modifier					= 0.5;
	primitiveMines.technology						= Technology.miningTechniques;
	primitiveMines.upgradedBy.add(mines);
	primitiveMines.upgradedBy.add(mechanizedMines);
	primitiveMines.upgradedBy.add(roboticMines);
	primitiveMines.upgradedBy.add(naniteMines);
	primitiveMines.upgradedBy.add(teleporterMines);
	primitiveMines.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/primitiveMines.png"));
		
	mines.classification=1;
	mines.costsMiner								= 1;
	mines.resourcesOutput.modifier						= 2;
	mines.ecoDamageMiner.modifier							= 1;
	mines.technology								= Technology.explosives;
	mines.upgradedBy.add(mechanizedMines);
	mines.upgradedBy.add(roboticMines);
	mines.upgradedBy.add(naniteMines);
	mines.upgradedBy.add(teleporterMines);
	mines.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/mines.png"));
		
	mechanizedMines.classification=1;
	mechanizedMines.costsMiner						= 3;
	mechanizedMines.resourcesOutput.modifier			= 4;
	mechanizedMines.ecoDamageMiner.modifier					= 0.75;
	mechanizedMines.technology						= Technology.mechanizedMining;
	mechanizedMines.upgradedBy.add(roboticMines);
	mechanizedMines.upgradedBy.add(naniteMines);
	mechanizedMines.upgradedBy.add(teleporterMines);	
	mechanizedMines.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/mechanizedMines.png"));
		
	roboticMines.classification=1;
	roboticMines.costsMiner							= 10;
	roboticMines.resourcesOutput.modifier				= 8;
	roboticMines.ecoDamageMiner.modifier						= 0.5;
	roboticMines.technology							= Technology.miningRobots;
	roboticMines.upgradedBy.add(naniteMines);		
	roboticMines.upgradedBy.add(teleporterMines);
	roboticMines.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/roboticMines.png"));
		
	naniteMines.classification=1;
	naniteMines.costsMiner							= 30;
	naniteMines.resourcesOutput.modifier				= 16;
	naniteMines.ecoDamageMiner.modifier						= 0.25;
	naniteMines.technology							= Technology.extractionNanites;
	naniteMines.upgradedBy.add(teleporterMines);
	naniteMines.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/naniteMines.png"));
		
	teleporterMines.classification=1;
	teleporterMines.costsMiner						= 100;
	teleporterMines.resourcesOutput.modifier			= 32;
	teleporterMines.technology						= Technology.teleporterMining;
	teleporterMines.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/teleporterMines.png"));
	
	blastFurnances.classification=1;
	blastFurnances.costsMiner						= 2;
	blastFurnances.resourcesOutput.modifier			= 2;
	blastFurnances.ecoDamageMiner.modifier					= 0.5;
	blastFurnances.technology						= Technology.blastFurnances;
	blastFurnances.upgradedBy.add(heavyIndustries);
	blastFurnances.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/blastFurnances.png"));
		
	heavyIndustries.classification=1;
	heavyIndustries.costsMiner						= 6;
	heavyIndustries.resourcesOutput.modifier			= 4;
	heavyIndustries.ecoDamageMiner.modifier					= 0.5;
	heavyIndustries.technology						= Technology.heavyIndustries;
	heavyIndustries.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/heavyIndustries.png"));
	
	openPitMines.classification=1;
	openPitMines.costsMiner 						= 4;
	openPitMines.resourcesOutput.modifier 			= 8;
	openPitMines.ecoDamageMiner.modifier			= 16;
	openPitMines.technology							= Technology.excavators;
	openPitMines.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/openPitMines.png"));
		
	orbitalIsotopesExtractor.classification			=1;
	orbitalIsotopesExtractor.costsAbsolute			= 1000;
	orbitalIsotopesExtractor.isotopesOutput.modifier		= 3000;
	orbitalIsotopesExtractor.orbitalWorkersDemand.modifier	= 10000;
	orbitalIsotopesExtractor.orbitalFacility		= true;
	orbitalIsotopesExtractor.levels					= 100;
	orbitalIsotopesExtractor.technology				= Technology.isotopesExtractors;
	orbitalIsotopesExtractor.AOTypeAllowed.add(AOType.gasGiant);
	orbitalIsotopesExtractor.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalIsotopesExtractor.png"));
		
	orbitalResourceExtractor.classification=1;
	orbitalResourceExtractor.costsAbsolute			= 1000;
	orbitalResourceExtractor.resourcesOutput.modifier		= 3000;
	orbitalResourceExtractor.orbitalWorkersDemand.modifier	= 10000;
	orbitalResourceExtractor.orbitalFacility		= true;
	orbitalResourceExtractor.levels					= 100;
	orbitalResourceExtractor.technology				= Technology.asteroidMining;
	orbitalResourceExtractor.AOTypeAllowed.add(AOType.asteroid);
	orbitalResourceExtractor.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalResourceExtractor.png"));
		
	wasteDisposalSites.classification=1;
	wasteDisposalSites.recycling.modifier					= 0.35;
	wasteDisposalSites.ecoDamagePopulation.modifier			= -0.05;
	wasteDisposalSites.costsPopulation				= 0.01;
	wasteDisposalSites.upgradedBy.add(recyclingCenters);
	wasteDisposalSites.upgradedBy.add(nanoRecyclers);
	wasteDisposalSites.technology					= Technology.wasteManagement;
	wasteDisposalSites.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/wasteDisposalSites.png"));
		
	recyclingCenters.classification=1;
	recyclingCenters.recycling.modifier						= 0.65;
	recyclingCenters.ecoDamagePopulation.modifier			= -0.10;
	recyclingCenters.costsPopulation				= 0.25;
	recyclingCenters.technology						= Technology.recyclingCenters;
	recyclingCenters.upgradedBy.add(nanoRecyclers);
	recyclingCenters.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/recyclingCenters.png"));
		
	nanoRecyclers.classification=1;
	nanoRecyclers.recycling.modifier							= 1.0;
	nanoRecyclers.ecoDamagePopulation.modifier				= -0.15;
	nanoRecyclers.costsPopulation					= 10;
	nanoRecyclers.technology						= Technology.extractionNanites;
	nanoRecyclers.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/nanoRecyclers.png"));
		
	deepDisposalSites.classification=1;
	deepDisposalSites.costsPopulation				= 0.1;
	deepDisposalSites.costsMiner					= 1; 
	deepDisposalSites.ecoDamageMiner.modifier				= -0.1; 
	deepDisposalSites.costsWorker					= 1; 
	deepDisposalSites.ecoDamageWorker.modifier				= -0.1;
	deepDisposalSites.technology					= Technology.fissionReactors;
	deepDisposalSites.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/deepDisposalSites.png")); //XXX
		
	// Power Plants
		hydroPowerPlants.classification=1;
		hydroPowerPlants.costsPopulation				= 0.1;
		hydroPowerPlants.infrastructure.modifier					= 0.1;
		hydroPowerPlants.technology						= Technology.electricalEngineering;
		hydroPowerPlants.AOSpecialRestriction			= AOSpecial.rainyClimate;
		hydroPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/hydroPowerPlants.png"));
			
		seaflowPowerPlants.classification=1;
		seaflowPowerPlants.costsPopulation				= 0.1;
		seaflowPowerPlants.infrastructure.modifier				= 0.1;
		seaflowPowerPlants.technology					= Technology.electricalEngineering;
		seaflowPowerPlants.AOSpecialRestriction			= AOSpecial.strongOceanCurrents;
		seaflowPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/seaflowPowerPlant.png"));
			
		windPowerPlants.classification=1;
		windPowerPlants.costsPopulation					= 0.1;
		windPowerPlants.infrastructure.modifier					= 0.1;
		windPowerPlants.technology						= Technology.electricalEngineering;
		windPowerPlants.AOSpecialRestriction			= AOSpecial.stormyClimate;
		windPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/windPowerPlants.png"));
			
		geothermalPowerPlants.classification=1;
		geothermalPowerPlants.costsPopulation			= 0.1;
		geothermalPowerPlants.infrastructure.modifier			= 0.1;
		geothermalPowerPlants.technology				= Technology.electricalEngineering;
		geothermalPowerPlants.AOSpecialRestriction		= AOSpecial.volcanism;
		geothermalPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/geothermalPowerPlants.png"));
			
		solarPowerPlants.classification=1;
		solarPowerPlants.costsPopulation				= 0.1;
		solarPowerPlants.infrastructure.modifier					= 0.1;
		solarPowerPlants.technology						= Technology.electricalEngineering;
		solarPowerPlants.AOSpecialRestriction			= AOSpecial.intenseInsolation;
		solarPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/solarPowerPlants.png"));
			
		fossilFuelPowerPlants.classification=1;
		fossilFuelPowerPlants.costsPopulation			= 0.25;
		fossilFuelPowerPlants.ecoDamagePopulation.modifier		= 1;
		fossilFuelPowerPlants.infrastructure.modifier			= 0.3;
		fossilFuelPowerPlants.technology				= Technology.electricalEngineering;
		fossilFuelPowerPlants.upgradedBy.add(nuclearPowerPlants);
		fossilFuelPowerPlants.upgradedBy.add(fusionDTPowerPlants);
		fossilFuelPowerPlants.upgradedBy.add(fusionHe3PowerPlants);
		fossilFuelPowerPlants.upgradedBy.add(singularityPowerPlants);
		fossilFuelPowerPlants.AOTypeAllowed.add(AOType.ocean);
		fossilFuelPowerPlants.AOTypeAllowed.add(AOType.terran);
		fossilFuelPowerPlants.AOTypeAllowed.add(AOType.steppe);
		fossilFuelPowerPlants.AOTypeAllowed.add(AOType.desert);
		fossilFuelPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fossilFuelPowerPlants.png"));
			
		nuclearPowerPlants.classification=1;
		nuclearPowerPlants.costsPopulation				= 2;
		nuclearPowerPlants.isotopesDemand.modifier				= 0.1;
		nuclearPowerPlants.ecoDamagePopulation.modifier			= 0.35;
		nuclearPowerPlants.infrastructure.modifier				= 0.3;
		nuclearPowerPlants.technology					= Technology.fissionReactors;
		nuclearPowerPlants.upgradedBy.add(fusionDTPowerPlants);
		nuclearPowerPlants.upgradedBy.add(fusionHe3PowerPlants);
		nuclearPowerPlants.upgradedBy.add(singularityPowerPlants);
		nuclearPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/nuclearPowerPlants.png"));
			
		fusionDTPowerPlants.classification=1;
		fusionDTPowerPlants.costsPopulation				= 3;
		fusionDTPowerPlants.isotopesDemand.modifier				= 0.1;
		fusionDTPowerPlants.ecoDamagePopulation.modifier			= 0.1;
		fusionDTPowerPlants.infrastructure.modifier				= 0.4;
		fusionDTPowerPlants.technology					= Technology.fusionReactors;
		fusionDTPowerPlants.upgradedBy.add(fusionHe3PowerPlants);
		fusionDTPowerPlants.upgradedBy.add(singularityPowerPlants);
		fusionDTPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fusionDTPowerPlants.png"));
			
		fusionHe3PowerPlants.classification=1;
		fusionHe3PowerPlants.costsPopulation			= 4;
		fusionHe3PowerPlants.isotopesDemand.modifier				= 0.2;
		fusionHe3PowerPlants.infrastructure.modifier				= 0.5;
		fusionHe3PowerPlants.technology					= Technology.fusionReactors;
		fusionHe3PowerPlants.upgradedBy.add(singularityPowerPlants);
		fusionHe3PowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fusionHe3PowerPlants.png"));
			
		singularityPowerPlants.classification=1;
		singularityPowerPlants.costsPopulation			= 5;
		singularityPowerPlants.infrastructure.modifier			= 0.6;
		singularityPowerPlants.technology				= Technology.singularityReactors;
		singularityPowerPlants.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/singularityPowerPlants.png"));
		
	// Industry XXX
	manufactories.classification=2;
	manufactories.costsWorker 						= 0.5;
	manufactories.goodsOutput.modifier 				= 1;
	manufactories.ecoDamageWorker.modifier 					= 0.5;
	manufactories.technology						= Technology.manufactories;
	manufactories.upgradedBy.add(factories);
	manufactories.upgradedBy.add(assemblyLineFactories);
	manufactories.upgradedBy.add(roboticFactories);
	manufactories.upgradedBy.add(naniteFactories);
	manufactories.upgradedBy.add(replicatorFactories);
	manufactories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/manufactories.png"));
		
	factories.classification=2;
	factories.costsWorker 						= 1;
	factories.goodsOutput.modifier 				= 2;
	factories.ecoDamageWorker.modifier 					= 1;
	factories.technology						= Technology.factories;
	factories.upgradedBy.add(assemblyLineFactories);
	factories.upgradedBy.add(roboticFactories);
	factories.upgradedBy.add(naniteFactories);
	factories.upgradedBy.add(replicatorFactories);
	factories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/factories.png"));
		
	assemblyLineFactories.classification=2;
	assemblyLineFactories.costsWorker				= 3;
	assemblyLineFactories.goodsOutput.modifier 		= 4;
	assemblyLineFactories.ecoDamageWorker.modifier			= 0.75;
	assemblyLineFactories.technology				= Technology.assemblyLine;
	assemblyLineFactories.upgradedBy.add(roboticFactories);
	assemblyLineFactories.upgradedBy.add(naniteFactories);
	assemblyLineFactories.upgradedBy.add(replicatorFactories);
	assemblyLineFactories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/assemblyLineFactories.png"));
		
	roboticFactories.classification=2;
	roboticFactories.costsWorker					= 10;
	roboticFactories.goodsOutput.modifier				= 8;
	roboticFactories.ecoDamageWorker.modifier				= 0.5;
	roboticFactories.technology						= Technology.industrialRobots;
	roboticFactories.upgradedBy.add(naniteFactories);
	roboticFactories.upgradedBy.add(replicatorFactories);	
	roboticFactories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/roboticFactories.png"));
		
	naniteFactories.classification=2;
	naniteFactories.costsWorker						= 30;
	naniteFactories.goodsOutput.modifier				= 16;
	naniteFactories.ecoDamageWorker.modifier					= 0.25;
	naniteFactories.technology						= Technology.industrialNanites;
	naniteFactories.upgradedBy.add(replicatorFactories);
	naniteFactories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/naniteFactories.png"));
		
	replicatorFactories.classification=2;
	replicatorFactories.costsWorker					= 100;
	replicatorFactories.goodsOutput.modifier			= 32;
	replicatorFactories.technology					= Technology.industrialReplicators;
	replicatorFactories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/replicatorFactories.png"));
		
	lightIndustries.classification=2;
	lightIndustries.costsWorker						= 1;
	lightIndustries.goodsOutput.modifier				= 1;
	lightIndustries.technology						= Technology.electricalEngineering; 
	lightIndustries.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/lightIndustries.png"));
	
	//Education & Research XXX
	
	schools.classification=3;
	schools.workersPublic.modifier							= 0.01;
	schools.qualification.modifier							= 0.50;
	schools.mood.modifier								= 0.02;
	schools.costsPopulation							= 1;
	schools.investmentRatio.modifier							= 0.05;
	schools.technology								= Technology.educationSystem;
	schools.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/schools.png"));
	schools.privateSector = false;
			
	universities.classification=3;
	universities.workersPublic.modifier						= 0.005;
	universities.qualification.modifier						= 0.50;
	universities.researchOutput.modifier				= 1.00;
	universities.costsPopulation					= 0.5;
	universities.investmentRatio.modifier					= 0.05;
	universities.technology							= Technology.educationSystem;
	universities.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/universities.png"));
	universities.privateSector = false;
		
	researchLaboratories.classification=3;
	researchLaboratories.researchOutput.modifier		= 2;
	researchLaboratories.costsResearcher		 	= 5;
	researchLaboratories.technology					= Technology.researchFacilities;
	researchLaboratories.upgradedBy.add(researchInstitutes);
	researchLaboratories.upgradedBy.add(researchAcademies);
	researchLaboratories.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/researchLaboratories.png"));
	researchLaboratories.privateSector = false;
		
	researchInstitutes.classification=3;
	researchInstitutes.researchOutput.modifier			= 4;
	researchInstitutes.costsResearcher				= 10;
	researchInstitutes.technology					= Technology.researchInstitutes; 
	researchInstitutes.upgradedBy.add(researchAcademies);
	researchInstitutes.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/researchInstitutes.png"));
	researchInstitutes.privateSector = false;
	
	researchAcademies.classification=3;
	researchAcademies.researchOutput.modifier 			= 8;
	researchAcademies.costsResearcher				= 20;
	researchAcademies.technology					= Technology.researchAcademies;
	researchAcademies.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/researchAcademies.png"));
	researchAcademies.privateSector = false;
		
	thinkTanks.classification=3;
	thinkTanks.researchOutput.modifier 				= 16;
	thinkTanks.costsResearcher						= 40;
	thinkTanks.technology							= Technology.thinkTanks;
	thinkTanks.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/researchAcademies.png"));
	thinkTanks.privateSector = false;
		
	testSites.classification=3;
	testSites.costsAbsolute							= 200;
	testSites.researchOutput.modifier					= 0.5;
	testSites.mood.modifier								= -0.05;
	testSites.technology							= Technology.rocketry;
	testSites.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/superCollider.png"));
	testSites.privateSector = false;
		
	superCollider.classification=3;
	superCollider.costsAbsolute						= 100;
	superCollider.researchOutput.modifier				= 0.2;
	superCollider.technology						= Technology.superColliders;
	superCollider.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/superCollider.png"));
	superCollider.privateSector = false;
		
	//orbitalResearchStation.classification=3;
	//orbitalResearchStation.costsAbsolute			= 500; 
	//orbitalResearchStation.researchOutput.modifier 	= 0.2;
	//orbitalResearchStation.orbitalFacility			= true;
	//orbitalResearchStation.technology				= Technology.orbitalResearchStation;
	//orbitalResearchStation.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalResearchStation.png"));
	//orbitalResearchStation.privateSector = false;
		
	electronicSupercomputers.classification=3;
	electronicSupercomputers.costsResearcher		= 1;
	electronicSupercomputers.researchOutput.modifier 	= 0.5;
	electronicSupercomputers.technology				= Technology.electronicComputers;
	electronicSupercomputers.upgradedBy.add(opticSupercomputers);
	electronicSupercomputers.upgradedBy.add(quantumSupercomputers);	
	electronicSupercomputers.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/electronicSupercomputers.png"));
	electronicSupercomputers.privateSector = false;
		
	opticSupercomputers.classification=3;
	opticSupercomputers.costsResearcher			= 3.5;
	opticSupercomputers.researchOutput.modifier 	= 1.0;
	opticSupercomputers.technology		= Technology.optronicComputers;
	opticSupercomputers.upgradedBy.add(quantumSupercomputers);	
	opticSupercomputers.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/opticSupercomputers.png"));
	opticSupercomputers.privateSector = false;
		
	quantumSupercomputers.classification=3;
	quantumSupercomputers.costsResearcher			= 10;
	quantumSupercomputers.researchOutput.modifier 		= 1.5;
	quantumSupercomputers.technology		= Technology.quantumComputers;
	quantumSupercomputers.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/quantumSupercomputers.png"));
	quantumSupercomputers.privateSector = false;
		
	// Services XXX
	broadcastingStations.classification=4;
	broadcastingStations.workersPublic.modifier					= 0.0003;
	broadcastingStations.costsPopulation				= 0.25;
	broadcastingStations.serviceSector.modifier				= 0.01;
	broadcastingStations.serviceSector.modifier				= 0.01;
	broadcastingStations.mood.modifier						= 0.01;
	broadcastingStations.technology						= Technology.broadcastingStations;
	broadcastingStations.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/broadcastingStations.png"));
		
	banks.classification=4;
	banks.costsPopulation							= 0.1;
	banks.serviceSector.modifier						= 0.02;
	banks.serviceSector.modifier							= 0.01;
	banks.investmentRatio.modifier							= 0.05;
	banks.technology								= Technology.bankingSystem;
	banks.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/banks.png"));
		
	stockExchanges.classification=4;
	stockExchanges.costsPopulation					= 0.1;
	stockExchanges.serviceSector.modifier				= 0.01;
	stockExchanges.serviceSector.modifier					= 0.005;
	stockExchanges.investmentRatio.modifier					= 0.05;
	stockExchanges.technology						= Technology.financialMarket;
	stockExchanges.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/stockExchanges.png"));
		
	insuranceCompanies.classification=4;
	insuranceCompanies.costsPopulation				= 0.1;
	insuranceCompanies.serviceSector.modifier			= 0.02;
	insuranceCompanies.serviceSector.modifier				= 0.01;
	insuranceCompanies.investmentRatio.modifier				= 0.05;
	insuranceCompanies.technology					= Technology.insurances;
	insuranceCompanies.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/insuranceCompanies.png"));
		
	vacationResorts.classification=4;
	vacationResorts.costsPopulation					= 0.5;
	vacationResorts.serviceSector.modifier				= 0.05;
	vacationResorts.serviceSector.modifier				    = 0.05;
	vacationResorts.mood.modifier						= 0.05;
	vacationResorts.habitable						= true;
	vacationResorts.technology						= Technology.vacationIndustry;
	vacationResorts.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/vacationResorts.png"));
		
	
	markets.classification=4;
	markets.costsPopulation					= 0.25;
	markets.serviceSector.modifier				= 0.025;
	markets.serviceSector.modifier				    = 0.025;
	markets.mood.modifier						= 0.025;
	markets.technology						= Technology.currency;
	markets.upgradedBy.add(shoppingCenters);
	markets.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/markets.png"));
	
	shoppingCenters.classification=4;
	shoppingCenters.costsPopulation					= 0.5;
	shoppingCenters.serviceSector.modifier				= 0.05;
	shoppingCenters.serviceSector.modifier				    = 0.05;
	shoppingCenters.mood.modifier						= 0.05;
	shoppingCenters.technology						= Technology.massConsumption;
	shoppingCenters.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/shoppingCenters.png"));
		
	// Transport / Services
	primitiveTransport.classification=4;
	primitiveTransport.costsPopulation					= 1;
	primitiveTransport.serviceSector.modifier				= 0.02;
	primitiveTransport.serviceSector.modifier					= 0.01;
	primitiveTransport.infrastructure.modifier					= 0.10;
	primitiveTransport.AOTypeAllowed.add(AOType.ocean);
	primitiveTransport.AOTypeAllowed.add(AOType.terran);
	primitiveTransport.AOTypeAllowed.add(AOType.steppe);
	primitiveTransport.AOTypeAllowed.add(AOType.desert);
	primitiveTransport.AOTypeAllowed.add(AOType.ammonia);
	primitiveTransport.upgradedBy.add(steamTransport);
	primitiveTransport.upgradedBy.add(combustionTransport);
	primitiveTransport.upgradedBy.add(electrifiedTransport);
	primitiveTransport.upgradedBy.add(gravityTransport);
	primitiveTransport.upgradedBy.add(teleporterTransport);
	primitiveTransport.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/primitiveTransport.png"));
	
	steamTransport.classification=4;
	steamTransport.costsPopulation					= 2;
	steamTransport.serviceSector.modifier				= 0.04;
	steamTransport.serviceSector.modifier					= 0.02;
	steamTransport.infrastructure.modifier					= 0.20;
	steamTransport.ecoDamagePopulation.modifier				= 1;
	steamTransport.technology						= Technology.steamEngines;
	steamTransport.AOTypeAllowed.add(AOType.ocean);
	steamTransport.AOTypeAllowed.add(AOType.terran);
	steamTransport.AOTypeAllowed.add(AOType.steppe);
	steamTransport.AOTypeAllowed.add(AOType.desert);
	steamTransport.upgradedBy.add(combustionTransport);
	steamTransport.upgradedBy.add(electrifiedTransport);
	steamTransport.upgradedBy.add(gravityTransport);
	steamTransport.upgradedBy.add(teleporterTransport);
	steamTransport.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/steamTransport.png"));
		
	combustionTransport.classification=4;
	combustionTransport.costsPopulation				= 4;
	combustionTransport.serviceSector.modifier			= 0.08;
	combustionTransport.serviceSector.modifier				= 0.04;
	combustionTransport.infrastructure.modifier				= 0.30;
	combustionTransport.ecoDamagePopulation.modifier			= 0.5;
	combustionTransport.technology					= Technology.combustionEngines;
	combustionTransport.AOTypeAllowed.add(AOType.ocean);
	combustionTransport.AOTypeAllowed.add(AOType.terran);
	combustionTransport.AOTypeAllowed.add(AOType.steppe);
	combustionTransport.AOTypeAllowed.add(AOType.desert);
	combustionTransport.upgradedBy.add(electrifiedTransport);
	combustionTransport.upgradedBy.add(gravityTransport);
	combustionTransport.upgradedBy.add(teleporterTransport);
	combustionTransport.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/combustionTransport.png"));
		
	electrifiedTransport.classification=4;
	electrifiedTransport.costsPopulation			= 6;
	electrifiedTransport.serviceSector.modifier			= 0.08;
	electrifiedTransport.serviceSector.modifier			= 0.04;
	electrifiedTransport.infrastructure.modifier				= 0.30;
	electrifiedTransport.technology					= Technology.superConductors;
	electrifiedTransport.upgradedBy.add(gravityTransport);
	electrifiedTransport.upgradedBy.add(teleporterTransport);
	electrifiedTransport.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/electrifiedTransport.png"));
		
	gravityTransport.classification=4;
	gravityTransport.costsPopulation				= 8;
	gravityTransport.serviceSector.modifier			= 0.1;
	gravityTransport.serviceSector.modifier				= 0.05;
	gravityTransport.infrastructure.modifier				= 0.40;
	gravityTransport.technology					= Technology.gravitationDrive;
	gravityTransport.upgradedBy.add(teleporterTransport);
	gravityTransport.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/gravityTransport.png")); 
		
	teleporterTransport.classification=4;
	teleporterTransport.costsPopulation				= 10;
	teleporterTransport.serviceSector.modifier			= 0.12;
	teleporterTransport.serviceSector.modifier				= 0.06;
	teleporterTransport.infrastructure.modifier				= 0.5;
	teleporterTransport.technology					= Technology.personnelTeleporters;
	teleporterTransport.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/teleporterTransport.png"));
		
	communicationNetworks.classification=4;
	communicationNetworks.costsPopulation			= 1;
	communicationNetworks.serviceSector.modifier 		= 0.01;
	communicationNetworks.serviceSector.modifier 			= 0.01;
	communicationNetworks.infrastructure.modifier			= 0.05;
	communicationNetworks.researchOutput.modifier		= 0.25;
	communicationNetworks.technology				= Technology.telecommunication;
	communicationNetworks.upgradedBy.add(dataNetworks);
	communicationNetworks.upgradedBy.add(quantumNetworks);
	communicationNetworks.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/communicationNetworks.png"));
		
	dataNetworks.classification=4;
	dataNetworks.costsPopulation					= 2;
	dataNetworks.serviceSector.modifier 				= 0.02;
	dataNetworks.serviceSector.modifier 					= 0.02;
	dataNetworks.infrastructure.modifier						= 0.1;
	dataNetworks.researchOutput.modifier				= 0.50;
	dataNetworks.technology							= Technology.dataNetworks;
	dataNetworks.upgradedBy.add(quantumNetworks);
	dataNetworks.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/dataNetworks.png"));
		
	quantumNetworks.classification=4;
	quantumNetworks.costsPopulation					= 4;
	quantumNetworks.serviceSector.modifier 				= 0.02;
	quantumNetworks.serviceSector.modifier 				= 0.03;
	quantumNetworks.infrastructure.modifier					= 0.15;
	quantumNetworks.researchOutput.modifier			= 1;
	quantumNetworks.technology						= Technology.quantumCommunication;
	quantumNetworks.upgradedBy.add(quantumNetworks);
	quantumNetworks.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/quantumNetworks.png"));
		
	primitiveDwellings.classification=4;
	primitiveDwellings.costsPopulation				= 1;
	primitiveDwellings.serviceSector.modifier			= 0.15;
	primitiveDwellings.serviceSector.modifier				= 0.02;
	primitiveDwellings.mood.modifier						= 0.05;
	primitiveDwellings.mortalityRate.modifier					= -0.0005;
	primitiveDwellings.technology					= Technology.tools;
	primitiveDwellings.upgradedBy.add(modernDwellings);
	primitiveDwellings.upgradedBy.add(residentialTowers);
	primitiveDwellings.upgradedBy.add(arcologies);
	primitiveDwellings.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/primitiveDwellings.png"));
		
	modernDwellings.classification=4;
	modernDwellings.costsPopulation				= 2;
	modernDwellings.serviceSector.modifier			= 0.2;
	modernDwellings.serviceSector.modifier				= 0.03;
	modernDwellings.mood.modifier					= 0.10;
	modernDwellings.mortalityRate.modifier					= -0.001;
	modernDwellings.ecoDamagePopulation.modifier			= -0.1;
	modernDwellings.technology					= Technology.electricalEngineering;
	modernDwellings.upgradedBy.add(residentialTowers);
	modernDwellings.upgradedBy.add(arcologies);
	modernDwellings.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/modernDwellings.png"));
		
	residentialTowers.classification=4;
	residentialTowers.costsPopulation			= 3;
	residentialTowers.minPopPerLevel			= 1;
	residentialTowers.serviceSector.modifier		= 0.25;
	residentialTowers.serviceSector.modifier			= 0.04;
	residentialTowers.mood.modifier					= 0.10;
	residentialTowers.mortalityRate.modifier					= -0.001;
	residentialTowers.ecoDamagePopulation.modifier		= -0.2;
	residentialTowers.technology				= Technology.skyscrapers;
	residentialTowers.upgradedBy.add(arcologies);
	residentialTowers.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/residentialTowers.png"));
		
	arcologies.classification=4;
	arcologies.costsPopulation					= 4;
	arcologies.minPopPerLevel					= 1;
	arcologies.serviceSector.modifier				= 0.3;
	arcologies.serviceSector.modifier					= 0.05;
	arcologies.mood.modifier							= 0.10;
	arcologies.mortalityRate.modifier						= -0.001;
	arcologies.ecoDamagePopulation.modifier				= -0.3;
	arcologies.technology						= Technology.arcologies;
	arcologies.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/arcologies.png"));
		
	spacePorts.classification=4;
	spacePorts.costsPopulation						= 0.25;
	spacePorts.exportCosts.modifier			= -0.2;
	spacePorts.technology							= Technology.reusableLaunchSystem;
	spacePorts.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/spacePorts.png"));
		
	spaceElevators.classification=4;
	spaceElevators.costsPopulation					= 0.5;
	spaceElevators.exportCosts.modifier		= -0.4;
	spaceElevators.orbitalFacility					= true;
	spaceElevators.technology						= Technology.spaceElevators;
	spaceElevators.upgradedBy.add(gravElevators);
	spaceElevators.upgradedBy.add(orbitalTeleporters);
	spaceElevators.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/spaceElevators.png"));
		
	gravElevators.classification=4;
	gravElevators.costsPopulation					= 0.5;
	gravElevators.exportCosts.modifier		= -0.6;
	gravElevators.orbitalFacility					= true;
	gravElevators.technology						= Technology.spaceElevators;
	gravElevators.upgradedBy.add(orbitalTeleporters);
	gravElevators.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/gravElevators.png"));
		
	orbitalTeleporters.classification=4;
	orbitalTeleporters.costsPopulation				= 1;
	orbitalTeleporters.exportCosts.modifier	= -0.8;
	orbitalTeleporters.technology					= Technology.teleportation;
	orbitalTeleporters.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalTeleporters.png"));
		
	// Administration XXX
	
	centralGovernment.classification=5;
	centralGovernment.costsAbsolute				= 50;
	centralGovernment.militaryPersonnel.modifier			= 0.01;
	centralGovernment.technology					= Technology.globalOrganisations;
	centralGovernment.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/centralGovernment.png"));
	centralGovernment.privateSector = false;
		
	localGovernment.classification=5;
	localGovernment.costsPopulation				= 0.001;	
	localGovernment.workersPublic.modifier					= 0.01; 
	localGovernment.administration.modifier				= 0.2;
	localGovernment.technology						= Technology.legislation;
	localGovernment.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/localGovernment.png"));
	localGovernment.privateSector = false;
		
	policeDepartments.classification=5;
	policeDepartments.costsPopulation				= 0.05;
	policeDepartments.workersPublic.modifier					= 0.003;
	policeDepartments.mood.modifier						= 0.02;
	policeDepartments.administration.modifier				= 0.10;
	policeDepartments.counterintelligence.modifier			= 0.1;
	policeDepartments.riot.modifier						= -0.02;
	policeDepartments.investmentRatio.modifier				= 0.05;
	policeDepartments.technology					= Technology.judicialSystem;
	policeDepartments.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/policeDepartments.png"));
	policeDepartments.privateSector = false;
		
	secretService.classification=5;
	secretService.workersPublic.modifier						= 0.001;
	secretService.mood.modifier							= -0.01;
	secretService.administration.modifier					= 0.10;
	secretService.counterintelligence.modifier				= 1;
	secretService.riot.modifier							= -0.05;
	secretService.costsPopulation					= 0.025;
	secretService.technology						= Technology.counterespionage;
	secretService.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/secretService.png")); //XXX
	secretService.privateSector = false;
		
	environmentalAgency.classification=5;
	environmentalAgency.workersPublic.modifier			= 0.001;
	environmentalAgency.costsPopulation		= 0.05;
	environmentalAgency.ecoDamagePopulation.modifier 	= -0.1;
	environmentalAgency.foodOutput.modifier		= -0.1;
	environmentalAgency.ecoDamageFarmer.modifier		= -0.35;
	environmentalAgency.resourcesOutput.modifier	= -0.1;
	environmentalAgency.ecoDamageMiner.modifier			= -0.35;
	environmentalAgency.goodsOutput.modifier		= -0.1;
	environmentalAgency.ecoDamageWorker.modifier		= -0.35;
	environmentalAgency.technology				= Technology.environmentalAgency;
	environmentalAgency.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/environmentalAgency.png"));
	environmentalAgency.privateSector = false;
		
	revenueService.classification=5;
	revenueService.workersPublic.modifier			= 0.001;
	revenueService.costsPopulation					= 0.1;
	revenueService.administration.modifier			= 0.5;
	revenueService.mood.modifier					= -0.10;
	revenueService.technology						= Technology.administrativeAccounting;
	revenueService.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/revenueService.png"));
	revenueService.privateSector = false;
		
	gravGenerators.classification=5;
	gravGenerators.costsPopulation 					= 10;
//	gravGenerators.gravEffects.modifier				= -1.0;
	gravGenerators.technology						= Technology.gravGenerators;
	gravGenerators.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/gravGenerators.png"));
	gravGenerators.privateSector = false;
		
	hospitals.classification=5;
	hospitals.workersPublic.modifier							= 0.02;
	hospitals.costsPopulation						= 1;
	hospitals.mortalityRate.modifier								= -0.001;	
	hospitals.mood.modifier								= 0.02;
	hospitals.technology							= Technology.antibiotics;
	hospitals.upgradedBy.add(geneticHospitals);	
	hospitals.upgradedBy.add(naniteHospitals);
	hospitals.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/hospitals.png"));
	hospitals.privateSector = false;
		
	geneticHospitals.classification=5;
	geneticHospitals.workersPublic.modifier					= 0.02;
	geneticHospitals.costsPopulation				= 3;
	geneticHospitals.mortalityRate.modifier						= -0.002;
	geneticHospitals.birthRate.modifier						= 0.0005;
	geneticHospitals.mood.modifier						= 0.03;
	geneticHospitals.technology						= Technology.geneTherapy;
	geneticHospitals.upgradedBy.add(naniteHospitals);
	geneticHospitals.supressedSpecials.add(AOSpecial.pathogens);
	geneticHospitals.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/geneticHospitals.png")); //XXX
	geneticHospitals.privateSector = false;
		
	naniteHospitals.classification=5;
	naniteHospitals.workersPublic.modifier					= 0.02;
	naniteHospitals.costsPopulation					= 10;
	naniteHospitals.mortalityRate.modifier						= -0.003;
	naniteHospitals.birthRate.modifier					= 0.001;
	naniteHospitals.mood.modifier						= 0.04;
	naniteHospitals.technology						= Technology.nanoSurgery;
	naniteHospitals.supressedSpecials.add(AOSpecial.pathogens);
	naniteHospitals.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/naniteHospitals.png")); //XXX
	naniteHospitals.privateSector = false;
		
	natureReserves.classification=5;
	natureReserves.workersPublic.modifier					= 0.001;
	natureReserves.potentialFarmers.modifier					= -0.2;
	natureReserves.ecoDamageFarmer.modifier					= -0.2;
	natureReserves.resourcesOutput.modifier			= -0.2;
	natureReserves.researchOutput.modifier				= 0.01;
	natureReserves.ecoDamageMiner.modifier					= -0.25;
	natureReserves.ecoDamagePopulation.modifier				= -0.35;
	natureReserves.costsPopulation					= 0.5;
	natureReserves.technology						= Technology.ecology;
	natureReserves.AOTypeAllowed.add(AOType.ocean);
	natureReserves.AOTypeAllowed.add(AOType.terran);
	natureReserves.AOTypeAllowed.add(AOType.steppe);
	natureReserves.AOTypeAllowed.add(AOType.desert);
	natureReserves.AOTypeAllowed.add(AOType.ammonia);
	natureReserves.supressedSpecials.add(AOSpecial.subterraneanAnimals);
	natureReserves.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/natureReserves.png"));
	natureReserves.privateSector = false;
		
	ecosphereDomes.classification=5;
	ecosphereDomes.workersPublic.modifier					= 0.001;
	ecosphereDomes.mood.modifier							= 0.05;
	ecosphereDomes.costsPopulation					= 10;
	ecosphereDomes.serviceSector.modifier				= 0.01;
	ecosphereDomes.serviceSector.modifier					= 0.01;
	ecosphereDomes.technology						= Technology.artificialEcosystems;
	ecosphereDomes.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/ecosphereDomes.png"));
	ecosphereDomes.privateSector = false;
		
	orbitalHabitats.classification=5;
	orbitalHabitats.costsAbsolute					= 1000;
	orbitalHabitats.shipyardCapacity.modifier					= 100;
	orbitalHabitats.orbitalWorkers.modifier					= 50000;
	orbitalHabitats.orbitalFacility					= true;
	orbitalHabitats.technology						= Technology.orbitalHabitats;
	orbitalHabitats.privateSector = false;
		
	orbitalCities.classification=5;
	orbitalCities.costsAbsolute						= 10000;
	orbitalCities.shipyardCapacity.modifier		= 1000;
	orbitalCities.orbitalWorkers.modifier		= 1000000;
	orbitalCities.orbitalFacility						= true;
	orbitalCities.technology							= Technology.orbitalCities;
	orbitalCities.privateSector = false;
	
		

	// Military XXX
	
	orbitalShipyards.classification=6;
	orbitalShipyards.costsAbsolute					= 1000;
	orbitalShipyards.shipyardCapacity.modifier		= 1000;
	orbitalShipyards.orbitalWorkersDemand.modifier	= 10000;
	orbitalShipyards.orbitalFacility					= true;
	orbitalShipyards.technology						= Technology.orbitalShipyards;
	orbitalShipyards.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalShipyards.png"));
	orbitalShipyards.privateSector = false;
		
	militiaForces.classification=6;
	militiaForces.costsPopulation  					= 1;
	militiaForces.riot.modifier  				= 0.1;
	militiaForces.technology						= Technology.militiaSystem;
	militiaForces.supressedSpecials.add(AOSpecial.alienPredator);
	militiaForces.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/militiaForces.png"));
	militiaForces.privateSector = false;
		
	armyBases.classification=6;
	armyBases.costsAbsolute 							= 10;
	armyBases.levels		 							= 100;
	armyBases.minPopPerLevel							= 100;
	armyBases.militaryPersonnel.modifier  				= 2;
	armyBases.armySupport.modifier						= 1;
	armyBases.armyExperience.modifier							= 1;
	armyBases.technology								= Technology.regularArmy;
	armyBases.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/armyBases.png"));
	armyBases.privateSector = false;
		
	missileBases.classification=6;
	missileBases.costsAbsolute						= 10;
	missileBases.levels		 						= 100;
	missileBases.militaryPersonnel.modifier  					= 0.01;
	missileBases.minPopPerLevel						= 1;
	missileBases.technology							= Technology.guidedMissiles;
	missileBases.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/missileBases.png"));
	missileBases.privateSector = false;
		
	fighterBases.classification=6;
	fighterBases.costsAbsolute						= 10;
	fighterBases.levels								= 100;
	fighterBases.militaryPersonnel.modifier  					= 0.001;
	fighterBases.minPopPerLevel						= 0.1;
	fighterBases.technology							= Technology.spaceFighters;
	fighterBases.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fighterBases.png"));
	fighterBases.privateSector = false;
		
	defenseSatellites.classification=6;
	defenseSatellites.costsAbsolute				= 100;
	defenseSatellites.orbitalFacility			= true;
	defenseSatellites.technology					= Technology.defenseSatellites;
	defenseSatellites.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/defenseSatellites.png"));
	defenseSatellites.privateSector = false;
		
	orbitalBattery.classification=6;
	orbitalBattery.costsAbsolute					= 10;
	orbitalBattery.levels							= 100;	
	orbitalBattery.militaryPersonnel.modifier  				= 0.001;
	orbitalBattery.minPopPerLevel					= 0.1;
	orbitalBattery.technology						= Technology.orbitalBatteries;
	orbitalBattery.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/orbitalBattery.png"));
	orbitalBattery.privateSector = false;
	
	armyAcademy.classification=6;
	armyAcademy.costsAbsolute						= 10;
	armyAcademy.levels								= 100;
	armyAcademy.minPopPerLevel						= 1;
	armyAcademy.militaryPersonnel.modifier					= 0.01;
	armyAcademy.armyExperience.modifier						= 1;
	armyAcademy.technology							= Technology.militaryEducation;
	armyAcademy.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/armyAcademy.png"));
	armyAcademy.privateSector = false;
		
	fleetAcademy.classification=6;
	fleetAcademy.costsAbsolute						= 10;
	fleetAcademy.levels								= 100;
	fleetAcademy.minPopPerLevel						= 1;									
	fleetAcademy.militaryPersonnel.modifier			= 0.01;	
	fleetAcademy.fleetExperience.modifier			= 1;
	fleetAcademy.technology							= Technology.starfleetEducation;
	fleetAcademy.icon = new ImageIcon(GraphicFU.class.getResource("BuildingIcons/fleetAcademy.png"));
	fleetAcademy.privateSector = false;
	}
 }