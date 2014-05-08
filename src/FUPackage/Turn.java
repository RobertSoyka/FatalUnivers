package FUPackage;

public abstract class Turn implements IGeneralData{
		
public static void turn(){
	
// Economy and Ecology XXX	
	for (Species species : Galaxy.availableSpecies){
		species.empire.turn();		
		}
	
	for (StarSystem starSystem : Galaxy.starSystems){
		for(AstronomicObject astronomicObject : starSystem.astronomicObjects){
			
		//	if (astronomicObject.colony != null){
		//		System.out.print("Name : " + astronomicObject.getName());
		//		astronomicObject.colony.turn();
		//		astronomicObject.colony.actualizeProduction();
		//	}
				
			
			
			
		}
		
		
		
	}
	
	
	Galaxy.turn++;
	}
}