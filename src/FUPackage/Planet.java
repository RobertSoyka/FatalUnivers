package FUPackage;

import java.util.HashSet;
import java.util.Set;

public class Planet extends AstronomicObject implements IGeneralData{

	// in km
	float gravitation = 0;
	double resources = 1;
	double oceans = 0;
	double ecosystem = 0;
	long dayLength = 3600;
	double pressure = 0;
	//static Set<AOType> primaryStars = new HashSet<AOType>();

public Planet(){
}	
// Autonomous Random Constructor
public Planet(StarSystem starSystem_, int planet_, int moon_){
	this.starSystem = starSystem_;
	this.planetID = planet_;
	this.moonID = moon_;
	if (moon_ > 0){
		this.parent = starSystem_.astronomicObject[planet_][0];
		}
	else {
		this.parent = starSystem_.astronomicObject[0][0];
		}	
	this.initialize();
}	


public Planet(StarSystem starSystem_, int planet_, int moon_, AOType aoType_){ // XXX
	this.starSystem = starSystem_;
	this.planetID = planet_;
	this.moonID = moon_;
	this.aoType = aoType_;
	
	if (moon_ > 0){
		this.parent = starSystem_.astronomicObject[planet_][0];
		}
		
	else {
		this.parent = starSystem_.astronomicObject[0][0];
		}
	this.starSystem.astronomicObjects.add(this);
	if (this.aoType.isStar){
		this.starSystem.stars.add(this);
		}
	else if (!this.aoType.isStar && this.moonID == 0){
		this.starSystem.planets.add(this);
		}	
	else {
		if (this.moonID > 0){
			if (this.starSystem.astronomicObject[this.planetID][0].aoType.isStar){
				this.starSystem.planets.add(this);
				this.parent.addOrbiter(this);
				}
			else {
				this.starSystem.moons.add(this);
				this.parent.addOrbiter(this);
				}
			}
		}
	
	
//	this.initialize(string);
}




	void setWater (double x) {
		this.oceans = x;
	}
	
	double getWater () {
		return this.oceans;
	}
	
	void setGravitation (float x) {
		this.gravitation = x;
	}
	
	float getGravitation () {
		return this.gravitation;
	}
	
	void setResources (float x) {
		this.resources = x;
	}
		
	double getResources() {
		return this.resources;
	}
	
	
	int getFarmerPotential () {
		int potentialFarmers = (int) ((this.oceans * Math.pow(this.diameter,2)/GalaxyParameter.farmArea) * (1 + this.getSpecialFoodPotential())) ;
		return potentialFarmers;
	}
	
	int getFarmerPotential (Species species) {
		int farmerPotential = (int) (
				this.oceans
				* Math.pow(this.diameter,2)/GalaxyParameter.farmArea
				* (1 + this.getSpecialFoodPotential())
				* this.ecosystem
				* (1 - Math.abs(species.waterOptimum.modifier - this.oceans))
				* (1 - Math.abs(species.tempOptimum - this.temperature) * species.tempSensitivity.modifier)
				);
		return farmerPotential;
	}
	
	
	
	void setEcosytem (float x) {
		this.ecosystem = x;
	}
	
	public double getEcosystem() {
		return this.ecosystem;
	}
	
	void setPressure (double x) {
		this.ecosystem = x;
	}
	
	double getPressure() {
		return this.pressure;
	}
	
	long getDayLength() {
		return this.dayLength;
		}

