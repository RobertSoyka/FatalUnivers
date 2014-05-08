package FUPackage;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Technology implements IGeneralData{

public static Set<Technology>technologies = new LinkedHashSet<Technology>();	
	
public String name;
public String description;
public Icon icon;
public int category; // Biology(0), Chemistry(1), Physics(2), Construction(3), Informatic(4), Social(5)  
public double costs						= 1000;
public boolean application = false;

Set<Technology> requiredTechnology = new LinkedHashSet<Technology>();

Set<Technology> allowsTechnology = new LinkedHashSet<Technology>();
Set<BuildingType> allowsBuilding = new LinkedHashSet<BuildingType>();

int positionX					= 0;
int positionY					= 0;


double foodPotential			= 0;
double resourcesProduction		= 0;
double goodsProduction			= 0;
double serviceProduction		= 0;
double researchProduction		= 0;
double qualification			= 0;

double resourceConsumption		= 0;
double pollution				= 0;
double atmosphereConversion		= 0; 
double buerocracy				= 0;


// BASIC TECHNOLOGY 

// static Technology none						= new Technology(true, 8, language., language._description, GraphicFU.qMarkIcon);




// Primary Techs XXX
static Technology agriculture				= new Technology(false, 0, new Technology[]{},language.agriculture, language.agriculture_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/agriculture.png")));
static Technology miningTechniques			= new Technology(false, 1, new Technology[]{},language.miningTechniques, language.miningTechniques_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/miningTechniques.png")));

static Technology construction				= new Technology(false, 3, new Technology[]{},language.construction, language.construction_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/construction.png")));

static Technology literacy					= new Technology(false, 4, new Technology[]{},language.literacy, language.literacy_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/literacy.png")));

//Stone Age
static Technology breeding					= new Technology(false, 0, new Technology[]{agriculture},language.breeding, language.breeding_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/breeding.png")));
static Technology ironworking				= new Technology(false, 1, new Technology[]{miningTechniques},language.ironworking, language.ironworking_description,  new ImageIcon(GraphicFU.class.getResource("TechIcons/ironworking.png")));
static Technology mathematics				= new Technology(false, 4, new Technology[]{literacy},language.mathematics, language.mathematics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/mathematics.png")));



// ANCIENT  AGE XXX
static Technology mechanics					= new Technology(false, 2, new Technology[]{mathematics},language.mechanics, language.mechanics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/mechanics.png")));

static Technology constructionPlanning		= new Technology(false, 3, new Technology[]{construction, mathematics},language.constructionPlanning, language.constructionPlanning_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/constructionPlanning.png")));
static Technology scientificMethod			= new Technology(false, 4, new Technology[]{mathematics},language.scientificMethod, language.scientificMethod_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/scientificMethod.png")));

//
static Technology optics					= new Technology(false, 2, new Technology[]{scientificMethod},language.optics, language.optics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/optics.png")));
static Technology microBiology				= new Technology(false, 0, new Technology[]{optics},language.microBiology, language.microBiology_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/microBiology.png")));

static Technology chemistry					= new Technology(false, 1, new Technology[]{ironworking, scientificMethod},language.chemistry, language.chemistry_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/chemistry.png")));



static Technology engineering				= new Technology(false, 3, new Technology[]{mechanics, constructionPlanning},language.engineering, language.engineering_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/engineering.png")));


// Industrial AGE XXX
static Technology fossilFuels				= new Technology(false, 1, new Technology[]{ironworking},language.fossilFuels, language.fossilFuels_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/fossilFuels.png")));
static Technology metallurgy				= new Technology(false, 1, new Technology[]{fossilFuels},language.metallurgy, language.metallurgy_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/metallurgy.png")));

static Technology organicChemistry			= new Technology(false, 1, new Technology[]{chemistry, fossilFuels},language.organicChemistry, language.organicChemistry_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/organicChemistry.png")));
static Technology inorganicChemistry		= new Technology(false, 1, new Technology[]{chemistry, metallurgy},language.inorganicChemistry, language.inorganicChemistry_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/inorganicChemistry.png")));

static Technology evolutionaryBiology		= new Technology(false, 0, new Technology[]{breeding, scientificMethod},language.evolutionaryBiology, language.evolutionaryBiology_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/evolutionaryBiology.png")));
static Technology biologicalChemistry		= new Technology(false, 0, new Technology[]{microBiology, organicChemistry},language.biologicalChemistry, language.biologicalChemistry_description, GraphicFU.qMarkIcon);
static Technology ecology					= new Technology(false, 0, new Technology[]{evolutionaryBiology, microBiology},language.ecology, language.ecology_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/ecology.png")));


static Technology electromagnetism			= new Technology(false, 2, new Technology[]{ironworking, scientificMethod},language.electromagnetism, language.electromagnetism_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/electromagnetism.png")));
//static Technology thermodynamics			= new Technology(false, 2, new Technology[]{scientificMethod},language.thermodynamics, language.thermodynamics_description, GraphicFU.qMarkIcon);
static Technology mechanisation				= new Technology(false, 3, new Technology[]{engineering, metallurgy},language.mechanisation, language.mechanisation_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/mechanisation.png")));

static Technology electricalEngineering		= new Technology(false, 3, new Technology[]{electromagnetism, metallurgy, engineering},language.electricalEngineering, language.electricalEngineering_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/electricalEngineering.png")));
static Technology relativity				= new Technology(false, 2, new Technology[]{mechanics, optics, electromagnetism},language.relativity, language.relativity_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/relativity.png")));


// Nuclear AGE XXX 


// static Technology quantumPhysics			= new Technology(false, 2, new Technology[]{electromagnetism, optics},language.quantumPhysics, language.quantumPhysics_description, GraphicFU.qMarkIcon); // new ImageIcon(GraphicFU.class.getResource("TechIcons/quantumPhysics"))
static Technology quantumPhysics			= new Technology(false, 2, new Technology[]{electromagnetism, optics},language.quantumPhysics, language.quantumPhysics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/quantumPhysics.png")));
// static Technology physicalChemistry			= new Technology(false, 1, new Technology[]{quantumPhysics},language.physicalChemistry, language.physicalChemistry_description, );
static Technology nuclearPhysics			= new Technology(false, 2, new Technology[]{quantumPhysics},language.nuclearPhysics, language.nuclearPhysics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/nuclearPhysics.png")));


static Technology molecularBiology			= new Technology(false, 0, new Technology[]{biologicalChemistry, evolutionaryBiology},language.molecularBiology, language.molecularBiology_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/molecularBiology.png")));

static Technology telecommunication			= new Technology(false, 4, new Technology[]{electromagnetism},language.telecommunication, language.telecommunication_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/telecommunication.png")));
static Technology radioEngineering			= new Technology(false, 4, new Technology[]{telecommunication, electricalEngineering},language.radioEngineering, language.radioEngineering_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/radioEngineering.png")));


static Technology electricControlSystems	= new Technology(false, 4, new Technology[]{mechanisation, electricalEngineering},language.electricControlSystems, language.electricControlSystems_description, GraphicFU.qMarkIcon);
static Technology semiconductors			= new Technology(false, 1, new Technology[]{inorganicChemistry, electricalEngineering, quantumPhysics},language.semiconductors, language.semiconductors_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/semiconductors.png")));
static Technology microelectronics			= new Technology(false, 4, new Technology[]{semiconductors, electricControlSystems},language.microelectronics, language.microelectronics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/microelectronics.png")));



static Technology automation				= new Technology(false, 3, new Technology[]{mechanisation, electricControlSystems, electricalEngineering},language.automation, language.automation_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/automation.png")));
static Technology compositeMaterials		= new Technology(false, 1, new Technology[]{organicChemistry, inorganicChemistry},language.compositeMaterials, language.compositeMaterials_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/compositeMaterials.png")));


// Early Space age

static Technology rocketry					= new Technology(false, 3, new Technology[]{electricalEngineering, inorganicChemistry},language.rocketry, language.rocketry_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/rocketry.png")));

static Technology robotics					= new Technology(false, 3, new Technology[]{automation, microelectronics},language.robotics, language.robotics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/microelectronics.png")));
static Technology orbitalConstruction		= new Technology(false, 3, new Technology[]{rocketry},language.orbitalConstruction, language.orbitalConstruction_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/orbitalConstruction.png")));


static Technology spaceColonization			= new Technology(false, 0, new Technology[]{rocketry,ecology},language.spaceColonization, language.spaceColonization_description, GraphicFU.qMarkIcon);
static Technology geneticEngineering		= new Technology(false, 0, new Technology[]{molecularBiology,microelectronics},language.geneticEngineering, language.geneticEngineering_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/geneticEngineering.png")));

static Technology artificialEcosystems		= new Technology(false, 0, new Technology[]{spaceColonization},language.artificialEcosystems, language.artificialEcosystems_description, GraphicFU.qMarkIcon);



static Technology quantumMechanics			= new Technology(false, 2, new Technology[]{quantumPhysics},language.quantumMechanics, language.quantumMechanics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/quantumMechanics.png")));
static Technology quantumFieldPhysics		= new Technology(false, 2, new Technology[]{quantumMechanics},language.quantumFieldPhysics, language.quantumFieldPhysics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/quantumFieldPhysics.png")));
static Technology lightAmplification		= new Technology(false, 2, new Technology[]{quantumMechanics},language.lightAmplification, language.lightAmplification_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/lightAmplification.png")));
static Technology quantumGravity			= new Technology(false, 2, new Technology[]{quantumFieldPhysics, relativity},language.quantumGravity, language.quantumGravity_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/quantumGravity.png")));
static Technology optronics					= new Technology(false, 4, new Technology[]{microelectronics, lightAmplification},language.optronics, language.optronics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/microelectronics.png")));

static Technology superConductors			= new Technology(false, 1, new Technology[]{quantumMechanics},language.superConductors, language.superConductors_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/superConductors.png")));
static Technology supraMagnets				= new Technology(false, 1, new Technology[]{superConductors},language.supraMagnets, language.supraMagnets_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/supraMagnets.png")));
static Technology superAccumulators			= new Technology(false, 1, new Technology[]{supraMagnets},language.superAccumulators, language.superAccumulators_description, GraphicFU.qMarkIcon);

static Technology nanoMaterials				= new Technology(false, 1, new Technology[]{quantumMechanics, compositeMaterials},language.nanoMaterials, language.nanoMaterials_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/nanoMaterials.png")));
static Technology metaMaterials				= new Technology(false, 1, new Technology[]{nanoMaterials},language.metaMaterials, language.metaMaterials_description, GraphicFU.qMarkIcon);
// MIDDLE SPACE AGE
static Technology molecularMachines		= new Technology(false, 3, new Technology[]{nanoMaterials, molecularBiology},language.molecularMachines, language.molecularMachines_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/molecularMachines.png")));
static Technology nanoRobotics				= new Technology(false, 3, new Technology[]{robotics, molecularMachines},language.nanoRobotics, language.nanoRobotics_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/nanoRobotics.png")));



static Technology superscalarConstruction	= new Technology(false, 3, new Technology[]{orbitalConstruction, robotics},language.superscalarConstruction, language.superscalarConstruction_description, GraphicFU.qMarkIcon);



static Technology grandUnifiedTheory		= new Technology(false, 2, new Technology[]{quantumGravity},language.grandUnifiedTheory, language.grandUnifiedTheory_description, GraphicFU.qMarkIcon);
static Technology theoryOfEverything		= new Technology(false, 2, new Technology[]{grandUnifiedTheory},language.theoryOfEverything, language.theoryOfEverything_description, GraphicFU.qMarkIcon);



static Technology astrobiology				= new Technology(false, 0, new Technology[]{geneticEngineering},language.astrobiology, language.astrobiology_description, GraphicFU.qMarkIcon);




static Technology adaptiveAlgorithms		= new Technology(false, 4, new Technology[]{optronics},language.adaptiveAlgorithms, language.adaptiveAlgorithms_description, GraphicFU.qMarkIcon);
static Technology virtualIntelligence		= new Technology(false, 4, new Technology[]{adaptiveAlgorithms},language.virtualIntelligence, language.virtualIntelligence_description, GraphicFU.qMarkIcon);




// LATE SPACE AGE
static Technology nanoSurgery				= new Technology(false, 0, new Technology[]{nanoRobotics},language.nanoSurgery, language.nanoSurgery_description, GraphicFU.qMarkIcon);
static Technology neuroImplantation			= new Technology(false, 0, new Technology[]{nanoSurgery},language.neuroImplantation, language.neuroImplantation_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/neuroImplantation.png")));
static Technology mindTransfer				= new Technology(false, 0, new Technology[]{neuroImplantation},language.mindTransfer, language.mindTransfer_description, GraphicFU.qMarkIcon);

static Technology subatomicManipulation		= new Technology(false, 2, new Technology[]{quantumGravity},language.subatomicManipulation, language.subatomicManipulation_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/subatomicManipulation.png")));
static Technology temporalMechanics			= new Technology(false, 2, new Technology[]{theoryOfEverything},language.temporalMechanics, language.temporalMechanics_description, GraphicFU.qMarkIcon);
static Technology quantumSingularities		= new Technology(false, 2, new Technology[]{temporalMechanics},language.quantumSingularities, language.quantumSingularities_description, GraphicFU.qMarkIcon);
static Technology antimatter				= new Technology(false, 1, new Technology[]{supraMagnets, subatomicManipulation},language.antimatter, language.antimatter_description, GraphicFU.qMarkIcon);

static Technology quantronics				= new Technology(false, 4, new Technology[]{optronics, subatomicManipulation},language.quantronics, language.quantronics_description, GraphicFU.qMarkIcon);
static Technology artificialIntelligence	= new Technology(false, 4, new Technology[]{virtualIntelligence,quantronics},language.artificialIntelligence, language.artificialIntelligence_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/artificialIntelligence.png")));

static Technology programmableMatter		= new Technology(false, 1, new Technology[]{metaMaterials,subatomicManipulation},language.programmableMatter, language.programmableMatter_description, GraphicFU.qMarkIcon);




static Technology holokineticProjection		= new Technology(false, 2, new Technology[]{theoryOfEverything},language.holokineticProjection, language.holokineticProjection_description, GraphicFU.qMarkIcon);
static Technology virtualMatter				= new Technology(false, 1, new Technology[]{holokineticProjection, programmableMatter},language.virtualMatter, language.virtualMatter_description, GraphicFU.qMarkIcon);
static Technology virtualMachines			= new Technology(false, 3, new Technology[]{virtualMatter},language.virtualMachines, language.virtualMachines_description, GraphicFU.qMarkIcon);
static Technology virtualComputers			= new Technology(false, 4, new Technology[]{virtualMachines, quantronics},language.virtualComputers, language.virtualComputers_description, GraphicFU.qMarkIcon);
static Technology virtualReactors			= new Technology(false, 2, new Technology[]{quantumSingularities, virtualMachines},language.virtualReactors, language.virtualReactors_description, GraphicFU.qMarkIcon);

static Technology avatar					= new Technology(false, 2, new Technology[]{mindTransfer, virtualComputers, virtualReactors},language.avatar, language.avatar_description, new ImageIcon(GraphicFU.class.getResource("TechIcons/avatar.png")));


// CIVIL APPLICATIONS XXX

static Technology tools						= new Technology(true, 3, new Technology[]{ironworking},language.tools, language.tools_description, GraphicFU.qMarkIcon);



static Technology legislation				= new Technology(true, 5, new Technology[]{literacy},language.legislation, language.legislation_description, BuildingType.localGovernment.icon);
static Technology currency					= new Technology(true, 5, new Technology[]{legislation, mathematics},language.currency, language.currency_description, BuildingType.markets.icon);
static Technology divisionOfLabour			= new Technology(true, 5, new Technology[]{},language.divisionOfLabour, language.divisionOfLabour_description, GraphicFU.qMarkIcon);

static Technology judicialSystem			= new Technology(true, 5, new Technology[]{legislation, divisionOfLabour},language.judicialSystem, language.judicialSystem_description, BuildingType.policeDepartments.icon);
static Technology educationSystem			= new Technology(true, 5, new Technology[]{mathematics},language.educationSystem, language.educationSystem_description, BuildingType.schools.icon);
static Technology academicEducation			= new Technology(true, 5, new Technology[]{educationSystem},language.academicEducation, language.academicEducation_description, BuildingType.universities.icon);
static Technology regularArmy				= new Technology(true, 5, new Technology[]{legislation, },language.regularArmy, language.regularArmy_description, BuildingType.armyBases.icon);

static Technology globalOrganisations		= new Technology(true, 5, new Technology[]{telecommunication},language.globalOrganisations, language.globalOrganisations_description, BuildingType.centralGovernment.icon);
static Technology globalisation				= new Technology(true, 5, new Technology[]{globalOrganisations},language.globalisation, language.globalisation_description, GraphicFU.qMarkIcon);
static Technology galacticSociology			= new Technology(true, 5, new Technology[]{},language.galacticSociology, language.galacticSociology_description, GraphicFU.qMarkIcon);

static Technology counterespionage			= new Technology(true, 5, new Technology[]{judicialSystem},language.counterespionage, language.counterespionage_description, BuildingType.secretService.icon);
static Technology administrativeAccounting	= new Technology(true, 4, new Technology[]{currency},language.administrativeAccounting, language.administrativeAccounting_description, BuildingType.revenueService.icon);


//BUILDINGS XXX


static Technology bankingSystem				= new Technology(true, 5, new Technology[]{administrativeAccounting},language.bankingSystem, language.bankingSystem_description, BuildingType.banks.icon);
static Technology financialMarket			= new Technology(true, 5, new Technology[]{bankingSystem},language.financialMarket, language.financialMarket_description, BuildingType.stockExchanges.icon);
static Technology insurances				= new Technology(true, 5, new Technology[]{bankingSystem},language.insurances, language.insurances_description, BuildingType.insuranceCompanies.icon);

// static Technology carbonNanotubes			= new Technology(true, 6, new Technology[]{nanoMaterials},language.carbonNanotubes, language.carbonNanotubes_description, GraphicFU.qMarkIcon);
static Technology artificialFertilizer		= new Technology(true, 1, new Technology[]{organicChemistry},language.artificialFertilizer, language.artificialFertilizer_description, BuildingType.fertilizerFactories.icon);
//static Technology cloning					= new Technology(true, 0, new Technology[]{geneticEngineering},language.cloning, language.cloning_description, GraphicFU.qMarkIcon);
static Technology agrogenetics				= new Technology(true, 0, new Technology[]{geneticEngineering},language.agrogenetics, language.agrogenetics_description, BuildingType.agrogeneticLaboratories.icon);

//static Technology behavioralBiology 		= new Technology(true, 0, new Technology[]{biology},language.behavioralBiology, language.behavioralBiology_description, GraphicFU.qMarkIcon);
//static Technology psychology				= new Technology(true, 1, new Technology[]{behavioralBiology},language.psychology, language.psychology_description, GraphicFU.qMarkIcon);
static Technology antibiotics				= new Technology(true, 0, new Technology[]{biologicalChemistry},language.antibiotics, language.antibiotics_description, BuildingType.hospitals.icon);
static Technology geneTherapy				= new Technology(true, 0, new Technology[]{geneticEngineering},language.geneTherapy, language.geneTherapy_description, BuildingType.geneticHospitals.icon);
static Technology roboticSurgery			= new Technology(true, 0, new Technology[]{robotics},language.roboticSurgery, language.roboticSurgery_description, GraphicFU.qMarkIcon);
// static Technology neuralAnalysis			= new Technology(true, 0, new Technology[]{},language.neuralAnalysis, language.neuralAnalysis_description, GraphicFU.qMarkIcon);

static Technology blastFurnances			= new Technology(true, 1, new Technology[]{ironworking},language.blastFurnances, language.blastFurnances_description, BuildingType.blastFurnances.icon);
static Technology heavyIndustries			= new Technology(true, 1, new Technology[]{blastFurnances, metallurgy, engineering},language.heavyIndustries, language.heavyIndustries_description, BuildingType.heavyIndustries.icon);

static Technology steamEngines				= new Technology(true, 3, new Technology[]{engineering, fossilFuels},language.steamEngines, language.steamEngines_description, BuildingType.steamTransport.icon);
static Technology combustionEngines			= new Technology(true, 3, new Technology[]{steamEngines,organicChemistry},language.combustionEngines, language.combustionEngines_description, BuildingType.combustionTransport.icon);

static Technology teleportation				= new Technology(true, 2, new Technology[]{temporalMechanics},language.teleportation, language.teleportation_description, BuildingType.orbitalTeleporters.icon);


static Technology manufactories				= new Technology(true, 3, new Technology[]{constructionPlanning},language.manufactories, language.manufactories_description, BuildingType.manufactories.icon);
static Technology factories					= new Technology(true, 3, new Technology[]{manufactories, engineering}, BuildingType.factories);
static Technology assemblyLine				= new Technology(true, 3, new Technology[]{factories, mechanisation},language.assemblyLine, language.assemblyLine_description, BuildingType.assemblyLineFactories.icon);
static Technology massConsumption			= new Technology(true, 5, new Technology[]{currency, assemblyLine},language.massConsumption, language.massConsumption_description, BuildingType.shoppingCenters.icon);
static Technology industrialRobots			= new Technology(true, 3, new Technology[]{robotics},language.industrialRobots, language.industrialRobots_description, BuildingType.roboticFactories.icon);
static Technology industrialNanites			= new Technology(true, 3, new Technology[]{industrialRobots, nanoRobotics},language.industrialNanites, language.industrialNanites_description, BuildingType.naniteFactories.icon);
static Technology industrialReplicators		= new Technology(true, 3, new Technology[]{industrialNanites, teleportation},language.industrialReplicators, language.industrialReplicators_description, BuildingType.replicatorFactories.icon);


static Technology dataNetworks				= new Technology(true, 4, new Technology[]{microelectronics,radioEngineering},language.dataNetworks, language.dataNetworks_description, BuildingType.dataNetworks.icon);
static Technology quantumCommunication		= new Technology(true, 4, new Technology[]{quantronics, dataNetworks},language.quantumCommunication, language.quantumCommunication_description, BuildingType.quantumNetworks.icon);

static Technology quantumComputers			= new Technology(true, 4, new Technology[]{quantronics},language.quantumComputers, language.quantumComputers_description, BuildingType.quantumSupercomputers.icon);
static Technology irrigation				= new Technology(true, 3, new Technology[]{agriculture, constructionPlanning},language.irrigation, language.irrigation_description, BuildingType.irrigationSystems.icon);
static Technology mechanizedAgriculture		= new Technology(true, 3, new Technology[]{breeding,combustionEngines},language.mechanizedAgriculture, language.mechanizedAgriculture_description, BuildingType.mechanizedFarms.icon);
static Technology agriculturalRobots		= new Technology(true, 3, new Technology[]{mechanizedAgriculture},language.agriculturalRobots, language.agriculturalRobots_description, BuildingType.roboticFarms.icon);
static Technology agriculturalNanites		= new Technology(true, 0, new Technology[]{agriculturalRobots, nanoRobotics},language.agriculturalNanites, language.agriculturalNanites_description, BuildingType.naniteFarms.icon);
static Technology foodProcessing			= new Technology(true, 0, new Technology[]{assemblyLine},language.foodProcessing, language.foodProcessing_description, BuildingType.foodIndustries.icon);

static Technology solarMirrors				= new Technology(true, 3, new Technology[]{superscalarConstruction},language.solarMirrors, language.solarMirrors_description, BuildingType.solarMirror.icon);
static Technology mechanizedMining			= new Technology(true, 1, new Technology[]{mechanisation},language.mechanizedMining, language.mechanizedMining_description, BuildingType.mechanizedMines.icon);
static Technology miningRobots				= new Technology(true, 1, new Technology[]{mechanizedMining, robotics},language.miningRobots, language.miningRobots_description, BuildingType.roboticMines.icon);
static Technology extractionNanites			= new Technology(true, 1, new Technology[]{miningRobots,nanoRobotics},language.extractionNanites, language.extractionNanites_description, BuildingType.naniteMines.icon);
static Technology teleporterMining			= new Technology(true, 3, new Technology[]{extractionNanites, teleportation},language.teleporterMining, language.teleporterMining_description, BuildingType.teleporterMines.icon);
static Technology excavators				= new Technology(true, 3, new Technology[]{mechanisation},language.excavators, language.excavators_description, BuildingType.openPitMines.icon);

static Technology electronicComputers		= new Technology(true, 4, new Technology[]{microelectronics},language.electronicComputers, language.electronicComputers_description, BuildingType.electronicSupercomputers.icon);
static Technology optronicComputers			= new Technology(true, 4, new Technology[]{optronics},language.optronicComputers, language.optronicComputers_description, BuildingType.opticSupercomputers.icon);
// static Technology computerAidedDesign		= new Technology(true, 6, new Technology[]{electronicComputers},language.computerAidedDesign, language.computerAidedDesign_description, GraphicFU.qMarkIcon);

static Technology atmosphereConverters		= new Technology(true, 0, new Technology[]{astrobiology, artificialEcosystems}, BuildingType.atmosphereConverters );

static Technology environmentalAgency		= new Technology(false, 5, new Technology[]{legislation, ecology, biologicalChemistry}, BuildingType.environmentalAgency);

static Technology wasteManagement			= new Technology(true, 0, new Technology[]{microBiology},language.wasteManagement, language.wasteManagement_description, BuildingType.wasteDisposalSites.icon);
static Technology recyclingCenters			= new Technology(true, 1, new Technology[]{wasteManagement, automation, ecology},BuildingType.recyclingCenters);
static Technology nanoRecyclers				= new Technology(true, 1, new Technology[]{recyclingCenters, nanoRobotics},BuildingType.nanoRecyclers);

static Technology broadcastingStations		= new Technology(true, 2, new Technology[]{radioEngineering}, BuildingType.broadcastingStations);

static Technology skyscrapers				= new Technology(true, 3, new Technology[]{mechanisation, electricalEngineering},language.skyscrapers, language.skyscrapers_description, BuildingType.residentialTowers.icon);
static Technology arcologies			= new Technology(true, 3, new Technology[]{skyscrapers, artificialEcosystems}, BuildingType.arcologies);

static Technology explosives				= new Technology(true, 1, new Technology[]{chemistry, fossilFuels},language.explosives, language.explosives_description, GraphicFU.qMarkIcon);
//static Technology nuclearFission			= new Technology(true, 6, new Technology[]{nuclearPhysics},language.nuclearFission, language.nuclearFission_description, GraphicFU.qMarkIcon);
static Technology fissionReactors			= new Technology(true, 2, new Technology[]{nuclearPhysics, electricalEngineering},language.fissionReactors, language.fissionReactors_description, BuildingType.nuclearPowerPlants.icon);

//static Technology nuclearFusion				= new Technology(true, 6, new Technology[]{nuclearFission},language.nuclearFusion, language.nuclearFusion_description, GraphicFU.qMarkIcon);
static Technology fusionReactors			= new Technology(true, 2, new Technology[]{nuclearPhysics, supraMagnets},language.fusionReactors, language.fusionReactors_description, BuildingType.fusionDTPowerPlants.icon);

static Technology plasmaDrive				= new Technology(true, 2, new Technology[]{supraMagnets},language.plasmaDrive, language.plasmaDrive_description, GraphicFU.qMarkIcon);
static Technology fusionDrive				= new Technology(true, 2, new Technology[]{fusionReactors},language.fusionDrive, language.fusionDrive_description, GraphicFU.qMarkIcon);
static Technology gravitationDrive			= new Technology(true, 2, new Technology[]{quantumGravity},language.gravitationDrive, language.gravitationDrive_description, GraphicFU.qMarkIcon);

static Technology interplanetaryTrade		= new Technology(true, 5, new Technology[]{rocketry},language.interplanetaryTrade, language.interplanetaryTrade_description, BuildingType.spacePorts.icon);
static Technology interstellarEconomics		= new Technology(true, 5, new Technology[]{interplanetaryTrade,fusionDrive},language.interstellarEconomics, language.interstellarEconomics_description, GraphicFU.qMarkIcon);

static Technology organicReplication		= new Technology(true, 0, new Technology[]{molecularMachines},language.organicReplication, language.organicReplication_description, GraphicFU.qMarkIcon);

static Technology researchFacilities		= new Technology(true, 5, new Technology[]{scientificMethod},language.researchFacilities, language.researchFacilities_description, BuildingType.researchLaboratories.icon);

static Technology researchInstitutes		= new Technology(true, 4, new Technology[]{researchFacilities, electronicComputers},BuildingType.researchInstitutes);
static Technology researchAcademies			= new Technology(true, 4, new Technology[]{academicEducation,researchFacilities},language.researchAcademies, language.researchAcademies_description, BuildingType.researchAcademies.icon);
static Technology thinkTanks				= new Technology(true, 4, new Technology[]{neuroImplantation},BuildingType.thinkTanks);
static Technology superColliders			= new Technology(true, 2, new Technology[]{superConductors},language.superColliders, language.superColliders_description, BuildingType.superCollider.icon);
// static Technology orbitalResearchStation	= new Technology(true, 6, new Technology[]{},language.orbitalResearchStation, language.orbitalResearchStation_description, GraphicFU.qMarkIcon);
static Technology gravGenerators			= new Technology(true, 2, new Technology[]{quantumGravity},language.gravGenerators, language.gravGenerators_description, BuildingType.gravGenerators.icon);
static Technology spaceElevators			= new Technology(true, 3, new Technology[]{nanoMaterials}, BuildingType.spaceElevators);
static Technology orbitalHabitats			= new Technology(true, 3, new Technology[]{orbitalConstruction},BuildingType.orbitalHabitats);
static Technology orbitalCities				= new Technology(true, 3, new Technology[]{orbitalHabitats},BuildingType.orbitalCities);
static Technology isotopesExtractors		= new Technology(true, 1, new Technology[]{fusionReactors, orbitalConstruction},language.isotopesExtractors, language.isotopesExtractors_description, BuildingType.orbitalIsotopesExtractor.icon);
static Technology asteroidMining			= new Technology(true, 1, new Technology[]{mechanizedMining, orbitalConstruction},language.asteroidMining, language.asteroidMining_description, BuildingType.orbitalResourceExtractor.icon);
static Technology singularityReactors		= new Technology(true, 2, new Technology[]{quantumSingularities},language.singularityReactors, language.singularityReactors_description, BuildingType.singularityPowerPlants.icon);
static Technology vacationIndustry			= new Technology(true, 5, new Technology[]{massConsumption},language.vacationIndustry, language.vacationIndustry_description, BuildingType.vacationResorts.icon);

static Technology reusableLaunchSystem		= new Technology(true, 3, new Technology[]{rocketry,compositeMaterials},language.reusableLaunchSystem, language.reusableLaunchSystem_description, BuildingType.spacePorts.icon);
static Technology personnelTeleporters		= new Technology(true, 2, new Technology[]{teleportation},language.personnelTeleporters, language.personnelTeleporters_description, BuildingType.teleporterTransport.icon);




// MILITARY APPLICATIONS
static Technology militiaSystem				= new Technology(true, 5, new Technology[]{ironworking},language.militiaSystem, language.militiaSystem_description, BuildingType.militiaForces.icon);
static Technology militaryEducation			= new Technology(true, 5, new Technology[]{regularArmy, academicEducation},language.militaryEducation, language.militaryEducation_description, BuildingType.armyAcademy.icon);
static Technology orbitalShipyards			= new Technology(true, 4, new Technology[]{orbitalConstruction}, BuildingType.orbitalShipyards);
static Technology starfleetEducation		= new Technology(true, 5, new Technology[]{orbitalConstruction},language.starfleetEducation, language.starfleetEducation_description, BuildingType.fleetAcademy.icon);


// WEAPONS : Kinetic XXX
static Technology archery					= new Technology(true, 2, new Technology[]{tools},language.archery, language.archery_description, GraphicFU.qMarkIcon);
static Technology firearms					= new Technology(true, 2, new Technology[]{chemistry},language.firearms, language.firearms_description, GraphicFU.qMarkIcon);
static Technology autoCannons				= new Technology(true, 2, new Technology[]{firearms,metallurgy},language.autoCannons, language.autoCannons_description, GraphicFU.qMarkIcon);
static Technology railGuns					= new Technology(true, 2, new Technology[]{autoCannons,superConductors},language.railGuns, language.railGuns_description, GraphicFU.qMarkIcon);
static Technology massDrivers				= new Technology(true, 2, new Technology[]{autoCannons,gravGenerators},language.massDrivers, language.massDrivers_description, GraphicFU.qMarkIcon);

static Technology particleBeam				= new Technology(true, 2, new Technology[]{},language.particleBeam, language.particleBeam_description, GraphicFU.qMarkIcon);

//WEAPONS : Laser
static Technology infraredLaser				= new Technology(true, 2, new Technology[]{lightAmplification},language.infraredLaser, language.infraredLaser_description, GraphicFU.qMarkIcon);
static Technology ultravioletLaser			= new Technology(true, 2, new Technology[]{infraredLaser},language.ultravioletLaser, language.ultravioletLaser_description, GraphicFU.qMarkIcon);
static Technology xRayLaser					= new Technology(true, 2, new Technology[]{ultravioletLaser},language.xRayLaser, language.xRayLaser_description, GraphicFU.qMarkIcon);


//Weapons : Bombs
static Technology conventonalBombs			= new Technology(true, 1, new Technology[]{explosives},language.conventonalBombs, language.conventonalBombs_description, GraphicFU.qMarkIcon);
static Technology nuclearFissionBombs		= new Technology(true, 2, new Technology[]{nuclearPhysics,explosives},language.nuclearFissionBombs, language.nuclearFissionBombs_description, GraphicFU.qMarkIcon);
static Technology nuclearFusionBombs		= new Technology(true, 2, new Technology[]{nuclearFissionBombs},language.nuclearFusionBombs, language.nuclearFusionBombs_description, GraphicFU.qMarkIcon);
static Technology antiMatterBombs			= new Technology(true, 2, new Technology[]{antimatter},language.antiMatterBombs, language.antiMatterBombs_description, GraphicFU.qMarkIcon);
static Technology singularityBombs			= new Technology(true, 2, new Technology[]{quantumSingularities},language.singularityBombs, language.singularityBombs_description, GraphicFU.qMarkIcon);

// Weapons : Systems 
static Technology guidedMissiles			= new Technology(true, 4, new Technology[]{rocketry, microelectronics},language.guidedMissiles, language.guidedMissiles_description, BuildingType.missileBases.icon);
static Technology spaceFighters				= new Technology(true, 3, new Technology[]{orbitalConstruction,virtualIntelligence},language.spaceFighters, language.spaceFighters_description, BuildingType.fighterBases.icon);
static Technology defenseSatellites			= new Technology(true, 3, new Technology[]{orbitalConstruction, infraredLaser},language.defenseSatellites, language.defenseSatellites_description, BuildingType.defenseSatellites.icon);
static Technology orbitalBatteries			= new Technology(true, 3, new Technology[]{orbitalConstruction, autoCannons},language.orbitalBatteries, language.orbitalBatteries_description, BuildingType.orbitalBattery.icon);

// Military Equipment
static Technology titaniumArmor				= new Technology(true, 1, new Technology[]{metallurgy},language.titaniumArmor, language.titaniumArmor_description, GraphicFU.qMarkIcon);
static Technology compositeArmor			= new Technology(true, 1, new Technology[]{compositeMaterials},language.compositeArmor, language.compositeArmor_description, GraphicFU.qMarkIcon);
static Technology nanoCrystalArmor			= new Technology(true, 1, new Technology[]{nanoMaterials},language.nanoCrystalArmor, language.nanoCrystalArmor_description, GraphicFU.qMarkIcon);
static Technology shapedEnergyArmor			= new Technology(true, 1, new Technology[]{virtualMatter},language.shapedEnergyArmor, language.shapedEnergyArmor_description, GraphicFU.qMarkIcon);

static Technology electromagneticShields	= new Technology(true, 2, new Technology[]{supraMagnets},language.electromagneticShields, language.electromagneticShields_description, GraphicFU.qMarkIcon);
static Technology kineticBarriers			= new Technology(true, 2, new Technology[]{gravGenerators},language.kineticBarriers, language.kineticBarriers_description, GraphicFU.qMarkIcon);

static Technology radarSensors				= new Technology(true, 2, new Technology[]{radioEngineering},language.radarSensors, language.radarSensors_description, GraphicFU.qMarkIcon);
static Technology infraredSensors			= new Technology(true, 2, new Technology[]{microelectronics},language.infraredSensors, language.infraredSensors_description, GraphicFU.qMarkIcon);
static Technology broadbandSensors			= new Technology(true, 2, new Technology[]{},language.broadbandSensors, language.broadbandSensors_description, GraphicFU.qMarkIcon);
static Technology gravitySensors			= new Technology(true, 2, new Technology[]{quantumGravity},language.gravitySensors, language.gravitySensors_description, GraphicFU.qMarkIcon);

static Technology radarStealth				= new Technology(true, 2, new Technology[]{compositeMaterials},language.radarStealth, language.radarStealth_description, GraphicFU.qMarkIcon);
static Technology thermalStealth			= new Technology(true, 2, new Technology[]{radarStealth},language.thermalStealth, language.thermalStealth_description, GraphicFU.qMarkIcon);
static Technology broadbandStealth			= new Technology(true, 2, new Technology[]{thermalStealth, metaMaterials},language.thermalStealth, language.thermalStealth_description, GraphicFU.qMarkIcon);
static Technology gravityStealth 			= new Technology(true, 2, new Technology[]{broadbandStealth, gravGenerators},language.gravityStealth, language.gravityStealth_description, GraphicFU.qMarkIcon);
static Technology opticStealth 				= new Technology(true, 2, new Technology[]{thermalStealth, temporalMechanics},language.opticStealth, language.opticStealth_description, GraphicFU.qMarkIcon);

static Technology electronicCounterMeasures	= new Technology(true, 2, new Technology[]{radarSensors},language.electronicCounterMeasures, language.electronicCounterMeasures_description, GraphicFU.qMarkIcon);
static Technology broadbandCounterMeasures	= new Technology(true, 2, new Technology[]{electronicCounterMeasures},language.broadbandCounterMeasures, language.broadbandCounterMeasures_description, GraphicFU.qMarkIcon);
static Technology opticCounterMeasures		= new Technology(true, 2, new Technology[]{infraredLaser},language.opticCounterMeasures, language.opticCounterMeasures_description, GraphicFU.qMarkIcon);
static Technology gravityCounterMeasures	= new Technology(true, 2, new Technology[]{gravGenerators},language.gravityCounterMeasures, language.gravityCounterMeasures_description, GraphicFU.qMarkIcon);

static Technology interstellarColonization	= new Technology(true, 5, new Technology[]{spaceColonization},language.interstellarColonization, language.interstellarColonization_description, GraphicFU.qMarkIcon);


// Ground Trooper Equipment
static Technology portableSensors			= new Technology(true, 2, new Technology[]{},language.portableSensors, language.portableSensors_description, GraphicFU.qMarkIcon);
static Technology portableShields			= new Technology(true, 2, new Technology[]{kineticBarriers, superAccumulators},language.portableShields, language.portableShields_description, GraphicFU.qMarkIcon);
// static Technology mechanicExoskeleton		= new Technology(true, 0, 14, 7, new Technology[]{},language.mechanicExoskeleton, language.mechanicExoskeleton_description, GraphicFU.qMarkIcon);
static Technology poweredExoskeleton		= new Technology(true, 3, new Technology[]{robotics, superAccumulators},language.poweredExoskeleton, language.poweredExoskeleton_description, GraphicFU.qMarkIcon);
static Technology weatherManipulation		= new Technology(true, 2, new Technology[]{kineticBarriers},language.weatherManipulation, language.weatherManipulation_description, BuildingType.weatherControlStations.icon);

public Technology(){
	this.costs = 1000;
	
//	this.name = name_;
	 }

public Technology(boolean application_,  int category_, Technology[] techList,  String name_, String description_, Icon icon_){
	if (techList != null) {
		for (int i = 0; i < techList.length; i++){
			this.requiredTechnology.add(techList[i]);
			}
		}
	this.icon = icon_;
	this.application = application_;
	this.positionX = 0;
	if (application) {
		this.positionY = 12;
		}
	else {
		this.positionY = category_*2;
		}
	this.category = category_;
	this.name = name_;
	this.description = description_;
	this.costs = 1000;
	technologies.add(this);
	}

public Technology(boolean application_,  int category_, Technology[] techList,  BuildingType buildingType_){
	if (techList != null) {
		for (int i = 0; i < techList.length; i++){
			this.requiredTechnology.add(techList[i]);
			}
		}
	this.icon = buildingType_.icon;
	this.application = application_;
	this.positionX = 0;
	if (application) {
		this.positionY = 12;
		}
	else {
		this.positionY = category_*2;
		}
	this.category = category_;
	this.name = buildingType_.name;
	this.description = buildingType_.description;
	this.costs = 1000;
	technologies.add(this);
	}

private static void autoPositioning(){
	for (Technology technology : technologies){
		int x = 0;
		if (technology.requiredTechnology.size() > 0) {
			for (Technology required : technology.requiredTechnology){
				x = Math.max(x, required.positionX);
				}
			if (technology.application){
				technology.positionX = x + 1;
				}
			else {
				technology.positionX = x + 1;
				}
		
			}
			for (Technology techCheck : technologies){
				if  (techCheck == technology){
					break;
					}
				if (techCheck.positionX == technology.positionX && techCheck.positionY == technology.positionY){
					technology.positionY++;
					}
				}
		}	
	}
private static void autoInfos(){
	for (Technology technology : technologies){
		for(Technology tech : technologies){
			if (tech.requiredTechnology.contains(technology)){
				technology.allowsTechnology.add(tech);
				} 
			}
		
		for(BuildingType buildingType : BuildingType.buildingTypes){
			if (buildingType.technology == technology){
				technology.allowsBuilding.add(buildingType);
				}	
			}
		}
	
}



public static void initialize(){ 
autoInfos();
autoPositioning();
	}


}