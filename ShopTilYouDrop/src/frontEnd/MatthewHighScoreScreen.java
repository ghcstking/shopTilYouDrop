package frontEnd;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class MatthewHighScoreScreen extends ClickableScreen implements Runnable, KeyListener{

	private ArrayList <HighScoreInterface> scores;//instantiate elsewhere
	private static int crank;
	private static String user;
	private static TextLabel title;
	private static TextLabel username;
	
	public MatthewHighScoreScreen(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		title = new TextLabel(300, 50, 500, 40, "High Scores");
		title.setSize(30);
//		instantiate the arraylist somewhere else. push score from worker. add to TextLabelScore
		viewObjects.add(title);
	}

	private HighScoreInterface getPlayer() {
		return new TextLabelScore();
	}
}