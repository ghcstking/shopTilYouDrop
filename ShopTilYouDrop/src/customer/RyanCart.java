package customer;

import java.util.ArrayList;

import gui6.components.ClickableGraphic;
import gui6.components.Component;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class RyanCart extends ClickableGraphic {

	private ArrayList<Component> shoppingCart;
	private int numberOfItems;
	private TextLabel label;
	private double timeLeft;
	private int budget;
	
	
	public RyanCart(int x, int y) {
		super(x, y, .5, "resources/sampleImages/cart.png");	
		shoppingCart = new ArrayList<Component>();
		//screen should incorporate clicking an image to add an item to the cart
		//and clicking an image in the cart to remove it
	}
	
	private void initializePrices(){
		double[] itemPrices = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	}
	
	private void generateBudget(){
		budget = ;
		//generate a budget that will consist of different arrangements of the item prices,
		//so that the customer can match the prices of the items exactly with the budget
	}

	private void addItem(){
		if(isFull(shoppingCart) == true){
			//if full, item cannot be purchased
		}else{
			shoppingCart.add();
		}
	}
	
	private void removeItem(){
		if(isEmpty(shoppingCart) == true){
			//if empty, nothing will happen
		}else{ 
			shoppingCart.remove();
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

	public ArrayList<Component> getCartItems() {
		return shoppingCart;
	}
}

