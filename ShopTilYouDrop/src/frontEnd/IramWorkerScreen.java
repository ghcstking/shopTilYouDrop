package frontEnd;

import java.util.ArrayList;

import gui6.components.ClickableGraphic;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;


public class IramWorkerScreen extends ClickableScreen {
	private TextLabel title;
	private ClickableGraphic patty;
	
	public IramWorkerScreen(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
	
		patty = new ClickableGraphic(50, 50, "resources/patty.PNG");
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {
		title = new TextLabel(325,50,300,40,"Worker");
		viewObjects.add(title);
		viewObjects.add(patty);
	}
}
