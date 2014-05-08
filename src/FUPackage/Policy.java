package FUPackage;

import java.util.LinkedHashSet;
import java.util.Set;

public class Policy extends EconomicEffects{

	String name;
	
	// Government
	static Policy anarchy = new Policy();
	
	static Policy democracy = new Policy();  // Decentralized democracy
	
	static Policy plutocracy = new Policy(); // Decentralized autocracy
	
	static Policy aristocracy = new Policy(); // Decentralized autocracy
		
	static Policy stratocracy = new Policy(); // Decentralized autocracy
	
	static Policy autocracy = new Policy(); // Centralized autocracy 
	
	static Policy eusociality = new Policy(); // Hive mind
	
	// Economy
	static Policy subsistenceEconomy = new Policy();
	static Policy plannedEconomy = new Policy();
	static Policy marketEconomy = new Policy();
		
	// Social
	static Policy welfareState = new Policy();
	
	// Press
	static Policy mediaFree = new Policy();
	static Policy mediaCensorship = new Policy();
	static Policy mediaPropaganda = new Policy();
	
	// Security
	static Policy policeState = new Policy();
	
	// BirthPolicy
	static Policy proNatalism = new Policy();
	static Policy noPopulationPolicy = new Policy();
	static Policy antiNatalism = new Policy();
	
	EconomicEffects economicEffects = new EconomicEffects();
	
	double investigativeJournalism = 0;
	boolean privateSector = false;
	boolean elections = false;
	
	
	LinkedHashSet <Policy> excludes = new LinkedHashSet<Policy>();
		
	
static void initialize(){
	
// LEADERSHIP
	anarchy.administration.modifier = -1;
	anarchy.innovationOutput.modifier = 1;
	anarchy.excludes.add(policeState);
	anarchy.excludes.add(plannedEconomy);
	anarchy.excludes.add(mediaCensorship);
	anarchy.excludes.add(mediaPropaganda);

	democracy.mood.modifier = 0.05;
	democracy.riot.modifier = -0.1;
	democracy.counterintelligence.modifier = -0.2;
	democracy.researchOutput.modifier = 0.2;
	democracy.innovationOutput.modifier = 0.5;
	democracy.excludes.add(policeState);
	democracy.excludes.add(mediaPropaganda);
	
	plutocracy.administration.modifier = -0.5; 
	plutocracy.counterintelligence.modifier = -0.2;
	plutocracy.foodOutput.modifier = 0.15;
	plutocracy.potentialFarmers.modifier = -0.1;
	plutocracy.resourcesOutput.modifier = 0.1;
	plutocracy.goodsOutput.modifier = 0.1;
	plutocracy.innovationOutput.modifier = 0.5;
	plutocracy.investmentRatio.modifier  = 0.2;
	plutocracy.armySupport.modifier = -0.25;
	plutocracy.armyExperience.modifier = -0.25;
	plutocracy.fleetExperience.modifier = -0.25;
	plutocracy.excludes.add(plannedEconomy);
	
	aristocracy.administration.modifier = -0.1;
	aristocracy.counterintelligence.modifier = -0.2;
	aristocracy.armySupport.modifier = 1;
	aristocracy.armyExperience.modifier = 1;
	aristocracy.fleetExperience.modifier = 1;
	aristocracy.innovationOutput.modifier = 0.25;
	aristocracy.groundDefense.modifier = 1;
	
	stratocracy.administration.modifier = -0.1; 
	stratocracy.counterintelligence.modifier = -0.2;
	stratocracy.armySupport.modifier = 1;
	stratocracy.armyExperience.modifier = 1;
	stratocracy.fleetExperience.modifier = 1;
	stratocracy.innovationOutput.modifier = 0.25;
	stratocracy.groundDefense.modifier = 1;
	
	eusociality.foodOutput.modifier = 0.2;
	eusociality.resourcesOutput.modifier = 0.2;
	eusociality.goodsOutput.modifier = 0.2;
	eusociality.researchOutput.modifier = -0.2;
	eusociality.innovationOutput.modifier = -0.5;
	eusociality.excludes.add(marketEconomy);

// FREEDOM

	policeState.mood.modifier = -0.05;
	policeState.riot.modifier = -0.2;
	policeState.counterintelligence.modifier = 0.5;
	policeState.innovationOutput.modifier = -0.25;
	
// INFORMATION
	
	mediaFree.investigativeJournalism = 0.03;
	mediaFree.innovationOutput.modifier = 0.10;
	mediaFree.counterintelligence.modifier = - 0.1;
	mediaFree.riot.modifier = 0.05;
	
	mediaCensorship.investigativeJournalism = 0.01;
	mediaCensorship.counterintelligence.modifier = 0.1;
	
	mediaPropaganda.mood.modifier = 0.05;
	mediaPropaganda.riot.modifier = 0.05;
	mediaPropaganda.innovationOutput.modifier = - 0.10;
	mediaPropaganda.counterintelligence.modifier = 0.20;
	
	
// ECONOMIC SYSTEM	
	
	subsistenceEconomy.foodOutput.modifier = 1;
	subsistenceEconomy.potentialFarmers.modifier = -0.5;
	subsistenceEconomy.resourcesOutput.modifier = -0.2;
	subsistenceEconomy.goodsOutput.modifier = -0.2;
	subsistenceEconomy.serviceSector.modifier = -0.5;
	subsistenceEconomy.qualification.modifier = -0.5;
	subsistenceEconomy.administration.modifier = -0.5;
	
	plannedEconomy.privateSector = false;
		
	marketEconomy.privateSector = true;
	marketEconomy.investmentRatio.modifier  = 0.5; 
	marketEconomy.foodOutput.modifier = 0.25;
	marketEconomy.potentialFarmers.modifier = -0.2;
	marketEconomy.resourcesOutput.modifier = 0.25;
	marketEconomy.goodsOutput.modifier = 0.25;
	marketEconomy.serviceSector.modifier = 0.5;
	marketEconomy.innovationOutput.modifier = 0.5;


	
	
}
	
	

	
	
	
}
