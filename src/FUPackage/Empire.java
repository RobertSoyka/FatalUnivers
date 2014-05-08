package FUPackage;

import java.awt.Color;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;

public class Empire implements IGeneralData { 

//public static Empire[] empire = new Empire[maxEmpires];		

public String name;
public Color color;
public Species founder;
public boolean inExile = false;
public AstronomicObject selectedAO; 
public StarSystem selectedStarSystem;  

public int galaxyMapX = 0;
public int galaxyMapY = 0;

public int techTreeX = 0;
public int techTreeY = 0;

public Set <Species> members = new LinkedHashSet<Species>();
public Set<Colony> colonies = new LinkedHashSet<Colony>();

public Set<StarSystem> starSystemsKnown = new LinkedHashSet<StarSystem>();
public Set<AstronomicObject> aoExplored = new LinkedHashSet<AstronomicObject>();

public Set<Technology> technologyKnown= new LinkedHashSet<Technology>();
public Set<ResearchProject> researchProjects= new HashSet<ResearchProject>();
public Set<ResearchProject> researchProjectsRunning = new LinkedHashSet<ResearchProject>();
public Set<ResearchProject> researchProjectsAvailable = new LinkedHashSet<ResearchProject>();

public double taxRate = 0.33;
public double investmentCapital = 0;

public Policy gouvernment;  // democracy, dictatorship, feudalism, unification
public Policy economy = Policy.marketEconomy; // market economy / planned economy?

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

Asset research = new Asset(AssetType.research);
Asset innovation = new Asset(AssetType.innovation);
Asset services = new Asset(AssetType.services);


public Commodity commodity[] = {this.food, this.resources, this.hydrocarbons, this.rareElements, this.preciousMetals, this.goods, this.isotopes, this.elementZ, this.artifacts, this.bioSamples, this.money, this.investments};

public Asset asset[] = { this.research, this.innovation, this.services };


//Freighter Capacity
public int freighters;

// public static Empire systemsAlliance = new Empire(Species.humans);

