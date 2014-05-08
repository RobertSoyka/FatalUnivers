package FUPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Commodity extends Asset implements IGeneralData{


double stock;
double demand;
double supply;
double exportPotential;
double importDemand;
double price;

public Commodity(AssetType type_){
this.type = type_;
this.stock = 0;
this.output = 0;
this.demand = 0;
this.supply = 0;
this.price = type_.basePrice;
this.exportPotential = 0;
this.importDemand = 0;
}


	
	
}