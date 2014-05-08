package FUPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.JSlider;

public class Colony implements IGeneralData{
	
public AstronomicObject location;
public Character governor;
public double area; 
Species bestFarmers;
double potentialFarmers;
double foodMaxAllocation;

public Empire controller;
public boolean underSiege = false;
public double founded; // Turn the colony was founded

public LinkedHashSet<Population> populations = new LinkedHashSet<Population>();

Commodity food = new Commodity(AssetType.food);
Commodity resources = new Commodity(AssetType.resources);
Commodity hydrocarbons = new Commodity(AssetType.hydrocarbons);
Commodity rareElements = new Commodity(AssetType.rareElements);
Commodity preciousMetals = new Commodity(AssetType.preciousMetals);
Commodity goods = new Commodity(AssetType.goods);
Commodity isotopes = new Commodity(AssetType.isotopes);
Commodity elementZ = new Commodity(AssetType.elementZ);
Commodity artifacts = new Commodity(AssetType.artifacts);
Commodity bioSamples = new Commodity(AssetType.bioSamples);
Commodity money = new Commodity(AssetType.money);
Commodity investments = new Commodity(AssetType.investments);

public Commodity commodity[] = {this.food, this.resources, this.hydrocarbons, this.rareElements, this.preciousMetals, this.goods, this.isotopes, this.elementZ, this.artifacts, this.bioSamples, this.money, this.investments};

Asset research = new Asset(AssetType.research);
Asset innovation = new Asset(AssetType.innovation);
Asset services = new Asset(AssetType.services);

public Asset asset[] = {this.research, this.innovation, this.services};

public double goodsOutputPotential;


/// END BUILDINGS - START ALLOCATION XXX

public double[] allocation = new double[7];
public boolean[] allocationFixed = new boolean[7];

public LinkedHashSet<Building> buildings = new LinkedHashSet<Building>();

EconomicEffects buildingsEffect = new EconomicEffects();

/// END ALLOCATION - START SPECIAL EFFECTS XXX
EconomicEffects aoSpecialEffects = new EconomicEffects();

// END SPECIAL EFFECTS  - START COLONY ECONOMY XXX



public double incomeAverage;
public double administration;
public double investmentNeedsGovernment;
public double investmentNeedsPrivateBusiness;

public double getMoodBase(){
return (1.0 + this.buildingsEffect.mood.modifier - this.controller.taxRate);
}

public double getTotalPopulation(){
	double totalPopulation = 0;
	for (Population pop : populations){
			totalPopulation = pop.quantity;	
			}		
	return totalPopulation; 	
}	


public double getWorkforce(){
	double workforce = 0;
	for (Population pop : populations){
			workforce = pop.quantity * pop.species.workforce.modifier;	
			}		
	return workforce; 	
}

public double getWorkforceFood(){
	return this.getWorkforce() * this.allocation[0]; 	
}

public double getWorkforceResources(){
	return this.getWorkforce() * this.allocation[1]; 	
}

public double getWorkforceGoods(){
	return this.getWorkforce() * this.allocation[2]; 	
}

public double getWorkforceResearch(){
	return this.getWorkforce() * this.allocation[3]; 	
}

public double getWorkforceServices(){
	return this.getWorkforce() * this.allocation[4]; 	
}

public double getWorkforcePublicServices(){
	return this.getWorkforce() * this.allocation[5]; 	
}

Icon getControllerFlag(){
	return this.controller.getFlagIcon();
	}


public Colony(AstronomicObject ao_, Empire empire_, Species species_, double quantity_, double qualification_, double mood_){
	this.location = ao_;
	this.area = Math.pow(ao_.getDiameter(),2) * Math.PI / 1000000; // Area in mio. km2 
	ao_.setColony(this);
	this.controller = empire_;
	empire_.colonies.add(this);
	this.populations.add(new Population (ao_.colony, species_, quantity_, qualification_, mood_));
	allocation[0] = 0.16; // in %
	allocation[1] = 0.17; // in %
	allocation[2] = 0.18; // in %
	allocation[3] = 0.19; // in %
	allocation[4] = 0.20; // in %
	allocation[5] = 0.10; // in %
	allocation[6] = 0.20; // in %
	
	allocationFixed[0] = false;
	allocationFixed[1] = false;
	allocationFixed[2] = false;
	allocationFixed[3] = false;
	allocationFixed[4] = true;
	allocationFixed[5] = true;
	allocationFixed[6] = false;
	
	
}

// Allocation Recalculation XXX
public void recalculateAllocation(int source){
	double allocationAvailable = 1.0;
	double allocationOthers = 0;
	double allocationRemaining = 0;
	int freeSliders = 5;
	
	this.allocation[4] = this.buildingsEffect.serviceSector.modifier;
	this.allocation[5] = (this.buildingsEffect.workersPublic.modifier * this.getTotalPopulation() + this.buildingsEffect.militaryPersonnel.modifier)/ this.getWorkforce();	
	
	for (int i = 0; i <6 ; i++){
	if (this.allocationFixed[i] && source != i){
		freeSliders--;
		allocationAvailable -= this.allocation[i];
		}
	if (!this.allocationFixed[i] && source != i)
		allocationOthers += this.allocation[i];
		}
	
	if (this.allocation[source] >= allocationAvailable){ 
		this.allocation[source] = allocationAvailable;
		}
	if (freeSliders == 0) {
		this.allocation[source] = allocationAvailable;
		}
	
	allocationRemaining = allocationAvailable - this.allocation[source];
		if (allocationOthers == 0){			
			for (int i = 0; i <6 ; i++){
				if (this.allocationFixed[i] == false && source != i){
				this.allocation[i] = allocationRemaining / freeSliders; 
					}		
				}
			}
		else {
			for (int i = 0; i <6 ; i++){
				if (this.allocationFixed[i] == false && source != i){
				this.allocation[i] = this.allocation[i] * allocationRemaining / allocationOthers;
				}
			}
		}
		this.recalculateBuildingBonus();
	}

// Building Bonus Recalculation XXX
public void recalculateBuildingBonus(){
	this.buildingsEffect.reset();
	this.aoSpecialEffects.constructionCosts.modifier = this.location.getSpecialConstructionCost();
	
for(Building building : buildings) {  
	this.buildingsEffect.addEffect(building.buildingType, building.level * building.getCondition());
	}
this.actualizeSpecialEffects();

}
// Special Effects XXX
public void actualizeSpecialEffects(){
	this.aoSpecialEffects.reset();
	for(AOSpecial  aoSpecial : this.location.specials) {  
		if (buildingsEffect.supressedSpecials.contains(aoSpecial)){
			continue;
		}
		this.aoSpecialEffects.addEffect(aoSpecial, 1);
	}
	this.actualizeProduction();

}


// Production XXX
 public void actualizeProduction(){
	this.calculatePopulations();
	this.getInvestmentNeeds();
	this.calculateProductionFood();
	this.calculateDemandFood();
	this.calculateOutputResources();
	this.calculateResourcesDemand();
	this.calculateOutputGoods();
	this.calculateDemandGoods();
	this.calculateResearch();
	this.calculateInnovation();
	this.calculateIncomeAverage();
	this.services.output			= this.getWorkforceServices() * this.incomeAverage; //* this.buildingsEffect.serviceSector.modifier;
	this.administration				= this.buildingsEffect.administration.modifier;
	this.getTax();
	this.getPublicDemand();
	this.actualizeTrade();
	this.controller.calculateBalance();
	}

public void calculatePopulations(){
	Set<Species> localSpecies = new HashSet<Species>();
	for (Population pop : populations){		
		localSpecies.add(pop.species);
		}
	this.bestFarmers = this.location.getBestFarmerSpecies(localSpecies);
	if (this.bestFarmers != null){
		this.potentialFarmers = this.location.getFarmerPotential(this.bestFarmers);
		}
//	double maxAllocationFood = this.getWorkforce();
	
	
}




public void calculateProductionFood(){

	
this.food.output = 0;
	for (Population pop : populations){
		this.food.output	+= this.food.type.baseOutput 
							* pop.getWorkforce() * this.allocation[0] * ( 1 + pop.species.foodOutput.modifier)
							* (1 + this.buildingsEffect.foodOutput.modifier * (1 + this.buildingsEffect.infrastructure.modifier + pop.qualification ))
							* (1 + Math.max(pop.getMoodFactor() * Parameter.moodFactorFood, Parameter.moodFactorMinimum)) 
							* (1 + pop.getGravMalus() * (1 + this.buildingsEffect.gravEffects.modifier));
							}
}

public void calculateDemandFood(){
	this.food.demand = 0;
		for (Population pop : populations){
			this.food.demand 		+= pop.quantity 
									* (1 + pop.species.foodDemand.modifier)/Parameter.turnsPerYear;
		}
	}
 
 
public void calculateOutputResources() {
	this.resources.output = 0;
		for (Population pop : populations){
			this.resources.output	+= this.resources.type.baseOutput
									* this.location.getResources()
									* (1 + this.buildingsEffect.resourcesOutput.modifier * (1 + this.buildingsEffect.infrastructure.modifier + pop.qualification ))
									* pop.getWorkforce() * this.allocation[1]
									* (1 + pop.species.resourcesOutput.modifier)
									* (1 + Math.max(pop.getMoodFactor() * Parameter.moodFactorResources, Parameter.moodFactorMinimum)) 
									* (1 + pop.getGravMalus() * (1 + this.buildingsEffect.gravEffects.modifier));
//									+ this.getMaintainance() * this.buildingsEffect.recycling;  XXX
			
			
									}
		this.hydrocarbons.output	= this.resources.output * this.aoSpecialEffects.hydrocarbonsOutput.modifier;
		this.preciousMetals.output	= this.resources.output * this.aoSpecialEffects.preciousMetalsOutput.modifier;
		this.rareElements.output	= this.resources.output * this.aoSpecialEffects.rareElementsOutput.modifier;
		this.isotopes.output		= this.resources.output * this.aoSpecialEffects.isotopesOutput.modifier;
}
 
public void calculateResourcesDemand(){
	
this.goodsOutputPotential = 0;
	for (Population pop : populations){
		this.goodsOutputPotential    += this.goods.type.baseOutput
									* (1 + this.aoSpecialEffects.goodsOutput.modifier)
									* (1 + this.buildingsEffect.goodsOutput.modifier *  (1 + this.buildingsEffect.infrastructure.modifier ))
									* pop.getWorkforce() * this.allocation[2]
									* (1 + pop.species.goodsOutput.modifier)
									* (Math.max(1 + pop.getMoodFactor() * Parameter.moodFactorGoods, Parameter.moodFactorMinimum))
									* (1 + pop.getGravMalus() * (1 + this.buildingsEffect.gravEffects.modifier));
									}
 this.resources.demand = goodsOutputPotential * resources.type.productionDemand;
 this.hydrocarbons.demand = goodsOutputPotential * hydrocarbons.type.productionDemand;
 this.preciousMetals.demand = goodsOutputPotential * preciousMetals.type.productionDemand;
 this.rareElements.demand = goodsOutputPotential * rareElements.type.productionDemand;
 
 this.resources.supply = this.resources.stock / this.resources.demand;
 this.hydrocarbons.supply = this.hydrocarbons.stock /this.hydrocarbons.demand;
 this.preciousMetals.supply = this.preciousMetals.stock /this.preciousMetals.demand;
 this.rareElements.supply = this.rareElements.stock /this.rareElements.demand;
}

public void calculateOutputGoods(){

if (this.goodsOutputPotential>0){	
this.goods.output 			= goodsOutputPotential
							* (Math.min(1,this.resources.supply) * resources.type.productionDemand 
							+ Math.min(1,this.hydrocarbons.supply) * hydrocarbons.type.productionDemand
							+ Math.min(1,this.preciousMetals.supply) * preciousMetals.type.productionDemand 
							+ Math.min(1,this.rareElements.supply) * rareElements.type.productionDemand);
 							} 

else	{
	this.goods.output = 0;
	}
}	
public void calculateDemandGoods(){
	this.goods.demand 		= this.investmentNeedsGovernment
							+ this.investmentNeedsPrivateBusiness
							+ this.getPublicDemandGoods();
}

