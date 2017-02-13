package frontEnd;

import java.util.ArrayList;

import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;


public class IramWorkerScreen extends ClickableScreen {
	private TextLabel title;
	
	public IramWorkerScreen(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {
		title = new TextLabel(325,50,300,40,"Worker");
		viewObjects.add(title);
	}
}
