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

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {
//		title = new TextLabel(325,50,300,40,"Shop Til You Drop");
//		viewObjects.add(title);
		
		title = new TextLabel(100, 100, 500, 40, "This is the title");
		title.setSize(30);
		customer = new TextArea(20, 300, 700, 100, "Customer goes here");
		customer.setSize(30);
		worker = new TextArea(20, 400, 700, 100, "Worker goes here");
		worker.setSize(30);
		viewObjects.add(title);
		viewObjects.add(customer);
		viewObjects.add(worker);
	}
	
	public void update(Graphics2D g) {
		
	}

}
