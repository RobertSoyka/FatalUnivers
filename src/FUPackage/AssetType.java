package FUPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class AssetType implements IGeneralData{

	
String name = "I need a name";
String unit = "I need a name";
boolean tradeable = true;
boolean needsExportCapacity = true;
boolean empireStock = false;
double productionDemand = 0;
double researchDemand = 0;
double baseOutput = 1;
double basePrice = 1;
Icon icon = new ImageIcon(GraphicFU.class.getResource("GUI/qMark.png")); 


static AssetType food				= new AssetType(language.food, language.abbrMegatons, true, true, false, 0, 0, 0.1, 1.0, GraphicFU.foodIcon);
static AssetType resources			= new AssetType(language.resources, language.abbrMegatons, true, true, false, 1, 0, 0.1, 2.0, GraphicFU.resourcesIcon);
static AssetType hydrocarbons		= new AssetType(language.hydrocarbons, language.abbrMegatons, true, true, false, 0.2, 0, 0.1, 2.0, GraphicFU.hydrocarbonsIcon);
static AssetType rareElements		= new AssetType(language.rareElements, language.abbrKilotons, true, true, false, 0.2, 0, 0.1, 2.0, GraphicFU.rareElementsIcon);
static AssetType preciousMetals		= new AssetType(language.preciousMetals, language.abbrKilotons, true, true, false, 0.2, 0, 0.1, 2.0, GraphicFU.preciousMetalsIcon);

static AssetType goods				= new AssetType(language.goods, language.abbrMegatons, true, true, false, 0, 0, 0.1, 4.0, GraphicFU.goodsIcon);

static AssetType isotopes			= new AssetType(language.isotopes, language.abbrTons, true, true, false, 0, 0, 0.1, 1.0, GraphicFU.isotopesIcon);
static AssetType elementZ			= new AssetType(language.elementZ, language.abbrTons, true, true, false, 0, 0, 0.1, 1.0, GraphicFU.elementGIcon);

static AssetType artifacts			= new AssetType(language.artifacts, language.abbrTons, true, true, false, 0, 0.1, 1, 1, GraphicFU.artifactsIcon);
static AssetType bioSamples			= new AssetType(language.bioSamples, language.abbrTons, true, true, false, 0, 0.1, 1, 1, GraphicFU.artifactsIcon);

static AssetType services			= new AssetType(language.services, language.abbrBillionCredits, false, false, false,0, 0, 0.1, 1, GraphicFU.servicesIcon);
static AssetType money				= new AssetType(language.money, language.abbrBillionCredits, false, false, true, 0, 0, 0, 1, GraphicFU.moneyIcon);
static AssetType investments		= new AssetType(language.investments, language.abbrBillionCredits, false, false, true, 0, 0, 0.1, 1, GraphicFU.moneyIcon);

static AssetType research			= new AssetType(language.research, language.abbrResearchUnits, false, false, true, 0, 0, 0.1, 1, GraphicFU.researchIcon);
static AssetType innovation			= new AssetType(language.innovation, language.abbrResearchUnits, false, false, true, 0, 0, 0.1, 1, GraphicFU.innovationIcon);

//static AssetType taxMoney			= new AssetType(language.money, language.abbrBillionCredits, false, false, 0, 0, 0, 1, GraphicFU.moneyIcon);



public AssetType(String name_, String unit_, boolean tradeable_, boolean needsExportCapacity_, boolean empireStock_, double productionDemand_, double researchDemand_, double baseOutput_, double basePrice_, Icon icon_){
this.name = name_;
this.unit = unit_;
this.tradeable = tradeable_;
this.needsExportCapacity = needsExportCapacity_; 
this.productionDemand = productionDemand_;
this.empireStock = empireStock_;
this.researchDemand = researchDemand_;
this.baseOutput = baseOutput_;
this.basePrice = basePrice_;
this.icon = icon_;
Galaxy.assetTypes.add(this);
}


	
	
}