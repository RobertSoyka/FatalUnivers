package FUPackage;

public abstract class GalaxyCreation implements IGeneralData{

//Positioning


public static void initialize() {
//	Species.initialize();
	initializeSystems();
}



public static void initializeSystems() {
	StarSystem galacticCenter = new StarSystem();
	galacticCenter.coordinateX = (int)(Galaxy.galaxySizeX * 0.5);
	galacticCenter.coordinateY = (int)(Galaxy.galaxySizeY  * 0.5);
	galacticCenter.name = "Sagitarrius A*";
	galacticCenter.astronomicObject[0][0] = new Star(galacticCenter, AOType.blackHole);
	
	while (Galaxy.starSystems.size() < maxSystems) {
		StarSystem starSystem = new StarSystem();
		starSystem.astronomicObject[0][0] = new Star(starSystem);
		starSystem.initializePlanets();
		}
		
	for (StarSystem starSystem : Galaxy.starSystems){
		if (starSystem.coordinateX == 0 | starSystem.coordinateY == 0){  
				setSystemCoordinates(starSystem);
			}
		}
	fakeKnowledge();
	}





private static void setSystemCoordinates (StarSystem starSystem) {
	starSystem.coordinateX  = (int)(Math.random() * (Galaxy.galaxySizeX - 2 * Galaxy.galaxyPadding)/2 + Math.random() * (Galaxy.galaxySizeX - 2 * Galaxy.galaxyPadding)/2);
	starSystem.coordinateY  = (int)(Math.random() * (Galaxy.galaxySizeY - 2 * Galaxy.galaxyPadding)/2 + Math.random() * (Galaxy.galaxySizeY - 2 * Galaxy.galaxyPadding)/2);
	
		
	for	(StarSystem checkStarSystem : Galaxy.starSystems)
		if 	(checkStarSystem != starSystem) {
				if 	(Math.sqrt(Math.pow((checkStarSystem.coordinateX - starSystem.coordinateX)/GalaxyParameter.minSystemDistanceHorizontal,2) + Math.pow(checkStarSystem.coordinateY - starSystem.coordinateY,2)) < GalaxyParameter.minSystemDistance){
				setSystemCoordinates (starSystem);
				}
		}
	}

////Faking Knowledge XXX

private static void fakeKnowledge () {
for (StarSystem starSystem : Galaxy.starSystems){
	if (Math.random() < 0.5){
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	if (starSystem.coordinateX > 0 && starSystem.coordinateX < 1000 && starSystem.coordinateY > 0 && starSystem.coordinateY < 1000){
		starSystem.owner = Species.asari.empire;
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	if (starSystem.coordinateX > 1000 && starSystem.coordinateX < 1600 && starSystem.coordinateY > 0 && starSystem.coordinateY < 1000){
		starSystem.owner = Species.drell.empire;
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	if (starSystem.coordinateX > 1600 && starSystem.coordinateX < 2600 && starSystem.coordinateY > 0 && starSystem.coordinateY < 1000){
		starSystem.owner = Species.protheans.empire;
//		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	if (starSystem.coordinateX > 0 && starSystem.coordinateX < 1000 && starSystem.coordinateY > 1000 && starSystem.coordinateY < 1600){
		starSystem.owner = Species.krogan.empire;
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	if (starSystem.coordinateX > 1000 && starSystem.coordinateX < 1600 && starSystem.coordinateY > 1000 && starSystem.coordinateY < 1600){
		starSystem.owner = Species.salarians.empire;
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	if (starSystem.coordinateX > 1600 && starSystem.coordinateX < 2600 && starSystem.coordinateY > 1000 && starSystem.coordinateY < 1600){
		starSystem.owner = Species.quarians.empire;
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	if (starSystem.coordinateX > 0 && starSystem.coordinateX < 1000 && starSystem.coordinateY > 1600 && starSystem.coordinateY < 2600){
		starSystem.owner = Species.turians.empire;
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	if (starSystem.coordinateX > 1000 && starSystem.coordinateX < 1600 && starSystem.coordinateY > 1600 && starSystem.coordinateY < 2600){
		starSystem.owner = Species.humans.empire;
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	
	if (starSystem.coordinateX > 1600 && starSystem.coordinateX < 2600 && starSystem.coordinateY > 1600 && starSystem.coordinateY < 2600){
		starSystem.owner = Species.batarians.empire;
		Species.humans.empire.starSystemsKnown.add(starSystem);
		}
	}
}
}