package frontEnd;

import java.util.ArrayList;
import java.util.List;

import gui6.components.ClickableGraphic;
import gui6.components.Graphic;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;



public class SammyajitCustomerScreen extends ClickableScreen implements Runnable {
	private TextLabel t;
	private ClickableGraphic cg;
	
	private Graphic g;
	

	public SammyajitCustomerScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {
		t = new TextLabel(10, 50, 500, 40, "You are a customer. Pick items to put in cart.");
		viewObjects.add(t);
		
		g=new Graphic(5,100,.82,"resources/CustomerBackground.png");
		viewObjects.add(g);
		//g.setSize();
	}
 
}
