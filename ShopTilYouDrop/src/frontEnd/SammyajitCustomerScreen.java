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
	private TextLabel gameOver;
	private TextArea desc;
	private TextArea vCart;

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

	public void gameOver(){
		viewObjects.clear();
		gameOver = new TextLabel(400,400,200,40,"GAME OVER");
		viewObjects.add(gameOver);
	}

	@Override
	public void initAllObjects(ArrayList<Visible> arg0) {

		budget = new TextLabel(515,103,300,40,"$"+bdget);
		price = new TextLabel(515,158,100,40,"Price");
		desc = new TextArea(515,210,290,195,"Description");
		desc.setSize(20);
		vCart = new TextArea(10,240,600,200,"");

		//		String listString = "";
		//
		//		for (String s : RyanCart.shoppingCart)
		//		{
		//		    listString += s + "\t";
		//		}



		cart=new ViewableCart(10,400,new RyanCart(10,50));
		t = new TextLabel(10, 50, 1000, 40, "You are a customer. Pick items to put in cart.");
		//		cart= new RyanCart(300,50);

		viewObjects.add(t); 
		//t.setSize(.5);


		g=new Graphic(5,100,.82,"resources/CustomerBackground.png");

		button = new ClickableGraphic(600,375,140,50,"resources/button.png");
		button.setAction(new Action() {



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


				StoreItem s = createItem("Valentino Dress",100.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "100.0");
				RyanCart.changeText(desc, "An expensive Valentino dress that Kim Kardashian wore. That means it's worth less.");
				String listString = String.join(", ", RyanCart.shoppingCart);
				RyanCart.changeText(vCart,listString);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());
				if(bdget>=0){
					gameOver();
				}
			}

		});

		//Shoes
		viewObjects.add(new ClickSpace(65,110,40,30) {

			@Override

			public void actOnClick() {
				StoreItem s = createItem("Yeezys", 300.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "300.0");
				RyanCart.changeText(desc, "Shoes you couldn't afford at Foot Locker.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());
				//vCart.setText();
				if(bdget>=0){
					gameOver();
				}
			}

		});

		//TV
		viewObjects.add(new ClickSpace(125,110,105,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Flat Screen TV", 500.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "500.0");
				RyanCart.changeText(desc, "A fancy 60' TV to Netflix and chill.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());
				if(bdget>=0){
					gameOver();
				}
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
				RyanCart.changeText(desc, "One of those antennae TVs because you don't have Netflix.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	
				if(bdget>=0){
					gameOver();
				}}
		});

		//CDS
		viewObjects.add(new ClickSpace(15,170,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Mixtape", 50.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "50.0");
				RyanCart.changeText(desc, "Kanye's new mixtape. Actually, his only mixtape.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	
				if(bdget>=0){
					gameOver();
				}
			}
		});

		//Books
		viewObjects.add(new ClickSpace(80,170,35,35) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Harry Potter book", 30.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "30.0");
				RyanCart.changeText(desc, "One of the books from the Harry Potter series to read for the 100th time.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	
				if(bdget>=0){
					gameOver();
				}}
		});


		viewObjects.add(new ClickSpace(150,200,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("School Supplies", 100.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "100.0");
				RyanCart.changeText(desc,"School Supplies that your child always seems to lose.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());			if(bdget>=0){
					gameOver();
				}}
		});

		//Lipstick
		viewObjects.add(new ClickSpace(10,220,30,50) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Lipstick", 50.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "50.0");
				RyanCart.changeText(desc, "Lipstick in case you ever find a girlfriend.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());if(bdget>=0){
					gameOver();
				}			}

		});

		//Makeup
		viewObjects.add(new ClickSpace(40,220,30,50) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Makeup", 20.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "20.0");
				RyanCart.changeText(desc,"Makeup because you're ugly." );

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());if(bdget>=0){
					gameOver();
				}			}

		});

		//Necklace
		viewObjects.add(new ClickSpace(40,270,30,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Necklace", 100.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "100.0");
				RyanCart.changeText(desc, "A real necklace. Not made in China.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());if(bdget>=0){
					gameOver();
				}			}

		});


		//Ring
		viewObjects.add(new ClickSpace(10,290,30,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Diamond Ring", 600.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "600.0");

				RyanCart.changeText(desc, "24 karat magic in the air.");
				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());if(bdget>=0){
					gameOver();
				}			}

		});

		//Chair
		viewObjects.add(new ClickSpace(440,170,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Wooden Chair", 140.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "140.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());if(bdget>=0){
					gameOver();
				}			}

		});

		//Lock
		viewObjects.add(new ClickSpace(445,220,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Lock", 20.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "20.0");
				RyanCart.changeText(desc, "A Brooklyn Tech necessity - the infamous gym lock.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}			}

		});

		//Cellphone
		viewObjects.add(new ClickSpace(445,268,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Cellphone", 80.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "80.0");

				RyanCart.changeText(desc, "Is that a flip phone? What time period are you from?");
				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}			}

		});

		//Skateboard
		viewObjects.add(new ClickSpace(410,327,80,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Skateboard", 90.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "90.0");

				RyanCart.changeText(desc, "Skateboards make you look cooler. That's a fact.");
				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());if(bdget>=0){
					gameOver();
				}			}

		});

		//Bike
		viewObjects.add(new ClickSpace(305,243,45,85) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Bike", 90.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "90.0");
				RyanCart.changeText(desc, "'Look, ma! No hands!' Those were your last words.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Toys
		viewObjects.add(new ClickSpace(305,170,40,40) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Toys", 30.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "30.0");

				RyanCart.changeText(desc, "You've got a friend in me!");
				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Flowers
		viewObjects.add(new ClickSpace(255,170,45,45) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Flowers", 50.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "50.0");

				RyanCart.changeText(desc, "Flowers for your loved one. Smells...like a breakup.");
				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Cactus
		viewObjects.add(new ClickSpace(255,220,46,46) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Cactus", 20.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "20.0");
				RyanCart.changeText(desc, "Who the heck buys a cactus?");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Soccer Ball
		viewObjects.add(new ClickSpace(255,270,46,46) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Soccer Ball", 20.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "20.0");
				RyanCart.changeText(desc, "A soccer ball. You're probably going to lose it.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});


		//Christmas tree
		viewObjects.add(new ClickSpace(192,170,45,45) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Christmas tree", 100.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "100.0");
				RyanCart.changeText(desc, "It's never too early to buy a Christmas tree.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Volleyball
		viewObjects.add(new ClickSpace(192,300,45,45) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Volleyball", 70.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "70.0");
				RyanCart.changeText(desc, "A colorful beach ball. In case you ever go to the beach. Or leave your house.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Balloons
		viewObjects.add(new ClickSpace(140,300,45,45) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Balloons", 60.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "60.0");
				RyanCart.changeText(desc, "A bunch of balloons. Better let go of one to see how high it goes.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());		if(bdget>=0){
					gameOver();
				}	}

		});

		//Balloons
		viewObjects.add(new ClickSpace(140,300,45,45) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Balloons", 20.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "20.0");
				RyanCart.changeText(desc, "A bunch of balloons. Better let go of one to see how high it goes.");
				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());		if(bdget>=0){
					gameOver();
				}	}

		});

		//Vacuum Cleaner
		viewObjects.add(new ClickSpace(140,250,45,45) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Vacuum Cleaner", 100.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "100.0");
				RyanCart.changeText(desc, "A vacuum cleaner. Time to go ghostbusting like Luigi.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());		if(bdget>=0){
					gameOver();
				}	}

		});

		//Medicine
		viewObjects.add(new ClickSpace(75,243,38,38) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Medicine", 20.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "20.0");
				RyanCart.changeText(desc, "Medicine. Yuck.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Ketchup
		viewObjects.add(new ClickSpace(75,285,38,60) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Ketchup", 10.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "10.0");
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				RyanCart.changeText(desc, "You purchased a "+s.getDescription());
				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Frying pan
		viewObjects.add(new ClickSpace(75,212,30,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Frying pan", 20.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "20.0");
				RyanCart.changeText(desc, "A frying pan - the most lethal weapon.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

		});

		//Purse
		viewObjects.add(new ClickSpace(40,315,30,30) {

			@Override
			public void actOnClick() {
				StoreItem s = createItem("Purse", 150.0);
				RyanCart.addToCart(cart,s);
				RyanCart.changeText(budget, "$"+bdget);
				RyanCart.changeText(price, "150.0");
				RyanCart.changeText(desc, "Don't get a lady angry, or she'll whack you with her purse.");

				String listString = String.join(", ", RyanCart.shoppingCart);
				System.out.println("You purchased a "+s.getDescription()+". It cost "+s.getPrice());	if(bdget>=0){
					gameOver();
				}		}

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
