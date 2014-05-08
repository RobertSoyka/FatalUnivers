package FUPackage;

public abstract class Parameter {
	
	public static int turnsPerYear = 10;
	
	// Start resources
	public static double startFood = 500;
	public static double startResources = 500;
	public static double startGoods = 500;
	public static double startMoney = 100;
	
	// Grav
	public static double gravMalus = -0.5; // productivity reduction per exceeding g
	public static double gravMalusMinimum = -0.9;
	
	// Mood
	public static double moodFactorFood = 0.0;
	public static double moodFactorResources = 1;
	public static double moodFactorGoods = 1; 
	public static double moodFactorResearch = 2.0;
	public static double moodFactorMinimum = -0.9;
		

	public static double startTurn = 2000; 
	
	public static double transportCost = 1;
	
	//Galaxy Creation
}
