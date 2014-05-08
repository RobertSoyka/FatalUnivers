package FUPackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.JButton;

public class AstronomicObject implements IGeneralData{
		StarSystem starSystem; // Galaxy.starSystem[1]
		AOType aoType;
		AstronomicObject parent;
		Set<AstronomicObject> orbiters 	= new LinkedHashSet<AstronomicObject>();
		Icon icon						= GraphicFU.qMarkIcon;						
//		int systemID					= 1;
		int systemStar					= 1;
		int planetID					= 0;
		int moonID						= 0; 
		long starDistance				= 0;
		long moonDistance 				= 0;
		String name						= "";
		double sizer 					= 0;//acts as anchor for random values within given range, individual textures and subclasses of stars
		double mass						= 0;					// in sun Masses
		long diameter					= 1000;				// in km
		double temperature				= 3;
		AtmoType atmoType				= AtmoType.none;
		long orbitalPeriod				= 0; // in sec
		Set <AOSpecial> specials        = new LinkedHashSet<AOSpecial>();
		public Colony colony;			// Colony can be attached.
		
			
// getter and setter
		void setStarSystem(StarSystem x){
			this.starSystem = x;
		}
		

		StarSystem getStarSystem() {
			return this.starSystem;		
		}


	int getSystemStar() {
			return this.systemStar;	
			}		
			
		
		void setAOType(AOType x){
			this.aoType = x;
			}
		
		AOType getAOType() {
			return this.aoType;
			}
	
	
	
		void setParent(AstronomicObject x){
			this.parent = x;
		}
		AstronomicObject getParent() {
			return this.parent;
		}
		
		void setPlanetID(int x){
			this.planetID = x;
		}
		int getPlanetID() {
			return this.planetID;
		}
		
		void setStarDistance (long x){
			this.starDistance = x;
		}
		long getStarDistance() {
			return this.starDistance;
		}

		public void setMoonID(int x){
			this.moonID = x;
		}
		int getMoonID() {
			return this.moonID;
		}

		void setMoonDistance(long x){
				this.moonDistance = x;
		}
		
		long getMoonDistance() {
				return this.moonDistance;
		}
				
		void setSizer(double x){
			this.sizer = x;
		}
		
		double getSizer() {
			return this.sizer;
		}

		
		int getIconID() {
			return this.aoType.iconID;
		}
		
		Icon getIcon() {
			return GraphicFU.aoIcon[this.getIconID()][(int) (this.getSizer() * (this.aoType.iconSizeVariants))];
		}

		void setName(String x) {
			this.name = x;
		}

		String getName() {
		String nameAO; 
			if (this.name == null)  {
				nameAO = this.starSystem.getName() + this.getDesignation();
				}
			else if ( this.name.isEmpty()){
				nameAO = this.starSystem.getName() + this.getDesignation();
				}
			
			else {
				nameAO = this.name;
				}
			return nameAO;
		}
		
		String getDesignation() {
		String nameAO = ""; 
			if (this.starSystem.stars.size()>1 ) {
			nameAO = nameAO + " " + language.alphabeticCapital[this.getSystemStar()];
			}
			if (this.getSystemStar()>1 && this.getPlanetID() > 0 ) {
			nameAO = nameAO + " " + language.roman[this.getMoonID()];	
			}
	
			if (this.getSystemStar()<2 && this.getPlanetID() > 0 ) {
			nameAO = nameAO + " " + language.roman[this.getPlanetID()];
			}
			if (this.getSystemStar()<2 && this.getMoonID() > 0 ) {
			nameAO = nameAO + " " + language.alphabetic[this.getMoonID()];
			}
			return nameAO;
		}
	
	
		public void setMass(double x) {
			this.mass = x;
		}
	
		public double getMass () {
			return this.mass;
		}
		
		void setTemperature(int x) {
			this.temperature = x;
		}
		
		double getTemperature() {
			return this.temperature;
		}		

		void setDiameter(long x) {
			this.diameter = x;
		}
		
		long getDiameter() {
			return this.diameter;
		}
		
		void setAtmoType (AtmoType x) {
			this.atmoType = x;
		}
		
		AtmoType getAtmosphereType () {
			return this.atmoType;
		}	

	
		
		double getLuminosity() {
		if (this.getClass().getName() == "FUPackage.Star" ){
			return this.getLuminosity();
			}
			else {
				return Math.pow(this.diameter/GalaxyParameter.dSun,2)*(Math.pow(this.temperature/GalaxyParameter.tSun,4));
				}
			}
		
