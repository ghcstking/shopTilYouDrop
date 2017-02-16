package frontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
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
	private ClickableGraphic tomato;
	private ClickableGraphic topBun;
	private ClickableGraphic patty;
	private ClickableGraphic lettuce;
	private ClickableGraphic cheese;
	private ClickableGraphic pickles;
	private int countdown;
	private TextLabel timeLabel;
	private int cashamount;

	public IramWorkerScreen(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
	}

	@Override
	public void run() {
		countdown = 15;
		while (countdown > 0) {
			countdown--;
			timeLabel.setText("" + countdown);
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
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		title = new TextLabel(325, 50, 300, 40, "Burger Maker!");
		timeLabel = new TextLabel(60, 50, 120, 60, "");
		orders = new ArrayList<TextLabel>();
		bottomBun = new ClickableGraphic(225, 500, 100, 100, "resources/bottom_bun.png");
		topBun = new ClickableGraphic(10, 500, 100, 100, "resources/top_bun.png");
		tomato = new ClickableGraphic(450, 500, 100, 100, "resources/tomato.png");
		patty = new ClickableGraphic(550, 500, 100, 100, "resources/patty.png");
		lettuce = new ClickableGraphic(675, 500, 100, 100, "resources/lettuce.png");
		cheese = new ClickableGraphic(325, 500, 100, 100, "resources/cheese.png");
		pickles = new ClickableGraphic(125, 500, 100, 100, "resources/pickles.png");
		viewObjects.add(title);
		viewObjects.add(bottomBun);
		viewObjects.add(topBun);
		viewObjects.add(tomato);
		viewObjects.add(lettuce);
		viewObjects.add(patty);
		viewObjects.add(cheese);
		viewObjects.add(pickles);
		viewObjects.add(timeLabel);
		// viewObjects.add(orders);
	}

	@Override
	public void displayNewRequest(ArrayList<String> r) {
		for (int i = 0; i < r.size(); i++) {
			this.addObjects(new TextLabel(100 + i * 50, 50, 200, 40, r.get(i)));
		}
	}

	@Override
	public void displayBurger() {

	}

	@Override
	public void cash() {
		// cashamount =
	}

	@Override
	public void displayPrice() {
		// TODO Auto-generated method stub

	}

}