	public void initialize(){
		double maxSizer  = 1;
		if (this.moonID > 0){
			maxSizer = Math.min(this.parent.getMass()* GalaxyParameter.mSun * 0.05 , GalaxyParameter.maxSizerMoon);
			}
								
		this.parent.addOrbiter(this);		
		this.systemStar = this.parent.systemStar;
		this.starSystem.astronomicObjects.add(this);
		if (parent.aoType.isStar){
			this.starSystem.planets.add(this);
			}
		else {
			this.starSystem.moons.add(this);
			}
		
		
		double baseTemp = 3;
		double tidalForce;
		// First Planet
		if (this.moonID == 0 && this.planetID == 1){	
			this.starDistance = (long)(
									(Math.pow(this.starSystem.astronomicObject[this.planetID - 1][0].getLuminosity(),0.5) 
									* (GalaxyParameter.minStarDistance + Math.random() * (GalaxyParameter.maxStarDistance - GalaxyParameter.minStarDistance)) 
									* GalaxyParameter.dAU)
								);

			tidalForce = 50000000 * maxSizer * GalaxyParameter.gravConstant * this.parent.mass * GalaxyParameter.mSun * GalaxyParameter.mEarth / Math.pow(this.starDistance * 1000, 3);
			
			if (tidalForce > GalaxyParameter.tidalForceLimit) {
				this.starDistance = (long) (this.parent.mass * GalaxyParameter.minStarDistance*GalaxyParameter.dAU);
			//	this.starDistance = (long) (this.starDistance * Math.pow(tidalForce / GalaxyParameter.tidalForceLimit,(1/3)));
				}
			baseTemp = GalaxyParameter.baseTempUniverse + GalaxyParameter.baseTempEarth * Math.pow((starSystem.primaryStar.getLuminosity() / Math.pow(this.starDistance/GalaxyParameter.dAU, 2)),0.25);
			
			if (this.starDistance == 1000){
				}	
			}
		
		else if (this.moonID == 0){
			
			
			this.starDistance = (long) (this.starSystem.astronomicObject[this.planetID - 1][0].getStarDistance() * GalaxyParameter.minRelativeDistance + Math.pow(this.starSystem.astronomicObject[this.planetID - 1][0].getMass(),0.5) * GalaxyParameter.massDistanceModifier);
			baseTemp = GalaxyParameter.baseTempUniverse + GalaxyParameter.baseTempEarth * Math.pow((starSystem.primaryStar.getLuminosity() / Math.pow(this.starDistance/GalaxyParameter.dAU, 2)),0.25);	

			}
		else if (this.moonID == 1){	
			this.starDistance = parent.getStarDistance();
			this.moonDistance = (long) (parent.getDiameter() + GalaxyParameter.minDistanceMoon + 4 * Math.random() * GalaxyParameter.minDistanceMoon + Math.pow(this.parent.getLuminosity(),0.5) * (GalaxyParameter.minStarDistance + Math.random() * (GalaxyParameter.maxStarDistance - GalaxyParameter.minStarDistance)) * GalaxyParameter.dAU);			
			tidalForce = 50000000 * maxSizer * GalaxyParameter.gravConstant * parent.mass * GalaxyParameter.mSun * GalaxyParameter.mEarth / Math.pow(this.moonDistance * 1000, 3);
			if (tidalForce > GalaxyParameter.tidalForceLimit) 
				this.moonDistance = (long) (this.moonDistance * Math.pow(tidalForce / GalaxyParameter.tidalForceLimit,0.35));  
			
			baseTemp = GalaxyParameter.baseTempUniverse + GalaxyParameter.baseTempEarth  * Math.pow((starSystem.primaryStar.getLuminosity() / Math.pow(this.starDistance/GalaxyParameter.dAU, 2) + parent.getLuminosity() / Math.pow(this.moonDistance/GalaxyParameter.dAU, 2)),0.25);
			}
		else {
			this.starDistance = parent.getStarDistance();
			this.moonDistance = (long) (this.starSystem.astronomicObject[this.planetID][this.moonID-1].getMoonDistance() * GalaxyParameter.minRelativeDistance + Math.pow(this.starSystem.astronomicObject[this.planetID][this.moonID-1].getMass(),0.5) * GalaxyParameter.massDistanceModifier);
			baseTemp = GalaxyParameter.baseTempUniverse + GalaxyParameter.baseTempEarth  * Math.pow((starSystem.primaryStar.getLuminosity() / Math.pow(this.starDistance/GalaxyParameter.dAU, 2) + parent.getLuminosity() / Math.pow(this.moonDistance/GalaxyParameter.dAU, 2)),0.25);
			}

		double totalProbability = 0;
		double checkedProbability = 0;
		double random = Math.random();
		Set<AOType> candidates = new HashSet<AOType>();
		
		for(AOType planetT : AOType.planets){
			if (planetT.getMinTemp() < baseTemp && baseTemp < planetT.getMaxTemp() && planetT.getMinSizer() < maxSizer && planetT.possiblePrimaryStar.contains(this.starSystem.primaryStar.aoType) && ((this.moonID == 0)? true : planetT.canBeMoon) ) {
			candidates.add(planetT);
			totalProbability += planetT.getProbability(); 
				}
			}
		for(AOType candidate : candidates){
			if (random < checkedProbability + candidate.getProbability()/totalProbability){
			aoType = candidate;
			this.aoType = candidate;
			break;
			}
			else {
				checkedProbability += candidate.getProbability()/totalProbability;
				}
			}
//		System.out.print("System:" + StarSystem.starSystemQ + "Planet : " + this.planetID + " Moon" + this.moonID); // XXX
		this.sizer = this.aoType.minSizer + Math.pow(Math.random(),2) * (maxSizer - this.aoType.minSizer);
		
		this.diameter = (long) (this.aoType.getMinDiameter() + sizer * (this.aoType.getMaxDiameter() - this.aoType.getMinDiameter()));
		double denser = 0.5 * Math.pow(Math.random(),2) + 0.5 * sizer;
		double density = this.aoType.getMinDensity() + denser * (this.aoType.getMaxDensity() - this.aoType.getMinDensity());
		this.mass = density * 1/6 * Math.PI * Math.pow(diameter * 10000, 3);
		
		this.gravitation = (float) ((mass * GalaxyParameter.gravConstant) / Math.pow(diameter*500,2) / GalaxyParameter.gEarth);
		 
		int possibleAtmoCount = this.aoType.possibleAtmospheres.size();
		if (possibleAtmoCount == 0 | this.gravitation < Math.pow(baseTemp / GalaxyParameter.baseTempEarth, 0.5) * GalaxyParameter.minGravAthmo ){
			this.atmoType = AtmoType.none;
			this.pressure = 0;
			}

		else{
			double random2 = Math.random();
			double probability = 0;
			int i = 0;
			for(AtmoType aT : this.aoType.possibleAtmospheres) {
				i++;
				probability += (1.5*possibleAtmoCount-i+0.5)/Math.pow(possibleAtmoCount,2);
				if (random2 < probability){
					
					this.atmoType = aT;
					this.pressure = this.aoType.minPressure + Math.pow(Math.random(),GalaxyParameter.atmoPressureExponent) * (this.aoType.maxPressure - this.aoType.minPressure) * Math.min(1, gravitation );
					break;
					}
				}
			}
		this.mass = (float) (mass/GalaxyParameter.mEarth/GalaxyParameter.mSun);
		this.temperature = baseTemp * this.aoType.tempOffset * atmoType.greenhouseEffect; // * Math.pow(pressure,0.5);
		this.resources = (float) (density / 5); //(density /  this.aoType.minResources + denser * (this.aoType.maxResources - this.aoType.minResources));
		this.oceans = this.aoType.minOceans + Math.random()* (this.aoType.maxOceans - this.aoType.minOceans);
		this.ecosystem = this.aoType.ecosystem;
		if (moonID > 0){ 
			this.orbitalPeriod = parent.getOrbitalPeriod();
			this.dayLength = (long) (Math.pow(((4*Math.pow(Math.PI,2)*Math.pow(this.moonDistance*1000,3))/(GalaxyParameter.gravConstant * ((this.mass + this.parent.getMass())*GalaxyParameter.mSun * GalaxyParameter.mEarth))),0.5));
			}
		else {
			this.orbitalPeriod = (long) (Math.pow(((4*Math.pow(Math.PI,2)*Math.pow(this.starDistance*1000,3))/(GalaxyParameter.gravConstant * ((this.mass + this.parent.getMass())*GalaxyParameter.mSun * GalaxyParameter.mEarth))),0.5));
			this.dayLength = (long) (GalaxyParameter.minDayLength + Math.random() * (GalaxyParameter.maxDayLength - GalaxyParameter.minDayLength));	
			}
		
		// Specials
		if (this.moonID == 0){
			tidalForce = 2 * this.diameter * 1000 * GalaxyParameter.gravConstant * this.parent.mass * GalaxyParameter.mSun * GalaxyParameter.mEarth / Math.pow(this.starDistance * 1000, 3); 
			}
		
		else{
			tidalForce = 2 * this.diameter * 1000 * GalaxyParameter.gravConstant * parent.parent.mass * GalaxyParameter.mSun * GalaxyParameter.mEarth / Math.pow(this.starDistance * 1000, 3);
			tidalForce += 2 * this.diameter * 1000 * GalaxyParameter.gravConstant * parent.mass * GalaxyParameter.mSun * GalaxyParameter.mEarth / Math.pow(this.moonDistance * 1000, 3);
			}
//		System.out.print("Tidal force : " +  tidalForce); // XXX
		
		for(AOSpecial parentSpecial : this.parent.specials){
			if (parentSpecial.inheritedByOrbiter){
				this.specials.add(parentSpecial);
				}
			}
		
		
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
		
					continue;
					}
				else if (candidate.planetOnly && this.moonID > 0){
					continue;
					}				
				else if (candidate.ecologic && this.ecosystem < 0.1){
					continue;
					}
				else if (candidate.minPressure >= this.pressure | candidate.maxPressure <= this.pressure ){
					continue;
					}
				else if (candidate.multipleStar && this.starSystem.stars.size() == 1){
					continue;
					}
				else if (candidate.minTidalForce > tidalForce){
					continue;
					}
				else if (candidate.innerMoonGasGiant && this.moonID!= 1 | this.parent.aoType != AOType.gasGiant ){
					continue;
					}
				else if (candidate.minDayLenght > this.dayLength){
					continue;
					}
				else if (Math.random() < ((favouredSpecials.contains(candidate) ? GalaxyParameter.specialFavouredProbability : 1) * candidate.probability)){
					favouredSpecials.addAll(candidate.favours);
					excludedSpecials.addAll(candidate.excludes);
					this.resources 		= this.resources * (1 + candidate.resourceModifier);
					this.mass 			= this.mass * (1 + candidate.densityModifier);
					this.gravitation 	= (float) (this.gravitation * (1 + candidate.densityModifier));
					this.specials.add(candidate);
				}
			}
	}
	public void initialize(String string){
	
		// if (string == "Mercury")
		// Blabla XXX
		
		

	}
	
}
			
			
		
	

