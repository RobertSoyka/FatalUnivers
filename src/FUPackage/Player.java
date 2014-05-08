package FUPackage;

import java.awt.Color;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;

public class Player implements IGeneralData { 
	
	public static int players;
	
	public int playerID;
	public Species playerSpecies;
	public StarSystem selectedStarSystem;
	public AstronomicObject selectedAO;
	
	public static int galaxyMapX = 750;
	public static int galaxyMapY = 1650;


	
public Player(Species species){
	Galaxy.players.add(this);
	this.playerID = Galaxy.players.size();
	this.playerSpecies = species;
	this.selectedStarSystem = species.homeSystem;
	this.selectedAO = species.homeworld;
	
	}
}





