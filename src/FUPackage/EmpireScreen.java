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
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import FUPackage.TopNavi.menuListener;


public class EmpireScreen extends JLayeredPane implements IGeneralData {
private TopNavi topNavi;	


public EmpireScreen(final Empire empire){
	
	this.setBounds(0, 0, resolutionX, resolutionY);		
	this.add(GraphicFU.bgPanel, 1, 0);
	
	this.topNavi = new TopNavi(empire);
	this.add(this.topNavi, 3, 0);
		
	JPanel empirePanel = new JPanel();
	empirePanel.setBounds(0, TopNavi.height, resolutionX, resolutionY - TopNavi.height - bottomPanelHeight);
	empirePanel.setBorder(GUIBorder);
	empirePanel.setLayout(new GridLayout(0,3));
	empirePanel.setOpaque(false);
	this.add(empirePanel, 1, 0);
	
	
	
	JLabel decreaseTax = Labels.icon(GraphicFU.reduceIcon);
	decreaseTax.addMouseListener(new MouseListener() {
    	@Override	
    	public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {
        	if (empire.taxRate >= 0.01)
    		empire.taxRate -= 0.01;
        	empire.recalculateEmpire();
    		FUMain.mainFrame.openEmpireScreen(empire);
        	}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
    });
	empirePanel.add(decreaseTax);
	
	
	
	empirePanel.add(Labels.label((int)(empire.taxRate * 100) + " %", GraphicFU.moneyIcon));
	
	JLabel balanceLabel = Labels.label((int)(empire.getBalanceMoney() * 10) / 10.0 + " " + language.abbrBillionCredits, GraphicFU.arrowUp2);
	if (empire.getBalanceMoney() == 0){
		balanceLabel.setIcon(GraphicFU.arrowNeutral);
		}
	else if (empire.getBalanceMoney() < 0){
		balanceLabel.setIcon(GraphicFU.arrowDown2);
		}
	
	balanceLabel.setOpaque(false);
	balanceLabel.setVisible(true);

	balanceLabel.setBackground (new Color (0, 0, 0, 0));
	balanceLabel.setForeground(new Color(255,200,0));
	balanceLabel.setFont(mediumFont);
	balanceLabel.setHorizontalAlignment(JButton.LEFT);
	empirePanel.add(balanceLabel);
	
	
	JLabel increaseTax = Labels.icon(GraphicFU.addIcon);
	increaseTax.addMouseListener(new MouseListener() {
    	@Override	
    	public void mouseClicked(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {
        	if (empire.taxRate <= 1.00)
    		empire.taxRate += 0.01;
        	empire.recalculateEmpire();
    		FUMain.mainFrame.openEmpireScreen(empire);
        	}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
    });
	empirePanel.add(increaseTax);
	
	
	
	
	
	
	

	}	
}

