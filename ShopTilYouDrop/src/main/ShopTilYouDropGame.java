package main;

import frontEnd.IramWorkerScreen;
import frontEnd.MatthewCustomerB;
import frontEnd.MatthewHighScoreScreen;
import frontEnd.MatthewMain;
import frontEnd.MatthewWorkerB;
import frontEnd.SammyajitCustomerScreen;
import gui6.GUIApplication;

public class ShopTilYouDropGame extends GUIApplication {
	
	public static ShopTilYouDropGame game;
	public static MatthewCustomerB customerScreen;
	public static MatthewWorkerB workerScreen;
	public static IramWorkerScreen workerGame;
	public static SammyajitCustomerScreen customerGame;
	public static MatthewMain mainScreen;
	private MatthewHighScoreScreen highscorescreen;
	
	public ShopTilYouDropGame(int width, int height) {
		super(width, height);
	}
	
	public static void main(String[] args) {
		game = new ShopTilYouDropGame(800, 600);
		Thread app = new Thread(game);
		app.start();
	}


	@Override
	public void initScreen() {
//		SammyajitCustomerScreen screen = new SammyajitCustomerScreen(getWidth(), getHeight());
//		setScreen(screen);
		IramWorkerScreen screen = new IramWorkerScreen(getWidth(), getHeight());
		setScreen(screen); //cin
	}

}
