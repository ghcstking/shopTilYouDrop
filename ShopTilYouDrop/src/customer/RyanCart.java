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
	
	public RyanCart(int x, int y) {
		super(x, y, .5, "resources/sampleImages/cart.png");	
		shoppingCart = new ArrayList<Component>();
	}

	private void addItem(){
		if(isFull(shoppingCart)){
			
		}else{
			shoppingCart.add();
		}
	}
	
	private void removeItem(){
		if(isEmpty(shoppingCart)){
			
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
