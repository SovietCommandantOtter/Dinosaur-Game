package xyz.sovietcommandantotter.dinosaurgame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Game {
	private static final String APPLICATION_NAME = "Jumpy Dinosaur";
	private static final int NORMAL_WIDTH = 960;
	private static final int NORMAL_HEIGHT = 300;

	public static JFrame window = new JFrame(APPLICATION_NAME);
	
	private static ImageIcon cactusImage = new ImageIcon("src/xyz/sovietcommandantotter/dinosaurgame/resources/graphics/small_cactus.png");
	private static JLabel cactusLabel = new JLabel(cactusImage);
	
	private static Cactus cactus = new Cactus(window);
	
	public static void main(String[] args) {
		
		window.setSize(NORMAL_WIDTH, NORMAL_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		
		
		//window.add(cactusLabel);
		//cactusLabel.setLocation(500, 50);
		//cactusLabel.setSize(cactusImage.getIconWidth(), cactusImage.getIconHeight());
		window.setVisible(true);
		cactus.run();
		
		
		

	}
}
