
package xyz.sovietcommandantotter.dinosaurgame.elements;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import xyz.sovietcommandantotter.dinosaurgame.interfaces.Cactus;

public class SmallCactus implements Cactus {

	private int width;
	private int height;
	private int initialX;

	private int cactusXPos;
	private int cactusYPos;

	private static final String SMALL_CACTUS = "src/xyz/sovietcommandantotter/dinosaurgame/resources/small_cactus.png";
	private static ImageIcon cactusImage = new ImageIcon(SMALL_CACTUS);
	private static JLabel cactusLabel = new JLabel(cactusImage);

	public SmallCactus(int xPos, int yPos) {
		this.cactusXPos = xPos;
		this.initialX = xPos;
		this.cactusYPos = yPos;
		width = cactusImage.getIconWidth();
		height = cactusImage.getIconHeight();
	}

	public String getType() {

		return "Small";
	}

	public void moveCactus() {
		cactusXPos -= 1;
	}

	public JLabel getCactusImage() {
		return cactusLabel;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getX() {

		return cactusXPos;
	}

	public int getY() {

		return cactusYPos;
	}

	public void setXPos(int xPos) {
		cactusXPos = xPos;
	}

	public void setYPos(int yPos) {
	}

	public int getInitialX() {
		return this.initialX;
	}
}