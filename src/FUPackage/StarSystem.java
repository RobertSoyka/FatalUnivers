package FUPackage;

import java.util.HashSet;
import java.util.Set;

public class StarSystem implements IGeneralData {

public static int starSystemQ = 0; 
	
public int systemID = 0;
public int coordinateX = 0;
public int coordinateY = 0;
public AstronomicObject primaryStar; 
public String name				= "I need a name";
public String nativeName;
public Species firstColonizers;
public Empire owner;
Set<AstronomicObject> astronomicObjects = new HashSet<AstronomicObject>();
Set<AstronomicObject> stars = new HashSet<AstronomicObject>();
Set<AstronomicObject> planets = new HashSet<AstronomicObject>();
Set<AstronomicObject> moons = new HashSet<AstronomicObject>();

public AstronomicObject[][] astronomicObject = new AstronomicObject[maxPlanets][maxMoons];

void setSystemID (int x){
	this.systemID = x;
}
int getSystemID () {
	return this.systemID;
}

void setCoordinateX (int x){
	this.coordinateX = x;
}
int getCoordinateX () {
	return this.coordinateX;
}

void setCoordinateY (int y){
	this.coordinateY = y;
}
int getCoordinateY () {
	return this.coordinateY;
}

void setPrimaryStar (AstronomicObject x){
	this.primaryStar = x;
}
AstronomicObject getPrimaryStar () {
	return this.primaryStar;
}

void setName (String x){
	this.name = x;
}

String getName() {
	return this.name;
}

void setNativeName (String x){
	this.nativeName = x;
}

String getNativeName() {
	return this.nativeName;
}


void setFirstColonizers (Species x){
	this.firstColonizers = x;
}

Species getFirstColonizers(){
	return this.firstColonizers;
}

void setOwner (Empire x){
	this.owner = x;
}

Empire getOwner(){
	return this.owner;
}

public StarSystem(){
	Galaxy.starSystems.add(this);
	starSystemQ++;
}

public void initializePlanets() {			
   	for(int po=1; po<maxPlanets; po++)	{
   		if (po > GalaxyParameter.minOrbits && Math.random()< GalaxyParameter.systemEndChance) {
   			continue;
   			}
   		if (this.astronomicObject[po-1][0] == null){
   			continue;
   			}
   		//double test =  1 + Math.pow(Galaxy.astronomicObject[sys][po-1][0].getMass()* GalaxyParameter.mSun,0.5);
   		for (int mo = 0; mo<maxMoons; mo++){
   			if (mo == 0 && Math.random()< GalaxyParameter.secondaryStarChance){
   				this.astronomicObject[po][mo] = new Star(this, po,mo);
   				this.astronomicObject[po][mo].initialize();
   				}
   			
   			else if (mo > 1 && this.astronomicObject[po][mo-1] == null) {
   				continue;
   				}
   				
   			else if (mo > 0 && mo > (0.5 + Math.random()) * Math.pow(this.astronomicObject[po][0].getMass()* GalaxyParameter.mSun,0.5)){
   				continue;
   				}
   			
   			else if (mo > 1 && Math.random()* 6 < mo){ 
   				continue;
   				}
   					
   		   	else {
  				this.astronomicObject[po][mo] = new Planet(this,po,mo);
   				}
   			}	
   		}
   	}
}