 void setName(String x){
	this.name = x;
}

public String getName(){
	return this.founder.empireName;
}

void setMoney(double x){
	this.money.stock = x;
	}

double getMoney(){
	return this.money.stock;
	}

double getBalanceMoney(){
	return this.money.output - this.money.demand;
	}

public Icon getFlagIcon(){
	return this.founder.getFlagIcon();
	}
public Icon getFlagBig(){
	return this.founder.getFlagBig();
	}

	
public Empire(){
}

public Empire(Species species_){
	this.founder = species_;
	this.name = species_.empireName;
	this.members.add(species_);
	this.color = species_.color;
	species_.empire = this;	
	for (Technology technology : Technology.technologies){
		this.researchProjects.add(new ResearchProject(technology));
		}
	if (species_.society == SpeciesTrait.anarchic | species_.society == SpeciesTrait.democratic | species_.society == SpeciesTrait.materialistic){
		this.economy = Policy.marketEconomy;
		}
	else{
		this.economy = Policy.plannedEconomy;
		}

//	this.money.stock = Parameter.startMoney;
	}

public void initialize (Species species_){
	this.founder = species_;
	this.name = species_.empireName;
	this.color = species_.color;
	species_.empire = this;	
	this.money.stock = Parameter.startMoney;
	
	for (Technology tech : Technology.technologies){
		if (tech.positionX < species_.techLevel){
			this.technologyKnown.add(tech);
			
			}
		}
	System.out.print( " | " + this.name + " has" + this.technologyKnown.size() + " techs");
	
	}

public void recalculateEmpire(){
	for(Colony colony : colonies){
		colony.recalculateBuildingBonus();
	}
	calculateBalance();
}
	
	
public void calculateBalance(){
	
	for (int i = 0; i < this.commodity.length; i++){
		if (!this.commodity[i].type.empireStock){
			this.commodity[i].stock = 0;
			}
		this.commodity[i].output = 0;
		this.commodity[i].demand = 0;
		this.commodity[i].exportPotential = 0; 
		this.commodity[i].importDemand = 0;
		this.commodity[i].supply = 0; 
	}
	
	for (int i = 0; i < this.asset.length; i++){
		this.asset[i].output = 0;
		}
	for(Colony colony : colonies){
//		System.out.print("\n" + "Name : " + colony.location.getName());	
		
		for (int i = 0; i < this.commodity.length; i++){
//			if (!this.commodity[i].type.empireStock){
//				this.commodity[i].stock += colony.commodity[i].stock;
//				}
			this.commodity[i].output += colony.commodity[i].output;
//			System.out.print(" Output : " + this.commodity[i].output);
			
			this.commodity[i].demand += colony.commodity[i].demand;
			this.commodity[i].exportPotential += colony.commodity[i].exportPotential;   
			this.commodity[i].importDemand += colony.commodity[i].importDemand;
			}
		
		for (int i = 0; i < this.asset.length; i++){
			this.asset[i].output += colony.asset[i].output;			
			}
	}
	
	for (int i = 0; i < this.commodity.length; i++){
		if (this.commodity[i].importDemand <= 0){
			this.commodity[i].supply = 0;	
			}
		else {	
			this.commodity[i].supply = this.commodity[i].exportPotential / this.commodity[i].importDemand;
			}
		} 
	}
public void	turn(){
	
	for (int i = 0; i < this.commodity.length; i++){
		this.commodity[i].output = 0;
		this.commodity[i].exportPotential = 0; 
		this.commodity[i].importDemand = 0;
		this.commodity[i].supply = 0; 
		}
	for (int i = 0; i < this.asset.length; i++ ){
		this.asset[i].output = 0; 		
		}
	
	for(Colony colony : colonies){
		colony.recalculateBuildingBonus(); // XXX
	}
	
	for(Colony colony : colonies){
		
		for (int i = 0; i < this.commodity.length; i++){
			this.commodity[i].output += colony.commodity[i].output;
			this.commodity[i].demand += colony.commodity[i].demand;
			
			this.commodity[i].exportPotential += colony.commodity[i].exportPotential;   
			this.commodity[i].importDemand += colony.commodity[i].importDemand;
			
			if (this.commodity[i].type.empireStock){
				this.commodity[i].stock += colony.commodity[i].output;
				}
			}
		
		
		for (int i = 0; i < this.asset.length; i++ ){
			this.asset[i].output += colony.asset[i].output;
			}
		
		colony.turn();
		colony.actualizeProduction();
		}
	
		
	while (this.research.output > 0 && !this.researchProjectsRunning.isEmpty()) {
		double researchInvestment = this.getResearchInvestments();
		for (ResearchProject researchProject : this.researchProjectsRunning){
			researchProject.researchInvested += researchInvestment;
			}
		this.research.output = this.checkTechProjects(this.researchProjects);
		}
	
	this.getAvailableResearchProjects();

	
	
	
	while (this.innovation.output > 0 && !this.researchProjectsAvailable.isEmpty()) {
		double innovationInvestment = this.getInnovationInvestments();
//		System.out.print("Empire Inno : ResInv" + this.getInnovationInvestments());
		for (ResearchProject researchProject : this.researchProjectsAvailable){
			
			researchProject.researchInvested += innovationInvestment;

//			System.out.print("Empire Inno : ResInv" + researchProject.researchInvested);
			}
//		this.innovation.output = 0;
		this.innovation.output = this.checkTechProjects(this.researchProjects);
		}
	this.getAvailableResearchProjects();
	
	
	}



public double getResearchInvestments(){
	double researchInv;
	if (researchProjectsRunning.isEmpty()){
		researchInv = 0;
		}
	else {
		researchInv = this.research.output / this.researchProjectsRunning.size();
		}
	return researchInv;
	}

public double getInnovationInvestments(){
	double researchInv;
	if (researchProjectsAvailable.isEmpty()){
		researchInv = 0;
		}
	else {
		researchInv = this.innovation.output / this.researchProjectsAvailable.size();
		}
	return researchInv;
	}


public double checkTechProjects(Collection<ResearchProject> researchProjects_){
	double payback = 0;
	for (ResearchProject researchProject : researchProjects_){
		if (this.technologyKnown.contains(researchProject.technology)){
			this.researchProjectsRunning.remove(researchProject);
			this.researchProjectsAvailable.remove(researchProject);
			researchProject.researchInvested = researchProject.technology.costs;
			continue;
			}
		else if (researchProject.researchInvested >= researchProject.technology.costs){
			payback += researchProject.researchInvested - researchProject.technology.costs;
			this.technologyKnown.add(researchProject.technology);
			this.researchProjectsRunning.remove(researchProject);
			this.researchProjectsAvailable.remove(researchProject);
			researchProject.researchInvested = researchProject.technology.costs;
			}
		}
	return payback;
	}

public void getAvailableResearchProjects(){
	
	this.researchProjectsAvailable.clear();
	for (ResearchProject researchProject : this.researchProjects){
		boolean available = true;
		if (this.technologyKnown.contains(researchProject.technology)){
			
			available = false;
			continue;
			}
		for (Technology tech : researchProject.technology.requiredTechnology){
			if (!this.technologyKnown.contains(tech)){
			
				available = false;
				break;				
				}
			}
		if (available){
			this.researchProjectsAvailable.add(researchProject);
			}
		}
	}
}




