package FUPackage;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class FUMain implements IGeneralData {

	public static MainFrame mainFrame; 
	
	
			public static void main(String[] args) {
				
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				//	UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
				//	UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				//	UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				//	UIManager.setLookAndFeel(FULookAndFeel = newLookAndFeel);
				}
				catch (Exception e){
					e.printStackTrace();
				}
				GraphicFU.initializeGraphics();
				AOType.initialize();
				AOSpecial.initialize();
				Policy.initialize();
				BuildingType.initialize();
				Technology.initialize();
				SpeciesTrait.initialize();
				Species.initialize();
				GalaxyCreation.initialize();				
				

				openNewMainFrame();
			//	mainFrame.getContentPane().removeAll();
				mainFrame.openGalaxyScreen(Species.humans.empire);  // XXX Quick Fix

			//	mainFrame.openStarSystemScreen(Galaxy.humanPlayer.selectedStarSystem);
				
				mainFrame.revalidate();
			}	
	
		public static void openNewMainFrame(){
		mainFrame = new MainFrame();
		mainFrame.setVisible(true);
		mainFrame.pack();
		mainFrame.setSize(resolutionX, resolutionY + 25);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(true);

		}
}



