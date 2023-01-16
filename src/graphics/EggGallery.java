package graphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.GameDataLookup;
import util.Utils;

public class EggGallery {

	private JPanel panel = new JPanel();
	public JPanel getPanel() {return panel;}
	
	int currentEgg = -1;
	
	JButton[] eggButtons = new JButton[72];
	JLabel selectedEggImage;
	JLabel selectedEggName;
	JLabel selectedEggLevels; // TODO: JButtons to open maps?
	JLabel selectedEggFruitCount;
	JLabel[] selectedEggFruitPreferences = new JLabel[7];
	
	JButton levelSelectButton;
	
	public void initialize() {
		panel.setPreferredSize(new Dimension(1020,620));
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		for(int i = 0; i < 72; i++) {
			final int j = i; // Use a final copy for listener
			eggButtons[i] = new JButton();
			eggButtons[i].setPreferredSize(new Dimension(64,64));
			
			final int startX = 0, eggWidth = 64, eggHeight = 64, xSpacer = 10, ySpacer = 5;
			eggButtons[i].setIcon(Utils.scaleIcon(GraphicsDriver.eggIcons[i], eggWidth, eggHeight));
			eggButtons[i].setSize(new Dimension(eggWidth,eggHeight));
			eggButtons[i].setLocation(startX + 2*xSpacer + ((eggWidth +xSpacer)* (i%9)), 3*ySpacer + (eggHeight+ySpacer)*(i/9));
			if(GameDataLookup.getIsSonicEgg(i)) { 
				eggButtons[i].setToolTipText("Requires "+GameDataLookup.getSonicEggChickCoinRequirement(i)+" Chick Coins");
			}
			
			eggButtons[i].addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {eggButtonSelected(j);}});
			panel.add(eggButtons[i]);
		}
		selectedEggImage = new JLabel();
		selectedEggImage.setSize(new Dimension(300,300));
		selectedEggImage.setLocation(680, 0);
		panel.add(selectedEggImage);
		
		selectedEggName = new JLabel();
		selectedEggName.setForeground(Color.WHITE);
		selectedEggName.setSize(new Dimension(300,16));
		selectedEggName.setLocation(700,320);
		panel.add(selectedEggName);
		
		selectedEggLevels = new JLabel();
		selectedEggLevels.setForeground(Color.WHITE);
		selectedEggLevels.setSize(new Dimension(300,16));
		selectedEggLevels.setLocation(700,340);
		panel.add(selectedEggLevels);
		
		selectedEggFruitCount = new JLabel();
		selectedEggFruitCount.setForeground(Color.WHITE);
		selectedEggFruitCount.setSize(new Dimension(300,16));
		selectedEggFruitCount.setLocation(700,360);
		panel.add(selectedEggFruitCount);
		
		for(int i = 0; i < 7; i++) {
			selectedEggFruitPreferences[i] = new JLabel();
			selectedEggFruitPreferences[i].setIcon(Utils.scaleIcon(GraphicsDriver.fruitIcons[i], 64, 64));
			selectedEggFruitPreferences[i].setSize(64,64);
			selectedEggFruitPreferences[i].setLocation(700 + ((i%4)*70), 380 + ((i/4)*70));
			selectedEggFruitPreferences[i].setEnabled(false);
			panel.add(selectedEggFruitPreferences[i]);
		}
		
		levelSelectButton = new JButton("Level Select");
		levelSelectButton.setSize(300,48);
		levelSelectButton.setLocation(700,520);
		levelSelectButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {clear(); Dashboard.switchPane();}});
		panel.add(levelSelectButton);
	}

	public void update() {
		if(currentEgg == -1) { return; }
		
		selectedEggImage.setIcon(Utils.scaleIcon(GraphicsDriver.eggIcons[currentEgg], 300, 300));
		selectedEggImage.setEnabled(true);
		selectedEggName.setText(GameDataLookup.getEggName(currentEgg));
		selectedEggName.setEnabled(true);
		selectedEggLevels.setText(Arrays.toString(Utils.levelIndiciesToWorldMissionPairs(GameDataLookup.getEggLocations(currentEgg))));
		selectedEggLevels.setEnabled(true);
		selectedEggFruitCount.setText("Fruit Required to Hatch: "+GameDataLookup.getEggFruitCount(currentEgg));
		selectedEggFruitCount.setEnabled(true);
		boolean[] preferences = GameDataLookup.getEggFruitPreferences(currentEgg);
		for(int i = 0; i < 7; i++) {
			selectedEggFruitPreferences[i].setEnabled(preferences[i]);
		}
	}
	
	public void clear() {
		currentEgg = -1;
		
		selectedEggImage.setIcon(null);
		selectedEggName.setText("");
		selectedEggLevels.setText("");
		selectedEggFruitCount.setText("");
		for(int i = 0; i < 7; i++) {
			selectedEggFruitPreferences[i].setEnabled(false);
		}
	}
	
	private void eggButtonSelected(int eggID) { currentEgg = eggID; GraphicsDriver.update(); }
}

