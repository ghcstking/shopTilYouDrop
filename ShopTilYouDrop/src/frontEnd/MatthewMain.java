package frontEnd;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import gui6.components.Action;
import gui6.components.Button;
import gui6.components.MovingComponent;
import gui6.components.TextArea;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;


public class MatthewMain extends ClickableScreen implements Runnable{

	private TextLabel title;
	private TextLabel customer;
	private TextLabel worker;

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

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {
//		title = new TextLabel(325,50,300,40,"Shop Til You Drop");
//		viewObjects.add(title);
		
		title = new TextLabel(100, 100, 500, 40, "Shop Til You Drop");
		title.setSize(30);
		customer = new TextLabel(100, 300, 500, 100, "Customer");
		customer.setSize(30);
		worker = new TextLabel(100, 400, 700, 100, "Worker");
		worker.setSize(30);
		viewObjects.add(title);
		viewObjects.add(customer);
		viewObjects.add(worker);
	}
	
	public void update(Graphics2D g) {
		
	}

}
