package frontEnd;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class MatthewHighScoreScreen extends ClickableScreen implements Runnable, KeyListener{

	private static HighScoreInterface[] scores;
	private static int crank;
	private static String user;
	private static TextLabel title;
	private static TextLabel username;
	//place highscore screen here private static MatthewHighScoreScreen gameover;
	
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
		int allscores = scores.length;
		scores = new HighScoreInterface[allscores];
		for(int i = 0; i < allscores; i++){
			for(int k = 0; k< allscores; i++){
				if(scores[k].getScore() < scores[k+1].getScore()){
					HighScoreInterface tmp = scores[k];
					scores[k] = scores[k+1];
					scores[k+1] = tmp;
				}
			}
			scores[i] = getPlayer();
			scores[i].setUsername("User"+i);
			//scores add score is set in vicki's thing list.set(index, Integer.valueof(9))
			viewObjects.add(scores[i]);
		}
		viewObjects.add(title);
	}

	private HighScoreInterface getPlayer() {
		return new TextLabelScore();
	}
}