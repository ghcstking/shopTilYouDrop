package customer;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
//import java.util.List;

import customer.components.Stranger;
//import frontEnd.ClickSpace;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;
//import gui6.components.ClickableGraphic;


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
}

