package frontEnd;

import java.util.ArrayList;

import gui6.components.ClickableGraphic;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;
import worker.WorkerInterface;

public class IramWorkerScreen extends ClickableScreen implements WorkerInterface {
	private TextLabel title;
	private ArrayList<TextLabel> orders;
	private ClickableGraphic bottomBun;
	private int countdown;
	private int cashAmount;
	
	public IramWorkerScreen(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
		orders = new ArrayList<TextLabel>();
		bottomBun = new ClickableGraphic(50, 50, "resources/bottomBun.PNG");
	}

	@Override
	public void run() {
		while (countdown > 0) {
			countdown--;
			System.out.println(countdown);
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
		for(int i = 0; i < r.size(); i++){
			orders.add(new TextLabel(325+i*50,50,300,40,r.get(i)));
		}
		update();
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
		
		
	}
}