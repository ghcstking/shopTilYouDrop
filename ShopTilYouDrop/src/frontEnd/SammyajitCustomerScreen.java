package frontEnd;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import customer.DanielFreeMoney;
import customer.DemoPlayer;
import customer.RyanCart;
import customer.StoreItem;
import customer.components.Stranger;
import gui6.components.Action;
import gui6.components.Button;
import gui6.components.ClickableGraphic;
import gui6.components.Graphic;
import gui6.components.TextArea;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;



public class SammyajitCustomerScreen extends ClickableScreen implements Runnable {
	private TextLabel t;
	private ClickableGraphic cg;
	private ViewableCart cart;
	
	private TextLabel budget;
	private TextLabel price;
	private TextArea desc;
	private TextLabel vCart;
	
	private Graphic g;
	
	private ClickableGraphic button;
	
	//String scoreD = String.format("%.2f", score);
	 public static double bdget=4000.0;
	
	


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
		
		budget = new TextLabel(515,103,300,40,"$"+bdget);
		price = new TextLabel(515,158,100,40,"Price");
		desc = new TextArea(515,210,300,195,"Description");
		desc.setSize(20);
		vCart = new TextLabel(10,350,600,200,"cart");
		
		
		cart=new ViewableCart(10,400,new RyanCart(10,50));
		t = new TextLabel(10, 50, 1000, 40, "You are a customer. Pick items to put in cart.");
		//		cart= new RyanCart(300,50);

		viewObjects.add(t);
		//t.setSize(.5);


		g=new Graphic(5,100,.82,"resources/CustomerBackground.png");
		
		button = new ClickableGraphic(600,375,140,50,"resources/button.png");
		button.setAction(new Action() {

			
			@Override
			public void act() {
				RyanCart.removeFromCart(cart, RyanCart.shoppingCart.get(RyanCart.shoppingCart.size()-1));
			}

		});

		viewObjects.add(g);
		//g.setSize();


		//Dress
		viewObjects.add(new ClickSpace(14,114,50,50) {

			@Override
			public void actOnClick() {
				
				StoreItem s = createItem("Valentino Dress",200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());
				//RyanCart.removeFromCart(cart, );

			}

		});
		
		//Shoes
		viewObjects.add(new ClickSpace(65,110,40,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Yeezys", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());
				//vCart.setText();
			}

		});

		//TV
		viewObjects.add(new ClickSpace(125,110,105,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Flat Screen TV", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
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
				RyanCart.changeText(budget, "$"+bdget);
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
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}
		});
		
		//Books
		viewObjects.add(new ClickSpace(80,170,35,35) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Harry Potter book", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}
		});
	
	
		viewObjects.add(new ClickSpace(150,200,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("School Supplies", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
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
				RyanCart.changeText(budget, "$"+bdget);
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
				RyanCart.changeText(budget, "$"+bdget);
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
				RyanCart.changeText(budget, "$"+bdget);
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
				RyanCart.changeText(budget, "$"+bdget);
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
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		//Lock
		viewObjects.add(new ClickSpace(445,220,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Lock", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		//Cellphone
		viewObjects.add(new ClickSpace(445,268,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Cellphone", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		//Skateboard
		viewObjects.add(new ClickSpace(410,327,80,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Skateboard", 200.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "200.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

		});
		
		//Bike
				viewObjects.add(new ClickSpace(305,243,45,85) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Bike", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Toys
				viewObjects.add(new ClickSpace(305,170,40,40) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Toys", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Flowers
				viewObjects.add(new ClickSpace(255,170,45,45) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Flowers", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Cactus
				viewObjects.add(new ClickSpace(255,220,46,46) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Cactus", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Soccer Ball
				viewObjects.add(new ClickSpace(255,270,46,46) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Soccer Ball", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				

				//Christmas tree
				viewObjects.add(new ClickSpace(192,170,45,45) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Christmas tree", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Volleyball
				viewObjects.add(new ClickSpace(192,300,45,45) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Volleyball", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Balloons
				viewObjects.add(new ClickSpace(140,300,45,45) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Balloons", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Balloons
				viewObjects.add(new ClickSpace(140,300,45,45) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Balloons", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
					RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Vacuum Cleaner
				viewObjects.add(new ClickSpace(140,250,45,45) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Vacuum Cleaner", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Medicine
				viewObjects.add(new ClickSpace(75,243,38,38) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Medicine", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Ketchup
				viewObjects.add(new ClickSpace(75,285,38,60) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Ketchup", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Frying pan
				viewObjects.add(new ClickSpace(75,212,30,30) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Frying pan", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				
				//Purse
				viewObjects.add(new ClickSpace(40,315,30,30) {

					@Override
					public void actOnClick() {
						StoreItem s = createItem("Purse", 200.0);
						RyanCart.addToCart(cart,s);
						RyanCart.changeText(budget, "$"+bdget);
						RyanCart.changeText(price, "200.0");
						RyanCart.changeText(desc, "You purchased a "+s.getDescription());
						System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			}

				});
				

				
//				viewObjects.add(new ClickSpace(570,370,140,50) {
//					
//					@Override
//					public void actOnClick() {
//						
//					}
//					
//				});
		
		//Checkout
		viewObjects.add(new ClickSpace(350,110,140,50) {
			
			@Override
			public void actOnClick() {
				System.out.println("Checkout");
			}
			
		});
		viewObjects.add(cart);
		viewObjects.add(budget);
		viewObjects.add(price);
		viewObjects.add(desc);
		viewObjects.add(vCart);
		viewObjects.add(button);


//
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
		
		//DanielFreeMoney.placeMoney(410,327);


		
	}

//ADD REMOVE

	
	
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
