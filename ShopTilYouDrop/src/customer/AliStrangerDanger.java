package customer;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
//import java.util.List;

import customer.components.Stranger;
//import gui6.components.Action;
//import gui6.components.TextLabel;
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

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		DemoPlayer demo = new DemoPlayer(100,300,100,20);
		strangers = new ArrayList<Stranger>();
		strangers.add(new Stranger(demo, 40,40,20,20));
		viewObjects.add(demo);
		viewObjects.addAll(strangers);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}


//public void initAllObjects(List<Visible> viewObjects) {
//	strangers = new ArrayList<StrangerInterface>();
//	player = getAPlayer();
//	viewObjects.add(player);
//	
//	private void appearNewMole() {
//	double chance = .1*(60-timeLeft)/60;
//	if(Math.random() < chance){
//		//create a mole
//		final MoleInterface mole = getAMole();
//		mole.setAppearanceTime(
//				(int)(500+Math.random()*2000));
//		//tell the mole what to do when clicked
//		mole.setAction(new Action(){
//			public void act(){
//				player.increaseScore(1);
//				remove(mole);
//				moles.remove(mole);
//			}
//
//			private void remove(MoleInterface mole) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		addObject(mole);
//		moles.add(mole);
//	}
//}
//
//private void addObject(MoleInterface mole) {
//	// TODO Auto-generated method stub
//	
//}
//
//private void updateAllMoles() {
//	for(int i = 0; i < moles.size(); i++){
//		MoleInterface m = moles.get(i);
//		int screenTime = m.getAppearanceTime()-100;
//		m.setAppearanceTime(screenTime);
//		if(m.getAppearanceTime() <=0){
//			remove(m);
//			//remove from screen
//			moles.remove(m);
//			i--;//compensate for removal
//		}
//		
//	}
//}
//}