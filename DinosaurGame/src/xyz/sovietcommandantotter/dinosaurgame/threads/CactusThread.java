
package xyz.sovietcommandantotter.dinosaurgame.threads;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JLabel;

import xyz.sovietcommandantotter.dinosaurgame.CactusFactory;
import xyz.sovietcommandantotter.dinosaurgame.interfaces.Cactus;

public class CactusThread implements Runnable {

	Window cactusWindow;
	ArrayList<Cactus> cactusList;
	int cactusSpacing[] = {
			300, 350, 400, 450, 500
	};
	public static Timer cactusTimer = new Timer();
	public static CactusFactory cactusFactory = new CactusFactory();
	
	protected int lastCactusX;
	protected int lastCactusY;
	protected int lastCactusWidth;
	protected int lastCactusHeight;

	public CactusThread(Window window, ArrayList<Cactus> cactusList, CactusFactory cactusFactory) {
		this.cactusWindow = window;
		this.cactusList = cactusList;
	}


	public void drawCactus() {
		for (int i = 0; i < cactusList.size(); i++) {
			Cactus tempCactus = cactusList.get(i);
			JLabel cactusLabel = tempCactus.getCactusImage();
			cactusLabel.setSize(tempCactus.getWidth(), tempCactus.getHeight());
			cactusLabel.setLocation(tempCactus.getX(), tempCactus.getY());
			if (cactusLabel.getX() > -300) {
				cactusWindow.add(cactusLabel);
				//cactusWindow.repaint();
			}
		}
	}

	public void moveCactus() {
		int tempX = 0;
		for (int i = 0; i < cactusList.size(); i++) {
			Cactus tempCactus = cactusList.get(i);
			tempCactus.moveCactus();
			if (tempCactus.getX() < -300) {
				cactusWindow.remove(cactusList.get(i).getCactusImage());
				tempX = tempCactus.getInitialX();
				tempCactus.setXPos(tempX);
				cactusList.set(i, tempCactus);
				//cactusWindow.repaint();
			}
		}
	}

	public void run() {
		//drawCactus();
		while (true) {
			drawCactus();
			moveCactus();
			
			cactusWindow.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
