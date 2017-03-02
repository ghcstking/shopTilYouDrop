package frontEnd;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public abstract class MatthewAddScore extends ClickableScreen{

	public MatthewAddScore(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	private static ArrayList<HighScores> playerScores;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public void placeScores(ArrayList<HighScores> viewObjects) {
		allScores(viewObjects);
		playerScores = new ArrayList<HighScores>();
		for(HighScores i: playerScores){
			//size of ArrayList can be accessed using size()
			//element of ArrayList at index i is get(i)
			if(i instanceof HighScores){
				playerScores.add((HighScores)i);
			}
		}
	}

	public abstract void allScores(ArrayList<HighScores> lst);

	public MouseListener getMouseListener(){
		return this;
	}

	public void mouseClicked(MouseEvent e) {
		for(HighScores i: playerScores){
			if(i.isHovered(e.getX(), e.getY())){
				i.act();
			}
		}
	}
	
	public void addObject(Visible v){
		super.addObjects(v);
		if(v instanceof HighScores){
			playerScores.add((HighScores)v);
		}
	}



	public void remove(Visible v){
		super.remove(v);
		playerScores.remove((HighScores)v);
	} 

}