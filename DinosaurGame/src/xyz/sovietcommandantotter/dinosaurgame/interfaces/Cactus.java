package xyz.sovietcommandantotter.dinosaurgame.interfaces;

import javax.swing.JLabel;

public interface Cactus {
	public String getType();

	public void moveCactus();
	
	public void setXPos(int xPos);
	
	public void setYPos(int yPos);

	public JLabel getCactusImage();

	public int getWidth();

	public int getHeight();

	public int getInitialX();
	
	public int getX();

	public int getY();
	
}
