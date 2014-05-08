package FUPackage;

import java.awt.Graphics;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EconomicEffects {

//Ecology
public Modifier ecoDamagePopulation 	=	new Modifier (0, ModifierType.ecoDamagePopulation);
public Modifier ecoDamageFarmer 		=	new Modifier (0, ModifierType.ecoDamageFarmer);
public Modifier ecoDamageMiner 			=	new Modifier (0, ModifierType.ecoDamageMiner);
public Modifier ecoDamageWorker 		=	new Modifier (0, ModifierType.ecoDamageWorker);
public Modifier ecoDamageRecovery		=	new Modifier (0, ModifierType.ecoDamageRecovery);

public Modifier terraformingSpeed		=	new Modifier (0, ModifierType.terraformingSpeed);
public Modifier temperatureChange 		=	new Modifier (0, ModifierType.temperatureChange);

// Economy
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

public Modifier investmentRatio			=	new Modifier (0, ModifierType.ecoDamageMiner);

public Modifier infrastructure 			=	new Modifier (0, ModifierType.ecoDamageMiner);
public Modifier isotopesDemand			=	new Modifier (0, ModifierType.isotopesDemand );
public Modifier elementGDemand			=	new Modifier (0, ModifierType.elementGDemand );

public Modifier exportCosts				=	new Modifier (0, ModifierType.exportCosts );
public Modifier shipyardCapacity		=	new Modifier (0, ModifierType.shipyardCapacity );
public Modifier constructionCosts		=	new Modifier (0, ModifierType.constructionCosts );
public Modifier recycling				=	new Modifier (0, ModifierType.recycling );

// Population
public Modifier qualification 			=	new Modifier (0, ModifierType.qualification );
public Modifier riot					=	new Modifier (0, ModifierType.riot );
public Modifier mood					=	new Modifier (0, ModifierType.mood );
public Modifier mortalityRate			=	new Modifier (0, ModifierType.mortalityRate );
public Modifier birthRate				=	new Modifier (0, ModifierType.birthRate );

public Modifier orbitalWorkers			=	new Modifier (0, ModifierType.orbitalWorkers );
public Modifier orbitalWorkersDemand	=	new Modifier (0, ModifierType.orbitalWorkersDemand );

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

// Special
public Modifier gravEffects 			=	new Modifier (0, ModifierType.gravEffects );

public Modifier[] effect = {this.ecoDamagePopulation, this.ecoDamageFarmer, this.ecoDamageMiner, this.ecoDamageWorker, this.ecoDamageRecovery, this.terraformingSpeed, this.potentialFarmers, this.foodOutput, this.resourcesOutput, this.preciousMetalsOutput, this.rareElementsOutput, this.hydrocarbonsOutput, this.elementGOutput, this.isotopesOutput, this.goodsOutput, this.serviceSector, this.researchOutput, this.innovationOutput, this.artifactsOutput, this.bioSamplesOutput, this.investmentRatio, this.infrastructure, this.isotopesDemand, this.elementGDemand, this.exportCosts, this.shipyardCapacity, this.constructionCosts, this.recycling, this.qualification, this.riot, this.mood, this.mortalityRate, this.birthRate, this.orbitalWorkers, this.orbitalWorkersDemand, this.administration, this.counterintelligence, this.workersPublic, this.armySupport, this.militaryPersonnel, this.armyExperience, this.fleetExperience, this.groundDefense, this.bombardmentResistance, this.gravEffects};


//public EconomicEffects(){
//	effects[0] = this.ecoDamagePopulation; 
//	effects[1] = this.ecoDamageFarmer; 
//	effects[2] = this.ecoDamageMiner;
//	effects[3] = this.ecoDamageWorker; 
//	effects[4] = this.ecoDamageRecovery; 
//	effects[5] = this.terraformingSpeed; 
//	effects[6] = this.potentialFarmers; 
//	effects[7] = this.foodOutput; 
//	effects = {this.ecoDamagePopulation, this.ecoDamageFarmer, this.ecoDamageMiner, this.ecoDamageWorker, this.ecoDamageRecovery, this.terraformingSpeed, this.potentialFarmers, this.foodOutput, this.resourcesOutput, this.preciousMetalsOutput, this.rareElementsOutput, this.hydrocarbonsOutput, this.isotopesOutput, this.goodsOutput, this.serviceSector, this.researchOutput, this.innovationOutput, this.artifactsOutput, this.bioSamplesOutput, this.investmentRatio, this.infrastructure, this.isotopesDemand, this.elementGDemand, this.resourceExtraction, this.isotopesExtraction, this.antimatterProduction, this.exportCosts, this.shipyardCapacity, this.constructionCosts, this.recycling, this.qualification, this.riot, this.mood, this.mortalityRate, this.birthRate, this.orbitalWorkers, this.orbitalWorkersDemand, this.administration, this.counterintelligence, this.workersPublic, this.armySupport, this.militaryPersonnel, this.armyExperience, this.fleetExperience, this.groundDefense, this.bombardmentResistance, this.gravEffects};
//}



// Surpressed Specials
public Set<AOSpecial> supressedSpecials = new HashSet<AOSpecial>();


void reset(){
for (int i = 0; i < effect.length; i++){
	effect[i].modifier = 0;
	}
	// Surpressed Specials
	supressedSpecials.clear();
}

void addEffect(EconomicEffects economicEffect, double factor){
	for (int i = 0; i < effect.length; i++){
		this.effect[i].modifier += factor * economicEffect.effect[i].modifier;
//		System.out.print(economicEffect.foodOutput);
//		System.out.print(economicEffect.effects[10]);
		}
//Surpressed Specials
if (factor >= 0.5 )
	supressedSpecials.addAll(economicEffect.supressedSpecials);
}





 }