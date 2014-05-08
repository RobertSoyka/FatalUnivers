package FUPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.JSlider;

public class Population implements IGeneralData{

public Colony colony;	
public Species species;
public double quantity; // in Mio.
public double qualification = 1;
public double mood = 1;
public int occupation = 3;
public double outputPotential = 0;



public Population (Colony colony_, Species species_, double quantity_, double qualification_, double  mood_) {
this.colony = colony_; 
this.species = species_;	
this.quantity = quantity_;
this.qualification = qualification_;
this.mood = mood_;
colony_.populations.add(this);

}

public double getMoodFactor(){
return (this.mood - 1.0) * ( 1.0 + this.species.moodSensitivity.modifier);
}

public double getGravMalus(){
return Math.max(Parameter.gravMalusMinimum, colony.location.getGravitation() > this.species.getGravOptimum() ? (colony.location.getGravitation() - this.species.getGravOptimum()) * Parameter.gravMalus : 0);
}

public double getWorkforce(){
return (this.quantity * this.species.workforce.modifier);
}

public double getDeaths(){
return (this.quantity * ( this.species.mortalityRate.modifier + this.colony.buildingsEffect.mortalityRate.modifier + this.colony.aoSpecialEffects.mortalityRate.modifier ) / Parameter.turnsPerYear);
}

public double getBirths(){
return (this.quantity * ( this.species.birthRate.modifier + this.colony.buildingsEffect.birthRate.modifier )/ Parameter.turnsPerYear);
}

public double getMoodChange(){
return (colony.getMoodBase() - this.mood)/Parameter.turnsPerYear ;
}

public double getQualificationChange(){
//	System.out.print("Quali : " + (colony.buildingsEffect.qualification - this.qualification) / (this.species.lifeExpectancy * Parameter.turnsPerYear ) * 4 );
return (colony.buildingsEffect.qualification.modifier - this.qualification) / (this.species.lifeExpectancy.modifier * Parameter.turnsPerYear ) * 4 ;
 

}

}