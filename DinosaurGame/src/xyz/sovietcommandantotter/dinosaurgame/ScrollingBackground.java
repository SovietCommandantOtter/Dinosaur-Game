package xyz.sovietcommandantotter.dinosaurgame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ScrollingBackground extends Canvas implements Runnable {

	private Background backgroundOne;
	private Background backgroundTwo;

	private BufferedImage background;

	public ScrollingBackground() {
		backgroundOne = new Background();
		backgroundTwo = new Background(backgroundOne.getBackgroundWidth(), 0);

		new Thread(this).start();
		setVisible(true);
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
                repaint();
			}
		} catch (Exception e) {
		}
	}

	@Override
	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		Graphics2D graphics = (Graphics2D) window;

		if (background == null) {
			background = (BufferedImage) (createImage(getWidth(), getHeight()));
		}

		Graphics buffer = background.createGraphics();

		backgroundOne.drawBackground(buffer);
		backgroundTwo.drawBackground(buffer);
		graphics.drawImage(background, null, 0, 0);

	}
}
