package xyz.sovietcommandantotter.dinosaurgame;

import java.awt.Color;

import javax.swing.JLabel;

public class Cactus extends JLabel {

	private int x;
	private int y;

	public Cactus() {
		this.setSize(150, 150);
		this.setLocation(10, 10);
		this.setBackground(Color.BLUE);
		this.setOpaque(true);
		this.setVisible(true);
	}


	public void addCactus(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
