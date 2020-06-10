package xyz.sovietcommandantotter.dinosaurgame.interfaces;

import javax.swing.JLabel;

public interface Cactus {
	public String getType();

	public void moveCactus();
	
	public void setXPos(int xPos);

	public JLabel getCactusImage();

	public int getWidth();

	public int getHeight();

	public int getX();

	public int getY();
	
}
