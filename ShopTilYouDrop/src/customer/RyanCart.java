package customer;

import java.util.ArrayList;

import frontEnd.CartInterface;
import frontEnd.ViewableCart;
import gui6.components.ClickableGraphic;
import gui6.components.Component;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class RyanCart implements CartInterface{

	public static ArrayList<String> shoppingCart;
	private int numberOfItems;
	private TextLabel label;
	private double timeLeft;
	private double budget;
	private ViewableCart cart;
	
	
	public RyanCart(int x, int y) {
		super();	
		shoppingCart = new ArrayList<String>();
		//screen should incorporate clicking an image to add an item to the cart
		//and clicking an image in the cart to remove it
	}
	
	private void generateBudget(){
		budget = 100.00;
		//generate a budget that will consist of different arrangements of the item prices,
		//so that the customer can match the prices of the items exactly with the budget
	}

	private void addItem(ArrayList a){
		if(isFull(a) == true){
			System.out.println("Your cart is full. You cannot purchase any more items.");
		}else{
			
		}
	}
	
	private void removeItem(ArrayList a){
		if(isEmpty(a) == true){
			System.out.println("You have nothing in your cart. You'd better go shopping!");
		}else{ 
			
		}
	}
	
	private boolean isFull(ArrayList cart){
		if(cart.size() > 10){
			return true;
		}
		return false;
	}
	
	private boolean isEmpty(ArrayList cart){
		if(cart.size() == 0){
			return true;
		}
		return false;
	}

	public ArrayList<String> getCartItems() {
		return shoppingCart;
	}

	@Override
	public void addItem(StoreItem i) {
		// TODO Auto-generated method stub
		
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
	
	public void addToCart(StoreItem s) {
		cart.addItem(s);
		RyanCart.shoppingCart.add(s.getDescription());
		cart.update();
		System.out.println(RyanCart.shoppingCart);
	}
	
	
}

