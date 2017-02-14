package frontEnd;

import java.awt.Font;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import gui6.components.Graphic;

import gui6.components.Action;
import gui6.components.Button;
import gui6.components.MovingComponent;
import gui6.components.TextArea;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;


public class MatthewMain extends ClickableScreen implements Runnable{

	private TextLabel title;
	private Graphic bg;
	
	private TextArea customer;
	private TextArea worker;


	public MatthewMain(int width, int height) {
		super(width, height);
		Thread screen = new Thread(this);
		screen.start();
	}

	@Override
	public void run() {
		

	}
	
	public void drawBackground(Graphics2D g){
		g.setColor(Color.green);
		g.fillRect(0, 0, getWidth(), getHeight());


	}

	public void initAllObjects(ArrayList<Visible> arg0) {
		title = new TextLabel(325,50,300,40,"Shop Til You Drop");
		title.setSize(30);
		bg = new Graphic(0,0,"resources/background.png");
		viewObjects.add(bg); 

		title = new TextLabel(20, 200, 500, 40, "This is the title");
		customer = new TextArea(20, 300, 700, 100, "Customer goes here");
		worker = new TextArea(20, 300, 700, 100, "Worker goes here");
		viewObjects.add(title);
		viewObjects.add(customer);
		viewObjects.add(worker);
	}

}
