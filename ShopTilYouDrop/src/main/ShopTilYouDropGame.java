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
	public static MatthewHighScoreScreen highscorescreen;
	
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
		customerScreen = new MatthewCustomerB(getWidth(), getHeight());
		workerScreen = new MatthewWorkerB(getWidth(), getHeight());
		customerGame = new SammyajitCustomerScreen(getWidth(), getHeight());
		workerGame = new IramWorkerScreen(getWidth(), getHeight());
		mainScreen = new MatthewMain(getWidth(), getHeight());
<<<<<<< HEAD
		highscorescreen = new MatthewHighScoreScreen(getWidth(), getHeight());
		setScreen(highscorescreen);
//		setScreen(mainScreen);
=======
	//	highscorescreen = new MatthewHighScoreScreen(getWidth(), getHeight());
//		setScreen(highscorescreen);
		setScreen(mainScreen);
>>>>>>> branch 'develop' of https://github.com/ghcstking/shopTilYouDrop
	}

}
