package FUPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Asset implements IGeneralData{

AssetType type;
double output;
double price;

public Asset(){
}

public Asset(AssetType type_){
this.type = type_;
this.output = 0;
this.price = type_.basePrice;
}


	
	
}