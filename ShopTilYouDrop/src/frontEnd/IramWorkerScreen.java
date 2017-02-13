package frontEnd;

import java.util.ArrayList;

import gui6.components.ClickableGraphic;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;
import worker.WorkerInterface;

public class IramWorkerScreen extends ClickableScreen implements WorkerInterface {
	private TextLabel title;
	private ClickableGraphic bottomBun;
	private int countdown;
	
	public IramWorkerScreen(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
	
		bottomBun = new ClickableGraphic(50, 50, "resources/bottomBun.PNG");
	}

	@Override
	public void run() {
		while (countdown > 0) {
			countdown--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {
		title = new TextLabel(325,50,300,40,"Burger Maker!");
		viewObjects.add(title);
		viewObjects.add(bottomBun);
	}

	@Override
	public void displayNewRequest(ArrayList<String> r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayTime() {
		countdown = 15;
		new Thread(this).start();
	}

	@Override
	public void displayBurger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cash() {
		// TODO Auto-generated method stub
		
	}
}