
package xyz.sovietcommandantotter.dinosaurgame.threads;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JLabel;

import xyz.sovietcommandantotter.dinosaurgame.Game;
import xyz.sovietcommandantotter.dinosaurgame.elements.SmallCactus;
import xyz.sovietcommandantotter.dinosaurgame.interfaces.Cactus;

public class CactusThread implements Runnable {

	Window cactusWindow;
	ArrayList<Cactus> cactusList;
	int cactusSpacing[] = {
			300, 350, 400, 450, 500
	};
	public static Timer cactusTimer = new Timer();

	public CactusThread(Window window, ArrayList<Cactus> cactusList) {
		this.cactusWindow = window;
		this.cactusList = cactusList;
	}

	public void generateCactus() {
		/*for (int i = 0; i < cactusList.size(); i++) {
			if (cactusList.get(i) == null) {
				if (cactusList.get(i + 1) != null) {
					cactusList.set(i, cactusList.get(i + 1));
					cactusList.set(i + 1, null);
				}
				cactusList.set(i, new SmallCactus(1000, Game.CANVAS_HEIGHT - 176));
			}
		}
		*/
	}

	public void drawCactus() {
		for (int i = 0; i < cactusList.size(); i++) {
			Cactus tempCactus = cactusList.get(i);
			JLabel cactusLabel = tempCactus.getCactusImage();
			cactusLabel.setSize(tempCactus.getWidth(), tempCactus.getHeight());
			cactusLabel.setLocation(tempCactus.getX(), tempCactus.getY());
			if (cactusLabel.getX() > -300) {
				cactusWindow.add(cactusLabel);
			}
		}
	}

	public void moveCactus() {
		for (int i = 0; i < cactusList.size(); i++) {
			Cactus tempCactus = cactusList.get(i);
			tempCactus.moveCactus();
			if (tempCactus.getX() < -300) {
				cactusWindow.remove(cactusList.get(i).getCactusImage());
				cactusList.remove(i);
			}
		}
	}

	public void run() {
		generateCactus();
		drawCactus();
		while (true) {
			moveCactus();
			drawCactus();
			cactusWindow.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
