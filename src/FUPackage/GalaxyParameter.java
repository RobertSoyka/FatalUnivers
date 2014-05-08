package FUPackage;

public abstract class GalaxyParameter {
	
	//public static int[][] coordinates = new int[maxSystems][2];
	public static final int outerLimitX = 100;
	public static final int outerLimitY = 80;

	public static final int minSystemDistance = 32; //coordinate points
	public static final int minSystemDistanceHorizontal = 2; 

	// universal constants
	public static final int celsius = 273; // Difference between Kelvin and Celsius Scale 
	public static final double gravConstant = 6.67384 * Math.pow(10,-11);
	public static final float lightSpeed = 300000;
	public static final float schwarzschild = 2.95F;
	public static final double dSun =1390000; 
	public static final float tSun = 5778;
	public static final float gSun = 28; //
	public static final float gEarth = 9.81F; //
	public static final float mSun = 332942; // Sun Mass in earth Masses
	public static final double mEarth = 5.9736 *  Math.pow(10,24); 
	public static final int baseTempEarth = 277;
	public static final double dAU = 149600000; // Astronomic Unit in km
	public static final int baseTempUniverse = 3;
	public static final int abundanceExponent = 5; // Makes it more likely that the resource abundance is near the lower end of the scale 
	public static final int atmoPressureExponent = 3; // Makes it more likely that the atmosPressure is near the lower end of the scale
	
	// Start of System
	public static final float minStarDistance = 0.1F; // in AU depending on square root of Luminosity!
	public static final float maxStarDistance = 0.75F; // in AU depending on square root of Luminosity!
	
	// New Planets
	public static final float tidalForceLimit = 0.02F;	
	public static final float minRelativeDistance = 1.3F;
	
	public static final float massDistanceModifier = 1000000; // adds X km distance to neighbours for each sun Mass
	public static final float minDistanceMoon = 150000;
	public static final float distanceModifierMoon = 9; 
	public static final float maxSizerMoon = 0.6F;
	public static final float secondaryStarChance = 0.4F; 
	
	// End of the system
	public static final int minOrbits = 5;
	public static final float systemEndChance = 0.05F; // Chance increase for each orbit after min Orbit that system ends there...
	public static final float maxDistance = 40;
 	
	// Ecologic cheats, create more Terran Planets than would be in reality by adjusting temperature
	public static final int farmArea = 300000; // Arable land needed for 1 Mt Food potential
	public static final float minGravAthmo = 0.2F;
	public static final long minDayLength = 30000;
	public static final long maxDayLength = 300000;
	public static final float specialFavouredProbability = 3; // Probability is increased by this value if favoured by at least one existing special  
	
}
