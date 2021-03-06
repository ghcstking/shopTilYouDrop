package frontEnd;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import gui6.components.Action;
import gui6.components.Button;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;
import main.ShopTilYouDropGame;

public class MatthewHighScoreScreen extends ClickableScreen implements Runnable, KeyListener{

	private ArrayList <HighScoreInterface> scores;
	private TextLabel rank;
	private int y;
	private Button restart;
	private Button home;
	private static TextLabel title;
	
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
		title = new TextLabel(300, 50, 500, 40, "GAME OVER");
		viewObjects.add(title);
		scores = new ArrayList<HighScoreInterface>();
		scores.add(new Player("",0.0));
		int allscores = scores.size();
		y = 100;
		for(int i = 0; i < allscores; i++){
			for(int k = 0; k< allscores; i++){
				if(allscores == 1)break;
				if(scores.get(k).getScore() < scores.get(k+1).getScore()){
					HighScoreInterface tmp = scores.get(k);
					scores.set(k, scores.get(k+1));
					scores.set(k+1, tmp);
				}
			}
			scores.get(i).setUsername("User"+i);
			scores.get(i).setScore(IramWorkerScreen.finalScore);
			rank = new TextLabel(100, y, 600, 50, (0+1)+"            |            "+scores.get(0).getUsername()+"            |            "+scores.get(0).getScore());
			viewObjects.add(rank);
			y+=50;
		}
		restart = new Button(65, 475, 100, 100, "Restart", Color.blue, new Action(){
			public void act(){
				ShopTilYouDropGame.game.setScreen(ShopTilYouDropGame.workerScreen);
			}
		});
		home = new Button(650, 475, 100, 100, "Home", Color.blue, new Action(){
			public void act(){
				ShopTilYouDropGame.game.setScreen(ShopTilYouDropGame.mainScreen);
			}
		});
		viewObjects.add(restart);
		viewObjects.add(home);
	}
}