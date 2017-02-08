package customer;

import java.util.ArrayList;

import gui6.components.ClickableGraphic;
import gui6.components.Component;
import gui6.components.TextLabel;
import gui6.components.Visible;
import gui6.screens.ClickableScreen;

public class RyanCart extends ClickableGraphic {

	private ArrayList<Component> itemsInCart;
	private int numberOfItems;
	private TextLabel label;
	
	public RyanCart(int x, int y) {
		super(x, y, .5, "resources/sampleImages/cart.png");
		
	}

	private void addItem(){
		
	}
	
	private void removeItem(){
		
	}

	public ArrayList<Component> getCartItems() {
		return itemsInCart;
	}
	
}
