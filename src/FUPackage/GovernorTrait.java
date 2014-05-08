package FUPackage;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import javax.swing.Icon;


public class GovernorTrait extends EconomicEffects implements IGeneralData{

	public String name  = "";
		
	
// Background
	public static GovernorTrait farmer = new GovernorTrait();
	public static GovernorTrait agroEngineer = new GovernorTrait();
	public static GovernorTrait foodMogul = new GovernorTrait();
	
	public static GovernorTrait miner = new GovernorTrait();
	public static GovernorTrait geoEngineer = new GovernorTrait();
	public static GovernorTrait steelBaron = new GovernorTrait();
	
	public static GovernorTrait worker = new GovernorTrait();
	public static GovernorTrait factoryEngineer = new GovernorTrait();
	public static GovernorTrait factoryOwner = new GovernorTrait();

	public static GovernorTrait inventor = new GovernorTrait();
	public static GovernorTrait computerEngineer = new GovernorTrait();
	public static GovernorTrait highTechIndustrialist = new GovernorTrait();
	
	public static GovernorTrait biologist = new GovernorTrait();
	public static GovernorTrait geneticEngineer = new GovernorTrait();
	
	public static GovernorTrait physican = new GovernorTrait();
	public static GovernorTrait nuclearPhysican = new GovernorTrait();
	
	public static GovernorTrait sociologist = new GovernorTrait();
		
	public static GovernorTrait trader = new GovernorTrait();
	public static GovernorTrait investor = new GovernorTrait();
	
	public static GovernorTrait archaeologist = new GovernorTrait();
	
	public static GovernorTrait shipEngineer = new GovernorTrait();
	
	public static GovernorTrait buerocrat = new GovernorTrait();
	public static GovernorTrait administrator = new GovernorTrait();
	
	public static GovernorTrait squadLeader = new GovernorTrait();
	public static GovernorTrait divisionLeader = new GovernorTrait();
	public static GovernorTrait armyLeader = new GovernorTrait();
	
	public static GovernorTrait commander = new GovernorTrait();
	public static GovernorTrait captain = new GovernorTrait();
	public static GovernorTrait admiral = new GovernorTrait();

	public static GovernorTrait policeLeader = new GovernorTrait();
	public static GovernorTrait policeInspector = new GovernorTrait();
	
	public static GovernorTrait thief = new GovernorTrait();
	
	public static GovernorTrait hacker = new GovernorTrait();
	
	public static GovernorTrait assassin = new GovernorTrait();
	
	public static GovernorTrait sniper = new GovernorTrait();
	
	public static GovernorTrait scout = new GovernorTrait();
	
	public static GovernorTrait warHero = new GovernorTrait();
	
	public static GovernorTrait warlord = new GovernorTrait();
	
	public static GovernorTrait mediaMogul = new GovernorTrait();

	public static GovernorTrait workersRepresentative = new GovernorTrait();
	
	public static GovernorTrait innovator = new GovernorTrait();
	
	public static GovernorTrait artist = new GovernorTrait();
	
	
	

// Education	

public static GovernorTrait educationNone = new GovernorTrait();
public static GovernorTrait educationSchool = new GovernorTrait();
public static GovernorTrait educationUniversity = new GovernorTrait();
public static GovernorTrait educationMilitaryAcademy = new GovernorTrait();
	
// Other Traits		
public static GovernorTrait cleptocratic = new GovernorTrait();
public static GovernorTrait corrupt = new GovernorTrait();

public static GovernorTrait chronicallyIll = new GovernorTrait();

public static GovernorTrait arrogant = new GovernorTrait();

public static GovernorTrait ambitious = new GovernorTrait();

public static GovernorTrait greedy = new GovernorTrait();
public static GovernorTrait generous = new GovernorTrait();

public static GovernorTrait paranoid = new GovernorTrait();

public static GovernorTrait charismatic = new GovernorTrait();
public static GovernorTrait distanced = new GovernorTrait();
public static GovernorTrait brute = new GovernorTrait();

public static GovernorTrait economicLiberal = new GovernorTrait();
public static GovernorTrait economicInterventionist = new GovernorTrait();
public static GovernorTrait economicPlanned = new GovernorTrait();


public static GovernorTrait stubborn = new GovernorTrait();



// Team
public static GovernorTrait mentor = new GovernorTrait();
public static GovernorTrait brainTrust = new GovernorTrait();
public static GovernorTrait personalPR = new GovernorTrait();
public static GovernorTrait businessFriends = new GovernorTrait();
public static GovernorTrait researchTeam = new GovernorTrait();


public static GovernorTrait instructors = new GovernorTrait();
public static GovernorTrait soldiers = new GovernorTrait();
public static GovernorTrait officiers = new GovernorTrait();
public static GovernorTrait supplyStaff = new GovernorTrait();


public static GovernorTrait navigator = new GovernorTrait();
public static GovernorTrait engineer = new GovernorTrait();
public static GovernorTrait gunner = new GovernorTrait();


void setName (String x) {
	this.name = x;
}

String getName () {
	return this.name;
}






public GovernorTrait(){
	
}

public static void initialize(){
	farmer.potentialFarmers.modifier = 0.05;
	farmer.foodOutput.modifier = 0.05;
	
	agroEngineer.potentialFarmers.modifier = 0.10;
	agroEngineer.foodOutput.modifier = 0.10;
	
	foodMogul.potentialFarmers.modifier = 0.10;
	foodMogul.foodOutput.modifier = 0.10;
	
	
	}
}



