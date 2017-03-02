package frontEnd;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import customer.DemoPlayer;
import customer.RyanCart;
import customer.StoreItem;
import customer.components.Stranger;
import gui6.components.ClickableGraphic;
import gui6.components.Graphic;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;



public class SammyajitCustomerScreen extends ClickableScreen implements Runnable {
	private TextLabel t;
	private ClickableGraphic cg;
	private ViewableCart cart;
	
	private TextLabel name;
	private TextLabel price;
	private TextLabel desc;
	
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
		name = new TextLabel(515,103,300,40,"Item");
		price = new TextLabel(515,158,100,40,"Price");
		desc = new TextLabel(515,210,200,50,"Description");
		
		cart=new ViewableCart(10,400,new RyanCart(10,50));
		t = new TextLabel(10, 50, 1000, 40, "You are a customer. Pick items to put in cart.");
		//		cart= new RyanCart(300,50);

		viewObjects.add(t);
		//t.setSize(.5);


		g=new Graphic(5,100,.82,"resources/CustomerBackground.png");



		viewObjects.add(g);
		//g.setSize();


		//Dress
		viewObjects.add(new ClickSpace(14,114,50,50) {

			@Override
			public void actOnClick() {
				
				StoreItem s = createItem("Valentino Dress",200.0);
//				RyanCart.addToCart(cart,s);
//				RyanCart.changeText(name, "Dress");
//				RyanCart.changeText(price, "200.0");
//				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
//				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());
				RyanCart.removeFromCart(cart, s);

			}

		});
		
		//Shoes
		viewObjects.add(new ClickSpace(65,110,40,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Yeezys", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Yeezys");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());
			}

		});

		//TV
		viewObjects.add(new ClickSpace(125,110,105,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Flat Screen TV", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Flat Screen TV");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());
			}
		});

		//TV 2
		viewObjects.add(new ClickSpace(230,110,105,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Cheap TV", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Cheap TV");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}
		});
		
		//CDS
		viewObjects.add(new ClickSpace(15,170,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Mixtape", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Mixtape");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}
		});
		
		//Books
		viewObjects.add(new ClickSpace(80,170,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Harry Potter book", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Harry Potter book");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}
		});
	
	//------Ryan coded below------
		//School Supplies
		viewObjects.add(new ClickSpace(150,200,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("School Supplies", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "School Supplies");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}
		});
		
		//Lipstick
		viewObjects.add(new ClickSpace(10,220,30,50) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Lipstick", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Lipstick");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		//Makeup
		viewObjects.add(new ClickSpace(40,220,30,50) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Makeup", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Makeup");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		//Necklace
		viewObjects.add(new ClickSpace(40,270,30,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Necklace", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Necklace");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		
		//Ring
		viewObjects.add(new ClickSpace(10,290,30,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Diamond Ring", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Diamond Ring");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		//Chair
		viewObjects.add(new ClickSpace(440,170,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Wooden Chair", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Wooden Chair");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		//
		viewObjects.add(new ClickSpace(440,170,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Wooden Chair", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Wooden Chair");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		viewObjects.add(new ClickSpace(440,170,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Wooden Chair", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(name, "Wooden Chair");
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		
		//Checkout
		viewObjects.add(new ClickSpace(350,110,140,50) {
			
			@Override
			public void actOnClick() {
				System.out.println("Checkout");
			}
			
		});
		viewObjects.add(cart);
		viewObjects.add(name);
		viewObjects.add(price);
		viewObjects.add(desc);



		DemoPlayer demo = new DemoPlayer(100,300,100,20);
		viewObjects.add(demo);
		for(int i=0;i<viewObjects.size();i++){
			if(viewObjects.get(i) instanceof ClickSpace){
				if(Math.random()>.5){
					ClickSpace c = (ClickSpace) viewObjects.get(i);
					Stranger s = new Stranger(demo,c.getX(),c.getY(),25,20);
					c.setStranger(s);
					viewObjects.add(s);
				}
				
			}
		}


		
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
