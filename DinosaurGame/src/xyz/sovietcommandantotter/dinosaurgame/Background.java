package xyz.sovietcommandantotter.dinosaurgame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import xyz.sovietcommandantotter.dinosaurgame.resources.graphics.*;

public class Background {

	private static final String backgroundImagePath = "src/xyz/sovietcommandantotter/dinosaurgame/resources/graphics/background_extended.png";
	private BufferedImage background;
	
	private int backgroundX;
	private int backgroundY;

	public Background() {
		this(0, 0);
	}

	public Background(int x, int y) {
		this.backgroundX = x;
		this.backgroundY = y;

		try {
			background = ImageIO.read(new File(backgroundImagePath));
		} catch (Exception e) {
			System.out.println("Image not found");
		}
	}

	public void drawBackground(Graphics window) {
		window.drawImage(background, getXPos(), getYPos(), background.getWidth(), background.getHeight(), null);
		this.backgroundX -= 5;
		if (this.backgroundX <= -1 * background.getWidth()) {
			this.backgroundX = this.backgroundX + background.getWidth() * 2;
		}
	}

	public void setXPos(int x) {
		this.backgroundX = x;
	}

	public int getXPos() {
		return this.backgroundX;
	}

	public int getYPos() {
		return this.backgroundY;
	}

	public int getBackgroundWidth() {
		return background.getWidth();
	}
}
