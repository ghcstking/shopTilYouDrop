package frontEnd;

import java.awt.event.KeyEvent;
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
	private ViewableCart cart;
	
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
		cart=new ViewableCart(10,400,new RyanCart(10,50));
		t = new TextLabel(10, 50, 1000, 40, "You are a customer. Pick items to put in cart.");
		//		cart= new RyanCart(300,50);

		viewObjects.add(t);
		//t.setSize(.5);


		g=new Graphic(5,100,.82,"resources/CustomerBackground.png");



		viewObjects.add(g);
		//g.setSize();


		//Dress
		viewObjects.add(new ClickSpace(14,114,55,60) {

			@Override
			public void act() {
				
				StoreItem s = createItem("Valentino Dress",200.0);
				addToCart(s);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());

			}

		});
		
		//Shoes
		viewObjects.add(new ClickSpace(83,115,40,30) {

			@Override
			public void act() {
				System.out.println("You purchased a new pair of Yeezys.");
//				addToCart("shoes",200.0);

			}

		});

		//TV
		viewObjects.add(new ClickSpace(155,110,115,40) {

			@Override
			public void act() {
				System.out.println("You purchased a 60' flat screen TV.");
//				addToCart("TV",200.0);

			}

		});

		//TV 2
		viewObjects.add(new ClickSpace(285,110,115,40) {

			@Override
			public void act() {
				System.out.println("You purchased one of those cheap TVs with antennaes that have no color.");
//				addToCart("better TV",200.0);

			}

		});
		
		//CDS
		viewObjects.add(new ClickSpace(18,185,40,40) {

			@Override
			public void act() {
				System.out.println("You purchased one of Kanye's new mixtapes.");
//				addToCart("CDs",200.0);

			}

		});
		
		//Books
		viewObjects.add(new ClickSpace(100,185,40,40) {

			@Override
			public void act() {
				System.out.println("You purchased a book from the Harry Potter series because you wanted to read it for the 10th time.");
//				addToCart("book",200.0);

			}

		});
	
	//------Ryan coded below------
		//School Supplies
		viewObjects.add(new ClickSpace(180,230,50,50) {

			@Override
			public void act() {
				System.out.println("You purchased some school supplies because it's Black Friday and they're cheap.");
//				addToCart("dress",200.0);

			}

		});
		
		//Lipstick
		viewObjects.add(new ClickSpace(10,250,30,50) {

			@Override
			public void act() {
				System.out.println("You purchased some lipstick in case you find a girlfriend.");
//				addToCart("dress",200.0);

			}

		});
		
		//Makeup
		viewObjects.add(new ClickSpace(50,250,30,50) {

			@Override
			public void act() {
				System.out.println("You purchased some makeup because you're ugly.");
//				addToCart("makeup",200.0);

			}

		});
		
		//Necklace
		viewObjects.add(new ClickSpace(50,310,30,30) {

			@Override
			public void act() {
				System.out.println("You purchased a necklace that's totally real. It's not made in China.");
//				addToCart("necklace",200.0);

			}

		});
		
		//Ring
		viewObjects.add(new ClickSpace(16,345,30,30) {

			@Override
			public void act() {
				System.out.println("You purchased a 25 karot diamond ring.");
//				addToCart("ring",200.0);

			}

		});
		
		//Chair
		viewObjects.add(new ClickSpace(545,185,40,50) {

			@Override
			public void act() {
				System.out.println("You purchased a chair that Goldilocks didn't sit on and break.");
//				addToCart("chair",200.0);

			}

		});
		
		//Checkout
		viewObjects.add(new ClickSpace(437,110,155,70) {
			
			@Override
			public void act() {
				System.out.println("Checkout");
				
			}
		});
		viewObjects.add(cart);
	}






	
	private void addToCart(StoreItem s) {
		cart.addItem(s);
		RyanCart.shoppingCart.add(s.getDescription());
		cart.update();
		System.out.println(RyanCart.shoppingCart);
	}
	
	public StoreItem createItem(String str, double d){
		StoreItem s = new StoreItem(){

			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return str;
			}

			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return d;
			}
			
		};
		return s;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
 

}