 public void calculateResearch(){
	 this.research.output = 0;	
	 	for (Population pop : populations) {
	 		this.research.output 	+= this.research.type.baseOutput
									* (1 + this.aoSpecialEffects.researchOutput.modifier)
									* (1 + this.buildingsEffect.researchOutput.modifier * (1 + this.buildingsEffect.infrastructure.modifier + pop.qualification ))
									* pop.getWorkforce() * this.allocation[3]
									* (1 + pop.species.researchOutput.modifier)
									* (Math.max(1 + pop.getMoodFactor() * Parameter.moodFactorResearch, Parameter.moodFactorMinimum))
									* (1 + pop.getGravMalus() * (1 + this.buildingsEffect.gravEffects.modifier));
	 								}
		}
 
 public void calculateInnovation(){
	 this.innovation.output = 0;
	 for (Population pop : populations) {
		 	this.innovation.output	+= pop.quantity
		 							* this.innovation.type.baseOutput
		 							* (1 + pop.species.innovationOutput.modifier)
		 							* pop.qualification	
		 							* (Math.max(1 + pop.getMoodFactor() * Parameter.moodFactorResearch, Parameter.moodFactorMinimum));
		}
 	}
 
 public void calculateIncomeAverage(){
 double income					= this.food.output * this.food.price
								+ this.resources.output * this.resources.price 
								+ this.goods.output * (this.goods.price - this.resources.type.productionDemand * this.resources.price)
								+ this.getIncomeResearch();

double workers					= this.getWorkforceFood() 
								+ this.getWorkforceResources() 
								+ this.getWorkforceGoods() 
								+ this.getWorkforceResearch()
								+ this.buildingsEffect.orbitalWorkers.modifier/1000000;

this.incomeAverage				= income / workers ;   
} 
	
public int getStatus(Building building_){
	int status = (int)(building_.investedGoods * 1000.0 / building_.getConstructionCosts());
	return Math.min(status, building_.level * 1000);
}

public double getLocalConstructionCost(BuildingType buildingType_){
	double localConstructionCost = 
	(1 + this.aoSpecialEffects.constructionCosts.modifier) *
	( buildingType_.costsAbsolute 
	+ buildingType_.costsArea * this.area 
	+ buildingType_.costsPopulation * this.getTotalPopulation() 
	+ buildingType_.costsFarmer * this.getWorkforceFood()
	+ buildingType_.costsMiner * this.getWorkforceResources()
	+ buildingType_.costsWorker * this.getWorkforceGoods()
	+ buildingType_.costsResearcher * this.getWorkforceResearch()
	);
	return localConstructionCost;
	}

	
public double getBalanceFood(){
	return this.food.output - this.food.demand;
	}

public double getBalanceResources(){
	return this.resources.output - this.resources.demand;
	}

// INVESTMENT NEED


public void getInvestmentNeeds(){
	
	
	this.investmentNeedsGovernment = 0;
	this.investmentNeedsPrivateBusiness = 0;
	
	for(Building building : buildings){
		if (this.controller.economy.privateSector && building.buildingType.privateSector){
			this.investmentNeedsPrivateBusiness += Math.max(building.getInvestmentNeeds(),0);
	//		this.investments.demand += Math.max(building.getInvestmentNeeds(),0) * this.goods.price; 
			}
		else {
			this.investmentNeedsGovernment += Math.max(building.getInvestmentNeeds(),0);
			this.investments.demand = Math.max(building.getInvestmentNeeds(),0) * this.goods.price;
			}
		}
	
	this.investments.demand = investmentNeedsPrivateBusiness * this.goods.price;
	
}
public double getBalanceGoods(){
	this.getInvestmentNeeds();
	return (
			this.goods.output
			-this.investmentNeedsGovernment
			-this.investmentNeedsPrivateBusiness
			-this.getPublicDemandGoods()
			);
	}

public double getIncomeFood(){
	return this.food.output * this.food.price;
	}

public double getIncomeResources(){
	return this.resources.output * this.resources.price;
	}

public double getIncomeGoods(){
	return this.goods.output * (this.goods.price - this.resources.type.productionDemand * this.resources.price);
	}

public double getIncomeResearch(){
	return (+ this.research.type.baseOutput * this.getWorkforceResearch()  
			* (1 + this.buildingsEffect.researchOutput.modifier)
			* this.research.type.basePrice);
	}

public double getIncomeServices(){
	return this.services.output;
	}

public double getIncomePublicServices(){
	return this.getWorkforcePublicServices() * this.incomeAverage;
	}

// XXX

public double getPublicDemand(){
	
	double publicDemand = (
						this.getIncomeFood()
						+ this.getIncomeResources() 
						+ this.getIncomeGoods()
						+ this.getIncomeServices()
						+ this.getIncomeResearch()
						+ this.getIncomePublicServices());
	this.investments.output = publicDemand * this.buildingsEffect.investmentRatio.modifier; // Needs to be fixed XXX 
	
	
	return publicDemand; 
			
}


public double getPublicDemandGoods(){

	return (
			0 );
//			this.getPublicDemand()
//			- Math.min ( this.food.demand, this.food.stock + this.food.output) * food.price
//			- this.services.output
//			)/this.goods.price;
}


public double getGDP(){
	return (this.food.output * this.food.price
			+ this.resources.output * this.resources.price
			+ this.goods.output * this.goods.price
			+ this.research.output * this.research.type.basePrice
			+ this.services.output
			+ this.getWorkforcePublicServices() * this.incomeAverage);	
	}

public double getTax(){
	double tax  = this.administration
				* this.controller.taxRate
				* this.incomeAverage
				* this.getWorkforce();
				
	this.money.output = tax;  
	return tax; 
	}		


public double getPublicExpenses(){
	
	this.money.demand		= this.investmentNeedsGovernment						
							* this.goods.price
							+ getIncomeResearch()
							+ getIncomePublicServices();
	
	return this.money.demand;
			
	}

public void actualizeTrade(){
	for (int i = 0; i < this.commodity.length; i++){
		this.commodity[i].supply = this.commodity[i].stock / this.commodity[i].demand; 
		
		this.commodity[i].exportPotential = 0; 
		this.commodity[i].importDemand = 0;
		
		if (this.commodity[i].stock + this.commodity[i].output >= this.commodity[i].demand * 3){
			this.commodity[i].exportPotential = this.commodity[i].stock + this.commodity[i].output - this.commodity[i].demand * 3;
			}
		else {
			this.commodity[i].importDemand =  this.commodity[i].demand * 3 - this.commodity[i].stock - this.commodity[i].output;
			}
		}
}

public LinkedHashSet<BuildingType> getAvailableBuildings(int category){
LinkedHashSet<BuildingType> availableBuildings = new LinkedHashSet<BuildingType>();
for(BuildingType checkBuildingType : BuildingType.buildingTypes){
	boolean available = true;
	if (checkBuildingType.classification != category){
		available = false;
		continue;
		}
	if (!this.controller.technologyKnown.contains(checkBuildingType.technology)){
		available = false;
		continue;
		}
	if (checkBuildingType.agriculture && this.bestFarmers != null ){
		available = false;
		continue;
		}
	if (checkBuildingType.AOTypeAllowed.size() > 0 && (checkBuildingType.AOTypeAllowed.contains(this.location.aoType) == false)){
		available = false;
		continue;
		}
	if (checkBuildingType.AOSpecialRestriction != null && (this.location.specials.contains(checkBuildingType.AOSpecialRestriction) == false)){
		available = false;
		continue;
		}
	if (checkBuildingType.minPopPerLevel > this.getTotalPopulation()){
		available = false;
		continue;
		}
	
	
	for(Building building : this.buildings){
		if (checkBuildingType == building.buildingType){
			available = false;
			break;
			}
		if (checkBuildingType.upgradedBy.contains(building.buildingType)){
			available = false;
			break;
			}
		}
	if (available){
		availableBuildings.add(checkBuildingType);
		} 
	}
	 
return availableBuildings;
	}

public double getMood(){
	double weightedMood = 0;
	for (Population pop : populations){
		weightedMood += pop.mood * pop.quantity;		
		}
	return weightedMood / this.getTotalPopulation();
}

public Species getDominantSpecies(){
	Species dominantSpecies = null;
	for (Population pop : populations){
		if (pop.quantity > this.getTotalPopulation() / 2){
			dominantSpecies = pop.species;
			break;
			};
		}
	return dominantSpecies;
}


public void investments(LinkedHashSet<Building> buildings){
	for(Building building : buildings){
		double deterioration = building.investedGoods * building.buildingType.deterioration;
		double newInvestments = 0;
		if (this.controller.economy.privateSector && building.buildingType.privateSector){
			newInvestments = building.getInvestmentNeeds() * Math.min(this.controller.investments.stock / this.controller.investments.demand < this.goods.supply ? this.controller.investments.stock / this.controller.investments.demand : this.goods.supply, 1);
			}
		else {
			newInvestments = building.getInvestmentNeeds() * Math.min(this.controller.money.stock / this.controller.money.demand < this.goods.supply ? this.controller.money.stock / this.controller.money.demand : this.goods.supply , 1);
			}
		building.investedGoods += newInvestments;
		building.investedGoods -= deterioration;
		
		this.goods.stock -= newInvestments;
		this.resources.stock += deterioration * this.buildingsEffect.recycling.modifier;
		}	
}




public void turn(){
	this.investments(this.buildings);
	
	for (int i = 0; i < this.commodity.length; i++){

		// USE
//		if (Math.min(this.commodity[i].stock, this.commodity[i].demand) != 0){
//			System.out.print(this.location.getName() + " " + commodity[i].type.name + " use -" + Math.min(this.commodity[i].stock, this.commodity[i].demand ) + ", Stock:" + commodity[i].stock + "Demand:" + commodity[i].demand + "\n") ; // XXX
//		}
		this.commodity[i].stock -= Math.min(this.commodity[i].stock, this.commodity[i].demand);

		// OUTPUT
//		if (Math.min(this.commodity[i].stock, this.commodity[i].demand) != 0 ){
//			System.out.print(this.location.getName() + " " + commodity[i].type.name + " output +" + Math.min(this.commodity[i].stock, this.commodity[i].demand) + "\n") ; // XXX
//			}		
		if (this.commodity[i].type.empireStock) {
			this.commodity[i].stock = 0;
			}
		else {	
			this.commodity[i].stock	+=	this.commodity[i].output; 
			}
		// EXPORT
//		if (this.commodity[i].exportPotential * Math.min(1, this.controller.commodity[i].supply == 0 ? 0 : 1 / this.controller.commodity[i].supply) != 0){
//			System.out.print(this.location.getName() + " " + commodity[i].type.name + " export -" + this.commodity[i].exportPotential * Math.min(1, this.controller.commodity[i].supply == 0 ? 0 : 1 / this.controller.commodity[i].supply) + "\n");
//			}
		this.commodity[i].stock	-=	this.commodity[i].exportPotential * Math.min(1, this.controller.commodity[i].supply == 0 ? 0 : (1 / this.controller.commodity[i].supply));

		// IMPORT
//		if (this.commodity[i].importDemand * Math.min(1, this.controller.commodity[i].supply) != 0){
//			System.out.print(this.location.getName() + " " + commodity[i].type.name + " import +" + this.commodity[i].importDemand * Math.min(1, this.controller.commodity[i].supply )+ "\n");
//			}
		this.commodity[i].stock += this.commodity[i].importDemand * Math.min(1, this.controller.commodity[i].supply) ;

		}
	
	
// 	Demography 
	for (Population pop : populations){
		pop.quantity += pop.getBirths() - pop.getDeaths();
		pop.mood += pop.getMoodChange();
		pop.qualification += pop.getQualificationChange(); 
		}

	

	}
}