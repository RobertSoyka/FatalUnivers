package FUPackage;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import javax.swing.Icon;


public class Character implements IGeneralData{

	// Emperor
	// system governor
	// science project leader
	// general
	// admiral
	// agent
	
	
	String name;
	Species species;
	double experience;
//	CharacterTrait background;
	int birthTurn;
//	Set<CharacterTrait> characterSpeciesTraits =  new HashSet<CharacterTrait>();
	
	// Politics
	
	double belligerence;
	double popularity;
	double networking;
	double loyality;
	double health;
	
	Set<Character> friends =  new HashSet<Character>();
	Set<Character> enemies =  new HashSet<Character>();
	
	EconomicEffects characterEffects = new EconomicEffects(); 

}