		double getResources() {
			if (this.getClass().getName() == "FUPackage.Planet" )
			return this.getResources();
			else
			return 0;	
		}
		
		long getOrbitalPeriod() {
			return this.orbitalPeriod;	
		}
		
		int getMoonPeriod() {
			return (int) (Math.pow(((4*Math.pow(Math.PI,2)*Math.pow(this.starDistance*1000,3))/(GalaxyParameter.gravConstant * ((this.mass + this.parent.getMass())*GalaxyParameter.mSun * GalaxyParameter.mEarth))),0.5));
		}
			
		void setWater (float x) {
			if (this.getClass().getName() == "FUPackage.Planet" ){	
				this.setWater(x);
			}
		}
		
		double getWater() {
			if (this.getClass().getName() == "FUPackage.Planet" ){	
			return this.getWater();
			}
			else{
			return 0.0F;	
			}
				
		}
		
		double getPressure() {
			if (this.getClass().getName() == "FUPackage.Planet" ){	
			return this.getPressure();
			}
			else{
			return 0.0F;	
			}
				
		}
		
		void setGravitation (float x) {
			if (this.getClass().getName() == "FUPackage.Planet" ){
			this.setGravitation(x);
			}
						}
		
		float getGravitation () {
			if (this.getClass().getName() == "FUPackage.Planet" ){
			return this.getGravitation();
			}
			else{
			return (float) (getMass()/Math.pow(getDiameter()/GalaxyParameter.dSun,2)* GalaxyParameter.gSun);	
			}
		}
		
		void setFarmLand (int x) {
			if (this.getClass().getName() == "FUPackage.Planet" ){
				this.setFarmLand(x);
			}
		}
		
		int getFarmLand () {
			if (this.getClass().getName() == "FUPackage.Planet" ){
				return this.getFarmLand();
			}
			else{
				return 0;	
				}
		}
		
		void setFarmWater (int x) {
			if (this.getClass().getName() == "FUPackage.Planet" ){
				this.setFarmWater(x);
			}
		}
		
		int getFarmWater () {
			if (this.getClass().getName() == "FUPackage.Planet" ){
				return this.getFarmWater();
			}
			else{
				return 0;	
				}
			}
		
		double getEcosystem() {
			if (this.getClass().getName() == "FUPackage.Planet" ){
				return this.getEcosystem();
			}
			else{
				return 0;	
				}
			}
		
		int getFarmerPotential(Species species) {
			if (this.getClass().getName() == "FUPackage.Planet" ){
				return this.getFarmerPotential(species);
				}
			else{
				return 0;	
				}
			}
		
		long getDayLength() {
			if (this.getClass().getName() == "FUPackage.Planet" ){
				return this.getDayLength();
				}
			else{
				return 0;	
				}
			}		
		
		public void addOrbiter(AstronomicObject orbiter){
			this.orbiters.add(orbiter);
		}
		
		
		public void initialize(){
			if (this.getClass().getName() == "FUPackage.Planet" ){
				this.initialize();
			}
		}
		
		public void setColony(Colony colony_){
			this.colony = colony_;
		}
		
		public Colony getColony(){
			return this.colony;
		}
		
		int getSpecialFoodPotential () {
			int specialFoodPotential = 0;
			for(AOSpecial special : this.specials){
				specialFoodPotential += special.potentialFarmers.modifier;
			}
			specialFoodPotential = Math.max(-100, specialFoodPotential);
			return specialFoodPotential; 
			}
		
		int getSpecialConstructionCost() {
			int specialConstructionCost = 0;
			for(AOSpecial special : this.specials){
				specialConstructionCost += special.constructionCosts.modifier;
			}
			specialConstructionCost = Math.max(-100, specialConstructionCost);
			return specialConstructionCost; 
			}
		

public AstronomicObject(){
	}


public Species getBestFarmerSpecies(Set<Species> availableSpecies){
	if (this.getClass().getName() == "FUPackage.Star" ){
		return null;
		}
	else if (this.getClass().getName() == "FUPackage.Planet"){
		Species bestFarmers = null;
		int maxFarmers = 0;
		
		for (Species testSpecies : availableSpecies) {
			int farmers = this.getFarmerPotential(testSpecies);
			if (farmers > maxFarmers){
				bestFarmers = testSpecies;
				maxFarmers = farmers;
				}
			}
		return bestFarmers;
		}
	else {
		return null;
		}
	
}
}
