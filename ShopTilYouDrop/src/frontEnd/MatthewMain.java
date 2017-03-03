package frontEnd;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import gui6.components.Action;
import gui6.components.Button;
import gui6.components.ClickableGraphic;
import gui6.components.Graphic;
import gui6.components.MovingComponent;
import gui6.components.TextArea;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;
import main.ShopTilYouDropGame;


public class MatthewMain extends ClickableScreen implements Runnable, KeyListener{

	private TextLabel title;
	private Graphic bg;
	private Graphic white;
	private TextArea open;
	private Button customer;
	private Button worker;
	private ClickableGraphic arrow;
	private boolean cBool = false;
	private boolean wBool = false;

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
		bg = new Graphic(0,0,"resources/background.png");
		white = new Graphic (90, 75, "resources/white.png");
		title = new TextLabel(200, 100, 500, 40, "Shop Til You Drop");
		title.setSize(45);
		open = new TextArea(100, 175, 600, 300, "Welcome to the Mall! Please select an option using the up/down arrow keys.");
		open.setSize(23);
		customer = new Button(225, 250, 300, 100, "Customer", Color.blue, new Action(){
			public void act(){
				ShopTilYouDropGame.game.setScreen(ShopTilYouDropGame.customerScreen);
			}
		});
		worker = new Button(225, 325, 300, 100, "Worker", Color.blue, new Action(){
			public void act(){
				ShopTilYouDropGame.game.setScreen(ShopTilYouDropGame.workerScreen);
			}
		});
		arrow = new ClickableGraphic(250,275,1.0,"resources/arrow.png");
		viewObjects.add(bg);
		viewObjects.add(white);
		viewObjects.add(title);
		viewObjects.add(open);
		viewObjects.add(customer);
		viewObjects.add(worker);
		viewObjects.add(arrow);
	}

	public void update(Graphics2D g) {

	}
	public KeyListener getKeyListener(){
		return this;
	}


	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			customer.act();
		}
		if(cBool==true && wBool==false && e.getKeyCode() == KeyEvent.VK_ENTER){
			customer.act();
		}
		else if(wBool == true && cBool == false && e.getKeyCode() == KeyEvent.VK_ENTER){
			worker.act();
		}
		if(e.getKeyCode() == KeyEvent.VK_UP){
			cBool = true;
			wBool = false;
			arrow.setY(275);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){ 
			wBool = true;
			cBool = false;
			arrow.setY(350);
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
