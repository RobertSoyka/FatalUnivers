package FUPackage;

public class ModifierType implements IGeneralData{
	public String name;
	public double factor;
	public String unit;
	
	
	public static ModifierType ecoDamagePopulation 	=	new ModifierType(language.ecoDamagePopulation, 100,"%");
	public static ModifierType ecoDamageFarmer 		=	new ModifierType(language.ecoDamageFarmer, 100,"%");
	public static ModifierType ecoDamageMiner 			=	new ModifierType(language.ecoDamageMiner, 100,"%");
	public static ModifierType ecoDamageWorker 		=	new ModifierType(language.ecoDamageWorker, 100,"%");
	public static ModifierType ecoDamageRecovery		= 	new ModifierType(language.ecoDamageRecovery, 100,"%");

	public static ModifierType terraformingSpeed		=	new ModifierType(language.terraformingSpeed, 100,"%");
	public static ModifierType temperatureChange 		=	new ModifierType(language.temperatureChange, 100,"%");

	// Economy
	public static ModifierType potentialFarmers		=	new ModifierType(language.potentialFarmers, 100,"%");
	public static ModifierType foodOutput				=	new ModifierType(language.foodOutput, 100,"%");
	public static ModifierType resourcesOutput			=	new ModifierType(language.resourcesOutput, 100,"%");
	public static ModifierType preciousMetalsOutput	=	new ModifierType(language.preciousMetalsOutput, 100,"%");
	public static ModifierType rareElementsOutput		=	new ModifierType(language.rareElementsOutput, 100,"%");
	public static ModifierType hydrocarbonsOutput		=	new ModifierType(language.hydrocarbonsOutput, 100,"%");
	public static ModifierType elementGOutput			=	new ModifierType(language.elementGOutput, 100,"%");
	public static ModifierType isotopesOutput			=	new ModifierType(language.isotopesOutput, 100,"%");

	public static ModifierType goodsOutput				=	new ModifierType(language.goodsOutput, 100,"%");
	public static ModifierType serviceSector			=	new ModifierType(language.serviceSector, 100,"%");

	public static ModifierType researchOutput			=	new ModifierType(language.researchOutput, 100,"%");
	public static ModifierType innovationOutput			=	new ModifierType(language.innovationOutput, 100,"%");
	public static ModifierType artifactsOutput			=	new ModifierType(language.artifactsOutput, 100,"%");
	public static ModifierType bioSamplesOutput			=	new ModifierType(language.bioSamplesOutput, 100,"%");
	public static ModifierType researcherSalary			=	new ModifierType(language.researcherSalary, 100,"%");
	
	public static ModifierType investmentRatio			=	new ModifierType(language.investmentRatio, 100,"%");

	public static ModifierType infrastructure 			=	new ModifierType(language.infrastructure, 100,"%");
	public static ModifierType isotopesDemand			=	new ModifierType(language.isotopesDemand, 100,"%");
	public static ModifierType elementGDemand			=	new ModifierType(language.elementGDemand, 100,"%");

//	public static ModifierType resourceExtraction		=	new ModifierType(language.resourceExtraction, 100,"%");
//	public static ModifierType isotopesExtraction		=	new ModifierType(language.isotopesExtraction, 100,"%");
//	public static ModifierType antimatterProduction		=	new ModifierType(language.antimatterProduction, 100,"%");

	public static ModifierType exportCosts				=	new ModifierType(language.exportCosts, 100,"%");
	public static ModifierType shipyardCapacity		=	new ModifierType(language.shipyardCapacity, 1, language.abbrKilotons);
	public static ModifierType constructionCosts		=	new ModifierType(language.constructionCosts, 100,"%");
	public static ModifierType recycling				=	new ModifierType(language.recycling, 100,"%");

	// Population
	public static ModifierType qualification 			=	new ModifierType(language.qualification, 100,"%");
	public static ModifierType riot					=	new ModifierType(language.riot, 100,"%");
	public static ModifierType mood					=	new ModifierType(language.mood, 100,"%");
	public static ModifierType moodSensitivity			=	new ModifierType(language.moodSensitivity, 100,"%");	
	public static ModifierType mortalityRate			=	new ModifierType(language.mortalityRate, 100,"%");
	public static ModifierType birthRate				=	new ModifierType(language.birthRate, 100,"%");

	public static ModifierType orbitalWorkers			=	new ModifierType(language.orbitalWorkers, 1,"");
	public static ModifierType orbitalWorkersDemand		=	new ModifierType(language.orbitalWorkersDemand, 1,"");

	// bAdministration
	public static ModifierType administration			=	new ModifierType(language.administration, 100,"%");
	public static ModifierType counterintelligence		=	new ModifierType(language.counterintelligence, 100,"%");
	public static ModifierType workersPublic			=	new ModifierType(language.workersPublic, 100,"%"); 

	// Military
	public static ModifierType armySupport				=	new ModifierType(language.armySupport, 100,"%"); 
	public static ModifierType militaryPersonnel		=	new ModifierType(language.militaryPersonnel, 1000000.0,"");
	public static ModifierType armyExperience			=	new ModifierType(language.armyExperience, 100,"%");
	public static ModifierType fleetExperience			=	new ModifierType(language.fleetExperience, 100,"%");
	public static ModifierType groundDefense			=	new ModifierType(language.groundDefense, 100,"%");
	public static ModifierType bombardmentResistance	=	new ModifierType(language.bombardmentResistance, 100,"%");

	// Special
	public static ModifierType gravEffects				=	new ModifierType(language.gravEffects, 100,"%");
	
	
	public static ModifierType waterOptimum				=	new ModifierType(language.waterOptimum, 100,"%");
	public static ModifierType tempSensitivity			=	new ModifierType(language.tempSensitivity, 100,"%");
	public static ModifierType foodDemand				=	new ModifierType(language.foodDemand, 100,"%");
	
	public static ModifierType lifeExpectancy			=	new ModifierType(language.lifeExpectancy, 1, language.years);
	public static ModifierType espionage				=	new ModifierType(language.espionage, 100,"%");
	public static ModifierType diplomacy				=	new ModifierType(language.diplomacy, 100,"%");
	public static ModifierType workforce				=	new ModifierType(language.workforce, 100,"%");
	public static ModifierType combatEfficiency			=	new ModifierType(language.combatEfficiency, 100,"%");
	public static ModifierType bodyArmor				=	new ModifierType(language.bodyArmor, 100,"%");
	public static ModifierType bodyCamouflage			=	new ModifierType(language.bodyCamouflage, 100,"%");
	public static ModifierType evasion					=	new ModifierType(language.evasion, 100,"%");
	public static ModifierType points					=	new ModifierType(language.points, 1,"%");
	
	
	
	
	
public ModifierType(String name_, double factor_, String unit_){
	this.name = name_;
	this.factor = factor_;
	this.unit = unit_;
}	
	
}