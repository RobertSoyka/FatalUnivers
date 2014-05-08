package FUPackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Star extends AstronomicObject implements IGeneralData{
	//	public int Star;
		
		public double luminosity;

		void setLuminosity (double x) {
			this.luminosity = x;
		}

		double getLuminosity() {
			return this.luminosity;
		}

// Primary Star only  		
public Star(StarSystem starSystem){
		AOType starType = null;
		double random = Math.random();
		double checkedProbability = 0;
		double totalProbability = 0;
		
		for(AOType aoT : AOType.primaryStars){
			totalProbability += aoT.getProbability(); 
			}
		for(AOType sT : AOType.primaryStars){
			if (random < checkedProbability + sT.getProbability()/totalProbability){
			starType = sT;
			
			break;
			}
			else {
				checkedProbability += sT.getProbability()/totalProbability;
				}
			}
		this.initialize (starSystem, starType);
		}

public Star(StarSystem starSystem, AOType starType){
	this.initialize (starSystem, starType);
	}

	public void initialize (StarSystem starSystem_, AOType starType){
		starSystem_.setPrimaryStar(this);
		this.aoType = starType;
		this.parent = null;
		this.starSystem = starSystem_;
		starSystem.astronomicObjects.add(this);
		starSystem.stars.add(this);
		
		
		this.systemStar = 1;
		this.planetID = 0;
		this.moonID = 0;
		this.starDistance = 0;
			
		double temporarySizer = Math.random();
		this.sizer= temporarySizer;
		//this.type = starType.iconID;
		this.mass = starType.getMinMass() + Math.pow(temporarySizer,0.5) * (starType.getMaxMass() - starType.getMinMass());
		this.diameter = (long) (starType.getMinDiameter() + temporarySizer * (starType.getMaxDiameter() - starType.getMinDiameter()));
		this.temperature = starType.getMinTemp() + temporarySizer * (starType.getMaxTemp() - starType.getMinTemp());
		this.luminosity = Math.pow(this.temperature/GalaxyParameter.tSun, 4) * Math.pow(this.diameter/GalaxyParameter.dSun,2);
		this.orbitalPeriod = 0;
			
		if (starType.systemName.length > starType.quantity) {
			starSystem.setName(starType.systemName[starType.quantity]);
		}
		else{
			starSystem.setName(starType.abbr + starType.quantity);	
		}
		
			
		starType.quantity ++;
}	
		
		
public Star(StarSystem starSystem, int planet, int moon){
		if ( planet == 0 && moon == 0) {
			starSystem.primaryStar = this;
			}
		else{
			starSystem.primaryStar.addOrbiter(this);
			this.parent = starSystem.primaryStar;	
			}
		this.planetID = planet;
		this.moonID  = moon;
		this.starSystem = starSystem;
}

public Star(StarSystem starSystem, int planet, int moon, AOTemplate template){
	
	this.planetID = planet;
	this.moonID  = moon;
	this.starSystem = starSystem;
	if (planet == 0 && moon == 0)
		starSystem.setPrimaryStar(this);
	else if (planet != 0 && moon == 0){ 
		this.parent = starSystem.primaryStar;
		this.parent.addOrbiter(this);
		}
	else { 
		this.parent = this.starSystem.astronomicObject[planet][0];
		this.parent.addOrbiter(this);
		}

//	System.out.print("Name : " + template.name); // XXX
	this.starSystem.astronomicObjects.add(this);
	if (template.aoType.isStar) {		
		this.starSystem.stars.add(this);	
		this.systemStar = this.starSystem.stars.size();
		}
	else {
		this.starSystem.planets.add(this);
		}
	
	
	this.aoType = template.aoType;
	this.sizer = template.sizer;
	this.diameter = template.diameter;
	this.mass = template.mass;
	this.atmoType = template.atmoType;
	this.temperature = template.temperature;
	this.luminosity = template.luminosity;
	this.orbitalPeriod = template.orbitalPeriod;
	this.name = template.name;
	this.starDistance = template.starDistance;
	this.moonDistance = template.moonDistance;
	this.specials.addAll(template.specials);

	
}


public Star(StarSystem starSystem, int planet, int moon, AOType aoType_){
	this.aoType = aoType_;
	this.planetID = planet;
	this.moonID  = moon;
	this.starSystem = starSystem;
	if (planet == 0 && moon == 0)
		starSystem.setPrimaryStar(this);
	else if (planet != 0 && moon == 0){ 
		this.parent = starSystem.primaryStar;
		this.parent.addOrbiter(this);
		}
	else { 
		this.parent = this.starSystem.astronomicObject[planet][0];
		this.parent.addOrbiter(this);
		}
	this.starSystem.astronomicObjects.add(this);
	if (aoType_.isStar){
		starSystem.stars.add(this);
		}
	else {
		starSystem.planets.add(this);
		}	
		
}

public void initialize(){
	double totalProbability = 0;
	double checkedProbability = 0;
	double random = Math.random(); 
	
	Set<AOType> candidates = new HashSet<AOType>();
	for(AOType starT : AOType.stars){
		if (starT.possiblePrimaryStar.contains(this.starSystem.primaryStar.aoType)) {
			totalProbability += starT.getProbability();
			candidates.add(starT);
			}
		}
	for(AOType sT : candidates){
		if (random < checkedProbability + sT.getProbability()/totalProbability){
		this.aoType = sT;
		break;
		}
		else {
			checkedProbability += sT.getProbability()/totalProbability;
			}
		}
	
	if (aoType.isStar) {
		this.starSystem.stars.add(this);	
		this.systemStar = this.starSystem.stars.size();
		}
	else {
		this.starSystem.planets.add(this);
		}
	
	if (this.planetID == 1){
		this.starDistance = (long) (
							Math.pow(this.starSystem.astronomicObject[this.planetID - 1][0].getLuminosity(),0.5) 
							* (GalaxyParameter.minStarDistance + Math.random() * (GalaxyParameter.maxStarDistance - GalaxyParameter.minStarDistance) 
							* GalaxyParameter.dAU));
		
		this.starDistance = (long)(Math.max(this.starDistance,this.parent.mass * GalaxyParameter.minStarDistance*GalaxyParameter.dAU));
							}
	
	else {	
		this.starDistance = (long) (this.starSystem.astronomicObject[this.planetID-1][this.moonID].getStarDistance() * GalaxyParameter.minRelativeDistance + Math.pow(this.starSystem.astronomicObject[this.planetID - 1][this.moonID].getMass() + this.getMass(),0.5) * GalaxyParameter.massDistanceModifier);
		}
	this.sizer= Math.random();
	this.mass = this.aoType.getMinMass() + Math.pow(this.sizer,0.5) * (this.aoType.getMaxMass() - this.aoType.getMinMass());
	this.diameter = (long) (this.aoType.getMinDiameter() + this.sizer * (this.aoType.getMaxDiameter() - this.aoType.getMinDiameter()));
	this.temperature = (this.aoType.getMinTemp() + this.sizer * (this.aoType.getMaxTemp() - this.aoType.getMinTemp())) + GalaxyParameter.baseTempUniverse + GalaxyParameter.baseTempEarth * Math.pow((starSystem.primaryStar.getLuminosity() / Math.pow(this.starDistance/GalaxyParameter.dAU, 2)),0.25);
	
	
	this.luminosity = Math.pow(this.temperature/GalaxyParameter.tSun, 4) * Math.pow(this.diameter/GalaxyParameter.dSun,2);
	this.orbitalPeriod = (long) (Math.pow(((4*Math.pow(Math.PI,2)*Math.pow(this.starDistance*1000,3))/(GalaxyParameter.gravConstant * ((this.mass + this.parent.getMass())*GalaxyParameter.mSun * GalaxyParameter.mEarth))),0.5));

	
	Set <AOSpecial> excludedSpecials = new HashSet<AOSpecial>();
	Set <AOSpecial> favouredSpecials = new HashSet<AOSpecial>();
	for(AOSpecial existingSpecial : this.specials){
		favouredSpecials.addAll(existingSpecial.favours);
		excludedSpecials.addAll(existingSpecial.excludes);
		}
			
	for(AOSpecial candidate : this.aoType.possibleSpecials){
			if (this.specials.size() >= maxSpecials){
				break;				
				}
			else if (excludedSpecials.contains(candidate)){
				System.out.print(candidate.getName() + "exclude"); // XXX
				continue;
				}
			else if (candidate.planetOnly && this.moonID > 0){
				System.out.print(candidate.getName() + "moon"); // XXX
				continue;
				}				
			else if (candidate.ecologic){
				System.out.print(candidate.getName() + "eco"); // XXX
				continue;
				}
			else if (candidate.multipleStar && this.starSystem.stars.size() == 1){
				System.out.print(candidate.getName() + "multiple"); // XXX
				continue;
				}
			else if (candidate.minDayLenght > 10000){
				System.out.print(candidate.getName() + "day"); // XXX
				continue;
				}
			else if (Math.random() < ((favouredSpecials.contains(candidate) ? GalaxyParameter.specialFavouredProbability : 1) * candidate.probability)){
				favouredSpecials.addAll(candidate.favours);
				excludedSpecials.addAll(candidate.excludes);
				this.mass 			= this.mass * (1 + candidate.densityModifier);
				this.specials.add(candidate);
			}
		}
	}
}



