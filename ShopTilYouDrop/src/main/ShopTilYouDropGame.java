package main;

import frontEnd.IramWorkerScreen;
import frontEnd.MatthewMain;
import frontEnd.SammyajitCustomerScreen;
import gui6.GUIApplication;

public class ShopTilYouDropGame extends GUIApplication {

	public ShopTilYouDropGame(int width, int height) {
		super(width, height);
	}
	
	public static void main(String[] args) {
		ShopTilYouDropGame game = new ShopTilYouDropGame(800, 600);
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
