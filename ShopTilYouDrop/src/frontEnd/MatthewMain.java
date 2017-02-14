package frontEnd;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import gui6.components.Action;
import gui6.components.Button;
import gui6.components.MovingComponent;
import gui6.components.TextArea;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;


public class MatthewMain extends ClickableScreen implements Runnable{

	private TextLabel title;
	private TextArea open;
	private Button customer;
	private Button worker;

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
//		title = new TextLabel(325,50,300,40,"Shop Til You Drop");
//		viewObjects.add(title);
		
		title = new TextLabel(175, 100, 500, 40, "Shop Til You Drop");
		title.setSize(45);
		open = new TextArea(100, 175, 600, 300, "Welcome to the Mall! Please select an option using the up/down arrow keys.");
		open.setSize(23);
		customer = new Button(225, 250, 300, 100, "Customer", Color.blue, new Action(){
			public void act(){
				MatthewChangeScreen.game.setScreen(MatthewChangeScreen.customerScreen);
			}
		});
		worker = new Button(225, 325, 300, 100, "Worker", Color.blue, new Action(){
			public void act(){
				MatthewChangeScreen.game.setScreen(MatthewChangeScreen.workerScreen);
			}
		});
		viewObjects.add(title);
		viewObjects.add(open);
		viewObjects.add(customer);
		viewObjects.add(worker);
	}
	
	public void update(Graphics2D g) {
		
	}
	public KeyListener getKeyListener(){
		return this;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){ 
			System.out.println("Up Arrow Key pressed");
			customer.act();
			}else if(e.getKeyCode() == KeyEvent.VK_DOWN){ 
			System.out.println("Down Arrow Key pressed");
			worker.act();
			} 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("A key was typed!");
	}
}
