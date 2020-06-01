package xyz.sovietcommandantotter.dinosaurgame;

import java.awt.Component;



import javax.swing.JFrame;
import javax.swing.JLabel;

import xyz.sovietcommandantotter.dinosaurgame.Cactus;

public class Game {
	private static final String APPLICATION_NAME = "Jumpy Dinosaur";
	private static final int NORMAL_WIDTH = 960;
	private static final int NORMAL_HEIGHT = 540;

	public static JFrame window = new JFrame(APPLICATION_NAME);
	public static Cactus cactus = new Cactus();
	public static ScrollingBackground background = new ScrollingBackground();
	public static JLabel testCactus = new JLabel("cactus");
	
	public static void main(String[] args) {
		window.setSize(NORMAL_WIDTH, NORMAL_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//((Component)background).setFocusable(true);
		window.add(background);
		background.setVisible(true);
		//window.add(cactus);
		
		//testCactus.setBounds(150, 150, 150, 150);
		//window.add(testCactus);
		
		window.setVisible(true);
		
	}
}
