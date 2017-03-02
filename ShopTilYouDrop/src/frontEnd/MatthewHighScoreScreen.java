package frontEnd;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class MatthewHighScoreScreen extends ClickableScreen implements Runnable, KeyListener{

	private ArrayList <HighScoreInterface> scores;
	private TextLabelScore rank;
	private int y= 200;
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
		viewObjects.add(title);
		scores = new ArrayList<HighScoreInterface>();
		int allscores = scores.size();
		for(int i = 0; i < allscores; i++){
			scores.add(new Player("",0.0));
//			for(int k = 0; k< allscores; i++){
//				if(scores.get(k).getScore() < scores.get(k+1).getScore()){
//					HighScoreInterface tmp = scores.get(k);
//					scores.set(k, scores.get(k+1));
//					scores.set(k+1, tmp);
//				}
//			}
			scores.get(0).setUsername("User"+0);
			scores.get(0).setScore(5.4);
			//scores add score is set in vicki's thing list.set(index, Integer.valueof(9))
			rank = new TextLabelScore(000, y, 600, 50, 0+"   |   "+scores.get(0).getUsername()+"   |   "+scores.get(0).getScore());
			viewObjects.add(rank);
			y+=50;
		}
		viewObjects.add(title);
	}
}