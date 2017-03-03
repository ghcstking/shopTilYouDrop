
package frontEnd;
/**@author Iram Shahed
 **/
 
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

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
	private TextLabel scoreLabel;
	private TextLabel priceLabel;
	private TextLabel gameOver;
	private TextLabel timeLabel;
	private ClickableGraphic highScoreB;
	private ClickableGraphic bottomBun;
	private ClickableGraphic tomato;
	private ClickableGraphic topBun;
	private ClickableGraphic patty;
	private ClickableGraphic lettuce;
	private ClickableGraphic cheese;
	private ClickableGraphic pickles;
	private ClickableGraphic submitBurger;
	private ClickableGraphic clearBurger;
	private EdwinRequestGenerator gen;
	private VickiProgressChecker progress;
	private ArrayList<String> request;
	private ArrayList<String> burger;
	private int countdown;
	private static double score;
	public static double finalScore;

	public IramWorkerScreen(int width, int height) {
		super(width, height);
		score = 0;
	}

	public void begin() {
		Thread screen = new Thread(this);
		screen.start();
	}

	@Override
	public void run() {
		resetBurger();
		countdown = 15;
		while (countdown > 0) {
			countdown--;
			timeLabel.setText("Time left: " + countdown);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//
		if(progress.checkBurger(request, reverseArrayList(burger))) {
			score += progress.price(request);
			score += gen.tip();
			request.clear();
			viewObjects.clear();
			initAllObjects(viewObjects);
			update();
			run();
		}
		else {
			gameOver();
		}
	}
	
	private ArrayList<String> reverseArrayList(ArrayList<String> x) {
		ArrayList<String> tempArrayList = new ArrayList<String>();
		for(int i = x.size() - 1; i > -1; i--) {
			tempArrayList.add(x.get(i));
		}
		for (int i = 0; i < tempArrayList.size(); i++) {
			System.out.println(tempArrayList.get(i));
		}
		return tempArrayList;
	}

	public void gameOver() {
		viewObjects.clear();
		gameOver = new TextLabel(200, 0, 500, 300, "GAME OVER");
		gameOver.setSize(75);
		scoreLabel.setText("You scored $" + getScore());
		scoreLabel.setX(310);
		scoreLabel.setY(300);
		finalScore = score;
		highScoreB = new ClickableGraphic(295, 400, 300, 100, "resources/hs.png");
		highScoreB.setAction(new Action() {

			
			public void act() {
				ShopTilYouDropGame.game.setScreen(ShopTilYouDropGame.mainScreen);
			}

		});
		update();
		viewObjects.add(gameOver);
		viewObjects.add(scoreLabel);
		viewObjects.add(highScoreB);
	}

	public void resetBurger() {
		burger = new ArrayList<String>();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		gen = new EdwinRequestGenerator();
		progress = new VickiProgressChecker();
		request = gen.generate(this);
		title = new TextLabel(300, 5, 300, 90, "Burger Maker");
		timeLabel = new TextLabel(10, 50, 200, 75, "");
		scoreLabel = new TextLabel(10, 80, 300, 75,"Money made: $" + getScore());
		priceLabel = new TextLabel(10, 110, 200, 75, "Price: $" + String.format( "%.2f",progress.price(request)));
		bottomBun = new ClickableGraphic(225, 500, 100, 100, "resources/bottom_bun.png");
		bottomBun.setAction(new Action() {

			@Override
			public void act() {
				burger.add("bottom_bun");
				ClickableGraphic btbn = bottomBun = new ClickableGraphic(300, 400 -(burger.size() * 1), 150, 150,
						"resources/bottom_bun.png");
				addObjects(btbn);//
			}

		});

		topBun = new ClickableGraphic(10, 500, 100, 100, "resources/top_bun.png");
		topBun.setAction(new Action() {//

			@Override
			public void act() {
				burger.add("top_bun");
				ClickableGraphic tpbn = new ClickableGraphic(300, 400 -(burger.size() * 5)-15, 150, 150, "resources/top_bun.png");
				addObjects(tpbn);
			}

		});
		tomato = new ClickableGraphic(450, 500, 100, 100, "resources/tomato.png");
		tomato.setAction(new Action() {

			@Override
			public void act() {
				burger.add("tomato");
				ClickableGraphic tmto = new ClickableGraphic(300, 400 -(burger.size() * 3), 150, 150, "resources/tomato.png");
				addObjects(tmto);
			}

		});
		patty = new ClickableGraphic(550, 500, 100, 100, "resources/patty.png");
		patty.setAction(new Action() {

			@Override
			public void act() {
				burger.add("patty");
				ClickableGraphic ptty = patty = new ClickableGraphic(300, 400 -(burger.size() * 2), 150, 150, "resources/patty.png");
				addObjects(ptty);
			}

		});
		lettuce = new ClickableGraphic(675, 500, 100, 100, "resources/lettuce.png");
		lettuce.setAction(new Action() {

			@Override
			public void act() {
				burger.add("lettuce");
				ClickableGraphic lttc = lettuce = new ClickableGraphic(300,400 -(burger.size() * 5),150, 150, "resources/lettuce.png");
				addObjects(lttc);
			}

		});
		cheese = new ClickableGraphic(335, 500, 100, 100, "resources/cheese.png");
		cheese.setAction(new Action() {

			@Override
			public void act() {
				burger.add("cheese");
				ClickableGraphic chse = cheese = new ClickableGraphic(300, 400 -(burger.size() * 5), 150, 150, "resources/cheese.png");
				addObjects(chse);
			}

		});
		pickles = new ClickableGraphic(125, 500, 100, 100, "resources/pickles.png");
		pickles.setAction(new Action() {

			@Override
			public void act() {
				burger.add("pickles");
				ClickableGraphic pkls = pickles = new ClickableGraphic(300, 400 -(burger.size() * 5)-5, 150, 150, "resources/pickles.png");
				addObjects(pkls);
			}

		});
		submitBurger = new ClickableGraphic(575, 400, 200, 100, "resources/submit.png"); 
		submitBurger.setAction(new Action(){
			public void act() {
				submitBurger();
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
		viewObjects.add(scoreLabel);
		viewObjects.add(priceLabel);
		viewObjects.add(submitBurger);
	}

	@Override
	public void displayNewRequest(ArrayList<String> r) {
		this.request = r;
		for (int i = 0; i < r.size(); i++) {
			String test = r.get(i).replaceAll("_", " ");
			this.addObjects(new TextLabel(600, 50 + i * 50, 200, 40, test));
		}
	}
	@Override
	public String getScore() {
		String scoreD = String.format("%.2f", score);
		return scoreD;
	}

	@Override
	public void submitBurger() {
		countdown = 0;		
	}
}
