package frontEnd;

<<<<<<< HEAD
import java.awt.Font;
=======

import java.awt.Color;
>>>>>>> refs/remotes/origin/develop
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

<<<<<<< HEAD
import gui6.components.Graphic;
=======
import gui6.components.Action;
import gui6.components.Button;
import gui6.components.MovingComponent;
import gui6.components.TextArea;
>>>>>>> refs/remotes/origin/develop
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;


public class MatthewMain extends ClickableScreen implements Runnable{

	private TextLabel title;
<<<<<<< HEAD
	private Graphic bg;
	
=======
	private TextArea customer;
	private TextArea worker;

>>>>>>> refs/remotes/origin/develop
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
<<<<<<< HEAD
		title = new TextLabel(325,50,300,40,"Shop Til You Drop");
		title.setSize(30);
		bg = new Graphic(0,0,"resources/background.png");
		viewObjects.add(bg); 
=======
//		title = new TextLabel(325,50,300,40,"Shop Til You Drop");
//		viewObjects.add(title);

		title = new TextLabel(20, 200, 500, 40, "This is the title");
		customer = new TextArea(20, 300, 700, 100, "Customer goes here");
		worker = new TextArea(20, 300, 700, 100, "Worker goes here");
>>>>>>> refs/remotes/origin/develop
		viewObjects.add(title);
<<<<<<< HEAD
=======
		viewObjects.add(customer);
		viewObjects.add(worker);
	}
	
	public void update(Graphics2D g) {
		
>>>>>>> refs/remotes/origin/develop
	}

}
