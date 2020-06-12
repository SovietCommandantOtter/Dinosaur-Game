
package xyz.sovietcommandantotter.dinosaurgame.threads;

import java.awt.Window;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

import xyz.sovietcommandantotter.dinosaurgame.interfaces.Cactus;

public class CactusThread extends SwingWorker<Object, String> {

	Window cactusWindow;
	ArrayList<Cactus> cactusList;

	protected int lastCactusX;
	protected int lastCactusY;
	protected int lastCactusWidth;
	protected int lastCactusHeight;

	public CactusThread(Window window, ArrayList<Cactus> cactusList) {
		this.cactusWindow = window;
		this.cactusList = cactusList;
	}

	public void drawCactus() {
		for (int i = 0; i < cactusList.size(); i++) {
			Cactus tempCactus = cactusList.get(i);
			JLabel cactusLabel = tempCactus.getCactusImage();
			cactusLabel.setSize(tempCactus.getWidth(), tempCactus.getHeight());
			cactusLabel.setLocation(tempCactus.getX(), tempCactus.getY());
			cactusWindow.add(cactusLabel);
		}
	}

	public void moveCactus() {
		int tempX = 0;
		for (int i = 0; i < cactusList.size(); i++) {
			Cactus tempCactus = cactusList.get(i);
			tempCactus.moveCactus();

			if (tempCactus.getX() < -300) {
				//cactusWindow.remove(cactusList.get(i).getCactusImage());
				tempX = tempCactus.getInitialX();
				tempCactus.setXPos(tempX);
				cactusList.set(i, tempCactus);
				cactusWindow.repaint();
			}

		}
	}

	@Override
	protected Object doInBackground() throws Exception {
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
