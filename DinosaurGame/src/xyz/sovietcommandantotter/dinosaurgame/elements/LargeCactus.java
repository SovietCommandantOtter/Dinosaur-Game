
package xyz.sovietcommandantotter.dinosaurgame.elements;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import xyz.sovietcommandantotter.dinosaurgame.interfaces.Cactus;

public class LargeCactus implements Cactus {

	private int width;
	private int height;

	private int cactusXPos;
	private int cactusYPos;

	private static final String LARGE_CACTUS = "src/xyz/sovietcommandantotter/dinosaurgame/resources/large_cactus.png";
	private static ImageIcon cactusImage = new ImageIcon(LARGE_CACTUS);
	private static JLabel cactusLabel = new JLabel(cactusImage);

	public LargeCactus(int xPos, int yPos) {
		this.cactusXPos = xPos;
		this.cactusYPos = yPos;
		width = cactusImage.getIconWidth();
		height = cactusImage.getIconHeight();
	}

	public String getType() {

		return "Large";
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
	}
}