package xyz.sovietcommandantotter.dinosaurgame;

import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cactus implements Runnable {

	Window cactusWindow;
	private static final String SMALL_CACTUS = "src/xyz/sovietcommandantotter/dinosaurgame/resources/graphics/small_cactus.png";
	private static ImageIcon cactusImage = new ImageIcon(SMALL_CACTUS);
	private static JLabel cactusLabel = new JLabel(cactusImage);
	public static JLabel[] cactusArray = new JLabel[20];

	public Cactus(Window window) {
		this.cactusWindow = window;
	}

	public void generateCactus() {
		for (int i = 0; i < 20; i++) {
			if (cactusArray[i] == null) {
				cactusArray[i] = new JLabel(cactusImage);
				cactusWindow.add(cactusArray[i]);
				cactusArray[i].setLocation(700, 50);
				cactusArray[i].setVisible(true);
				break;
			}
		}
	}

	public void run() {

	}
}
