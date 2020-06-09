package xyz.sovietcommandantotter.dinosaurgame.threads;

import java.awt.Window;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CactusThread implements Runnable {

	Window cactusWindow;
	private static final String SMALL_CACTUS = "src/xyz/sovietcommandantotter/dinosaurgame/resources/graphics/small_cactus.png";
	private static ImageIcon cactusImage = new ImageIcon(SMALL_CACTUS);
	private static JLabel cactusLabel = new JLabel(cactusImage);
	public static JLabel[] cactusArray = new JLabel[20];
	public static Timer cactusTimer = new Timer();

	public CactusThread(Window window) {
		this.cactusWindow = window;
	}

	public void generateCactus() {
		for (int i = 0; i < 20; i++) {
			if (cactusArray[i] == null) {
				cactusArray[i] = new JLabel(cactusImage);
				cactusWindow.add(cactusArray[i]);
				cactusArray[i].setLocation(800, 50);
				cactusArray[i].setVisible(true);
				break;
			}
		}
	}

	public void moveCactus() {
	}

	public void run() {
		for (int x = 0; x < 20; x++) {
			try {
				generateCactus();
				for (int c = 0; c < 100; c++) {
					moveCactus();
					Thread.sleep(1);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
