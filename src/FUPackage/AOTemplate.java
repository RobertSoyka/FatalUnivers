package FUPackage;

import java.util.HashSet;
import java.util.Set;

public class AOTemplate extends Planet implements IGeneralData{
	
	double luminosity = 0;
	int systemStar = 0;
	
	static AOTemplate mercury = new AOTemplate();
	static AOTemplate venus = new AOTemplate();
	
	static AOTemplate earth = new AOTemplate();
	static AOTemplate luna = new AOTemplate();
	
	static AOTemplate mars = new AOTemplate();
	
	static AOTemplate mainBelt = new AOTemplate();
	
	static AOTemplate io = new AOTemplate();
	static AOTemplate europa = new AOTemplate();
	static AOTemplate ganymede = new AOTemplate();
	static AOTemplate callisto = new AOTemplate();
	
	static AOTemplate tethys = new AOTemplate();
	static AOTemplate dione = new AOTemplate();
	static AOTemplate rhea = new AOTemplate();
	static AOTemplate titan = new AOTemplate();
	static AOTemplate iapetus = new AOTemplate();
	
	static AOTemplate ariel = new AOTemplate();
	static AOTemplate umbriel = new AOTemplate();
	static AOTemplate titania = new AOTemplate();
	static AOTemplate oberon = new AOTemplate();
	
	static AOTemplate triton = new AOTemplate();
		
	static AOTemplate kuiperBelt = new AOTemplate();
	
	
	static AOTemplate sol = new AOTemplate();
	static AOTemplate jupiter = new AOTemplate();
	static AOTemplate saturn = new AOTemplate();
	static AOTemplate uranus = new AOTemplate();
	static AOTemplate neptune = new AOTemplate();
	
	
	public AOTemplate() {
		}	
	
