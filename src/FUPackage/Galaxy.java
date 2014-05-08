package FUPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class Galaxy implements IGeneralData{
public static Set <Species> availableSpecies = new LinkedHashSet<Species>();
public static Set <Player> players = new LinkedHashSet<Player>();

public static HashSet<StarSystem> starSystems = new HashSet<StarSystem>();
public static HashSet<AssetType> assetTypes = new HashSet<AssetType>();

public static int turn = 20000;

public static final int galaxySizeX = 2600; // resolutionX - GalaxyParameter.outerLimitX;
public static final int galaxySizeY = 2600; // resolutionY - mainPanelHeight - GalaxyParameter.outerLimitY;
public static final int galaxyPadding = 70; 


public static int[] starsType = new int[12];


}