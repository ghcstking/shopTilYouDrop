package main;

import java.awt.Graphics2D;
import java.util.ArrayList;

import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class MatthewShopTilYouDropScreen extends ClickableScreen implements Runnable{

	private TextLabel title;
	public MatthewShopTilYouDropScreen(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
	}

	@Override
	public void run() {
		
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {
		title = new TextLabel(325,50,300,40,"Shop Til You Drop");
		viewObjects.add(title);
	}
	
	public void update(Graphics2D g) {
		
	}

}
