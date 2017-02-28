package frontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui6.components.Action;
import gui6.components.Button;
import gui6.components.ClickableGraphic;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;
import main.ShopTilYouDropGame;
import worker.EdwinRequestGenerator;
import worker.VickiProgressChecker;
import worker.WorkerInterface;

public class IramWorkerScreen extends ClickableScreen implements WorkerInterface, Runnable {
	private TextLabel title;
	private ClickableGraphic bottomBun;
	private ClickableGraphic tomato;
	private ClickableGraphic topBun;
	private ClickableGraphic patty;
	private ClickableGraphic lettuce;
	private ClickableGraphic cheese;
	private ClickableGraphic pickles;
	private Button submitBurger;
	private int countdown;
	private TextLabel timeLabel;
	private ArrayList<BufferedImage> images;
	private int cashamount;
	private EdwinRequestGenerator gen;
	private ArrayList<String> request;

	public IramWorkerScreen(int width, int height) {
		super(width, height);
	}

	public void begin(){
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
		//orders = new ArrayList<TextLabel>();
		bottomBun = new ClickableGraphic(225, 500, 100, 100, "resources/bottom_bun.png");
		topBun = new ClickableGraphic(10, 500, 100, 100, "resources/top_bun.png");
		tomato = new ClickableGraphic(450, 500, 100, 100, "resources/tomato.png");
		patty = new ClickableGraphic(550, 500, 100, 100, "resources/patty.png");
		lettuce = new ClickableGraphic(675, 500, 100, 100, "resources/lettuce.png");
		cheese = new ClickableGraphic(325, 500, 100, 100, "resources/cheese.png");
		pickles = new ClickableGraphic(125, 500, 100, 100, "resources/pickles.png");
		gen = new EdwinRequestGenerator();
		request = gen.generate(this);
		submitBurger = new Button(615, 375, 100, 100, "Play", Color.blue, new Action() {
			public void act() {
				VickiProgressChecker.checkBurger(request, /*** another arraylist string of users product ***/));
			}
		});
		viewObjects.add(title);
		viewObjects.add(bottomBun);
		viewObjects.add(topBun);
		viewObjects.add(tomato);
		viewObjects.add(lettuce);
		viewObjects.add(patty);
		viewObjects.add(cheese);
		viewObjects.add(pickles);
		viewObjects.add(timeLabel);
	}


	
	@Override
	public void displayNewRequest(ArrayList<String> r) {
		for (int i = 0; i < r.size(); i++) {
			this.addObjects(new TextLabel(600,100+ i*50, 200, 40, r.get(i)));
		}
	}

	@Override
	public void displayBurger() {
		
	}

	@Override
	public void cash() {
		//cashamount =
	}

	@Override
	public void displayPrice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void submitBurger() {
		// TODO Auto-generated method stub
		
	}

}