	static void initializeSol(){
		
		sol.aoType = AOType.classG;
		sol.sizer = 0.8;
		sol.diameter = 1392684;
		sol.mass = 1;
		sol.atmoType = AtmoType.plasma;
		sol.temperature = 5778;
		sol.luminosity = 1;
		sol.orbitalPeriod = 0;
		sol.name = language.sol;
		sol.starDistance = 0;
		sol.moonDistance = 0;
		//sol.specials.addAll(template.specials);	
		
		
		mercury.aoType						= AOType.rock;
		mercury.starDistance				= 57960000;
		mercury.moonDistance 				= 0;
		mercury.name						= language.mercury;
		mercury.sizer 						= 0.155;
		mercury.mass						= 0.00000016519393768284;					
		mercury.diameter					= 4879;				
		mercury.temperature					= 440;
		mercury.atmoType					= AtmoType.none;
		mercury.orbitalPeriod				= 7600521;
		mercury.gravitation 				= 0.37F;
		mercury.resources 					= 1.5;
		mercury.oceans 						= 0;
		mercury.ecosystem 					= 0;
		mercury.dayLength 					= 5067360;
		mercury.pressure 					= 0;
		mercury.specials.add(AOSpecial.endlessNights);
		mercury.specials.add(AOSpecial.intenseInsolation);
		mercury.specials.add(AOSpecial.heavyMetalDeposits);
		mercury.specials.add(AOSpecial.isotopeDeposits);
		
	
		venus.aoType						= AOType.toxic;
		venus.starDistance					= 108160000;
		venus.moonDistance 					= 0;
		venus.name							= language.venus;
		venus.sizer 						= 0.444;
		venus.mass							= 0.000003;					
		venus.diameter						= 12103;				
		venus.temperature					= 690;
		venus.atmoType						= AtmoType.CO2;
		venus.orbitalPeriod					= 19409760;
		venus.gravitation 					= 0.9F;
		venus.resources 					= 1.2;
		venus.oceans 						= 0;
		venus.ecosystem 					= 0;
		venus.dayLength 					= 10087200;
		venus.pressure 						= 92;
		venus.specials.add(AOSpecial.endlessNights);
		venus.specials.add(AOSpecial.rareElementsDeposits);
		venus.specials.add(AOSpecial.volcanism);
	
		
		earth.aoType						= AOType.terran;
		earth.starDistance					= 149600000;
		earth.moonDistance 					= 0;
		earth.name							= language.earth;
		earth.sizer 						= 0.47;
		earth.mass							= 0.0000031;					
		earth.diameter						= 12756;				
		earth.temperature					= 290;
		earth.atmoType						= AtmoType.N2_O2;
		earth.orbitalPeriod					= 31557600;
		earth.gravitation 					= 1;
		earth.resources 					= 1;
		earth.oceans 						= 0.71;
		earth.ecosystem 					= 0.7;
		earth.dayLength 					= 86400;
		earth.pressure 						= 1;
		earth.specials.add(AOSpecial.homeworld);
		earth.specials.add(AOSpecial.hydrocarbonDeposits);

		
		luna.aoType							= AOType.rock;
		luna.starDistance					= 149600000;
		luna.moonDistance 					= 384400;
		luna.name							= language.luna;
		luna.sizer 							= 0.099;
		luna.mass							= 0.00000003694337151816;					
		luna.diameter						= 3476;				
		luna.temperature					= 220;
		luna.atmoType						= AtmoType.none;
		luna.orbitalPeriod					= 31557600;
		luna.gravitation 					= 0.162F;
		luna.resources 						= 1.14;
		luna.oceans 						= 0;
		luna.ecosystem 						= 0;
		luna.dayLength 						= 2360534;
		luna.pressure 						= 0;
		luna.specials.add(AOSpecial.endlessNights);
		luna.specials.add(AOSpecial.isotopeDeposits);

		
		mars.aoType							= AOType.rock;
		mars.starDistance					= 227939100;
		mars.moonDistance 					= 0;
		mars.name							= language.mars;
		mars.sizer 							= 0.2316;
		mars.mass							= 0.00000032;					
		mars.diameter						= 6792;				
		mars.temperature					= 210;
		mars.atmoType						= AtmoType.CO2;
		mars.orbitalPeriod					= 59355072;
		mars.gravitation 					= 0.376F;
		mars.resources 						= 1.45;
		mars.oceans 						= 0.28;
		mars.ecosystem 						= 0;
		mars.dayLength 						= 88596;
		mars.pressure 						= 0.006;
		mars.specials.add(AOSpecial.preciousMetalDeposits);
		mars.specials.add(AOSpecial.subsurfaceEcosystem);
	
		mainBelt.aoType						= AOType.asteroid;
		mainBelt.starDistance				= 413910000;
		mainBelt.moonDistance 				= 0;
		mainBelt.name						= language.mainBelt;
		mainBelt.sizer 						= 0.35;
		mainBelt.mass						= 0.00000000045052892095;					
		mainBelt.diameter					= 975;				
		mainBelt.temperature				= 167;
		mainBelt.atmoType					= AtmoType.none;
		mainBelt.orbitalPeriod				= 145228075;
		mainBelt.gravitation 				= 0.028F;
		mainBelt.resources 					= 1;
		mainBelt.oceans 					= 0;
		mainBelt.ecosystem 					= 0;
		mainBelt.dayLength 					= 32667;
		mainBelt.pressure 					= 0;
		mainBelt.specials.add(AOSpecial.preciousMetalDeposits);
	
	
		jupiter.aoType = AOType.gasGiant;
		jupiter.sizer = 0.75;
		jupiter.diameter = 142984;
		jupiter.mass = 0.00095452060719284400;
		jupiter.atmoType = AtmoType.H2_He;
		jupiter.temperature = 165;
		jupiter.luminosity = 0;
		jupiter.orbitalPeriod = 374329940;
		jupiter.name = language.jupiter;
		jupiter.starDistance = 778547200;
		jupiter.moonDistance = 0;
		jupiter.specials.add(AOSpecial.magneticField);
		
		io.aoType							= AOType.toxic;
		io.starDistance						= 778547200;
		io.moonDistance 					= 421700;
		io.name								= "Io";
		io.sizer 							= 0.05;
		io.mass								= 0.00000004505289209532;					
		io.diameter							= 3637;				
		io.temperature						= 110;
		io.atmoType							= AtmoType.none;
		io.orbitalPeriod					= 374329940;
		io.gravitation 						= 0.183F;
		io.resources 						= 1.3;
		io.oceans 							= 0;
		io.ecosystem 						= 0;
		io.dayLength 						= 152853;
		io.pressure 						= 0;
		io.specials.add(AOSpecial.magneticField);
		io.specials.add(AOSpecial.tidalHeating);
		io.specials.add(AOSpecial.volcanism);

		
		europa.aoType						= AOType.ice;
		europa.starDistance					= 778547200;
		europa.moonDistance 				= 671034;
		europa.name							= language.europa;
		europa.sizer 						= 0.05;
		europa.mass							= 0.00000002402820911750;					
		europa.diameter						= 3046;				
		europa.temperature					= 102;
		europa.atmoType						= AtmoType.none;
		europa.orbitalPeriod				= 374329940;
		europa.dayLength 					= 306822;
		europa.gravitation 					= 0.134F;
		europa.resources 					= 0.21;
		europa.oceans 						= 1;
		europa.ecosystem 					= 0;
		europa.pressure 					= 0.006;
		europa.specials.add(AOSpecial.longNights);
		europa.specials.add(AOSpecial.tidalHeating);
		europa.specials.add(AOSpecial.subsurfaceEcosystem);
		
		
		ganymede.aoType						= AOType.ice;
		ganymede.starDistance				= 778547200;
		ganymede.moonDistance 				= 1070412;
		ganymede.name						= language.ganymede;
		ganymede.sizer 						= 0.21;
		ganymede.mass						= 0.00000007508815349220;					
		ganymede.diameter					= 5268;				
		ganymede.temperature				= 110;
		ganymede.atmoType					= AtmoType.none;
		ganymede.orbitalPeriod				= 374329940;
		ganymede.gravitation 				= 0.146F;
		ganymede.resources 					= 0.19;
		ganymede.oceans 					= 1;
		ganymede.ecosystem 					= 0;
		ganymede.dayLength 					= 618153;
		ganymede.pressure 					= 0;
		ganymede.specials.add(AOSpecial.bottomless);
		ganymede.specials.add(AOSpecial.longNights);	
		
		callisto.aoType						= AOType.ice;
		callisto.starDistance				= 778547200;
		callisto.moonDistance 				= 1882709;
		callisto.name						= language.callisto;
		callisto.sizer 						= 0.05;
		callisto.mass						= 0.00000005406347051438;					
		callisto.diameter					= 3792;				
		callisto.temperature				= 134;
		callisto.atmoType					= AtmoType.none;
		callisto.orbitalPeriod				= 374329940;
		callisto.gravitation 				= 0.126F;
		callisto.resources 					= 0.14;
		callisto.oceans 					= 1;
		callisto.ecosystem 					= 0;
		callisto.dayLength 					= 1441931;
		callisto.pressure 					= 0;
		callisto.specials.add(AOSpecial.bottomless);
		callisto.specials.add(AOSpecial.endlessNights);
		
		
		saturn.aoType = AOType.gasGiant;
		saturn.sizer = 0.5;
		saturn.diameter = 120536;
		saturn.mass = 0.00028579151924359200;
		saturn.atmoType = AtmoType.H2;
		saturn.temperature = 134;
		saturn.luminosity = 0;
		saturn.orbitalPeriod = 929595379;
		saturn.name = language.saturn;
		saturn.starDistance = 1433449370;
		saturn.moonDistance = 0;
		saturn.specials.add(AOSpecial.magneticField);
		

		tethys.aoType						= AOType.ice;
		tethys.starDistance					= 1433449370;
		tethys.moonDistance 				= 294619;
		tethys.name							= language.tethys;
		tethys.sizer 						= 0.05;
		tethys.mass							= 0.0000000003093631924;					
		tethys.diameter						= 1066;				
		tethys.temperature					= 82;
		tethys.atmoType						= AtmoType.none;
		tethys.orbitalPeriod				= 929595379;
		tethys.gravitation 					= 0.0148F;
		tethys.resources 					= 0.14;
		tethys.oceans 						= 1;
		tethys.ecosystem 					= 0;
		tethys.dayLength 					= 163106;
		tethys.pressure 					= 0;
		tethys.specials.add(AOSpecial.bottomless);
		tethys.specials.add(AOSpecial.tidalHeating);
		 
		
		dione.aoType						= AOType.ice;
		dione.starDistance					= 1433449370;
		dione.moonDistance 					= 377396;
		dione.name							= language.dione;
		dione.sizer 						= 0.05;
		dione.mass							= 0.00000000098515657382;					
		dione.diameter						= 1123;				
		dione.temperature					= 87;
		dione.atmoType						= AtmoType.none;
		dione.orbitalPeriod					= 929595379;
		dione.gravitation 					= 0.0233F;
		dione.resources 					= 0.07;
		dione.oceans 						= 1;
		dione.ecosystem 					= 0;
		dione.dayLength 					= 236469;
		dione.pressure 						= 0;
		dione.specials.add(AOSpecial.bottomless);
		
		
		rhea.aoType							= AOType.ice;
		rhea.starDistance					= 1433449370;
		rhea.moonDistance 					= 527108;
		rhea.name							= language.rhea;
		rhea.sizer 							= 0.05;
		rhea.mass							= 0.000000001160;					
		rhea.diameter						= 1527;				
		rhea.temperature					= 73;
		rhea.atmoType						= AtmoType.none;
		rhea.orbitalPeriod					= 929595379;
		rhea.gravitation 					= 0.0265F;
		rhea.resources 						= 1;
		rhea.oceans 						= 0.28;
		rhea.ecosystem 						= 0;
		rhea.dayLength 						= 88596;
		rhea.pressure 						= 0;
		rhea.specials.add(AOSpecial.bottomless);
		
		
		titan.aoType						= AOType.ice;
		titan.starDistance					= 1433449370;
		titan.moonDistance 					= 1257060;
		titan.name							= language.titan;
		titan.sizer 						= 0.21;
		titan.mass							= 0.00000006757933814298;					
		titan.diameter						= 5152;				
		titan.temperature					= 94;
		titan.atmoType						= AtmoType.N2;
		titan.orbitalPeriod					= 929595379;
		titan.gravitation 					= 0.14F;
		titan.resources 					= 1.62;
		titan.oceans 						= 1;
		titan.ecosystem 					= 0;
		titan.dayLength 					= 1377648;
		titan.pressure 						= 1.467;
		titan.specials.add(AOSpecial.endlessNights);
		titan.specials.add(AOSpecial.bottomless);
		titan.specials.add(AOSpecial.hydrocarbonLakes);
		
		iapetus.aoType						= AOType.ice;
		iapetus.starDistance				= 1433449370;
		iapetus.moonDistance 				= 3560820;
		iapetus.name						= language.iapetus;
		iapetus.sizer 						= 0.05;
		iapetus.mass						= 0.000000000908;					
		iapetus.diameter					= 1469;				
		iapetus.temperature					= 110;
		iapetus.atmoType					= AtmoType.none;
		iapetus.orbitalPeriod				= 929595379;
		iapetus.gravitation 				= 0.0224F;
		iapetus.resources 					= 0.22;
		iapetus.oceans 						= 1;
		iapetus.ecosystem 					= 0;
		iapetus.dayLength 					= 6853378;
		iapetus.pressure 					= 0;
		iapetus.specials.add(AOSpecial.bottomless);
		iapetus.specials.add(AOSpecial.endlessNights);
		
		
		uranus.aoType = AOType.gasGiant;
		uranus.sizer = 0.15;
		uranus.diameter = 51118;
		uranus.mass = 0.00004365925596650470;
		uranus.atmoType = AtmoType.H2_He;
		uranus.temperature = 76;
		uranus.luminosity = 0;
		uranus.orbitalPeriod = 2661041793L;
		uranus.name = language.uranus;
		uranus.starDistance = 2876679082L;
		uranus.moonDistance = 0;
		uranus.specials.add(AOSpecial.magneticField);
		
		ariel.aoType						= AOType.ice;
		ariel.starDistance					= 2876679082L;
		ariel.moonDistance 					= 191020;
		ariel.name							= language.ariel;
		ariel.sizer 						= 0.02;
		ariel.mass							= 0.00000000067879690757;					
		ariel.diameter						= 1156;				
		ariel.temperature					= 60;
		ariel.atmoType						= AtmoType.none;
		ariel.orbitalPeriod					= 2661041793L;
		ariel.gravitation 					= 0.027F;
		ariel.resources 					= 0.1;
		ariel.oceans 						= 1;
		ariel.ecosystem 					= 0;
		ariel.dayLength 					= 217761;
		ariel.pressure 						= 0;
		ariel.specials.add(AOSpecial.bottomless);
		
		umbriel.aoType						= AOType.ice;
		umbriel.starDistance				= 2876679082L;
		umbriel.moonDistance 				= 266300;
		umbriel.name						= language.umbriel;
		umbriel.sizer 						= 0.05;
		umbriel.mass						= 0.00000000060070522794;					
		umbriel.diameter					= 1169;				
		umbriel.temperature					= 75;
		umbriel.atmoType					= AtmoType.none;
		umbriel.orbitalPeriod				= 2661041793L;
		umbriel.gravitation 				= 0.023F;
		umbriel.resources 					= 0.12;
		umbriel.oceans 						= 1;
		umbriel.ecosystem 					= 0;
		umbriel.dayLength 					= 358057;
		umbriel.pressure 					= 0;
		umbriel.specials.add(AOSpecial.bottomless);
		umbriel.specials.add(AOSpecial.longNights);
		
		titania.aoType						= AOType.ice;
		titania.starDistance				= 2876679082L;
		titania.moonDistance 				= 435910;
		titania.name						= language.titania;
		titania.sizer 						= 0.05;
		titania.mass						= 0.00000000177448324333;					
		titania.diameter					= 1577;				
		titania.temperature					= 70;
		titania.atmoType					= AtmoType.none;
		titania.orbitalPeriod				= 2661041793L;
		titania.gravitation 				= 0.039F;
		titania.resources 					= 0.17;
		titania.oceans 						= 1;
		titania.ecosystem 					= 0;
		titania.dayLength 					= 752187;
		titania.pressure 					= 0;
		titania.specials.add(AOSpecial.bottomless);
		titania.specials.add(AOSpecial.longNights);
		
		oberon.aoType						= AOType.ice;
		oberon.starDistance					= 2876679082L;
		oberon.moonDistance 				= 583520;
		oberon.name							= language.oberon;
		oberon.sizer 						= 0.05;
		oberon.mass							= 0.00000000151557929009;					
		oberon.diameter						= 1523;				
		oberon.temperature					= 70;
		oberon.atmoType						= AtmoType.none;
		oberon.orbitalPeriod				= 2661041793L;
		oberon.gravitation 					= 0.035F;
		oberon.resources 					= 1;
		oberon.oceans 						= 1;
		oberon.ecosystem 					= 0;
		oberon.dayLength 					= 1163224;
		oberon.pressure 					= 0;
		oberon.specials.add(AOSpecial.bottomless);
		oberon.specials.add(AOSpecial.endlessNights);
	
		
		neptune.aoType = AOType.gasGiant;
		neptune.sizer = 0.15;
		neptune.diameter = 49528;
		neptune.mass = 0.0000515;
		neptune.atmoType = AtmoType.H2_He;
		neptune.temperature = 72;
		neptune.luminosity = 0;
		neptune.orbitalPeriod = 5200376904L;
		neptune.name = language.neptune;
		neptune.starDistance = 4503443661L;
		neptune.moonDistance = 0;
		neptune.specials.add(AOSpecial.magneticField);
		
		triton.aoType						= AOType.ice;
		triton.starDistance					= 4503443661L;
		triton.moonDistance 				= 354759;
		triton.name							= language.triton;
		triton.sizer 						= 0.05;
		triton.mass							= 0.00000001078265884148;					
		triton.diameter						= 3792;				
		triton.temperature					= 38;
		triton.atmoType						= AtmoType.none;
		triton.orbitalPeriod				= 5200376904L;
		triton.gravitation 					= 0.0794F;
		triton.resources 					= 1;
		triton.oceans 						= 1;
		triton.ecosystem 					= 0;
		triton.dayLength 					= 507760;
		triton.pressure 					= 0;
		triton.specials.add(AOSpecial.bottomless);
		triton.specials.add(AOSpecial.longNights);

		kuiperBelt.aoType					= AOType.asteroid;
		kuiperBelt.starDistance				= 5874000000L;
		kuiperBelt.moonDistance 			= 0;
		kuiperBelt.name						= language.kuiperBelt;
		kuiperBelt.sizer 					= 0.95;
		kuiperBelt.mass						= 0.00000000654768698452;					
		kuiperBelt.diameter					= 2306;				
		kuiperBelt.temperature				= 44;
		kuiperBelt.atmoType					= AtmoType.none;
		kuiperBelt.orbitalPeriod			= 7810836480L;
		kuiperBelt.gravitation 				= 0.067F;
		kuiperBelt.resources 				= 1;
		kuiperBelt.oceans 					= 1;
		kuiperBelt.ecosystem 				= 0;
		kuiperBelt.dayLength 				= 551857;
		kuiperBelt.pressure 				= 0;
		kuiperBelt.specials.add(AOSpecial.bottomless);
		
	}
}
			
			
		
	

