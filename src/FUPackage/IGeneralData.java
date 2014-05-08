package FUPackage;


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

interface IGeneralData { 
	
	// System.out.print("Name : " + ao_.getName()); // XXX
	
	public static int resolutionX = 1900; //1360
	public static int resolutionY = 900; // 710
//	public static final int topNaviHeight = 40;
	public static final int bottomPanelHeight = 200;
	public static final Color GUIColor = new Color(255,200,0);
	public static final Color colorFood = new Color(50,200,50, 125);
	public static final Color colorResources = new Color(200,0,0, 125);
	public static final Color colorGoods = new Color(50,50,255,125);
	public static final Color colorServices = new Color(255,200,0, 125);
	public static final Color colorResearch = new Color(0,255,255, 125);
	public static final Color colorPublicServices = new Color(200,200,200, 125);
	public static final Color colorFoodLight = new Color(50,200,50, 50);
	public static final Color colorResourcesLight = new Color(200,0,0, 50);
	public static final Color colorGoodsLight = new Color(50,50,255,50);
	public static final Color colorServicesLight = new Color(255,200,0, 50);
	public static final Color colorResearchLight = new Color(0,255,255, 50);
	public static final Color colorPublicServicesLight = new Color(200,200,200, 50);
	
	
	
	public static final Color colorRed	= new Color(185,0,0,255);
	
	public static final Border GUIBorder = BorderFactory.createLineBorder(GUIColor);
	public static final Border foodBorder = BorderFactory.createLineBorder(colorFood);
	public static final Border resourcesBorder = BorderFactory.createLineBorder(colorResources);
	public static final Border goodsBorder = BorderFactory.createLineBorder(colorGoods);
	public static final Border servicesBorder = BorderFactory.createLineBorder(colorServices);
	public static final Border researchBorder = BorderFactory.createLineBorder(colorResearch);
	
	public static final EmptyBorder eBorder = new EmptyBorder(10, 10, 10, 10); // oben, rechts, unten, links
	public Language language = Language.english;
	
	
	public static final int maxSystems = 250;
	public static final int maxPlanets = 11;
	public static final int maxMoons = 6;
	public static final int planetSizeClasses = 5;
	public static final int maxSpecials = 4;
		
	public static final int flagSymbols = 86;
	
	public static final int maxSpecies = 16;
	public static final int maxEmpires = 16;
	
	public final static Font hugeFont = new Font("Slider", Font.BOLD, 34); //+ Font.ITALIC
	public final static Font bigFont = new Font("Slider", Font.PLAIN, 24); //+ Font.ITALIC
	public final static Font mediumFont = new Font("Slider", Font.PLAIN, 18); //+ Font.ITALIC
	public final static Font mediumFontItalic = new Font("Slider", Font.ITALIC, 18); //+ Font.ITALIC
	public final static Font smallFont = new Font("Slider", Font.PLAIN , 12); //+ Font.ITALIC
	public final static Font smallFontItalic = new Font("Slider", Font.ITALIC, 12); //+ Font.ITALIC
	
	public final static Font mediumSpecial = new Font("Korataki", Font.PLAIN, 20); //+ Font.ITALIC  Slider
	public final static Font smallSpecial = new Font("Korataki", Font.PLAIN, 10); //+ Font.ITALIC  Slider
	
	
	
	
	
	
	
	
	
	
	}