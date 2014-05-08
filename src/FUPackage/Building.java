package FUPackage;

import java.util.LinkedHashSet;

public class Building implements IGeneralData{
	
public BuildingType buildingType;
public Colony colony;
public double investedGoods;
public int level = 1;

public Building(Colony colony_, BuildingType buildingType_, int level_, double condition){
	this.buildingType = buildingType_;
	this.level = Math.min(level_,buildingType_.levels);
	this.colony = colony_;
	this.investedGoods =
			condition *
			level_ * 
			(1 + colony_.location.getSpecialConstructionCost() / 100) *
			( buildingType_.costsAbsolute 
			+ buildingType_.costsArea * colony_.area 
			+ buildingType_.costsPopulation * colony_.getTotalPopulation()
			+ buildingType_.costsFarmer * colony_.getWorkforceFood()
			+ buildingType_.costsMiner * colony_.getWorkforceResources()
			+ buildingType_.costsWorker * colony_.getWorkforceGoods()
			+ buildingType_.costsResearcher * colony_.getWorkforceResearch()
			);

			colony.buildings.add(this);
	}

double getDeterioration(){ 
return this.investedGoods * this.buildingType.deterioration;
}

public double getConstructionCosts(){
	double constructionCosts = 
	this.level * 
	(1 + this.colony.aoSpecialEffects.constructionCosts.modifier) *
	( this.buildingType.costsAbsolute 
	+ this.buildingType.costsArea * this.colony.area 
	+ this.buildingType.costsPopulation * this.colony.getTotalPopulation()
	+ this.buildingType.costsFarmer * this.colony.getWorkforceFood()
	+ this.buildingType.costsMiner * this.colony.getWorkforceResources()
	+ this.buildingType.costsWorker * this.colony.getWorkforceGoods()
	+ this.buildingType.costsResearcher * this.colony.getWorkforceResearch()
	);
	return constructionCosts;
	}	

public double getCondition(){
	return Math.min(this.investedGoods / this.getConstructionCosts(), 1);
	
	} 

public double getInvestmentNeeds(){
	double cc = this.getConstructionCosts();
	double investmentNeeds = 
	Math.max(Math.min((cc * (1 + this.buildingType.deterioration ) - this.investedGoods), cc * this.buildingType.investmentSpeed),0);  
	return investmentNeeds;
	}

public Building(Colony colony_, BuildingType buildingType_, int level_){
	this.buildingType = buildingType_;
	this.level = level_;
	this.colony = colony_;
		
	LinkedHashSet<Building> removeBuildings = new LinkedHashSet<Building>();
	for(Building checkBuilding : colony.buildings) {
		if (checkBuilding.buildingType.upgradedBy.contains(buildingType_)){
			this.investedGoods += checkBuilding.investedGoods;
			removeBuildings.add(checkBuilding);
			}
		}
	colony.buildings.removeAll(removeBuildings);
	colony.buildings.add(this);	
	}
}


