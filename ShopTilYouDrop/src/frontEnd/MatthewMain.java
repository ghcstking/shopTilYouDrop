package frontEnd;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import gui6.components.Graphic;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class MatthewMain extends ClickableScreen implements Runnable{

	private TextLabel title;
	private Graphic bg;
	
	public MatthewMain(int width, int height) {
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
		title.setFont("Arial");
		bg = new Graphic(0,0,"resources/background.png");
		viewObjects.add(bg); 
		viewObjects.add(title);
	}

}
