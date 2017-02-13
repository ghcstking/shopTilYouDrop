package frontEnd;

import java.util.ArrayList;
import java.util.List;

import customer.RyanCart;
import customer.StoreItem;
import gui6.components.ClickableGraphic;
import gui6.components.Graphic;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;



public class SammyajitCustomerScreen extends ClickableScreen implements Runnable {
	private TextLabel t;
	private ClickableGraphic cg;
	private CartInterface cart;
	
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
		cart= new RyanCart(300,50);

		viewObjects.add(t);
		

		g=new Graphic(5,100,.82,"resources/CustomerBackground.png");

		

		viewObjects.add(g);
		//g.setSize();
		

		viewObjects.add(new ClickSpace(14,114,55,60) {
			
			@Override
			public void act() {
				System.out.println("Clicked on dress.");
				cart.addItem(new StoreItem(){
					
					@Override
					public double getPrice() {
						// TODO Auto-generated method stub
						return 200.0;
					}
					
					@Override
					public String getDescription() {
						// TODO Auto-generated method stub
						return "dress";
					}
				});
			}
		});
	}
 
}
