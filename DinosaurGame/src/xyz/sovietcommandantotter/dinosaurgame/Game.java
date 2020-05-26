package xyz.sovietcommandantotter.dinosaurgame;

import javax.swing.JFrame;
import javax.swing.JLabel;

import xyz.sovietcommandantotter.dinosaurgame.Cactus;

public class Game {
	private static final String APPLICATION_NAME = "Jumpy Dinosaur";
	private static final int NORMAL_WIDTH = 960;
	private static final int NORMAL_HEIGHT = 540;

	public static JFrame window = new JFrame(APPLICATION_NAME);
	public static Cactus cactus = new Cactus();

	
	public static void main(String[] args) {
		window.setSize(NORMAL_WIDTH, NORMAL_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);

		window.add(cactus);

		window.setVisible(true);
	}
}
