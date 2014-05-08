package FUPackage;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopNavi extends JPanel implements IGeneralData {

public static int height = 40;	
	
public JLabel foodButton;
public JLabel resourcesButton;
public JLabel goodsButton;
public JLabel researchButton;
public JButton moneyButton;
public JButton balanceButton;
public JLabel empireButton;
public JLabel menuButton;
public JLabel turnButton;

public TopNavi(final Empire empire){
	
	empire.calculateBalance();
	
	GridLayout gl = new GridLayout(1,0);
	this.setLayout(gl);
	this.setBounds(0, 0, resolutionX - 20, TopNavi.height);
	this.setOpaque(false);
	this.setBackground (new Color (0, 0, 0, 0));
	
	
		
		foodButton = topLabel(empire.food);
		this.add(foodButton);	
		
		resourcesButton = topLabel(empire.resources);
		this.add(resourcesButton);
		
		goodsButton = topLabel(empire.goods);
		this.add(goodsButton);
		
		String researchButtonString = (int) (empire.research.output * 10) / 10.0 + " RU"; ;
		researchButton = Labels.label(researchButtonString, GraphicFU.researchIcon);
		researchButton.setOpaque(false);
		researchButton.setVisible(true);
	//	researchButton.setBackground (new Color (0, 0, 0, 0));
	//	researchButton.setForeground(new Color(255,200,0));
	//	researchButton.setFont(mediumFont);
		researchButton.setHorizontalAlignment(JButton.LEFT);
		researchButton.addMouseListener(new MouseListener() {
	    	@Override	
	    	public void mouseClicked(MouseEvent e) {        				
	    	}
	        public void mousePressed(MouseEvent e) {
	        	FUMain.mainFrame.getContentPane().removeAll();
	        	FUMain.mainFrame.openResearchScreen(empire, null);
	        }
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	    });
		
		
		
		this.add(researchButton);
		
		String moneyButtonString = (int)(empire.getMoney() * 10) / 10.0 + " " + language.abbrBillionCredits;
		moneyButton = new JButton(moneyButtonString, GraphicFU.moneyIcon);
		moneyButton.setOpaque(false);
		moneyButton.setVisible(true);
		moneyButton.setContentAreaFilled(false);
		moneyButton.setBorderPainted(false);
		moneyButton.setRolloverEnabled(false);
		moneyButton.setBackground (new Color (0, 0, 0, 0));
		moneyButton.setForeground(new Color(255,200,0));
		moneyButton.setFont(mediumFont);
		moneyButton.setHorizontalAlignment(JButton.LEFT);
		moneyButton.addActionListener(new menuListener());
		this.add(moneyButton);
		
		String balanceButtonString = (int)(empire.getBalanceMoney() * 10) / 10.0 + " " + language.abbrBillionCredits;
		
		balanceButton = new JButton(balanceButtonString);
		if (empire.getBalanceMoney() > 0){
			balanceButton.setIcon(GraphicFU.arrowUp2);
			}
		else if (empire.getBalanceMoney() == 0){
			balanceButton.setIcon(GraphicFU.arrowNeutral);
			}
		else {
			balanceButton.setIcon(GraphicFU.arrowDown2);
			}
		
		balanceButton.setOpaque(false);
		balanceButton.setVisible(true);
		balanceButton.setContentAreaFilled(false);
		balanceButton.setBorderPainted(false);
		balanceButton.setRolloverEnabled(false);
		balanceButton.setBackground (new Color (0, 0, 0, 0));
		balanceButton.setForeground(new Color(255,200,0));
		balanceButton.setFont(mediumFont);
		balanceButton.setHorizontalAlignment(JButton.LEFT);
		balanceButton.addActionListener(new menuListener());
		this.add(balanceButton);
		
		
		JPanel endpanel = new JPanel();
		//GridBagLayout gbl = new GridBagLayout();
		endpanel.setLayout(gl);
		endpanel.setBounds(0, 0, resolutionX, TopNavi.height);
		endpanel.setOpaque(false);
		endpanel.setBackground (new Color (0, 0, 0, 0));
		
		
		String empireButtonString = language.empire;
		empireButton = Labels.icon(GraphicFU.empireIcon);
		empireButton.setOpaque(false);
		empireButton.setVisible(true);

		empireButton.setHorizontalAlignment(JButton.LEFT);
		empireButton.addMouseListener(new MouseListener() {
	    	@Override	
	    	public void mouseClicked(MouseEvent e) {        				
	    	}
	        public void mousePressed(MouseEvent e) {
	    		FUMain.mainFrame.getContentPane().removeAll();
	    		FUMain.mainFrame.openEmpireScreen(empire);
	        }
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	    });
		endpanel.add(empireButton);
		
		

		String menuButtonString = language.menu;
		menuButton = new JLabel(GraphicFU.qMarkIcon);
		menuButton.setOpaque(false);
		menuButton.setVisible(true);
		menuButton.setBackground (new Color (0, 0, 0, 0));
		menuButton.setForeground(new Color(255,200,0));
		menuButton.setFont(mediumFont);
		menuButton.setHorizontalAlignment(JButton.LEFT);
		menuButton.addMouseListener(new MouseListener() {
	    	@Override	
	    	public void mouseClicked(MouseEvent e) {        				
	    	}
	        public void mousePressed(MouseEvent e) {
	    		FUMain.mainFrame.getContentPane().removeAll();
	    		FUMain.mainFrame.openSpeciesSelectionScreen(empire);
	        }
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	    });
		endpanel.add(menuButton);
		
		
		
		
		this.add(endpanel);
		
//		String turnButtonString = language.turn;
		turnButton = new JLabel( String.valueOf(Galaxy.turn/10.0), GraphicFU.turnIcon,  JLabel.CENTER);
		turnButton.setOpaque(false);
		turnButton.setVisible(true);
		turnButton.setBackground (new Color (0, 0, 0, 0));
		turnButton.setForeground(new Color(255,200,0));
		turnButton.setFont(mediumFont);
		turnButton.addMouseListener(new MouseListener() {
		    	@Override	
		    	public void mouseClicked(MouseEvent e) {        				
		    	}
		        public void mousePressed(MouseEvent e) {
		        	Turn.turn()
		        	;	
		        }
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
		    });
		

		
		this.add(turnButton);
		
		
//		return (this);
		
		
		
}	

public static class menuListener implements ActionListener {
public menuListener() {
}
	@Override
public void actionPerformed(ActionEvent e) {			

//	GalaxyScreen.horizontal = GalaxyScreen.scrollPane.getHorizontalScrollBar().getValue(); XXX
//	GalaxyScreen.vertical = GalaxyScreen.scrollPane.getVerticalScrollBar().getValue(); XXX
		
	FUMain.mainFrame.getContentPane().removeAll();
	FUMain.mainFrame.openGalaxyScreen(Species.humans.empire);  // XXX Quick Fix
	FUMain.mainFrame.revalidate();
	}
}





private JLabel topLabel(Commodity commodity){
String foodButtonString = (int) (commodity.output / commodity.demand * 1000) / 10.0 + "%";
JLabel label = new JLabel(foodButtonString, commodity.type.icon, JLabel.CENTER);
label.setOpaque(false);
label.setVisible(true);
label.setBackground (new Color (0, 0, 0, 0));
label.setForeground(new Color(255,200,0));
label.setFont(mediumFont);
label.setToolTipText("Stock:" + (int)(commodity.stock) + "; Output:" + (int)(commodity.output) + "; Demand:" + (int)(commodity.demand));
return label;
}




}


