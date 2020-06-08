package xyz.sovietcommandantotter.dinosaurgame;

import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cactus implements Runnable {

	Window cactusWindow;
	private static ImageIcon cactusImage = new ImageIcon(
			"src/xyz/sovietcommandantotter/dinosaurgame/resources/graphics/small_cactus.png");
	private static JLabel cactusLabel = new JLabel(cactusImage);

	public Cactus(Window window) {
		this.cactusWindow = window;
		window.add(cactusLabel);
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(10);
				cactusLabel.setLocation(cactusLabel.getX() - 1, 50);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
