package FUPackage;

public class AtmoType implements IGeneralData{
	public String name;
	
	int constructionCost;
	int terraformingCosts;
    double greenhouseEffect;
	
	public static final AtmoType none 		= new AtmoType(language.none, 25, 1000, 1.0);
	public static final AtmoType plasma		= new AtmoType(language.plasma, 0, 0, 1.0);
	public static final AtmoType H2 		= new AtmoType(language.H2, 25, 200, 1.05);
	public static final AtmoType H2_He		= new AtmoType(language.H2_He, 25, 200, 1.05);
	public static final AtmoType N2 		= new AtmoType(language.N2, 25, -25, 1.10);
	public static final AtmoType N2_O2		= new AtmoType(language.N2_O2, 25, -25, 1.15);
	public static final AtmoType N2_O2_CO2	= new AtmoType(language.N2_O2_CO2, 25, -25, 1.20);
	public static final AtmoType N2_CO2		= new AtmoType(language.N2_CO2, 25, -25, 1.25);
	public static final AtmoType N2_NH3		= new AtmoType(language.N2_NH3, 25, 300, 1.5);
	public static final AtmoType CO2 		= new AtmoType(language.CO2, 25, 0, 1.30);
	public static final AtmoType CO2_SO2	= new AtmoType(language.CO2_SO2, 50, 200, 1.2);
	
	void setName(String name_){
	this.name = name_;	
	}

	public String getName(){
		return this.name;
	}
	
	void setConstructionCost(int constructionCost_){
		this.constructionCost = constructionCost_;	
	}

	public int getConstructionCost(){
		return this.constructionCost;
	}
	
	void setTerraformingCosts(int terraformingCosts_){
		this.terraformingCosts = terraformingCosts_;	
	}

	public int getTerraformingCosts(){
		return this.terraformingCosts;
	}
	
	void setGreenhouseEffect(double terraformingCosts_){
		this.greenhouseEffect = terraformingCosts_;	
	}

	public double getGreenhouseEffect(){
		return this.greenhouseEffect;
	}
	
	public AtmoType(String name_, int constructionCost_, int terraformingCosts_, double greenhouseEffect_) {
	this.name = name_;
	this.constructionCost = constructionCost_; 
	this.terraformingCosts = terraformingCosts_;   
	this.greenhouseEffect = greenhouseEffect_;
	}
}