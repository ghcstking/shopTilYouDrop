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
		//		cart= new RyanCart(300,50);

		viewObjects.add(t);


		g=new Graphic(5,100,.82,"resources/CustomerBackground.png");



		viewObjects.add(g);
		//g.setSize();


		//Dress
		viewObjects.add(new ClickSpace(14,114,55,60) {

			@Override
			public void act() {
				System.out.println("You purchase a dress.");
				//				addToCart("dress",200.0);

			}

		});
		
		//Shoes
		viewObjects.add(new ClickSpace(83,115,40,30) {

			@Override
			public void act() {
				System.out.println("You purchased a new pair of Yeezys.");
				//				addToCart("dress",200.0);

			}

		});

		//TV
		viewObjects.add(new ClickSpace(155,110,115,40) {

			@Override
			public void act() {
				System.out.println("You purchased a 60' flat screen TV.");
				//			addToCart("dress",200.0);

			}

		});

		//TV 2
		viewObjects.add(new ClickSpace(285,110,115,40) {

			@Override
			public void act() {
				System.out.println("You purchased one of those cheap TVs with antennaes that have no color.");
				//			addToCart("dress",200.0);

			}

		});
		
		//CDS
		viewObjects.add(new ClickSpace(18,185,40,40) {

			@Override
			public void act() {
				System.out.println("You purchased one of Kanye's new mixtapes.");
				//			addToCart("dress",200.0);

			}

		});
		
		//Books
		viewObjects.add(new ClickSpace(100,185,40,40) {

			@Override
			public void act() {
				System.out.println("You purchased a book from the Harry Potter series because you wanted to read it for the 10th time.");
				//			addToCart("dress",200.0);

			}

		});
	
	//------Find coordinates for below------
		//School Supplies
		viewObjects.add(new ClickSpace(180,230,50,50) {

			@Override
			public void act() {
				System.out.println("You purchased some school supplies because it's Black Friday and they're cheap.");
				//			addToCart("dress",200.0);

			}

		});
		
		//Lipstick
		viewObjects.add(new ClickSpace(10,250,30,50) {

			@Override
			public void act() {
				System.out.println("You purchased some lipstick in case you find a girlfriend.");
				//			addToCart("dress",200.0);

			}

		});
		
		//Makeup
		viewObjects.add(new ClickSpace(50,250,30,50) {

			@Override
			public void act() {
				System.out.println("You purchased some makeup because you're ugly.");
				//			addToCart("dress",200.0);

			}

		});
		
		//Necklace
		viewObjects.add(new ClickSpace(50,310,30,30) {

			@Override
			public void act() {
				System.out.println("You purchased a necklace that's totally real. It's not made in China.");
				//			addToCart("dress",200.0);

			}

		});
		
		//Ring
		viewObjects.add(new ClickSpace(16,345,30,30) {

			@Override
			public void act() {
				System.out.println("You purchased a 25 karot diamond ring.");
				//			addToCart("dress",200.0);

			}

		});
		
		//Chair
		viewObjects.add(new ClickSpace(545,185,40,50) {

			@Override
			public void act() {
				System.out.println("You purchased a chair that Goldilocks didn't sit on and break.");
				//			addToCart("dress",200.0);

			}

		});
		
		//Checkout
		viewObjects.add(new ClickSpace(437,110,155,70) {
			
			@Override
			public void act() {
				System.out.println("Checkout");
				//			addToCart("dress",200.0);
			}
		});
	}
	
	
	private void addToCart(String string, double d) {
		cart.addItem(new StoreItem(){

			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return d;
			}

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return string;
			}
		});
	}
}
