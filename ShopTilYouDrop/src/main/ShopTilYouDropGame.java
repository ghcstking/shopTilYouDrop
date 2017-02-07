package main;

import frontEnd.MatthewMain;
import gui6.GUIApplication;

public class ShopTilYouDropGame extends GUIApplication {

	public ShopTilYouDropGame(int width, int height) {
		super(width, height);
	}
	
	public static void main(String[] args) {
		ShopTilYouDropGame game = new ShopTilYouDropGame(800, 500);
		Thread app = new Thread(game);
		app.start();
	}


	@Override
	public void initScreen() {
		MatthewMain screen = new MatthewMain(getWidth(), getHeight());
		setScreen(screen);
		//
	}

}
