
package xyz.sovietcommandantotter.dinosaurgame;

import java.util.ArrayList;

import javax.swing.JFrame;

import xyz.sovietcommandantotter.dinosaurgame.elements.LargeCactus;
import xyz.sovietcommandantotter.dinosaurgame.elements.SmallCactus;
import xyz.sovietcommandantotter.dinosaurgame.interfaces.Cactus;
import xyz.sovietcommandantotter.dinosaurgame.threads.CactusThread;

public class Game {
	private static final String LAURA = "Jumpy Dinosaur";
	public static final int NORMAL_WIDTH = 960;
	public static final int NORMAL_HEIGHT = 540;
	public static final int CANVAS_WIDTH = 960;
	public static final int CANVAS_HEIGHT = 505;

	public static JFrame window = new JFrame(LAURA);

	private static CactusThread cactusThread;

	public static ArrayList<Cactus> cactusList = new ArrayList<Cactus>();

	public static void main(String[] args) {

		cactusList.add(new SmallCactus(900, (Game.CANVAS_HEIGHT - 104)));
		cactusList.add(new LargeCactus(1000, (Game.CANVAS_HEIGHT - 176)));
		cactusList.add(new SmallCactus(1200, (Game.CANVAS_HEIGHT - 104)));
		cactusList.add(new LargeCactus(1654, (Game.CANVAS_HEIGHT - 176)));
		
		window.setSize(NORMAL_WIDTH, NORMAL_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setLayout(null);
		window.setResizable(true);
		
		cactusThread = new CactusThread(window, cactusList);
		
		
		 cactusThread.execute();
		 window.setVisible(true);
	}
}
