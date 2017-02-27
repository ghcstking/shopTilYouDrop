package customer;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
//import java.util.List;

import customer.components.Stranger;
import frontEnd.ClickSpace;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;
import gui6.components.ClickableGraphic;


public class AliStrangerDanger extends ClickableScreen implements Runnable {
	private ArrayList<Stranger> strangers;


	public AliStrangerDanger(int w, int h) {
		super(w, h); 
		update();
	}
	private int appearanceTime;

	public int getAppearanceTime() {
		return appearanceTime;
	}

	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	// Stranger.money-= 5
	//a way on how to make money
	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		DemoPlayer demo = new DemoPlayer(100,300,100,20);
		strangers = new ArrayList<Stranger>();
		strangers.add(new Stranger(demo, 40,100,25,20));
		strangers.add(new Stranger(demo, 60,120,25,20));
		strangers.add(new Stranger(demo, 80,100,25,20));
		strangers.add(new Stranger(demo, 100,120,25,20));
		strangers.add(new Stranger(demo, 120,100,25,20));
		strangers.add(new Stranger(demo, 140,120,25,20));
		strangers.add(new Stranger(demo, 160,100,25,20));
		//we have coordinates, so we'll add more 
		//strangers at the coordinates of items
		viewObjects.add(demo);
		viewObjects.addAll(strangers);
		
		// make a new clickable graphics here, in the constructor you need to pass in the image
		// add it to viewObjects
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	} 
	//d

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	DemoPlayer demo = new DemoPlayer(100,300,100,20);
	viewObjects.add(demo);
	for(int i=0;i<viewObjects.size();i++){
		if(viewObjects.get(i) instanceof ClickSpace){
			if(Math.random()>.5){
				ClickSpace c = (ClickSpace) viewObjects.get(i);
				Stranger s = new Stranger(demo,c.getX(),c.getY(),25,20);
				viewObjects.add(s);
			}
			
		}
	}

}

